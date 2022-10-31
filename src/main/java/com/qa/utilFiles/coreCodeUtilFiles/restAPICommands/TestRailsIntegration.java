package com.qa.utilFiles.coreCodeUtilFiles.restAPICommands;

import com.aventstack.extentreports.ExtentTest;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.qa.coreFrameworkFiles.Initializer;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import com.qa.utilFiles.coreCodeUtilFiles.PathGeneration;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import static io.restassured.RestAssured.*;

public class TestRailsIntegration {
	private final List<String> appendableListOfTestCaseIDsForRun = new ArrayList<>();
	public XmlPath xp;
	public XmlPath xp1;
	private static final String baseURLForTestRails = "https://moneygram.testrail.io/index.php?/api/v2/";
	//base url for all requests to TestRails
	private static final String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
	private static final String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
	private static final String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
	//suite and project ID's on TestRails. Change if any updates to TestRails

	private static final String testRailUsername = System.getenv("testRailUsername");
	private static final String testRailAPIKey = System.getenv("testRailAPIKey"); //pulled from system variables

	private final boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
	private final boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));

	public String addRun(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String testRunName){ //creates an empty run
		String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
		String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
		String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
		boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
		boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));
		if(testRailActive) {
			if (testRailUsername == null || testRailUsername.equalsIgnoreCase("null")) {
				extentReportGenerator.addWarningMessage(currentTest, "testRailUsername is null! Check system properties.");
			}
			if (testRailAPIKey == null || testRailAPIKey.equalsIgnoreCase("null")) {
				extentReportGenerator.addInfoMessage(currentTest, "testRailAPIKey is null! Check system properties.");
			}

			String addRunJSON = String.format("{\n" +
					"  \"suite_id\": %s,\n" +
					"  \"description\": \"%s\",\n" +
					"  \"include_all\": false,\n" +
					"  \"name\": \"%s\" \n}", suiteID, "Test run created by user: " + testRailUsername, testRunName);

			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.auth()
								.preemptive()
								.basic(testRailUsername, testRailAPIKey)
								.contentType(ContentType.JSON)
								.body(addRunJSON)
								.post(new URL(baseURLForTestRails + "add_run/" + projectID))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}
			String currentRunID = "AwaitingAssignment";
			if (response != null && response.getStatusCode() == 200) {
				JsonObject addRunResponse = JsonParser.parseString(response.asString()).getAsJsonObject();
				currentRunID = addRunResponse.get("id").getAsString();
				extentReportGenerator.addInfoMessage(currentTest, "Test run successfully generated. Details: " + response.asString() + " || Run ID: " + currentRunID);
				System.out.println("Test run successfully generated. Details: " + response.asString() + " || Run ID: " + currentRunID);
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from test rails when trying to add a test run, or status was not 200!");
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
				}
			}
			return currentRunID;
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "addRun: Test Rail enabled set to false on properties");
			return "Test rails enabled set to FALSE on properties";
		}
	}
	public boolean checkIfCaseIDExists(String caseID, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){
		String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
		String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
		String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
		boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
		boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));
		if(testRailActive) {
			extentReportGenerator.addInfoMessage(currentTest, "Checking if case ID is valid: " + caseID);
			extentReportGenerator.addInfoMessage(currentTest, "Using this URL for request: " + baseURLForTestRails + "get_case/" + caseID);
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.auth()
								.preemptive()
								.basic(testRailUsername, testRailAPIKey)
								.contentType(ContentType.JSON)
								.get(new URL(baseURLForTestRails + "get_case/" + caseID))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to see if case ID: " + caseID + " is valid. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}

			boolean caseIDIsValid; //for passing/failing during test cases
			if (response != null && response.getStatusCode() == 200) {
				JsonObject validCaseIDResponse = JsonParser.parseString(response.asString()).getAsJsonObject();
				extentReportGenerator.addInfoMessage(currentTest, "Case ID is valid. Details: " + validCaseIDResponse);
				System.out.println("Case ID is valid. Details: " + validCaseIDResponse);
				caseIDIsValid = true;
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from test rails when trying to see if case ID was valid, or status was not 200! With case ID: " + caseID);
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
					extentReportGenerator.addInfoMessage(currentTest, "Was the invalid case ID: " + caseID + " removed?" + appendableListOfTestCaseIDsForRun.remove(caseID)); //if invalid case ID was provided, it will be removed from the list.
				}
				caseIDIsValid = false;
			}
			return caseIDIsValid;
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "checkIfCaseIDExists: Test Rail enabled set to false on properties");
			return false;
		}
	}
	public boolean updateRunWithCase(String caseID, String currentRunID, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){
		String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
		String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
		String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
		boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
		boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));
		if(testRailActive) {
			if(!caseID.equalsIgnoreCase("null")) {
				appendableListOfTestCaseIDsForRun.add(caseID);
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "CASE ID RETURNED NULL! NOT APPENDING. CASE ID: " + caseID);
			}
			extentReportGenerator.addInfoMessage(currentTest, "Current list of appendable test cases: " + appendableListOfTestCaseIDsForRun);
			String updateRunWithCaseJSON = String.format("{\n" +
					"  \"case_ids\": %s \n}", appendableListOfTestCaseIDsForRun); //will append the list in "[]" format to json body
			extentReportGenerator.addInfoMessage(currentTest, "Using this URL for request: " + baseURLForTestRails + "update_run/" + currentRunID);
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.auth()
								.preemptive()
								.basic(testRailUsername, testRailAPIKey)
								.contentType(ContentType.JSON)
								.body(updateRunWithCaseJSON)
								.post(new URL(baseURLForTestRails + "update_run/" + currentRunID))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to update test run with a test case to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}

			boolean addedCaseToTestRunSuccessfully; //for passing/failing during test cases
			if (response != null && response.getStatusCode() == 200) {
				JsonObject addResultForCaseResponse = JsonParser.parseString(response.asString()).getAsJsonObject();
				extentReportGenerator.addInfoMessage(currentTest, "Test case successfully added to test run. Details: " + addResultForCaseResponse);
				System.out.println("Test case successfully added to test run. Details: " + addResultForCaseResponse);
				addedCaseToTestRunSuccessfully = true;
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from test rails when trying to add test case to run, or status was not 200! With case ID: " + caseID);
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
					extentReportGenerator.addInfoMessage(currentTest, "Was the invalid case ID: " + caseID + " removed?" + appendableListOfTestCaseIDsForRun.remove(caseID)); //if invalid case ID was provided, it will be removed from the list.
				}
				addedCaseToTestRunSuccessfully = false;
			}
			return addedCaseToTestRunSuccessfully;
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "updateRunWithCase: Test Rail enabled set to false on properties");
			return false;
		}
	}
	public boolean addResultForCase(String statusID, String caseID, String currentRunID, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){ //pull case id from excel
		String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
		String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
		String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
		boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
		boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));
		if(testRailActive) {
			String addResultForCaseJSON = String.format("{\n" +
					"  \"status_id\": \"%s\" \n}", statusID); //status ID must be between 1 - 5, excluding 3. See TestRails API documentation for more details
			extentReportGenerator.addInfoMessage(currentTest, "Using this URL for request: " + baseURLForTestRails + "add_result_for_case/" + currentRunID + "/" + caseID);
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.auth()
								.preemptive()
								.basic(testRailUsername, testRailAPIKey)
								.contentType(ContentType.JSON)
								.body(addResultForCaseJSON)
								.post(new URL(baseURLForTestRails + "add_result_for_case/" + currentRunID + "/" + caseID))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}

			boolean resultForCaseAddedSuccessfully; //for passing/failing during test cases
			if (response != null && response.getStatusCode() == 200) {
				JsonObject addResultForCaseResponse = JsonParser.parseString(response.asString()).getAsJsonObject();
				extentReportGenerator.addInfoMessage(currentTest, "Test result successfully added. Details: " + addResultForCaseResponse);
				System.out.println("Test result successfully added. Details: " + addResultForCaseResponse);
				resultForCaseAddedSuccessfully = true;
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from test rails when trying to add a result for test case, or status was not 200! With case ID: " + caseID);
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
				}
				resultForCaseAddedSuccessfully = false;
			}
			return resultForCaseAddedSuccessfully;
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "addResultForCase: Test Rail enabled set to false on properties");
			return false;
		}
	}
	public boolean closeRun(String currentRunID, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){
		String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
		String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
		String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
		boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
		boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));
		if(testRailActive) {
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.auth()
								.preemptive()
								.basic(testRailUsername, testRailAPIKey)
								.contentType(ContentType.JSON)
								.post(new URL(baseURLForTestRails + "close_run/" + currentRunID))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to close test run on test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}

			boolean closedRunSuccessfully; //for passing/failing during test cases
			if (response != null && response.getStatusCode() == 200) {
				JsonObject closeRunResponse = JsonParser.parseString(response.asString()).getAsJsonObject();
				extentReportGenerator.addInfoMessage(currentTest, "Test run successfully closed. Details: " + closeRunResponse);
				System.out.println("Test run successfully closed. Details: " + closeRunResponse);
				closedRunSuccessfully = true;
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from test rails when trying to close test run, or status was not 200! Run ID: " + currentRunID);
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
				}
				closedRunSuccessfully = false;
			}
			return closedRunSuccessfully;
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "closeRun: Test Rail enabled set to false on properties");
			return false;
		}
	}

	//test plan/entry APIs:
	public HashMap<String, String> addTestPlanEntry(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, String testRunName){ //creates a test entry. has one filler test case in it because entries cannot be empty
		String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
		String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
		String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
		boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
		boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));
		if(testRailActive && usingTestPlan) {
			if (testRailUsername == null || testRailUsername.equalsIgnoreCase("null")) {
				extentReportGenerator.addWarningMessage(currentTest, "testRailUsername is null! Check system properties.");
			}
			if (testRailAPIKey == null || testRailAPIKey.equalsIgnoreCase("null")) {
				extentReportGenerator.addInfoMessage(currentTest, "testRailAPIKey is null! Check system properties.");
			}

			String addRunJSON = String.format("{\n" +
					"  \"suite_id\": %s,\n" +
					"  \"description\": \"%s\",\n" +
					"  \"include_all\": false,\n" +
					"  \"case_ids\": [%s],\n" +
					"  \"name\": \"%s\" \n}", suiteID, "Test Plan Entry_Run created by user: " + testRailUsername, new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("genericTestPlanHolderCaseID"), testRunName);
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.auth()
								.preemptive()
								.basic(testRailUsername, testRailAPIKey)
								.contentType(ContentType.JSON)
								.body(addRunJSON)
								.post(new URL(baseURLForTestRails + "add_plan_entry/" + planID))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test plan entry to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}
			String currentRunID;
			String currentEntryID;
			HashMap<String, String> runAndEntryID = new HashMap<>();
			if (response != null && response.getStatusCode() == 200) {
				JsonObject addRunResponse = JsonParser.parseString(response.asString()).getAsJsonObject();
				currentRunID = addRunResponse.get("runs").getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();
				currentEntryID = addRunResponse.get("runs").getAsJsonArray().get(0).getAsJsonObject().get("entry_id").getAsString();
				runAndEntryID.put("currentRunID", currentRunID);
				runAndEntryID.put("currentEntryID", currentEntryID);
				extentReportGenerator.addInfoMessage(currentTest, "Test plan entry successfully generated. Details: " + response.asString() + " || Run ID: " + currentRunID);
				System.out.println("Test plan entry successfully generated. Details: " + response.asString() + " || Run ID: " + currentRunID);
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from test rails when trying to add a test plan entry, or status was not 200!");
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
				}
			}
			return runAndEntryID;
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "addRun: Test Rail enabled set to false on properties, or test plan is not being used.");
			HashMap<String, String> blankHash = new HashMap<>();
			blankHash.put("currentRunID", "null");
			blankHash.put("currentEntryID", "null");
			return blankHash;
		}
	}
	public boolean updatePlanEntryWithCase(String caseID, String currentEntryID, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){
		String projectID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailProjectID");
		String suiteID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailSuiteID");
		String planID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("currentTestPlanID");
		boolean testRailActive = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("testRailActive"));
		boolean usingTestPlan = Boolean.parseBoolean(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan"));
		if(testRailActive && usingTestPlan) {
			if(!caseID.equalsIgnoreCase("null")) {
				appendableListOfTestCaseIDsForRun.add(caseID);
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "CASE ID RETURNED NULL! NOT APPENDING. CASE ID: " + caseID);
			}
			extentReportGenerator.addInfoMessage(currentTest, "Current list of appendable test cases: " + appendableListOfTestCaseIDsForRun);
			String updateRunWithCaseJSON = String.format("{\n" +
					"  \"case_ids\": %s \n}", appendableListOfTestCaseIDsForRun); //will append the list in "[]" format to json body
			extentReportGenerator.addInfoMessage(currentTest, "Using this URL for request: " + baseURLForTestRails + "update_plan_entry/" + planID + "/" + currentEntryID);
			Response response = null;
			try {
				response =
						given()
								.relaxedHTTPSValidation()
								.auth()
								.preemptive()
								.basic(testRailUsername, testRailAPIKey)
								.contentType(ContentType.JSON)
								.body(updateRunWithCaseJSON)
								.post(new URL(baseURLForTestRails + "update_plan_entry/" + planID + "/" + currentEntryID))
								.then().extract().response();
			} catch (MalformedURLException e) {
				extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to update test entry with a test case to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
			}

			boolean addedCaseToTestRunSuccessfully; //for passing/failing during test cases
			if (response != null && response.getStatusCode() == 200) {
				JsonObject addResultForCaseResponse = JsonParser.parseString(response.asString()).getAsJsonObject();
				extentReportGenerator.addInfoMessage(currentTest, "Test case successfully added to test run. Details: " + addResultForCaseResponse);
				System.out.println("Test case successfully added to test entry. Details: " + addResultForCaseResponse);
				addedCaseToTestRunSuccessfully = true;
			} else {
				extentReportGenerator.addWarningMessage(currentTest, "Returned null from test rails when trying to add test entry to run, or status was not 200! With case ID: " + caseID);
				if (response != null && response.getStatusCode() != 200) {
					extentReportGenerator.addWarningMessage(currentTest, "Non 200 response: " + response.asString());
					extentReportGenerator.addInfoMessage(currentTest, "Was the invalid case ID: " + caseID + " removed?" + appendableListOfTestCaseIDsForRun.remove(caseID)); //if invalid case ID was provided, it will be removed from the list.
				}
				addedCaseToTestRunSuccessfully = false;
			}
			return addedCaseToTestRunSuccessfully;
		} else {
			extentReportGenerator.addWarningMessage(currentTest, "updateRunWithCase: Test Rail enabled set to false on properties or not using test plan");
			return false;
		}
	}













	////////SOAP API___Start




	public String test1705addRun() { //creates an empty run

		String xml= "<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
				"    <Header>\n" +
				"        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
				"            <wsu:Timestamp/>\n" +
				"            <wsse:UsernameToken>\n" +
				"                <wsse:Username>69470613</wsse:Username>\n" +
				"                <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">456</wsse:Password>\n" +
				"            </wsse:UsernameToken>\n" +
				"        </wsse:Security>\n" +
				"    </Header>\n" +
				"    <Body>\n" +
				"        <checkInRequest xmlns=\"http://www.moneygram.com/AgentConnect1705\">\n" +
				"            <agentID>69470613</agentID>\n" +
				"            <agentSequence>11</agentSequence>\n" +
				"            <timeStamp>2020-12-17T16:57:37.344-06:00</timeStamp>\n" +
				"            <clientSoftwareVersion>1705</clientSoftwareVersion>\n" +
				"            <poeType>AGENTCONNECT</poeType>\n" +
				"            <channelType>LOCATION</channelType>\n" +
				"            <targetAudience>AGENT_FACING</targetAudience>\n" +
				"            <poeCapabilities>\n" +
				"                <poeCapability>\n" +
				"                    <infoKey>BACK_OFFICE_FIELDS</infoKey>\n" +
				"                    <value>true</value>\n" +
				"                </poeCapability>\n" +
				"            </poeCapabilities>\n" +
				"        </checkInRequest>\n" +
				"    </Body>\n" +
				"</Envelope>";


		Response response1 = null;
		String jsonAppResponse1 = null;
		try {
			response1 =
					given()
							.relaxedHTTPSValidation()
							.header("Connection", "close")
							.header("SOAPAction", "https://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705")
							.header("Content-Type", "text/xml;charset=UTF-8")
							.header("Server", "Layer7-API-Gateway")
							.contentType(ContentType.XML)
							.body(xml)
							.post(new URL("http://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			//extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}

		//if (response1 != null && response1.getStatusCode() == 200) {
		jsonAppResponse1 = response1.asString();
		//	System.out.println("Test run successfully generated. Details: " + response1.asString() + " || Run ID: " + currentRunID);
		//	}


		String FeeLookupxml="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
				"    <soapenv:Header>\n" +
				"        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
				"            <wsu:Timestamp />\n" +
				"            <wsse:UsernameToken>\n" +
				"                <wsse:Username>69470613</wsse:Username>\n" +
				"                <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">456</wsse:Password>\n" +
				"            </wsse:UsernameToken>\n" +
				"        </wsse:Security>\n" +
				"    </soapenv:Header>\n" +
				"    <soapenv:Body>\n" +
				"        <feeLookupRequest xmlns=\"http://www.moneygram.com/AgentConnect1705\">\n" +
				"            <agentID>69470613</agentID>\n" +
				"            <agentSequence>11</agentSequence>\n" +
				"            <timeStamp>2020-12-17T16:57:37.344-06:00</timeStamp>\n" +
				"            <clientSoftwareVersion>1705</clientSoftwareVersion>\n" +
				"            <poeType>AGENTCONNECT</poeType>\n" +
				"            <channelType>LOCATION</channelType>\n" +
				"            <targetAudience>AGENT_FACING</targetAudience>\n" +
				"            <poeCapabilities>\n" +
				"                <poeCapability>\n" +
				"                    <infoKey>BACK_OFFICE_FIELDS</infoKey>\n" +
				"                    <value>true</value>\n" +
				"                </poeCapability>\n" +
				"            </poeCapabilities>\n" +
				"            <mgiSessionType>SEND</mgiSessionType>\n" +
				"            <amountExcludingFee>5</amountExcludingFee>\n" +
				"            <destinationCountry>USA</destinationCountry>\n" +
				"            <destinationCountrySubdivisionCode>US-TX</destinationCountrySubdivisionCode>\n" +
				"            <sendCountry>USA</sendCountry>\n" +
				"            <serviceOption>WILL_CALL</serviceOption>\n" +
				"            <receiveCurrency>USD</receiveCurrency>\n" +
				"            <sendCurrency>USD</sendCurrency>\n" +
				"            <defaultMaxFee>true</defaultMaxFee>\n" +
				"            <allOptions>false</allOptions>\n" +
				"        </feeLookupRequest>\n" +
				"    </soapenv:Body>\n" +
				"</soapenv:Envelope>";


		Response response = null;
		String jsonAppResponse = null;
		try {
			response =
					given()
							.relaxedHTTPSValidation()
							.header("Connection", "close")
							.header("SOAPAction", "https://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705")
							.header("Content-Type", "text/xml;charset=UTF-8")
							.header("Server", "Layer7-API-Gateway")
							.contentType(ContentType.XML)
							.body(FeeLookupxml)
							.post(new URL("http://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			//extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}

		String currentRunID = "AwaitingAssignment";
		String MGISessionID ="";

		if (response != null && response.getStatusCode() == 200) {
			String xmlResponseString = response.asString();
			xp = new XmlPath(xmlResponseString);
			MGISessionID = xp.getString("Envelope.Body.feeLookupResponse.payload.feeInfos.feeInfo.mgiSessionID.text()");

		}

		String SendValidationXml ="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
				"    <soapenv:Header>\n" +
				"        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
				"            <wsu:Timestamp />\n" +
				"            <wsse:UsernameToken>\n" +
				"                <wsse:Username>69470613</wsse:Username>\n" +
				"                <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">456</wsse:Password>\n" +
				"            </wsse:UsernameToken>\n" +
				"        </wsse:Security>\n" +
				"    </soapenv:Header>\n" +
				"    <soapenv:Body>\n" +
				"        <sendValidationRequest xmlns=\"http://www.moneygram.com/AgentConnect1705\">\n" +
				"            <agentID>69470613</agentID>\n" +
				"            <agentSequence>11</agentSequence>\n" +
				"            <mgiSessionID>MGITransID</mgiSessionID>\n" +
				"            <timeStamp>2020-12-08T23:16:28.101-06:00</timeStamp>\n" +
				"            <clientSoftwareVersion>1705</clientSoftwareVersion>\n" +
				"            <poeType>AGENTCONNECT</poeType>\n" +
				"            <channelType>LOCATION</channelType>\n" +
				"            <targetAudience>AGENT_FACING</targetAudience>\n" +
				"            <poeCapabilities>\n" +
				"                <poeCapability>\n" +
				"                    <infoKey>BACK_OFFICE_FIELDS</infoKey>\n" +
				"                    <value>true</value>\n" +
				"                </poeCapability>\n" +
				"            </poeCapabilities>\n" +
				"            <GAFVersionNumber>1.1.20190118</GAFVersionNumber>\n" +
				"            <transactionStaging>false</transactionStaging>\n" +
				"            <sendAmount>sndAmount</sendAmount>\n" +
				"            <sendCurrency>SendCurrency</sendCurrency>\n" +
				"            <destinationCountry>RCVCountry</destinationCountry>\n" +
				"            <serviceOption>Deliveryoption</serviceOption>\n" +
				"            <receiveCurrency>RCVCurrency</receiveCurrency>\n" +
				"            <fieldValues>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_FirstName</infoKey>\n" +
				"                    <value>FName</value>\n" +
				"                </fieldValue>\n" +
				"                    <fieldValue>\n" +
				"                    <infoKey>sender_LastName</infoKey>\n" +
				"                    <value>LName</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_NameSuffix</infoKey>\n" +
				"                    <value>SR</value>\n" +
				"                </fieldValue>\n" +
				"                \n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_Country</infoKey>\n" +
				"                    <value>SendCountry</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_Address</infoKey>\n" +
				"                    <value>address</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_City</infoKey>\n" +
				"                    <value>city</value>\n" +
				"                </fieldValue>\n" +
				"              <fieldValue>\n" +
				"                    <infoKey>destination_Country_SubdivisionCode</infoKey>\n" +
				"                    <value>ReceiverStateCode</value>\n" +
				"                </fieldValue>\n" +
				"              <fieldValue>\n" +
				"                    <infoKey>sender_Country_SubdivisionCode</infoKey>\n" +
				"                    <value>SenderStateCode</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PostalCode</infoKey>\n" +
				"                    <value>zipcode</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PrimaryPhoneCountryCode</infoKey>\n" +
				"                    <value>1</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PrimaryPhone</infoKey>\n" +
				"                    <value>phonenumber</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_DOB</infoKey>\n" +
				"                    <value>dob</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_Birth_Country</infoKey>\n" +
				"                    <value>USA</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PersonalId1_Type</infoKey>\n" +
				"                    <value>PAS</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PersonalId1_Number</infoKey>\n" +
				"                    <value>photoidnumber</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PersonalId1_Issue_Country</infoKey>\n" +
				"                    <value>USA</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PersonalId2_Type</infoKey>\n" +
				"                    <value>SSN</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sender_PersonalId2_Number</infoKey>\n" +
				"                    <value>352929256</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>receiver_FirstName</infoKey>\n" +
				"                    <value>RFName</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>receiver_LastName</infoKey>\n" +
				"                    <value>RLName</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>receiver_NameSuffix</infoKey>\n" +
				"                    <value>SR</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>sourceOfFunds</infoKey>\n" +
				"                    <value>SAVINGS</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>send_PurposeOfTransaction</infoKey>\n" +
				"                    <value>GIFT</value>\n" +
				"                </fieldValue>\n" +
				"                <fieldValue>\n" +
				"                    <infoKey>thirdParty_Sender_Type</infoKey>\n" +
				"                    <value>NONE</value>\n" +
				"                </fieldValue>\n" +
				"            </fieldValues>\n" +
				"            \n" +
				"            <primaryReceiptLanguage>en-US</primaryReceiptLanguage>\n" +
				"            <secondaryReceiptLanguage>es-MX</secondaryReceiptLanguage>\n" +
				"        </sendValidationRequest>\n" +
				"    </soapenv:Body>\n" +
				"</soapenv:Envelope>";

		String updatedXmlRequest = SendValidationXml

				.replace("MGITransID", MGISessionID)
				.replace("sndAmount", "10.00")
				.replace("SenderStateCode", "US-TX")
				.replace("ReceiverStateCode", "US-MN")
				.replace("SendCountry", "USA")
				.replace("SendCurrency", "USD")
				.replace("RCVCountry", "USA")
				.replace("RCVCurrency", "USD")
				.replace("address", RandomStringUtils.randomAlphabetic(15))
				.replace("city", RandomStringUtils.randomAlphabetic(5))
				.replace("zipcode",  RandomStringUtils.randomNumeric(5))
				.replace("phonenumber", "8547965825")
				.replace("Deliveryoption", "WILL_CALL")
				.replace("dob", "1985-01-01")
				.replace("RFName", RandomStringUtils.randomAlphabetic(5))
				.replace("RLName", RandomStringUtils.randomAlphabetic(5))
				.replace("FName", RandomStringUtils.randomAlphabetic(5))
				.replace("LName", RandomStringUtils.randomAlphabetic(5))
				.replace("photoidnumber", RandomStringUtils.randomNumeric(10));






		Response response7 = null;
		String jsonAppResponse2 = null;
		try {
			response7 =
					given()
							.relaxedHTTPSValidation()
							.header("Connection", "close")
							.header("SOAPAction", "https://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705")
							.header("Content-Type", "text/xml;charset=UTF-8")
							.header("Server", "Layer7-API-Gateway")
							.contentType(ContentType.XML)
							.body(updatedXmlRequest)
							.post(new URL("http://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			//extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}



		if (response7 != null && response7.getStatusCode() == 200) {
			String xmlResponseString7 = response7.asString();
			xp = new XmlPath(xmlResponseString7);
			//MGISessionID = xp.getString("Envelope.Body.feeLookupResponse.payload.feeInfos.feeInfo.mgiSessionID.text()");

		}


		String commitTransactionXml ="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:agen=\"http://www.moneygram.com/AgentConnect1305\">\n" +
				"    <soapenv:Header>\n" +
				"        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
				"            <wsu:Timestamp />\n" +
				"            <wsse:UsernameToken>\n" +
				"                <wsse:Username>69470613</wsse:Username>\n" +
				"                <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">456</wsse:Password>\n" +
				"            </wsse:UsernameToken>\n" +
				"        </wsse:Security>\n" +
				"    </soapenv:Header>\n" +
				"   <soapenv:Body>\n" +
				"        <completeSessionRequest xmlns=\"http://www.moneygram.com/AgentConnect1705\">\n" +
				"         <agentID>69470613</agentID>\n" +
				"         <agentSequence>11</agentSequence>\n" +
				"            <mgiSessionID>MGITransID</mgiSessionID>\n" +
				"         <timeStamp>2020-12-08T23:16:28.101-06:00</timeStamp>\n" +
				"            <clientSoftwareVersion>1705</clientSoftwareVersion>\n" +
				"            <poeType>AGENTCONNECT</poeType>\n" +
				"            <channelType>LOCATION</channelType>\n" +
				"            <targetAudience>AGENT_FACING</targetAudience>\n" +
				"            <poeCapabilities>\n" +
				"                <poeCapability>\n" +
				"                    <infoKey>BACK_OFFICE_FIELDS</infoKey>\n" +
				"                    <value>true</value>\n" +
				"                </poeCapability>\n" +
				"            </poeCapabilities>\n" +
				"            <commit>true</commit>\n" +
				"            <mgiSessionType>Producttype</mgiSessionType>\n" +
				"        </completeSessionRequest>\n" +
				"   </soapenv:Body>\n" +
				"</soapenv:Envelope>";

		String updatedcommitTransactionXml = commitTransactionXml
				.replace("Producttype", "SEND")
				.replace("MGITransID", MGISessionID);




		Response response4 = null;
		String jsonAppResponse4 = null;
		try {
			response4 =
					given()
							.relaxedHTTPSValidation()
							.header("Connection", "close")
							.header("SOAPAction", "https://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705")
							.header("Content-Type", "text/xml;charset=UTF-8")
							.header("Server", "Layer7-API-Gateway")
							.contentType(ContentType.XML)
							.body(updatedcommitTransactionXml)
							.post(new URL("http://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			//extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}


		String Refnumber ="";

		if (response4 != null && response4.getStatusCode() == 200) {

			String xmlResponseString9 = response4.asString();
			xp1 = new XmlPath(xmlResponseString9);
			Refnumber = xp1.getString("Envelope.Body.completeSessionResponse.payload.referenceNumber.text()");




		}





		return Refnumber;
	}






	/////////SOAP API_____End
}
