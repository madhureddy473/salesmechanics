package com.qa.utilFiles.coreCodeUtilFiles.restAPICommands.capi;


import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static io.restassured.RestAssured.given;


public class CAPICancelTransactions {
    private final String baseURL = "https://q1consumerapi.qa.moneygram.com/services/capi";
    private static final String clientkeyval = System.getenv("clientKeyValue");
    // static String clientkeyval = "Basic V0VCX2RlOGNiZWY3LWM0MjktNGM5YS1hNTZkLTQ1MDEwYTk1MzI5Mjo3ZmRiMmZkMC1lNjA1LTRlOTUtOWFlZi0xMDY2MjZlNmU1M2U=";

    public String getAuthToken(String username, String password, String captchaResp, ExtentTest currentTest,ExtentReportGenerator extentReportGenerator) {

        String requestBody = "{\"username\":"+username+",\"password\":"+password+",\"captchaResponse\":"+captchaResp+"}";
        String localheaderval = "en_US";
        String response = null;

        try {
            response = given()
                            .queryParam("grant_type", "password")
                            .header("clientkey",clientkeyval)
                            .header("locale-header",localheaderval)
                            .contentType(ContentType.JSON)
                            .body(requestBody)
                            .post(new URL(baseURL+"/login"))
                            .then().extract().path("accesTokenInfo.access_token");
        } catch (
                MalformedURLException e) {
            extentReportGenerator.addWarningMessage(currentTest,"Malformed exception thrown while trying to getAuthToken. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
        }
        return response;
    }

    public ArrayList<String> getTransactionId(String username, String authToken,ExtentTest currentTest,ExtentReportGenerator extentReportGenerator){
        String response = null;
        ArrayList<String> txnID = new ArrayList<String>();
        try {
            response =
                    given()
                            .header("clientkey",clientkeyval)
                            .header("locale-header","en_US")
                            .header("X-Auth-Username",username)
                            .header("Authorization","Bearer "+authToken)
                            .contentType(ContentType.JSON)
                            .get(new URL(baseURL+"/auth/api/v1/consumer/transaction"))
                            .then().extract().response().asString();
        } catch (
                MalformedURLException e) {
            extentReportGenerator.addWarningMessage(currentTest,"Malformed exception thrown while trying to getTransactions. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
        }

        JsonPath txnsResponse = new JsonPath(response);
        int noOfTxns = txnsResponse.getInt("transactions.size()");
        for(int i=0;i<noOfTxns;i++){
            if(!txnsResponse.get("transactions["+i+"].status").toString().equalsIgnoreCase("CANCELED")){
                txnID.add(txnsResponse.get("transactions["+i+"].id").toString());
            }
        }
        return txnID;
    }

    public String cancelTransaction(String authToken, ArrayList<String> TransactionId, ExtentTest currentTest, ExtentReportGenerator extentReportGenerator){
        String response = null;
        for (String txnID:TransactionId) {

            try {
                response =
                        given()
                                .header("clientkey", clientkeyval)
                                .header("locale-header", "en_US")
                                .header("Authorization", "Bearer " + authToken)
                                .contentType(ContentType.JSON)
                                .body("{\"reasonCode\": \"MONEY_NOT_NEEDED\",\"transactionId\": \"" + txnID + "\"}")
                                .post(new URL(baseURL + "/auth/api/v1/transaction/cancel"))
                                .then().extract().response().path("transaction.status");
            } catch (
                    MalformedURLException e) {
                extentReportGenerator.addWarningMessage(currentTest, "Malformed exception thrown while trying to Cancel a Transaction. Stacktrace: " + Arrays.toString(e.getStackTrace())); //extentReports
            }
        }
        return response;
    }
}