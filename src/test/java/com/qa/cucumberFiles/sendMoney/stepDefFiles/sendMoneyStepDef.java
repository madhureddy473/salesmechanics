package com.qa.cucumberFiles.sendMoney.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

import java.util.HashMap;

public class sendMoneyStepDef {

	InitializeDriverPagesAndUtils initDrPgsAndUtils;

	public sendMoneyStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
		this.initDrPgsAndUtils = initDrPgsAndUtils;
	}
	@When("User attempts to select following payment method {string},  following receiving method {string} and bank for receiver option {string}")
	public void userAttemptsToSelectFollowingPaymentMethodAndFollowingReceivingMethod(String feeEstimatorPaymentMethodOption, String feeEstimatorReceiveMethodOption, String bankForReceiverOption) {
		initDrPgsAndUtils.getFeeEstimatorPage().selectPaymentReceiveAndBankForReceiverMethods(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption);
	}
	@And("user verifies Validation message on high amounts")
	public void VerifyValidationmessageonhighrecAmounts() {
		initDrPgsAndUtils.getFeeEstimatorPage().verifymsgOnDeliveryoptions();
	}


	@When("User attempts to select following payment method {string},  following receiving method {string} and bank for receiver option {string} GFFP1")
	public void userAttemptsToSelectFollowingPaymentMethodAndFollowingReceivingMethodGFFP1(String feeEstimatorPaymentMethodOption, String feeEstimatorReceiveMethodOption, String bankForReceiverOption) {
		initDrPgsAndUtils.getFeeEstimatorPage().selectPaymentReceiveAndBankForReceiverMethods(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption);
		initDrPgsAndUtils.getFeeEstimatorPage().selectPaymentReceiveAndBankForReceiverMethods(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption);

	}
	@Then("User validates zip is not mandatory in address update page")
	public void userValidatesZipIsNotMandoryInAddressUpdatePage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().zipNotMandatory();

	}
	@Then("User sends amount and validates confirmation page for OTP to email")
	public void sendAndValidateConfirmationPage_otpToemail() throws InterruptedException {
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitemailotpTransaction();

	}



	@Then("User validates transaction review status validation message and transaction status GB")
	public void sendAndValidateforreviewConfirmationPageGB(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().tranactioreviewGB();

	}

	@Then("User validates transaction Actimize GB review status validation message and transaction status GB")
	public void sendAndValidateforActimizereviewConfirmationPageGB(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().ActimizeReviewGB();

	}


	@Then("User validates transaction review status validation message and transaction status")
	public void sendAndValidateforreviewConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().tranactioreview();

	}

	@Then("User validates transaction rejected status validation message and transaction status")
	public void sendAndValidateforrejectConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().tranactiorejected();

	}
	@And("User login to EMT and change the last name as Reject")
	public void loginandchangeLNasReject() {
		initDrPgsAndUtils.getsignupPage().EMTLoginandchangeLN();
	}
	@And("User validates transaction hold message")
	public void User_validates_transaction_hold_message() {
		initDrPgsAndUtils.getHomePage().validatesTransctionHoldMessage();
	}
