package com.qa.cucumberFiles.contactUs.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import com.qa.pages.AlmostFinishAndConfirmationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class contactUsStepDef {

	InitializeDriverPagesAndUtils initDrPgsAndUtils;

	public contactUsStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
		this.initDrPgsAndUtils = initDrPgsAndUtils;
	}


	@And("User validates the Contact Us page is open {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void userValidatesHomePageAndContactUsPage(String legalFirstName, String legalLastName, String emailAddress, String serviceType, String sendDt, String sendCountry, String receiveCountry) {
		initDrPgsAndUtils.getContactUsPage().validatePageIsOpen();
		initDrPgsAndUtils.getContactUsPage().feedbackform(legalFirstName, legalLastName, emailAddress, serviceType, sendDt, sendCountry, receiveCountry);
	}

	@And("User validates the Complaint form is open {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void userValidatesHomePageAndComplaintsForm(String legal_FirstName, String legal_LastName, String email_Address, String service_Type, String send_Dt, String send_Country, String receive_Country) {
		initDrPgsAndUtils.getContactUsPage().validatePageIsOpen();
		initDrPgsAndUtils.getContactUsPage().complaint_form(legal_FirstName, legal_LastName, email_Address, service_Type, send_Dt, send_Country, receive_Country);
	}

	@And("User reports the Fraud {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void userValidatesHomePageAndReportFraudForm(String legal_FirstName, String legal_LastName, String email_Address, String service_Type, String reference_Number, String payment_Dt, String send_FirstName, String send_LastName) {
		initDrPgsAndUtils.getContactUsPage().validatePageIsOpen();
		initDrPgsAndUtils.getContactUsPage().reportfraud(legal_FirstName, legal_LastName, email_Address, service_Type, payment_Dt, reference_Number, send_FirstName, send_LastName);

	}




	@And("User enters the details {string}, {string}, {string}, {string}")
	public void trackaTransfer(String refNum, String senderLN, String senderDOB, String rcvLN) {
		initDrPgsAndUtils.getSSPTrackTransferPage().trackaTransfer(refNum, senderLN, senderDOB, rcvLN);
	}

	@And("User enters the Online details {string}, {string}, {string}, {string}")
	public void trackaOnlineTransfer(String refNum, String senderLN, String senderDOB, String rcvLN) {
		String refn= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();

		String lname =initDrPgsAndUtils.getSendMoneyReceiverInfoPage().getreceiverLastNameString();

		initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().trackaOnlineTransfer(refn, senderLN, senderDOB, lname);
	}


	@And("User enters the details {string}, {string}, {string}, {string}, {string}, {string}")
	public void editaTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String rcvsecondLastName, String email) {
		String refn= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();

		String lname =initDrPgsAndUtils.getSendMoneyReceiverInfoPage().getreceiverLastNameString();

		initDrPgsAndUtils.getSSPTrackTransferPage().editaTransfer(refn, sdrlastName, DOB, lname, rcvsecondLastName, email);

	}



	@And("User enters the edit offline details {string}, {string}, {string}, {string}, {string}, {string}")
	public void editofflineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String rcvsecondLastName, String email) {
		//String refn= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();

		//String lname =initDrPgsAndUtils.getSendMoneyReceiverInfoPage().getreceiverLastNameString();

		initDrPgsAndUtils.getSSPTrackTransferPage().editofflineTransfer(refNum, sdrlastName, DOB, rcvrLastName, rcvsecondLastName, email);

	}

	@And("User enters online the details {string}, {string}, {string}, {string}, {string}, {string}")
	public void editaOnlineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String rcvsecondLastName, String email) {

		String refn= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();

		String lname =initDrPgsAndUtils.getSendMoneyReceiverInfoPage().getreceiverLastNameString();

		initDrPgsAndUtils.getSSPTrackTransferPage().editOnlineTransfer(refn, sdrlastName, DOB, lname, rcvsecondLastName, email);

	}


	@And("User edit online the details {string}, {string}, {string}, {string}, {string}, {string}")
	public void edituserOnlineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String rcvsecondLastName, String email) {

		String refn= initDrPgsAndUtils.getAlmostFinishAndConfirmationPage().getReferenceNoString();

		String lname =initDrPgsAndUtils.getSendMoneyReceiverInfoPage().getreceiverLastNameString();

		initDrPgsAndUtils.getSSPTrackTransferPage().editUserOnlineTransfer(refn, sdrlastName, DOB, lname, rcvsecondLastName, email);

	}



	@And("The User enters the details {string}, {string}, {string}, {string}, {string}")
	public void cancelaTransfer(String refNum, String senderLN, String senderDOB, String rcvLN, String email) {
		initDrPgsAndUtils.getSSPTrackTransferPage().cancelaTransfer(refNum, senderLN, senderDOB, rcvLN, email);
	}

	@And("User enters the online transfer details {string}, {string}, {string}, {string}")
	public void cancelonlinetransfer(String refNum, String senderLN, String senderDOB, String rcvLN) {
		initDrPgsAndUtils.getSSPTrackTransferPage().cancelonlinetransfer(refNum, senderLN, senderDOB, rcvLN);

	}

	@And("User enters the online transfer details {string}, {string}, {string}, {string}, {string}")
	public void cancelmaybelater(String refNum, String senderLN, String senderDOB, String rcvLN, String email){
		initDrPgsAndUtils.getSSPTrackTransferPage().cancelmaybelater(refNum, senderLN, senderDOB, rcvLN, email);
	}
}
