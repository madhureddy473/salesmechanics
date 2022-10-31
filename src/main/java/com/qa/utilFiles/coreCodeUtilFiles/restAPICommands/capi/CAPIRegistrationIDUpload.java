package com.qa.utilFiles.coreCodeUtilFiles.restAPICommands.capi;

import com.aventstack.extentreports.ExtentTest;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import com.qa.utilFiles.coreCodeUtilFiles.PathGeneration;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static io.restassured.RestAssured.given;

public class CAPIRegistrationIDUpload {
	private static final String capiWebClientKey = System.getenv("capiQ1WebClientKey"); //can get rid of this, replace with the two below
	private static final String capiAndroidClientKey = System.getenv("capiQ1AndroidClientKey");
	//can be PARAMETRIZED for use with other environments
	//the above are subject to change, regenerate as needed
	private static final String chosenClientKey = chosenClientKeyViaPlatform();
	private static final String sdkApplicationID = chooseSdkApplicationIDViaPlatform();

	private static final String onFidoProdLikeAuthToken = System.getenv("onFidoProdLikeAuthToken");
	//onFido prod like Auth token

	private static final String capiBaseURL = "https://q1consumerapi.qa.moneygram.com/services/capi/"; //can be parametrized for other environments
	private static final String onFidoBaseURL = "https://api.onfido.com/v3/documents";

	private static final String localeHeader = chooseLocaleHeaderViaSenderCountry();

	private String accessToken;
	private String emailIDGenerated;
	private String emailIDGeneratedforGet=null;
	private String profileID;
	private String registeredUserLastName;
	private boolean statusAuthenticated = false;
	private String applicantID;
	public String getemailIDGeneratedforGet() {
		return emailIDGeneratedforGet;
	}
	private static final HashMap<String, String> phoneNumberHashMap = createPhoneNumberHashMap();
	private static final HashMap<String, String> twoLetterToFullCountryHashMap = createTwoLetterToFullCountryHashMap();

	private JsonObject registrationJSON; //for use in EMTUpdate