/*
	@And("User enter receiver details with {string} {string}")
	public void userEntersReceiverDetails(String receiverCity, String addReceiverPhoneNo){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetails(receiverCity, addReceiverPhoneNo);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}
*/

	@Then("User Click on Track button and track the transaction")
	public void UserClickonTrackbuttonandtrackthetransaction(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().trackTransaction();
	}


	@Then("User validates fields for GFFID DE")
	public void User_validates_fieldsForDE(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().validatesFieldsforDE();
	}
	@Then("User validates fields")
	public void User_validates_fields(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().validatesFields();
	}

	@And("User searches Walmart Locations {string}")
	public void uservalidatesWalmartLocations(String pwcAddress){
		initDrPgsAndUtils.getFeeEstimatorPage().walmartLocations(pwcAddress);
	}

	@When("User attempts to select PaywithCash in Virginia payment method {string},  following receiving method {string} and bank for receiver option {string} and location {string}")
	public void WVPaywithCashPaymentMethodAndFollowingReceivingMethod(String feeEstimatorPaymentMethodOption, String feeEstimatorReceiveMethodOption, String bankForReceiverOption, String pwcAddress) {
		initDrPgsAndUtils.getFeeEstimatorPage().WVPaymentOptionAndCashPickupForReceiverMethods(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption, pwcAddress);
	}

	@When("User attempts to select PaywithCash payment method {string},  following receiving method {string} and bank for receiver option {string} and location {string}")
	public void userAttemptsToSelectPaywithCashPaymentMethodAndFollowingReceivingMethod(String feeEstimatorPaymentMethodOption, String feeEstimatorReceiveMethodOption, String bankForReceiverOption, String pwcAddress) {
		initDrPgsAndUtils.getFeeEstimatorPage().selectCashatLocationPaymentOptionAndCashPickupForReceiverMethods(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption, pwcAddress);
	}

	@When("User attempts to select PaywithCash payment method CA {string},  following receiving method {string} and bank for receiver option {string} and location {string}")
	public void userAttemptsToSelectPaywithCashPaymentMethodAndFollowingReceivingMethodCA(String feeEstimatorPaymentMethodOption, String feeEstimatorReceiveMethodOption, String bankForReceiverOption, String pwcAddress) {
		initDrPgsAndUtils.getFeeEstimatorPage().selectCashatLocationPaymentOptionAndCashPickupForReceiverMethodsCA(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption, pwcAddress);
	}

	@When("User attempts to select PaywithCash payment method GB {string},  following receiving method {string} and bank for receiver option {string} and location {string}")
	public void userAttemptsToSelectPaywithCashPaymentMethodAndFollowingReceivingMethodGB(String feeEstimatorPaymentMethodOption, String feeEstimatorReceiveMethodOption, String bankForReceiverOption, String pwcAddress) {
		initDrPgsAndUtils.getFeeEstimatorPage().selectCashatLocationPaymentOptionAndCashPickupForReceiverMethodsGB(feeEstimatorPaymentMethodOption, feeEstimatorReceiveMethodOption, bankForReceiverOption, pwcAddress);
	}



	@And("User verifies SSN and occupation required in receiver information")
	public void verifySSNandoccupationGFFID2(){
		initDrPgsAndUtils.getFeeEstimatorPage().verifyssnoccupationinreceiverinfo();
	}


	@And("User validates there are more than 5 bubbles")
	public void validatebubblescount(){
		initDrPgsAndUtils.getFeeEstimatorPage().verifynumberofbubbles();
	}


	@Then("User verifies location tax in Summary page")
	public void userverifiesLocationtaxsummarypage(){
		initDrPgsAndUtils.getFeeEstimatorPage().verifiesLocationtaxsummarypage();
	}

	@Then("User verifies location tax in Fee estimation page")
	public void userverifiesLocationtaxFeeEstimator(){
		initDrPgsAndUtils.getFeeEstimatorPage().verifiesLocationtaxFeeEstimator();
	}

	@And("User scrolls down to and clicks next button on fee estimator page")
	public void userScrollsDownAndClicksNextButtonFeeEstimator(){
		initDrPgsAndUtils.getFeeEstimatorPage().scrollDownAndClickNextButtonFeeEstimator();
	}

	@And("User enter track receiver details with {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceivertrackDetails(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetails(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}

	@And("User enters additional info in receiver info page")
	public void sofortadditionlreceiverinfo(){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().sofortddtnlinfo();
	//initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}

	@And("User adds poli additional info in receiver info page")
	public void poliadditionlreceiverinfo(){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().sofortddtnlinfo();
		//initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}


	@And("User enter fastsend receiver details with {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersfastsendReceiverDetails(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetails(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}



	@And("User verifies phone number prefix for morocco {string} {string} {string} {string} {string} {string} {string}")
	public void verifymobilenumberprefixformorocco(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().receivermobilepreifixformoroco(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		//initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}


	@And("User verifies phone number prefixes {string} {string} {string} {string} {string} {string} {string}")
	public void verifymobilenumberprefix(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().receivermobilepreifix(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		//initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}

	@And("User enter receiver details with {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetails(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetails(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}



	@And("User enter receiver details with test datasheet {string} {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailswithtestdatasheet(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount,String cardNumberSTC){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailswithtestdatasheet(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount, cardNumberSTC);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}


	@And("User enter FS UStoUS receiver details with {string} {string} {string} {string} {string} {string} {string}")
	public void userEnterFSReceiverDetails(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverustousDetails(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}

	@And("User enter FS UStoES receiver details with {string} {string} {string} {string} {string} {string} {string}")
	public void userEnterFSESReceiverDetails(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverustoesDetails(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}

	@And("User enter receiver details for receive Redirect {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailsrrd(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailsReceiveRedirect(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}
	@Then("Create Receiver profile by using the receiver details")
	public void userCreateReceiverProfileandValidateDetails(){
		initDrPgsAndUtils.getHomePage().getsignUpButton().click();
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().SignupasReceiver();

	}

	@Then("Create Receiver profile by using the receiver details US to Spain by using existing login")
	public void userCreateReceiverProfileandValidateDetailsustospaiinexistinglogin(){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().redirecttoSpain();
		initDrPgsAndUtils.getHomePage().getLoginButton().click();

		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().loginAsReceiver();

	}
	@Then("Create Receiver profile by using the receiver details US to Spain")
	public void userCreateReceiverProfileandValidateDetailsustospaiin(){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().redirecttoSpain();
		initDrPgsAndUtils.getHomePage().getLoginButton().click();
		initDrPgsAndUtils.getHomePage().getLoginButton().click();
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().SignupasReceiver();

	}

	@And("User perform Transaction via Deposit Money {string}")
	public void performDepositMoney(String receiverDebitcard){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().performDepositMoney(receiverDebitcard);
	}

	@And("User perform Spain Transaction via Deposit Money {string}")
	public void performSpainDepositMoney(String receiverDebitcard){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().performDepositMoneyspain(receiverDebitcard);
	}

	@And("User perform Spain Transaction via Deposit Money checkout fail {string}")
	public void performSpainDepositMoneyfail(String receiverDebitcard){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().performDepositMoneyspaincheckoutfail(receiverDebitcard);
	}

	@And("User perform Spain Transaction via Deposit Money Bank Account {string}")
	public void performSpainDepositMoneyBankAccount(String receiverDebitcard){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().performDepositMoneyspainBankDepo(receiverDebitcard);
	}


	@And("User enter Driver License Additional Information Details for GB")
	public void userEntersDriverLicenseAdditionalInformationGB(){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillDriverLicenseAdditionalInformation();
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickSenderNextButton();
	}

	@And("User enter Driver License Additional Information Details")
	public void userEntersDriverLicenseAdditionalInformation(){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillDriverLicenseAdditionalInformation();
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickSenderNextButton();
	}

	@Then("User sends amount and validates confirmation page for blocked transaction")
	public void sendAndValidateConfirmationPage_blocked() throws InterruptedException {
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitblockedTransaction();

	}
	@Then("User Logout and Relogins and verify the login status")
	public void Relogin_LoginPage_blocked() throws InterruptedException {
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().verifyreloginForblocked();

	}



	@And("User enter receiver Additional Information details with {string} {string}")
	public void userEntersReceiverDetailswithAdditionalInfo(String receiverCity, String addReceiverPhoneNo){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillAdditionalReceiverInformation(receiverCity, addReceiverPhoneNo);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}



	@Then("Userverifies SSN number and occupation details in the receiver info page")
	public void verifySSNAndoccupationinreceiverinfopage(){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().verifySSNandoccupation();

	}

	@Then("User verifies the SSN Tooltip")
	public void validateSSNToolTip(){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().validateSSNToolTip();

	}

	@Then("User enters payment informationnn {string}, {string}, {string} and {string} and saves it")
	public void userEntersPaymentInformationnn(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCard(creditCardNumber, expiryMonth, expiryYear, cvv);

	}

	@Then("User enters payment information {string}, {string}, {string} and {string} and saves it")
	public void userEntersPaymentInformation(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCard(creditCardNumber, expiryMonth, expiryYear, cvv);
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
	}


	@Then("User enters Additional info")
	public void userEntersPaymentInformationWithAdditionainfolDetails(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addAdditionalinfoDetails();
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
	}

	@Then("User enters payment information and validates gffid for CA {string}, {string}, {string} and {string} saves it and add Additional details")
	public void userEntersPaymentInformationWithAdditionalDetailsGFFIDCA(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCard(creditCardNumber, expiryMonth, expiryYear, cvv);
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addAdditionalDetailsforgffidCA();
		//initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
	}

	@Then("User enters payment information {string}, {string}, {string} and {string} saves it and add Additional details")
	public void userEntersPaymentInformationWithAdditionalDetails(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCard(creditCardNumber, expiryMonth, expiryYear, cvv);
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addAdditionalDetails();
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
	}

	@Then("User enters payment information {string}, {string}, {string} and {string} and saves it from the PayBills")
	public void userEntersPaymentInformationfromPaybills(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCard(creditCardNumber, expiryMonth, expiryYear, cvv);

	}

	@Then("User enters the Additional details")
	public void userEntersAdditionalDetailsInformation(){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addAdditionalDetails();

	}


	@And("User completes fastsend reveiew and send")
	public void userCompletesfastsendFraudWarningPage(){
		initDrPgsAndUtils.getSendMoneyFraudProtectPage().fastsendReviewAndSend();
	}

	@And("User completes fastsend Confirm")
	public void userCompletesfastsendConfirmPage(){
		initDrPgsAndUtils.getSendMoneyFraudProtectPage().fastsendConfirm();
	}



	@And("User completes fraud warning page")
	public void userCompletesFraudWarningPage(){
		initDrPgsAndUtils.getSendMoneyFraudProtectPage().scrollDownToAndSelectReviewAndSend();
	}

	@Then("User validates required more info page")
	public void userValidatesRequiredMoreInfoPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().moreInfoPage();

	}

	@Then("user complets the interac transaction")
	public void user_complets_interacTransaction(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitinteracTransaction();

	}

	@Then("User sends amount and validates ID upload in the confirmation page")
	public void sendmoneyreferAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().SendmoneyrefersubmitTransaction();

	}
	@Then("user enters sofort details")
	public void user_enters_sofort_details(){
		//initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCard(creditCardNumber, expiryMonth, expiryYear, cvv);
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addSendAgainAdditionalDetails();
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
	}





	@And("User clicks on cookie preferences")
	public void UserClicksOnCookiePreferences(){
		initDrPgsAndUtils.getHomePage().clicksOnCookiePrefernces();
	}
	@Then("User navigates to homepage and validates ready to pay transcation")
	public void Navigates_to_homepage_and_validates_ready_to_pay_transcation(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getiamDoneButton().click();
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().readyToPayTransaction();

	}
	@Then("User enter PromoCode and perform send money Transaction")
	public void promoCodeAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().promocodeTransaction();
	}
	@And("User completes PayBills fraud warning page")
	public void userCompletesPayBillsFraudWarningPage(){
		initDrPgsAndUtils.getSendMoneyFraudProtectPage().scrollDownToAndSelectPayBillsReviewAndSend();
	}


	@Then("User sends amount and validates Pay Bills confirmation page")
	public void payBillssendAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().payBillssubmitTransaction();
	}

	@Then("User sends amount and validates Pay Bills via PWC confirmation page")
	public void payBillsPWCsendAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().payBillssubmitAutorizationTransaction();
	}



	@Then("User sends Again amount and validates confirmation page")
	public void sendAgainAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitSendAgainTransaction();
	}

	@Then("User Fast sends Again amount and validates confirmation page")
	public void fastsendAgainAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().FastSend_submitSendAgainTransaction();
	}

	@Then("User sends Again amount and validates confirmation page via Bubble")
	public void sendAgainAndValidateConfirmationPageviaBubble(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitSendAgainTransactionViaBubble();
	}

	@Then("User sends amount sofort and validates confirmation page")
	public void sendAndValidatesofortConfirmationPage() {
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTransaction_sofort();
	}

	@Then("User makes Poli Payment and validates confirmation page")
	public void sendAndValidatePoliConfirmationPage(){
			initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTransaction_Poli();

	}

	@Then("User makes TrueLayer Payment and validates confirmation page")
	public void sendAndValidateTrueLayerConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTransaction_TrueLayer();

	}

	@Then("User makes TrueLayer Payment for Germany and validates confirmation page")
	public void sendAndValidateTrueLayerConfirmationPageGermany(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTransaction_TrueLayer_DE();

	}

	@Then("User sends amount and validates confirmation page")
	public void sendAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTransaction();

	}

	@Then("User sends amount and validates confirmation  FastSend page")
	public void sendAndValidateConfirmationfastSendPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTransactionFastSend();

	}



	@Then("User validates the tool tip for max send amount")
	public void feeEstimatorPage(){
		initDrPgsAndUtils.getFeeEstimatorPage().tooltip();

	}



	@Then("User validates referal discount in summary page")
	public void referealdiscountvalidation(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().validaterefdisount();

	}

	@Then("User sends amount and validates confirmation page via Receive Redirect")
	public void receiveRedirectsendAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().ReceiveRedirectsubmitTransaction();

	}


	@Then("User perform logout")
	public void logoutPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().logOut();

	}

	@Then("User perform Fast send and  perform logout")
	public void fastsendlogoutPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().fastSendlogOut();

	}

	@Then("User Submit Pay Bills amount and validates confirmation page")
	public void payBillsAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitPayments();

	}

	@Then("User validates 20 percent loyalty discount amount and validates confirmation page")
	public void loyalty20percentdiscountValidationConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().VerifyLoyalty20percentDiscountAndsubmitTransaction();
	}
	@Then("User sends amount and validates Ready to Pay confirmation page")
	public void sendAndValidateReadyToPayConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitPaywithCashTransaction();

	}


	@Then("User verifies for location tax in Transactions Receipt")
	public void LocationtaxinTransactionsReceipt() {
		initDrPgsAndUtils.getHomePage().TransactionsReceiptLocationtax();
	}

	@Then("User views details on home page and View Transactions Receipt")
	public void userViewsDetailsOnHomePageAndViewTransactionsReceipt() {
		initDrPgsAndUtils.getHomePage().TransactionsReceiptSingleTopMostTransactionFromHomePage();
	}
	@Then("User sends amount and validates PWMB confirmation page")
	public void sendAndValidatePWMBConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitPWMBTransaction();

	}


	@Then("User Perform Receive and validates Reference number")
	public void userPerformReceive(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getiamDoneButton().click();
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getviewReceivePage().click();
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().performReceive();
	}


	@Then("User views Survey page and validate and perform survey")
	public void userViewSurveyAndValidateSurveyPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitSurvey();
	}

	@Then("User views Pay bills Survey page and validate and perform survey")
	public void paybillsViewSurveyAndValidateSurveyPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().payBillsSubmitSurvey();
	}

	@And("User views details on home page and cancels the transaction")
	public void userViewsDetailsOnHomePageAndCancelsTheTransaction() {
		initDrPgsAndUtils.getHomePage().cancelSingleTopMostTransactionFromHomePage();
	}

	@And("User cancels the fast Send transaction")
	public void userCancelsTheFastSendTransaction() {
		initDrPgsAndUtils.getHomePage().cancelFastSendTransaction();
	}
	@And("User views details on Cancel Model POPUP")
	public void userViewsDetailsOnCancelPopup() {
		initDrPgsAndUtils.getHomePage().cancelSingleTopMostTransactionViewNewModel();
	}

	@Given("User logs in with credentials {string}, {string}, open fee estimator page, selects {string}, {string}, and sends specified amounttt {string}")
	public void user_logs_in_with_credentials_open_fee_estimator_page_and_sends_specified_amounttt(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
		initDrPgsAndUtils.getHomePage().getLoginButton().click();
		initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
		initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
		initDrPgsAndUtils.getHomePage().changeLanguage();


		initDrPgsAndUtils.getFeeEstimatorPage().estimateFeeWithSendAmountAndReceiveCountryy(sendMoney, receiverCountry);
		initDrPgsAndUtils.getFeeEstimatorPage().estimateFeeWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);
	}



	@Given("User logs in with credentials and change the language {string}, {string}, open fee estimator page, selects {string}, {string}, and sends specified amount {string}")
	public void user_logs_in_chnagelanguage_and_start_transacation(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
		initDrPgsAndUtils.getHomePage().getLoginButton().click();
		initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
		//initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
		//initDrPgsAndUtils.getHomePage().changeLanguage();
		initDrPgsAndUtils.getHomePage().degetSendSomeoneNewButton().click();
		initDrPgsAndUtils.getFeeEstimatorPage().estimateFeeWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);
	}

	@Given("User logs in with credentials {string}, {string}, open fee estimator page, selects {string}, {string}, and sends specified amount {string}")
	public void user_logs_in_with_credentials_open_fee_estimator_page_and_sends_specified_amount(String userName, String password, String receiverCountry, String receiverState, String sendMoney){
		initDrPgsAndUtils.getHomePage().getLoginButton().click();
		initDrPgsAndUtils.getLoginPage().loginWithRegistrationViaAPI(userName, password);
		initDrPgsAndUtils.getHomePage().validateHomePageLoggedInIsOpen(initDrPgsAndUtils.getLoginPage().getUserNameToUse(), initDrPgsAndUtils.getLoginPage().getPasswordToUse());
		initDrPgsAndUtils.getHomePage().changeLanguage();
		initDrPgsAndUtils.getHomePage().getSendSomeoneNewButton().click();
		initDrPgsAndUtils.getFeeEstimatorPage().estimateFeeWithSendAmountAndReceiveCountry(sendMoney, receiverCountry);
	}

	@And("User enter receiver details {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetail(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetail(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}


	@Then("User enter payment information DE language {string}, {string}, {string} and {string} saves it and add Additional details")
	public void userEnterPaymentInfoDElanguage(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCards(creditCardNumber, expiryMonth, expiryYear, cvv);
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().deaddAdditionalDetails();
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
	}

	@Then("User enter payment information {string}, {string}, {string} and {string} saves it and add Additional details")
	public void userEnterPaymentInformationWithAdditionalDetails(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addOrUseExistingCards(creditCardNumber, expiryMonth, expiryYear, cvv);
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addAdditionalDetails();
		initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();
	}

	@And("User proceeds fraud warning page")
	public void userProceedsFraudWarningPage(){
		initDrPgsAndUtils.getSendMoneyFraudProtectPage().scrollDownAndSelectReviewAndSend();
	}

	@Then("User send amount and validates confirmation page")
	public void sendsAndValidateConfirmationPage(){
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().submitTheTransaction();

	}


	@And("User enter receiver details with USA checkout card details {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailswithUSAcheckoutcard(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailswithUSAcheckoutcard(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}


	@And("User enter receiver details with Spain checkout card details {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailswithSpaincheckoutcard(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailswithspaincheckoutcard(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}
	@And("User enter receiver details with UK checkout card details {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailswithUKcheckoutcard(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailswithcheckoutcard(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}
	@And("User enter receiver details with USA cybersource card details {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailswithUSACybersourcecard(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailswithUSAcybersource(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}

	@And("User enter receiver details with spain cybersource card details {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailswithspainCybersourcecard(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailswithspaincybersource(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}
	@And("User enter receiver details with UK cybersource card details {string} {string} {string} {string} {string} {string} {string}")
	public void userEntersReceiverDetailswithUKCybersourcecard(String receiverCity, String addReceiverPhoneNo,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String PhonenumberCount){
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fillOutReceiverDetailswithcybersource(receiverCity, addReceiverPhoneNo,AccNo,RcvMobileNo,IFSCCode,PhonePrefix,PhonenumberCount);
		initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
	}

}