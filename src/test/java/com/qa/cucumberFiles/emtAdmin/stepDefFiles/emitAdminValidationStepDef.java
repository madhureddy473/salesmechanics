package com.qa.cucumberFiles.emtAdmin.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

public class emitAdminValidationStepDef {

	InitializeDriverPagesAndUtils initDrPgsAndUtils;

	public emitAdminValidationStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
		this.initDrPgsAndUtils = initDrPgsAndUtils;
	}


	@Then("User Get TRAN ID from Database by Reference Number")
	public void getTRANIDFromDatabase() throws Exception {
		String strReferenceNo= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();
		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().GetReferenceNumberFromDatabase(strReferenceNo);

	}

	@Then("User Navigate to EMT Admin and Validate fields")
	public void VerifyEMTFields(){
		HashMap<String, String> emtFields = initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getEmgDBValues();
		initDrPgsAndUtils.getTransactionDetailPage().verifyEMTFields(emtFields);

	}

	@Then("User Navigate to EMT Admin and Cancel Tansaction")
	public void CancelTansactionInEMT(){
		String strTranIDNo= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getTranIDNoString();
		String strTranType= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().gettranTypeCodeString();
		String strStatusNo= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().gettranStatusCodeString();
		initDrPgsAndUtils.getTransactionDetailPage().NavigateToEMT();
		initDrPgsAndUtils.getTransactionDetailPage().cancelTransaction(strTranIDNo,strTranType,strStatusNo);

	}

	@Then("User Get ReferenceNo and search profile in EMT portal")
	public void getProfileResults(){
		String emailID = initDrPgsAndUtils.getLoginPage().getUserNameToUse();
		String strReferenceNo= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();
		initDrPgsAndUtils.getTransactionDetailPage().emtProfileSearch(strReferenceNo,emailID);

	}

	@Then("User updates comments in EMT portal")
	public void getProfileResultsaddComments(){
		initDrPgsAndUtils.getConsumerProfilePage().emtUpdateCommnets();
	}
	@Then("User Update Consumer Status profile in EMT portal")
	public void updateConsumerStatus(){
		initDrPgsAndUtils.getConsumerProfilePage().emtUpdateProfileStatus();

	}
	@Then("User Search Admin profile in EMT portal")
	public void searchAdminProfileResults(){
		initDrPgsAndUtils.getTransactionDetailPage().emtAdminProfileSearch();
	}

	@Then("User Search Reporting-Ad hoc in EMT portal")
	public void searchReportingAdhocResults(){
		String strTranIDNo= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getTranIDNoString();
		String strReferenceNo= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();
		initDrPgsAndUtils.getTransactionDetailPage().emtReportAdhocSearch(strReferenceNo,strTranIDNo);
	}
	@When("User Navigate to EMT portal")
	public void navigateToEMTPortal() {
		initDrPgsAndUtils.getTransactionDetailPage().NavigateToEMT();
	}
	@Then("User search profile in EMT portal with {string}")
	public void SearchProfileInEMTPortalWith(String userName) {
		initDrPgsAndUtils.getTransactionDetailPage().emtProfileSearch("",userName);

	}
	@Then("User navigates to Consumer details")
	public void navigatesToConsumerDetails()
	{
		initDrPgsAndUtils.getConsumerProfilePage().clickConsumerDetails();
	}
	@Then("Validate Metadata")
	public void validateMetadata() {
		initDrPgsAndUtils.getConsumerProfilePage().validateMetaData();

	}

	@Then("Validate Consumer Profile Search Results")
	public void validateConsumerProfileSearchResults() {
		initDrPgsAndUtils.getConsumerProfilePage().validateConsumerProfileSearchResults();

	}
	@Then("User search profile in EMT portal with ConsumerID")
	public void searchProfileInEMTPortalWithConsumerID() {
		initDrPgsAndUtils.getConsumerProfilePage().getConsumerIDAndSearchProfile();
	}
	@Then("User validates Consumer Profile Dashboard")
	public void ValidateConsumerProfileDashboard() {
		initDrPgsAndUtils.getConsumerProfilePage().validateConsumerProfileDashboard();
			}

	@Then("User validates Consumer Bank accounts for {string}")
	public void validateConsumerBankAccountsFieldsFor(String userName) {
		initDrPgsAndUtils.getConsumerProfilePage().validateBankAccountFields(userName);
	}

	@Then("User validates CreditCard Accounts for {string}")
	public void validatesCreditCardAccountsFor(String userName) {
		initDrPgsAndUtils.getConsumerProfilePage().validateCreditCardAccountFields(userName);
	}

	@Then("User validates DebitCard Accounts for {string}")
	public void userValidatesDebitCardAccountsFor(String userName) {
		initDrPgsAndUtils.getConsumerProfilePage().validateDeditCardAccountFields(userName);
	}

	@Then("user validates Recurring Payments for {string}")
	public void validatesRecurringPaymentsFor(String userName) {
		initDrPgsAndUtils.getConsumerProfilePage().validateRecurringPayments(userName);
	}

	@Then("User validates In-Store Transactions for {string}")
	public void validatesInStoreTransactionsFor(String userName) {
		initDrPgsAndUtils.getConsumerProfilePage().validateInStoreTransactions(userName);
	}

	@Then("User validates Person-To-Person Transactions for {string}")
	public void validatesPersonToPersonTransactionsFor(String userName) {
		initDrPgsAndUtils.getConsumerProfilePage().validateInStorePersonToPersonTransactions(userName);

	}

	@Then("user validates IP History Summary for {string}")
	public void validatesIPHistorySummaryFor(String userName) {
		initDrPgsAndUtils.getConsumerProfilePage().validateIPHistorySummary(userName);
		}

	@Then("Validate Headers")
	public void validateHeaders() {
		initDrPgsAndUtils.getConsumerProfilePage().validateHeaders();
	}

	@Then("User validates Consumer Profile Information")
	public void Validate_Consumer_Profile_Info() {
		initDrPgsAndUtils.getConsumerProfilePage().validateConsumerProfileInfo();

	}

	@Then("User validates Consumer Profile Comments")
	public void Validate_Consumer_Profile_Comments() {
		initDrPgsAndUtils.getConsumerProfilePage().validateConsumerProfileComments();

	}

	@Then("User validates Consumer profile Activity Log")
	public void Validate_ConsumerProfileActivityLog() {
		initDrPgsAndUtils.getConsumerProfilePage().Validate_ConsumerProfileActivityLog();
	}

	@Then("User validate Lexis Nexis Activity Log")
	public void Validate_LexisNexisActivityLog() {
		initDrPgsAndUtils.getConsumerProfilePage().Validate_LexisNexisActivityLog();
	}

	@Then("User validates ID History")
	public void validatesIDHistory() {
		initDrPgsAndUtils.getConsumerProfilePage().validateIDHistory();
	}

	@Then("User validates Person-To-Person Transactions Links")
	public void validatesPersonToPersonTransactionsLinks() {
		initDrPgsAndUtils.getConsumerProfilePage().validateP2PTransLinks();
	}


	@Then("User validates Consumer Profile Dashboard Links")
	public void validatesConsumerProfileDashboardLinks() {
		initDrPgsAndUtils.getConsumerProfilePage().validateConsumerProfileDashboardLinks();
		
	}
}
