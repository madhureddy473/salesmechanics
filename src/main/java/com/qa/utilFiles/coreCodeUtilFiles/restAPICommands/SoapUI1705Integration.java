package com.qa.utilFiles.coreCodeUtilFiles.restAPICommands;

import com.aventstack.extentreports.ExtentTest;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SoapUI1705Integration {

	public XmlPath xp;
	public XmlPath xp1;

	private static final String agentID = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("agentID");
	private static final String agentSequence = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("agentSequence");


	////////SOAP API___Start

	public String getReferenceNumber_1705() {

		String checkInxml= "<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
				"    <Header>\n" +
				"        <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
				"            <wsu:Timestamp/>\n" +
				"            <wsse:UsernameToken>\n" +
				"                <wsse:Username>AgentID</wsse:Username>\n" +
				"                <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">456</wsse:Password>\n" +
				"            </wsse:UsernameToken>\n" +
				"        </wsse:Security>\n" +
				"    </Header>\n" +
				"    <Body>\n" +
				"        <checkInRequest xmlns=\"http://www.moneygram.com/AgentConnect1705\">\n" +
				"            <agentID>AgentID</agentID>\n" +
				"            <agentSequence>AgentSeq</agentSequence>\n" +
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

		String updatedcheckInxmlXmlRequest = checkInxml

				.replace("AgentID", agentID)
				.replace("AgentSeq", agentSequence);


		Response checkInresponse = null;
		String jsonCheckinResponse = null;
		try {
			checkInresponse =
					given()
							.relaxedHTTPSValidation()
							.header("Connection", "close")
							.header("SOAPAction", "https://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705")
							.header("Content-Type", "text/xml;charset=UTF-8")
							.header("Server", "Layer7-API-Gateway")
							.contentType(ContentType.XML)
							.body(updatedcheckInxmlXmlRequest)
							.post(new URL("http://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			//extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}

		if (checkInresponse != null && checkInresponse.getStatusCode() == 200) {
			jsonCheckinResponse = checkInresponse.asString();
			System.out.println("Check in successfully generated. Details: " + checkInresponse.asString() );
		}


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


		Response FeeLookupresponse = null;
		String jsonFeeLookupResponse = null;
		try {
			FeeLookupresponse =
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

		if (FeeLookupresponse != null && FeeLookupresponse.getStatusCode() == 200) {
			String xmlResponseString = FeeLookupresponse.asString();
			xp = new XmlPath(xmlResponseString);
			MGISessionID = xp.getString("Envelope.Body.feeLookupResponse.payload.feeInfos.feeInfo.mgiSessionID.text()");
			System.out.println("FreeLook up successfully generated. Details: " + MGISessionID);
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

		String updatedSendValidationXmlRequest = SendValidationXml

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
				.replace("RLName", "rcvLastnametest")
				.replace("FName", RandomStringUtils.randomAlphabetic(5))
				.replace("LName", "sendLastnametest")
				.replace("photoidnumber", RandomStringUtils.randomNumeric(10));






		Response SendValidationresponse = null;
		String jsonSendValidationResponse = null;
		try {
			SendValidationresponse =
					given()
							.relaxedHTTPSValidation()
							.header("Connection", "close")
							.header("SOAPAction", "https://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705")
							.header("Content-Type", "text/xml;charset=UTF-8")
							.header("Server", "Layer7-API-Gateway")
							.contentType(ContentType.XML)
							.body(updatedSendValidationXmlRequest)
							.post(new URL("http://q1ws.qa.moneygram.com/ac2/services/AgentConnect1705"))
							.then().extract().response();
		} catch (MalformedURLException e) {
			//extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to add test run to test rails. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
		}



		if (SendValidationresponse != null && SendValidationresponse.getStatusCode() == 200) {
			String xmlSendValidationResponseString = SendValidationresponse.asString();
			xp = new XmlPath(xmlSendValidationResponseString);
			//MGISessionID = xp.getString("Envelope.Body.feeLookupResponse.payload.feeInfos.feeInfo.mgiSessionID.text()");
			System.out.println("Send Validation successfully generated.");
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




		Response commitTransactionresponse = null;
		String jsoncommitTransactionResponse = null;
		try {
			commitTransactionresponse =
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

		if (commitTransactionresponse != null && commitTransactionresponse.getStatusCode() == 200) {

			String xmlcommitTransactionResponseString = commitTransactionresponse.asString();
			xp1 = new XmlPath(xmlcommitTransactionResponseString);
			Refnumber = xp1.getString("Envelope.Body.completeSessionResponse.payload.referenceNumber.text()");
			System.out.println("Commit Transaction successfully generated. Details: " + Refnumber);
		}
		return Refnumber;
	}






	/////////SOAP API_____End
}
