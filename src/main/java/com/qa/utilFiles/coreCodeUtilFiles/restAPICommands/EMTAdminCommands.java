package com.qa.utilFiles.coreCodeUtilFiles.restAPICommands;

import com.aventstack.extentreports.ExtentTest;
import com.google.gson.JsonObject;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class EMTAdminCommands {
	private static final String lanID = System.getenv("lanID");
	private static final String lanIDPassword = lanIDPasswordCorrection(System.getenv("lanIDPassword"));
	//lanID and password. Set as system properties

	private static final String baseURL = "https://q1wsintapps.qacorp.moneygram.com/eMoneyGramAdm/";
	private final String profileToUse = profileToUse();
	private final String[] profileToUseArray = registrationDetailsNameDOB().get(profileToUse);

	private Cookie loginToEMT(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){ //standard login to emt. will return cookie, used in other EMT related transactions
		extentReportGenerator.addInfoMessage(currentTest, "Generating EMT cookie for authentication.");
		String loginXWWWFormURLEncodedPayload = String.format("userID=%s&userPassword=%s&submit=%s", lanID, lanIDPassword, "Login");
		Cookie loginCookie = null;

		Response response = null;
		try {
			response =
					given()
							.relaxedHTTPSValidation()
							.header("Connection", "close")
							.header("Content-Language", "en-US")
							.header("Content-Type", "application/x-www-form-urlencoded")
							.header("Accept-Encoding", "gzip, deflate, br")
							.header("Host", "q1wsintapps.qacorp.moneygram.com")
							.header("Origin", "https://q1wsintapps.qacorp.moneygram.com")
							.header("Referer", "https://q1wsintapps.qacorp.moneygram.com/eMoneyGramAdm/login.do")
							.body(loginXWWWFormURLEncodedPayload)
							.post(new URL(baseURL + "login.do"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying login to EMT for cookie generation. " + " Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}
		if(response != null && response.getStatusCode() == 200 && response.asString().contains(lanID.toUpperCase()) && response.asString().contains("welcome.do")){
			extentReportGenerator.addInfoMessage(currentTest, "Successfully logged into EMT with status code 200. Details: " + response.asString());
			loginCookie = response.getDetailedCookie("JSESSIONIDEMT");
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "Returned null from EMT when trying to login to get cookie, or status was not 200, or login was not successful (error finding lanID + welcome.do in response)!");
			if(response != null && response.getStatusCode() != 200){
				extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
			}
		}
		return loginCookie;
	}
	public void emtUpdateProfileNameDOB(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, JsonObject registrationJSON, String profileID){
		if(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("emtUpdateProfile").equalsIgnoreCase("true")) {
			extentReportGenerator.addInfoMessage(currentTest, "Updating profile using EMT, for profile: " + profileID);
			Cookie loginCookie = loginToEMT(currentTest, extentReportGenerator); //login cookie works as authentication. Call this after CAPIRegistration processRegistrationJSON method and pass that returned registration json
			if (loginCookie == null) {
				extentReportGenerator.addWarningMessage(currentTest, "Login cookie is null! Issue with EMT.");
			}
			String updateProfileXWWWFormURLEncodedPayload = updateProfileNameDOBXWWWFormURLEncodedPayloadGenerator(currentTest, extentReportGenerator, registrationJSON, profileID);
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.cookie(loginCookie)
								.header("Connection", "close")
								.header("Content-Language", "en-US")
								.header("Content-Type", "application/x-www-form-urlencoded")
								.header("Accept-Encoding", "gzip, deflate, br")
								.header("Host", "q1wsintapps.qacorp.moneygram.com")
								.header("Origin", "https://q1wsintapps.qacorp.moneygram.com")
								.header("Referer", "https://q1wsintapps.qacorp.moneygram.com/eMoneyGramAdm/login.do")
								.body(updateProfileXWWWFormURLEncodedPayload)
								.post(new URL(baseURL + "updateCustomerProfile.do"))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying login to EMT for cookie generation. " + " Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}
			if (response != null && response.getStatusCode() == 200 && response.asString().contains(lanID.toUpperCase()) && response.asString().contains("welcome.do")) {
				extentReportGenerator.addInfoMessage(currentTest, "Successfully updated profile on EMT, received status code 200. Details: " + response.asString());
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from EMT when trying to update profile, or status was not 200, or login was not successful (error finding lanID + welcome.do in response)!");
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
				}
			}
		}
	}
	public void emtUpdateProfileStatus(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String profileID){ //set to only update status of profile, profile details itself remain untouched as ID upload can no longer be done with onFido
		if(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("emtUpdateProfile").equalsIgnoreCase("true")) {
			System.out.println("UPDATING PROFILE STATUS VIA EMT, FOR PROFILE ID: " + profileID);
			extentReportGenerator.addInfoMessage(currentTest, "UPDATING PROFILE STATUS VIA EMT, FOR PROFILE ID: " + profileID);
			Cookie loginCookie = loginToEMT(currentTest, extentReportGenerator); //login cookie works as authentication. Call this after CAPIRegistration processRegistrationJSON method and pass that returned registration json
			if (loginCookie == null) {
				extentReportGenerator.addWarningMessage(currentTest, "Login cookie is null! Issue with EMT.");
			}
			String updateProfileXWWWFormURLEncodedPayload = changeCustStatusXWWWFormURLEncodedPayloadGenerator(currentTest, extentReportGenerator, profileID);
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.cookie(loginCookie)
								.header("Connection", "close")
								.header("Content-Language", "en-US")
								.header("Content-Type", "application/x-www-form-urlencoded")
								.header("Accept-Encoding", "gzip, deflate, br")
								.header("Host", "q1wsintapps.qacorp.moneygram.com")
								.header("Origin", "https://q1wsintapps.qacorp.moneygram.com")
								.header("Referer", String.format("https://q1wsintapps.qacorp.moneygram.com/eMoneyGramAdm/updateCustomerProfile.do?custId=%s&basicFlag=N", profileID))
								.body(updateProfileXWWWFormURLEncodedPayload)
								.post(new URL(baseURL + "updateCustomerStatus.do"))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to update profile status via EMT. " + " Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}
			if (response != null && response.getStatusCode() == 200 && response.asString().contains(lanID.toUpperCase()) && response.asString().contains("welcome.do")) {
				extentReportGenerator.addInfoMessage(currentTest, "Successfully updated profile on EMT, received status code 200. Details: " + response.asString());
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from EMT when trying to update profile, or status was not 200, or login was not successful (error finding lanID + welcome.do in response)!");
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
				}
			}
		}
	}
	private String updateProfileNameDOBXWWWFormURLEncodedPayloadGenerator(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, JsonObject registrationJSON, String profileID){ //uses name and DOB in actual profile (first name is always pass)
		extentReportGenerator.addInfoMessage(currentTest, "Using profile for CAPI/EMT registration: " + profileToUse);
		extentReportGenerator.addInfoMessage(currentTest, "Profile details: " + Arrays.toString(profileToUseArray));

		//passport first and last name
		String passportFirstName = profileToUseArray[0];
		String passportLastName = profileToUseArray[1];

		//DOB, ALL COUNTRIES ON EMT USE --> MMM/DD/YYYY. Dividers/periods be replaced by %2F
		String dob = profileToUseArray[2] + "%2F" + profileToUseArray[3] + "%2F" + profileToUseArray[4];

		//directly gleaned from registrationJSON
		String transactionCountryThreeLetter = registrationJSON.get("personalInfo").getAsJsonObject().get("phoneCountryISO").getAsString();
		String addressLineOne = registrationJSON.get("address").getAsJsonObject().get("addressLine1").getAsString();
		String city = registrationJSON.get("address").getAsJsonObject().get("city").getAsString();
		String postalCode = registrationJSON.get("address").getAsJsonObject().get("postalCode").getAsString();
		String phoneCountryCode = transactionCountryThreeLetter;
		String phoneNumber = registrationJSON.get("personalInfo").getAsJsonObject().get("phoneNumber").getAsString();
		String customerID = profileID;

		String state;
		try{
			state = registrationJSON.get("address").getAsJsonObject().get("state").getAsString().split("-")[1];
		} catch (NullPointerException e) {
			extentReportGenerator.addWarningMessage(currentTest, "No state field exists for registering accounts for the country: " + transactionCountryThreeLetter + ", setting state field as blank.");
			state = "";
		}

		String payload =
				"" +
						"partnerSiteId=MGO" + transactionCountryThreeLetter +
						"&custFirstName=" + passportFirstName +
						"&middleName=" +
						"&custLastName=" + passportLastName +
						"&custSecondLastName=" +
						"&addressLine1=" + addressLineOne +
						"&city=city" + city +
						"&addressLine2=" +
						"&state=" + state +
						"&addressLine3=" +
						"&postalCode=" + postalCode +
						"&phoneCountryCode=" + transactionCountryThreeLetter + "-" + phoneCountryCode +
						"&phoneNumber=" + phoneNumber +
						"&savePhoneNumber=" + phoneNumber +
						"&birthDateText=" + dob +
						"&loyaltyPgmMembershipId=" +
						"&updateSubmit=Update+Profile" +
						"&custId=" + customerID +
						"&plusNumber="
				+ "";
		return payload;
	}

	private String changeCustStatusXWWWFormURLEncodedPayloadGenerator(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String profileID){
		extentReportGenerator.addInfoMessage(currentTest, "Updating profile status via EMT");

		return
				"" +
						"custId=" + profileID +
						"&custStatus=" + "ACT%3AL08" + //L03 is document validation. L08 is Active Authentication Pass
						"&currentCustStatus=" + "ACT%3AL14" //typical status of newly created accounts that need an ID upload, "Active: ID Pending"
				+ "";
	}
	private HashMap<String, String[]> registrationDetailsNameDOB(){ //convert to a json file
		HashMap<String, String[]> registrationDetailsNameDOBMap = new HashMap<>();
		//key is the picture file
		//in the string array, index 0 is First name, 1 is Last name, 2 is date of birth (dd), 3 is month (mmm) of birth, 4 is year of birth (yyyy), 5 is 3 letter country code
		//first name will always be "pass" with onFido authentication
		String randomLastName = RandomStringUtils.randomAlphabetic(10);
		//names, in order --> Citizen, Geburtsort, Specimen, UK SPECIMEN
		registrationDetailsNameDOBMap.put("citizen_j_AU.png", new String[]{"pass", randomLastName, "07", "JUN", "1984", "AUS"});
		registrationDetailsNameDOBMap.put("geburtsort_m_AT.png", new String[]{"pass", randomLastName, "31", "DEC", "1987", "AUT"});
		registrationDetailsNameDOBMap.put("specimen_e_BE.png", new String[]{"pass", randomLastName, "14", "DEC", "1984", "BEL"});
		registrationDetailsNameDOBMap.put("ukSpecimen_a_GB.png", new String[]{"pass", randomLastName, "04", "DEC", "1988", "GBR"});
		//add more as more profiles become available

		return registrationDetailsNameDOBMap;
	}
	private String[] availableProfiles(){ //convert to a json file
		return new String[]{
				"citizen_j_AU.png",
				"geburtsort_m_AT.png",
				"specimen_e_BE.png",
				"ukSpecimen_a_GB.png"
				//add more as more profiles become available
		};
	}
	private String profileToUse() {
		return availableProfiles()[new Random().nextInt(availableProfiles().length)];
	}
	public String getProfileToUse() {
		return profileToUse;
	}
	public String[] getProfileToUseArray(){
		return profileToUseArray;
	}

	public static String lanIDPasswordCorrection(String lanIDPassword){
		if(lanIDPassword.contains("^^")){ //replace 2 carets with one, password issue
			return lanIDPassword.replace("^^", "^");
		} else {
			return lanIDPassword;
		}
	}
}