	public void createProfileLoopForDuplicateEmailPhone(String profileToUse, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String countryOfBirthFromEMTProfile){
		String response = createProfile(profileToUse, currentTest, extentReportGenerator, countryOfBirthFromEMTProfile);

		Instant start = Instant.now();
		while (response.contains("An account already exists with the phone number you provided") || response.contains("It looks like you already have an account with a different email address")){
			extentReportGenerator.addWarningMessage(currentTest, "Duplicate account details (either email or phone number, most likely phone number), used to create account. Non-200 response from registration: " + response);
			extentReportGenerator.addInfoMessage(currentTest, "Attempting to re-register account with different email + phone number.");
			response = createProfile(profileToUse, currentTest, extentReportGenerator, countryOfBirthFromEMTProfile);

			Instant end = Instant.now();
			long secondsPassed = Duration.between(start, end).getSeconds();
			if(secondsPassed > Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("timeToWaitForRegistrationDuplicates"))){
				extentReportGenerator.addWarningMessage(currentTest, "Account registration via CAPI is taking too long due to duplicates! Ending registration attempts.");
				break;
			}
		}
	}
	private String createProfile(String profileToUse, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String countryOfBirthFromEMTProfile){
		if(chosenClientKey == null || chosenClientKey.equalsIgnoreCase("null")){
			extentReportGenerator.addInfoMessage(currentTest, "capiWebClientKey is null! Check system properties.");
		}

		profileToUse = profileToUse.replace("regNewAcc_", "").concat(".json");
		String registrationJSON = (processRegistrationJSON(profileToUse, currentTest, extentReportGenerator, countryOfBirthFromEMTProfile)).toString();
		extentReportGenerator.addInfoMessage(currentTest, "Registration payload being used for CAPI registration: " + registrationJSON);
		Response response = null;
		try {
			response =
					given()
							.relaxedHTTPSValidation()
							.header("clientKey", chosenClientKey)
							.header("Host", "q1consumerapi.qa.moneygram.com") //can be PARAMETRIZED for use with other environments
							.header("locale-header", localeHeader)
							.contentType(ContentType.JSON)
							.body(registrationJSON)
							.post(new URL(capiBaseURL + "register"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying register a new account on CAPI: " + registrationJSON + " Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports

		}
		System.out.println("CAPI API Response  : " +response.asString());
		System.out.println("CAPI API Response status code  : " +response.getStatusCode());

		if(response != null && response.getStatusCode() == 200){
			String accessTokenPropertyName = "accesTokenInfo";
			String accessTokenResponseParsed = JsonParser.parseString(response.asString()).getAsJsonObject().get("accesTokenInfo").getAsJsonObject().get("access_token").getAsString();
			if(accessTokenResponseParsed == null || accessTokenResponseParsed.equalsIgnoreCase("null")){
				accessTokenPropertyName = "accessTokenInfo"; //for if CAPI team ever fixes typo in "accesTokenInfo"
			}

			accessToken = "Bearer " + JsonParser.parseString(response.asString()).getAsJsonObject().get(accessTokenPropertyName).getAsJsonObject().get("access_token").getAsString();
			profileID = JsonParser.parseString(response.asString()).getAsJsonObject().get("consumerProfile").getAsJsonObject().get("profileId").getAsString();
			registeredUserLastName = JsonParser.parseString(response.asString()).getAsJsonObject().get("consumerProfile").getAsJsonObject().get("profile").getAsJsonObject().get("personalInfo").getAsJsonObject().get("lastName").getAsString();

			String status = JsonParser.parseString(response.asString()).getAsJsonObject().get("consumerProfile").getAsJsonObject().get("status").getAsString();
			extentReportGenerator.addInfoMessage(currentTest, "Account successfully registered via CAPI. Details: " + response.asString() + " || accessToken: " + accessToken + " || status: " + status);

			if (status.equalsIgnoreCase("AUTHENTICATED")){
				statusAuthenticated = true;
				System.out.println("Account with email ID: " + emailIDGenerated + " has been successfully authenticated!");
				extentReportGenerator.addInfoMessage(currentTest, "Account with email ID: " + emailIDGenerated + " has been successfully authenticated!");
			} else {
				System.out.println("Account with email ID: " + emailIDGenerated + " needs further authentication, will proceed to idUpload.");
				extentReportGenerator.addWarningMessage(currentTest, "Account with email ID: " + emailIDGenerated + " needs further authentication, will proceed to idUpload.");
			}
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "Returned null from CAPI when trying to register an account, or status was not 200!");
			if(response != null && response.getStatusCode() != 200){
				extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
			}
		}
		assert response != null;
		return response.asString();
	}
	public void uploadIDMitec(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String profileToUse){ //generated from EMTAdminCommands class
		//Old Mitec API
		if(!statusAuthenticated) { //ID should not be uploaded in cases where account is already authenticated, otherwise issues may occur.
			extentReportGenerator.addInfoMessage(currentTest, "Account status is not AUTHENTICATED, will upload ID");

			//get idUpload JSON payload file
			JsonObject idUploadPayload = null;
			try {
				idUploadPayload = JsonParser.parseReader(new FileReader(new PathGeneration().returnPathToRegistrationJSONPayload() + "ID_UploadPayload.json")).getAsJsonObject();
			} catch (IOException e) {
				extentReportGenerator.addWarningMessage(currentTest, "IO Exception thrown while trying to parse ID upload JSON payload. Details: ".concat(Arrays.toString(e.getStackTrace())));
			}
			assert idUploadPayload != null;

			//image as base64 string
			String uploadImageBaseSixtyFour = convertImageToBaseSixtyFourString(new PathGeneration().returnPathToRegistrationIDUploadPictures().concat(profileToUse), currentTest, extentReportGenerator);

			//update values within idUpload JSON payload file
			idUploadPayload.addProperty("mgoSessionId", UUID.randomUUID().toString());
			idUploadPayload.get("images").getAsJsonArray().get(0).getAsJsonObject().addProperty("image", uploadImageBaseSixtyFour); //0 denotes the first object in the images array.

			//API call
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.header("clientKey", chosenClientKey)
								.header("Authorization", accessToken)
								.header("locale-header", localeHeader)
								.contentType(ContentType.JSON)
								.body(idUploadPayload)
								.post(new URL(capiBaseURL + "auth/api/v1/consumer/idUpload/"))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to upload ID on CAPI: " + idUploadPayload + " Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}

			if (response != null && response.getStatusCode() == 200) {
				extentReportGenerator.addInfoMessage(currentTest, "Successfully uploaded ID via CAPI with status code 200. Details: " + response.asString());
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from CAPI when trying to upload ID for account: " + emailIDGenerated + ", or status was not 200!");
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
				}
			}
		}
	}

	public void uploadIDOnFidoPassport(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String accessBearerToken, String localeHeader, String profileToUseForDocument){ //full ID upload flow here for passport. Alternate versions may be made if API testing done on other ID types
		//assumes that registration API has been made already, and locale header is generated. All else is stand alone.
		File documentToUpload = new File(new PathGeneration().returnPathToRegistrationIDUploadPictures().concat(profileToUseForDocument));
		String applicantID = getApplicantIDViaBearerToken(currentTest, extentReportGenerator, accessBearerToken, localeHeader);
		String[] documentIDs = {postIDToOnFidoServer(currentTest, extentReportGenerator,"passport", documentToUpload, "front", applicantID)};
		postProcessID(currentTest, extentReportGenerator, applicantID, "Passport", returnDocumentIDinJSONArrayForm(documentIDs), "KYC", accessBearerToken, chosenClientKey, localeHeader);
	}

	private String getApplicantIDViaBearerToken(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String accessBearerToken, String localeHeader){
		//must extract and return bearer token from registration call for this to work
		//must also have 2 system properties, CAPI client keys, for iOS and android
		//take locale header from what is generated for registration
		//set a class field as the applicant ID in this class; alternatively just have it return this
		extentReportGenerator.addInfoMessage(currentTest, "getApplicantIDViaBearerToken: API retrieving Applicant ID via bearer token.");
		Response response = null;
		try {
			response =
					given()
							.relaxedHTTPSValidation()
							.header("clientKey", chosenClientKey)
							.header("Authorization", accessBearerToken)
							.header("Content-Type", "application/json")
							.header("locale-header", localeHeader)
					.when()
							.get(new URL(capiBaseURL + String.format("auth/api/v1/consumer/idUpload/applicantIdToken?sdkApplicationId=%s", sdkApplicationID)))
					.then().extract().response();
		} catch (MalformedURLException e) {
			extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while API retrieving Applicant ID via bearer token. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}

		if(response != null && response.getStatusCode() == 200){
			applicantID = JsonParser.parseString(response.asString()).getAsJsonObject().get("applicantId").getAsString();
			extentReportGenerator.addInfoMessage(currentTest, "Applicant ID is: " + applicantID);
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "Returned null from API when trying to retrieve Applicant ID via bearer token, or status was not 200!");
			if (response != null && response.getStatusCode() != 200) {
				extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
			}
		}
		return applicantID;
	}

	private String postIDToOnFidoServer(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String typeOfDocument, File documentToUpload, String sideOfDocument, String applicantID){
		//will take applicant id from method above
		//parametrize "type", "side", so that this can eventually be used to test other ID types
		//an api live token for onFido for authorization, need a system property
		//set a class field as the document ID in this class; alternatively just have it return this
		//upload application and get ID, set this ID to uploadedApplicationID
		extentReportGenerator.addInfoMessage(currentTest, "postIDToOnFidoServer: upload ID to get document IDs from onFido server, with payload JSON: " + "using formData, not JSON: "
				+ "type: " + typeOfDocument
				+ "file: " + documentToUpload //must look into a process for getting this
				+ "side: " + sideOfDocument
				+ "applicant-id: " + applicantID
		);
		Response response = null;
		try {
			response =
					given()
							.relaxedHTTPSValidation()
							.header("Authorization", onFidoProdLikeAuthToken)
							.header("Content-Type", "multipart/form-data")
							.multiPart("type", typeOfDocument)
							.multiPart("file", documentToUpload,  "image/png")
							.multiPart("side", sideOfDocument)
							.multiPart("applicant_id", applicantID)
							.post(new URL(onFidoBaseURL))
					.then().extract().response();
		} catch (MalformedURLException e) {
			extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to postIDToOnFidoServer: upload ID to get document IDs from onFido server Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}
		String documentID = null; //not setting a class field for this because multiple document IDs may be generated if front and back are needed
		if(response != null && (response.getStatusCode() == 200 || response.getStatusCode() == 201)){
			documentID = JsonParser.parseString(response.asString()).getAsJsonObject().get("id").getAsString();
			extentReportGenerator.addInfoMessage(currentTest, "DocumentID for the following applicant ID: " + applicantID + " is: " + documentID);
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "Returned null from postIDToOnFidoServer: upload ID to get document IDs from onFido server, or status was not 200!");
			if(response != null && response.getStatusCode() != 200){
				extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
			}
		}
		return documentID;
	}
	private void postProcessID(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String applicantID, String documentType, String documentIds, String uploadReason, String authorization, String clientKey, String localeHeader){
		//will take applicant ID from getApplicantIDViaBearerToken, document ID from uploadToOnFidoServer, bearer token from registration, clientKey from system properties based on platform
		//parametrize "DocumentType", "uploadReason"
		//take locale header from what is generated for registration
		String postRequestPayload = String.format("{\n" +
				"  \"applicantId\": \"%s\",\n" +
				"  \"documentType\": \"%s\",\n" +
				"  \"documentIds\": %s,\n" +
				"  \"uploadReason\": \"%s\" \n}", applicantID, documentType, documentIds, uploadReason);
		extentReportGenerator.addInfoMessage(currentTest, "postProcessID: Post document ID from onFido to correct applicantID from CAPI, with payload JSON: " + postRequestPayload);
		Response response = null;
		try {
			response =
					given()
							.relaxedHTTPSValidation()
							.header("Authorization", authorization)
							.header("clientKey", clientKey)
							.header("locale-header", localeHeader)
							.header("Content-Type", "application/json")
							.body(postRequestPayload)
							.post(new URL(capiBaseURL + "auth/api/v1/consumer/idUpload/processId"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to postProcessID: Post document ID from onFido to correct applicantID from CAPI. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}

		if(response != null && response.getStatusCode() == 200){
			System.out.println("SUCCESSFULLY PROCESSED ID ON CAPI!");
			extentReportGenerator.addInfoMessage(currentTest, "SUCCESSFULLY PROCESSED ID postProcessID ON CAPI! Details: " + response.asString());
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "Returned null from postProcessID: Post document ID from onFido to correct applicantID from CAPI, or status was not 200!");
			if(response != null && response.getStatusCode() != 200){
				extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
			}
		}
	}

	public JsonObject processRegistrationJSON(String profileToUse, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String countryOfBirthFromEMTProfile){
		JsonObject registrationJSONFile = null;
		try {
			registrationJSONFile = JsonParser.parseReader(new FileReader(new PathGeneration().returnPathToRegistrationJSONPayload() + profileToUse)).getAsJsonObject();
		} catch (IOException e){
			extentReportGenerator.addWarningMessage(currentTest, "IO Exception thrown while trying to parse Registration JSON payload. Details: ".concat(Arrays.toString(e.getStackTrace())));
		}
		assert registrationJSONFile != null;

		//session ID
		String mgoSessionID = UUID.randomUUID().toString();
		//random DOB for registrationh
		LocalDate from = LocalDate.of(1967, 1, 1);
		LocalDate to = LocalDate.of(1995, 1, 1);
		long days = from.until(to, ChronoUnit.DAYS);
		long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
		LocalDate randomDate = from.plusDays(randomDays);
		String pattern = registrationJSONFile.get("personalInfo").getAsJsonObject().get("dateOfBirthformat").toString();
		pattern = pattern.replace("\"", "");
		String randomDOB =randomDate.format(DateTimeFormatter.ofPattern(pattern)).toString();
		System.out.println(randomDate.format(DateTimeFormatter.ofPattern(pattern)));

		//first and last name generator
		String firstName = null;
		String lastName = null;
		boolean usingNoNameProfile = false;
		if(profileToUse.contains("noName")) { //name randomized for noName profiles, ID upload after onFido is handled via EMT
			firstName = RandomStringUtils.randomAlphabetic(10);
			lastName = RandomStringUtils.randomAlphabetic(10);
			usingNoNameProfile = true;
			//dob need not be randomized.
		}
		if(profileToUse.contains("PWMB")){ //specifically for PWMB. Will not work with ID upload!
			firstName = "John";
			lastName = "Smith";
		}

		//email ID generator
		GetPropertiesFromSysOrConfig envCountries = new GetPropertiesFromSysOrConfig();
		emailIDGenerated = envCountries.getPropertyFromSysOrConfig("env") + "_" + envCountries.getPropertyFromSysOrConfig("country") + "_" + RandomStringUtils.randomAlphanumeric(12) + "@maildrop.cc";
		emailIDGeneratedforGet = emailIDGenerated;
		//random phone number generator
		String phoneNumber = createPhoneNumberHashMap().get(envCountries.getPropertyFromSysOrConfig("country")) + RandomStringUtils.randomNumeric(6);

		//randomize address line 1 + city
		String addressLineOne = RandomStringUtils.randomNumeric(4) + " " + RandomStringUtils.randomAlphabetic(5);
		String city = RandomStringUtils.randomAlphabetic(5);
		//maybe randomize address with API as well at some point with google maps API

		//country specific randomizations
		//maybe randomize italy fiscal code

		//Spain
		String nifCode = null;
		if(envCountries.getPropertyFromSysOrConfig("country").equalsIgnoreCase("ES")){
			nifCode = RandomStringUtils.randomNumeric(9);
		}

		//json modification
		registrationJSONFile.addProperty("mgoSessionId", mgoSessionID);
		registrationJSONFile.get("authenticationInfo").getAsJsonObject().addProperty("userName", emailIDGenerated);
		if(usingNoNameProfile){
			registrationJSONFile.get("personalInfo").getAsJsonObject().addProperty("firstName", firstName);
			registrationJSONFile.get("personalInfo").getAsJsonObject().addProperty("lastName", lastName);
		}
		registrationJSONFile.get("personalInfo").getAsJsonObject().addProperty("email", emailIDGenerated);
		registrationJSONFile.get("personalInfo").getAsJsonObject().addProperty("phoneNumber", phoneNumber);
		registrationJSONFile.get("address").getAsJsonObject().addProperty("addressLine1", addressLineOne);
		registrationJSONFile.get("address").getAsJsonObject().addProperty("city", city);

		registrationJSONFile.get("personalInfo").getAsJsonObject().addProperty("dateOfBirth", randomDOB);

		//country of birth not changeable at EMT, so setting here to the COB of random profile picked at EMT. No country of birth field for US, so doing this only for all other countries
		if(!new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("country").equalsIgnoreCase("US")) {
			registrationJSONFile.get("personalInfo").getAsJsonObject().addProperty("countryOfBirth", countryOfBirthFromEMTProfile);
		}

		//country specific JSON modification
		if(envCountries.getPropertyFromSysOrConfig("country").equalsIgnoreCase("ES")){
			registrationJSONFile.get("personalInfo").getAsJsonObject().get("registrationIdInfo").getAsJsonObject().addProperty("registrationIdNumber", nifCode);
		}
		registrationJSON = registrationJSONFile;
		return registrationJSONFile;
	}
	private static HashMap<String, String> createPhoneNumberHashMap(){ //convert to a json file
		HashMap <String, String> phoneNumberHashMap = new HashMap<>();
		//randomize last 6 digits
		phoneNumberHashMap.put("US", "3474");
		phoneNumberHashMap.put("GB", "1344");
		phoneNumberHashMap.put("DE", "8007");
		phoneNumberHashMap.put("FR", "933");
		phoneNumberHashMap.put("IT", "0815");
		phoneNumberHashMap.put("AU", "298");
		phoneNumberHashMap.put("CA", "6135");
		phoneNumberHashMap.put("ES", "956");
		phoneNumberHashMap.put("BE", "57");

		//add more as more countries become available. 6 numbers. Google Maps for first few digits of numbers
		return phoneNumberHashMap;
	}
	private static HashMap<String, String> createTwoLetterToFullCountryHashMap(){ //convert to a json file
		HashMap <String, String> twoLetterToFullCountryHashMap = new HashMap<>();
		//randomize last 6 digits
		twoLetterToFullCountryHashMap.put("US", "United States");
		twoLetterToFullCountryHashMap.put("GB", "United Kingdom Of Great Britain And Northern Ireland");
		twoLetterToFullCountryHashMap.put("DE", "Germany");
		twoLetterToFullCountryHashMap.put("FR", "France");
		twoLetterToFullCountryHashMap.put("IT", "Italy");
		twoLetterToFullCountryHashMap.put("AU", "Australia");
		twoLetterToFullCountryHashMap.put("CA", "Canada");
		twoLetterToFullCountryHashMap.put("ES", "Spain");
		twoLetterToFullCountryHashMap.put("BE", "Belgium");

		//add more as more countries become available. 6 numbers. Google Maps for first few digits of numbers
		return twoLetterToFullCountryHashMap;
	}
	private String convertImageToBaseSixtyFourString(String pathToImage, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){
		byte[] imageInBytes = null;
		try {
			imageInBytes = FileUtils.readFileToByteArray(new File(pathToImage));
			extentReportGenerator.addInfoMessage(currentTest, "Successfully generated imageInBytes, will now convert base64 image string.");
		} catch (IOException e){
			extentReportGenerator.addWarningMessage(currentTest, "IO Exception thrown while attempting to convert image " + pathToImage + " to base64 String! Details: " + Arrays.toString(e.getStackTrace()));
		}
		return Base64.getEncoder().encodeToString(imageInBytes);
	}
	private static String chosenClientKeyViaPlatform(){
		return capiAndroidClientKey;
	}
	private static String chooseSdkApplicationIDViaPlatform(){
		return new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("androidAppPackage");
	}
	private String returnDocumentIDinJSONArrayForm(String[] arrayOfDocumentIDs){
		//takes document id String, returns it in ["", "", ...] format
		String jsonFormatArrayOfDocumentIDs = "[\"".concat(arrayOfDocumentIDs[0].concat("\""));
		if(arrayOfDocumentIDs.length > 1){
			for(int i = 1; i < arrayOfDocumentIDs.length; i++){
				jsonFormatArrayOfDocumentIDs = ", \"".concat(arrayOfDocumentIDs[i].concat("\""));
			}
		}
		jsonFormatArrayOfDocumentIDs = jsonFormatArrayOfDocumentIDs.concat("]");
		return jsonFormatArrayOfDocumentIDs;
	}
	private static String chooseLocaleHeaderViaSenderCountry(){
		return "en_" + new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("country");
	}
	public String getEmailIDGenerated() {
		return emailIDGenerated;
	}
	public static String getLocaleHeader() {
		return localeHeader;
	}
	public String getProfileID() {
		return profileID;
	}
	public JsonObject getRegistrationJSON() {
		return registrationJSON;
	}
	public boolean isStatusAuthenticated() {
		return statusAuthenticated;
	}
	public String getApplicantID() {
		return applicantID;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public static HashMap<String, String> getPhoneNumberHashMap() {
		return phoneNumberHashMap;
	}
	public static HashMap<String, String> getTwoLetterToFullCountryHashMap() {
		return twoLetterToFullCountryHashMap;
	}
}
