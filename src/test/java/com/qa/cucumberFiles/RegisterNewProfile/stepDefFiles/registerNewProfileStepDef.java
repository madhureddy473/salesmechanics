package com.qa.cucumberFiles.RegisterNewProfile.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class registerNewProfileStepDef {
    InitializeDriverPagesAndUtils initDrPgsAndUtils;

    public registerNewProfileStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }
    @And("User login to EMT and change the last name as Review")
    public void loginandchangeLNasreview() {
        initDrPgsAndUtils.getsignupPage().EMTLoginandchangeLNReview();
    }

    @And("User opens fee estimator page, selects {string}, {string}, and sends specified amount {string}")
    public void user_opens_fee_estimator_page_and_sends_specified_amount(String receiverCountry, String receiverState, String sendMoney){


       initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
        initDrPgsAndUtils.getFeeEstimatorPage().estimateFeesWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);

    }

    @And("A User enter receiver detailsss with {string} {string}")
    public void userEntersReceiverDetailsss(String receiverCity, String addReceiverPhoneNo){
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailsss(receiverCity, addReceiverPhoneNo);
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
    }



    @And("validation message for UK credit card details")
    public void userverifiesvalidationUKMessageforCC() {
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().verifyUKerrormessageDetails();
    }

    @And("validation message for GB credit card details")
    public void userverifiesvalidationMessageforGBCC() {
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().verifyerrormessageDetailsGB();
    }



    @And("validation message for credit card details")
    public void userverifiesvalidationMessageforCC() {
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().verifyerrormessageDetails();
    }

    @And("A User enter receiver detailss with {string} {string}")
    public void userEntersReceiverDetailss(String receiverCity, String addReceiverPhoneNo){
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailss(receiverCity, addReceiverPhoneNo);
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
    }

    @And("user verifies Whatsnew content")
    public void userVerifieswhats_New_section(){
        initDrPgsAndUtils.getHomePage().validateWhatsnew_content();
    }
    @And("user verifies summary content")
    public void userVerifiessummary_section(){
        initDrPgsAndUtils.getHomePage().validateSummary_content();
    }

    @And("User attempts to select following payment method {string} {string} {string}")
    public void aTestuser(String feeEstimatorPaymentMethodOption, String feeEstimatorReceiveMethodOption, String bankForReceiverOption) {
        initDrPgsAndUtils.getFeeEstimatorPage().selectPaymentReceiveAndBankForReceiverMethods(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption);
    }
    @Then("Test User enters the Additional details")
    public void userEntersAdditionalDetailsInformation(){
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addAdditionalDetails();
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
    }
    @And("Create a new Customer by using Sign Up process {string} {string} {string} {string} {string} {string}")
    public void newUserSignUp(String password, String registrationPhonePrefix, String registrationDateOfBirth, String registrationAddressline, String registrationCity, String registrationPostalCode) {
        initDrPgsAndUtils.getHomePage().getsignUpButton().click();
        initDrPgsAndUtils.getsignupPage().signUp( password,  registrationPhonePrefix,  registrationDateOfBirth,  registrationAddressline,  registrationCity,  registrationPostalCode);

    }

    @And("Create a new Customer by using Sign Upp process {string} {string} {string} {string} {string} {string}")
    public void newUserSignUpp(String password, String registrationPhonePrefix, String registrationDateOfBirth, String registrationAddressline, String registrationCity, String registrationPostalCode) {
        // initDrPgsAndUtils.getHomePage().getsignUpButton().click();
        initDrPgsAndUtils.getsignupPage().signUp( password,  registrationPhonePrefix,  registrationDateOfBirth,  registrationAddressline,  registrationCity,  registrationPostalCode);

    }

    @And("Create a new Customer by using Sign Up processs {string} {string} {string} {string} {string} {string}")
    public void newUserSignUppp(String password, String registrationPhonePrefix, String registrationDateOfBirth, String registrationAddressline, String registrationCity, String registrationPostalCode) {
        initDrPgsAndUtils.getHomePage().getsignUpButton().click();
        initDrPgsAndUtils.getsignupPage().signUpprocess( password,  registrationPhonePrefix,  registrationDateOfBirth,  registrationAddressline,  registrationCity,  registrationPostalCode);

    }

    @And("Join plus rewards from homepage")
    public void joinrewardsprogramfromDashboardPage(){
        initDrPgsAndUtils.getsignupPage().joinrewardsfromdashboard();
    }

    @And("Create a new Customer with email address and contains plus Sign in email address {string} {string} {string} {string} {string} {string}")
    public void newUserSignUpwithPlusSignEmail(String password, String registrationPhonePrefix, String registrationDateOfBirth, String registrationAddressline, String registrationCity, String registrationPostalCode) {
        initDrPgsAndUtils.getHomePage().getsignUpButton().click();
        initDrPgsAndUtils.getsignupPage().signUpPlusSignEmail( password,  registrationPhonePrefix,  registrationDateOfBirth,  registrationAddressline,  registrationCity,  registrationPostalCode);

    }





    @And("User Join MoneyGram Without Enrolling Plus Rewards program for non US")
    public void newJoinsMoneygraWithoutEnrollnonus() {
        initDrPgsAndUtils.getsignupPage().signUpWithoutEnrollnonUS();
    }
    @And("User Join MoneyGram Without Enrolling Plus Rewards program")
    public void newJoinsMoneygraWithoutEnroll() {
        initDrPgsAndUtils.getsignupPage().signUpWithoutEnroll();
    }




    @And("User validate CANADIAN PR upload while registering")
    public void validateCAPRinregistration() {
        initDrPgsAndUtils.getsignupPage().signUpandvalidateCanadaPR();
    }

    @And("User validate phonenumber while registering")
    public void validatephonenumberinregistration() {
        initDrPgsAndUtils.getsignupPage().signUpandvalidatephonenumber();
    }

    @And("User Join MoneyGram With Enrolling Plus Rewards program")
    public void newJoinsMoneygraWithEnroll() {
        initDrPgsAndUtils.getsignupPage().signUpWithEnroll();
    }



    @And("User validates the Passport ID upload and Validate Passport ID Upload Option")
    public void VerifypassportIDUplad() {
        initDrPgsAndUtils.getsignupPage().VerifyIDUpload();
    }

    @And("User validates the Passport ID upload and Validate the EMT Admin flow")
    public void passportIDUplad() {
        initDrPgsAndUtils.getsignupPage().uploadPassportID();
    }

    @And("User validates the Passport ID upload and Validate the EMT Admin flow without plus number")
    public void WithoutpassportIDUplad() {
        initDrPgsAndUtils.getsignupPage().withoutuploadPassportID();
    }

    @And("User Verify Join Plus Rewards button on Dashboard Page")
    public void verifyJoinPlusRewardsButtononDashboardPage(){
        initDrPgsAndUtils.getsignupPage().verifyJoinPlusRewardsButton();
    }

    @And("User Verify Member Plus Reward Number on Dashboard Page")
    public void verifyMemberPlusRewardNumberonDashboardPage(){
        initDrPgsAndUtils.getsignupPage().verifyMemberPlusRewardNumber();
    }
    @And("User enroll Plus Reward Number from Dashboard Page")
    public void enrollplusnumberfromDashboardPage(){
        initDrPgsAndUtils.getsignupPage().enrollplusnumdashboard();
    }

        @And("A User scrolls down to and clicks fastsend next button on fee estimator page")
    public void NextButtonfastsendFeeEstimator(){
        initDrPgsAndUtils.getFeeEstimatorPage().testButtonfastsendFeeEstimator();
    }

    @And("A User scrolls down to and clicks next button on fee estimator page")
    public void NextButtonFeeEstimator(){
        initDrPgsAndUtils.getFeeEstimatorPage().testButtonFeeEstimator();
    }

    @And("A User scrolls down to and clicks next button on Payment Information page")
    public void NextButtononPaymentInformationFeeEstimator(){
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
    }


    @And("A User enter receiver details with {string} {string} {string} {string} {string} {string} {string}")
    public void userEntersReceiverDetails(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetails(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
    }
/*
    @And("A User enter receiver details with {string} {string} {string} {string}")
    public void userEntersReceiverDetails(String receiverCity, String addReceiverPhoneNo,String cardnumber,String Prefix){
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverSTCDetails(receiverCity, addReceiverPhoneNo,cardnumber,Prefix);
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
    }
*/
    @Then("A User enters payment information {string}, {string}, {string} and {string} and saves it")
    public void userEntersPaymentInformation(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCard(creditCardNumber, expiryMonth, expiryYear, cvv);
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
    }



    @Then("A User enters Bank Account Information for deposit")
    public void userEntersBankAccountInformationfordepost(){
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().wmaddBankAccountInformationDetails();
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
    }

    @Then("A User enters Bank Account Information {string}, {string}, {string} and {string} and saves it")
    public void userEntersBankAccountInformation(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addBankAccountInformationDetails();
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
    }


    @And("A User completes fraud warning page")
    public void userCompletesFraudWarningPage(){
        initDrPgsAndUtils.getSendMoneyFraudProtectPage().scrollDownToAndSelectReviewAndSend();
    }

    @Then("A User sends amount and validates confirmation page")
    public void sendAndValidateConfirmationPage(){
        initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTransaction();
    }



    @Then("A User views Survey page and validate and perform survey")
    public void userViewSurveyAndValidateSurveyPage(){
        initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitSurvey();
    }

    @And("A User views details on home page and cancels the transaction")
    public void userViewsDetailsOnHomePageAndCancelsTheTransaction() {
        initDrPgsAndUtils.getHomePage().cancelSingleTopMostTransactionFromHomePage();
    }


}
