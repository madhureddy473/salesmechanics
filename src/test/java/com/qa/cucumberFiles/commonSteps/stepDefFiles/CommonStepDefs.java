package com.qa.cucumberFiles.commonSteps.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static com.qa.testNG.Listeners.*;

public class CommonStepDefs {
    @Given("User logs in with credentialss {string}, {string}")
    public void user_logs_in_with_credentialss(String userName, String password){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);

    }

    @And("User validates the ID upload warning message is showing or not")
    public void UservalidatesPopmessageforIDUpload(){
        initDrPgsAndUtils.getHomePage().validateIDuploadpopisdisplayed();
    }

    @And("US User verifies if the user is blocked on not")
    public void USUservalidatesiftheloginblocked(){
        initDrPgsAndUtils.getHomePage().validateUSuserblockedisdisplayed();
    }


    @And("User verifies if the UK user is blocked on not")
    public void UKUservalidatesiftheloginblocked(){
        initDrPgsAndUtils.getHomePage().validateUKuserblockedisdisplayed();
    }
    @And("User verifies if the user is blocked on not")
    public void Uservalidatesiftheloginblocked(){
        initDrPgsAndUtils.getHomePage().validateuserblockedisdisplayed();
    }
    // PREFILLED WITH TESTRAIL INTEGRATION METHODS AND STEPS. DELETE IF THIS IS UNDESIRABLE.
    private String testRailsTestCaseUniqueID;
    private boolean isTestCaseIDValid;
    InitializeDriverPagesAndUtils initDrPgsAndUtils;
    public CommonStepDefs(InitializeDriverPagesAndUtils initDrPgsAndUtils){
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }
    @Given("User logs in with credentials {string}, {string}, opens fee estimator page, selects {string}, {string}, and sends specified amount {string} GFFP1")
    public void user_logs_in_with_credentials_opens_fee_estimator_page_and_sends_specified_amount_GFFP1(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen();
        initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesWithSendAmountAndReceiveCountryGFFP1(sendMoney, receiverCountry);

    }
    @Given("User logs in with existingcredentials {string}, {string}, opens fee estimator page, selects {string}, {string}, and sends specified amount {string}")
    public void user_logs_in_with_existingcredentials_opens_fee_estimator_page_and_sends_specified_amount(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithexistingcredentials(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen();
        initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);

    }


    @Given("Current test scenario is supported by application {string} {string}") //if "~~unsupported~~" string exists in this column, this test case will be skipped
    //testRails portion is only being done at this point because testrail test ID needs to be obtained from excel, so initializing and closing testrail here rather than initDrPgsAndUtils
    public void currentTestScenarioIsSupportedByApplication(String testCaseTitle_TestRails, String testCaseID_TestRails){
        testCaseTitle_TestRails = testCaseTitle_TestRails.replaceAll(" ", "");
        initDrPgsAndUtils.getExtentReportGeneratorInitDrPgsAndUtils().addInfoMessage(initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), "Currently running TestRails TestCase with title: " + testCaseTitle_TestRails + " and TestCase ID: " + testCaseID_TestRails);
        System.out.println("Currently running TestRails TestCase with title: " + testCaseTitle_TestRails + " and TestCase ID: " + testCaseID_TestRails);
        testRailsTestCaseUniqueID = testCaseID_TestRails;

        isTestCaseIDValid = railsIntegration.checkIfCaseIDExists(testCaseID_TestRails, initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), initDrPgsAndUtils.getExtentReportGeneratorInitDrPgsAndUtils());

        if(!(testCaseID_TestRails.contains("NOT_A_TEST_CASE") || testCaseID_TestRails.contains("not a test") || testCaseID_TestRails.contains("blank"))) {
            if(isTestCaseIDValid) {
                if(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("usingTestPlan").equalsIgnoreCase("false")) {
                    railsIntegration.updateRunWithCase(testCaseID_TestRails, currentRunID, initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), initDrPgsAndUtils.getExtentReportGeneratorInitDrPgsAndUtils());
                } else {
                    railsIntegration.updatePlanEntryWithCase(testCaseID_TestRails, currentEntryID, initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), initDrPgsAndUtils.getExtentReportGeneratorInitDrPgsAndUtils());
                }
            }
        }
    }
    @And("User validates that the home page is open but not logged in")
    public void userValidatesHomePageButNotLoggedIn(){
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedOutIsOpen();

    }
    @And("User validates that the home page is open and SSP page is open")
    public void userValidatesHomePageAndSSPPage(){
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedOutIsOpen();

        initDrPgsAndUtils.getSSPTrackTransferPage().validatePageIsOpen();
    }

    @And("offline User validates that the home page is open and SSP page is open")
    public void offlineuserValidatesHomePageAndSSPPage(){
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedOutIsOpen();

        initDrPgsAndUtils.getSSPTrackTransferPage().validatePageIsOpen();
    }

    @And("User validates Online that the home page is open and SSP page is open")
    public void userValidatesOnlineHomePageAndSSPPage(){
        //initDrPgsAndUtils.getHomePage().validateHomePageLoggedOutIsOpen();

        initDrPgsAndUtils.getSSPTrackTransferPage().validateOnlinePageIsOpen();
    }

    @Given("User logs in with credentiall {string}, {string}, opens fee estimator page, selects {string}, {string}, and sends specified amount {string}")
    public void user_logs_in_with_credentiall_opens_fee_estimator_page_and_sends_specified_amount(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
        initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);
        //initDrPgsAndUtils.getFeeEstimatorPage().changerreceivecurrencyy();

    }

    @Given("User logs in with credential {string}, {string}, opens fee estimator page, selects {string}, {string}, and sends specified amount {string}")
    public void user_logs_in_with_credential_opens_fee_estimator_page_and_sends_specified_amount(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
        initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);
        initDrPgsAndUtils.getFeeEstimatorPage().changerreceivecurrency();

    }


    @Given("User logs in with credentials {string}, {string}, opens fee estimator page, selects receiver state as west virginia {string}, {string}, and sends specified amount {string}")
    public void user_logs_in_sendsto_WestVirginia(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
        initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesWithSendstoWV(sendMoney, receiverCountry);
    }

    @Given("User logs in with credentials {string}, {string}, opens fee estimator page, selects {string}, {string}, and sends specified amount {string}")
    public void user_logs_in_with_credentials_opens_fee_estimator_page_and_sends_specified_amount(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().surveyAbandon();
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
        initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);
    }


    @Given("User logs in with credentials {string}, {string}, opens fee estimator page, selects {string}, and sends specified amount {string}")
    public void user_logs_in_sendstoHaiti(String userName, String password, String receiverCountry, String sendMoney) {
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().surveyAbandon();
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
        initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesHaiti(sendMoney, receiverCountry);

    }


    @And("User verifies for the for the forgot password prompt or not")
    public void UservalidatesPopmessageforforgotpwd(){
        initDrPgsAndUtils.getHomePage().validateforgotpwdisdisplayed();
    }
    @And("User validates the OTP warning message is showing or not")
    public void UservalidatesPopmessageforOTP(){
        initDrPgsAndUtils.getHomePage().validateOTPmessagedisplayed();
    }

    @Given("User register for the referal account")
    public void Userregisterforreferalaccount() throws IOException, UnsupportedFlavorException {

        initDrPgsAndUtils.getHomePage().registerreferalprofile();

    }


    @Given("User verifies Tesko and Rkiosk Locations for UK and Finland respectively")
    public void verifyfortescoandkiosklocations(){
        initDrPgsAndUtils.getHomePage().validatelocations();
        initDrPgsAndUtils.getHomePage().selectLocationandSearch();
        //initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());

    }

    @Given("User logs in with credentials {string}, {string}")
    public void user_logs_in_with_credentials(String userName, String password){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());

    }


    @Given("User logs as Receiver with credentials {string}, {string}")
    public void user_logs_with_Receiver_credentials(String userName, String password){
       // userName ="mgo_us_feb_18_2022_rcv@maildrop.cc";
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());

    }



    @Given("User logs in with credentials {string}, {string},{string}")
    public void user_logs_in_with_credentialsDOB(String userName, String password){
        initDrPgsAndUtils.getHomePage().getLoginButton().click();
        initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
        initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());

    }

    //test rails integration 'after' hook
    @After
    public void setTestRailsCaseStatus(Scenario passFail){
        String rerun = new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("rerun");
        if(!(testRailsTestCaseUniqueID.contains("NOT_A_TEST_CASE") || testRailsTestCaseUniqueID.contains("not a test") || testRailsTestCaseUniqueID.contains("blank"))) {
            if(isTestCaseIDValid) {
                System.out.println("Test case status before test rails upload: " + passFail.getStatus() + " on test case: " + passFail.getName());
                if (passFail.getStatus() == Status.FAILED) {
                    if (rerun.equalsIgnoreCase("false")) {
                        extentReportGenerator.addInfoMessage(initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), "This run is not a rerun, will set failed test case status to retest status on testrail, if active.");
                        railsIntegration.addResultForCase("4", testRailsTestCaseUniqueID, currentRunID, initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), initDrPgsAndUtils.getExtentReportGeneratorInitDrPgsAndUtils());
                    } else {
                        railsIntegration.addResultForCase("5", testRailsTestCaseUniqueID, currentRunID, initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), initDrPgsAndUtils.getExtentReportGeneratorInitDrPgsAndUtils());
                    }
                } else if(passFail.getStatus() == Status.PASSED) {
                    railsIntegration.addResultForCase("1", testRailsTestCaseUniqueID, currentRunID, initDrPgsAndUtils.getCurrentTestInitDrPgsAndUtils(), initDrPgsAndUtils.getExtentReportGeneratorInitDrPgsAndUtils());
                }
            }
        }
    }
}
