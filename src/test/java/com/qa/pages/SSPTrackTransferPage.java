package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import com.qa.utilFiles.coreCodeUtilFiles.restAPICommands.SoapUI1705Integration;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class SSPTrackTransferPage extends BasePageAbstractTemplate {
	@FindBy(xpath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')]")
	WebElement iamDoneButton;
	String iamDoneButtonXPath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')]";

	@FindBy(xpath = "//a//img[contains(@alt, 'MoneyGram')]")
	WebElement mgoLogo;
	String mgoLogoXPath = "//a//img[contains(@alt, 'MoneyGram')]";

	//Help Center Link:
	@FindBy(xpath = "//ul[@class='main-nav']/li[@class='ng-star-inserted']/a[(@href='/mgo/us/en/helpcenter') and contains(text(),'Help Center')]")
	WebElement helpCenter;
	String helpCenterXPath = "//ul[@class='main-nav']/li[@class='ng-star-inserted']/a[(@href='/mgo/us/en/helpcenter') and contains(text(),'Help Center')]";


	//Page Title:
	@FindBy(xpath = "//h1[(@class='title') and contains(text(),'Hello, How Can We Help?')]")
	WebElement pageTitle;
	String pageTitleXPath = "//h1[(@class='title') and contains(text(),'Hello, How Can We Help?')]";



	//Track a Transfer Link:
	@FindBy(xpath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/track')and contains(text(),'Track a Transfer')]")
	WebElement trackaTransfer;
	String trackaTransferXPath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/track')and contains(text(),'Track a Transfer')]";



	//Track Page Title:
	@FindBy(xpath = "//div[contains(text(),'Find a Transfer')]")
	WebElement trackPageTitle;
	String trackPageTitleXPath = "//div[contains(text(),'Find a Transfer')]";



	//Reference Number Input field:
	@FindBy(xpath = "//input[(@type='text') and contains(@formcontrolname,'transactionReferenceNo')]")
	WebElement referenceNumber;
	String referenceNumberXPath = "//input[(@type='text') and contains(@formcontrolname,'transactionReferenceNo')]";



	//Sender's LastName Input field:
	@FindBy(xpath = "//input[(@type='text') and contains(@formcontrolname,'senderLastName')]")
	WebElement sendersLastName;
	String sendersLastNameXPath = "//input[(@type='text') and contains(@formcontrolname,'senderLastName')]";


	//Sender's Date Of Birth Input field:
	@FindBy(xpath = "//input[(@id='senderDOB') and contains(@formcontrolname,'senderDOB')]")
	WebElement sendersDOB;
	String sendersDOBXPath = "//input[(@id='senderDOB') and contains(@formcontrolname,'senderDOB')]";



	//Receiver's Last Name Input field:
	@FindBy(xpath = "//input[(@id='receiverLastName') and contains(@formcontrolname,'receiverLastName')]")
	WebElement receiversLastName;
	String receiversLastNameXPath = "//input[(@id='receiverLastName') and contains(@formcontrolname,'receiverLastName')]";

	//I Confirm CheckBox:
	@FindBy(xpath = "//div//input[@type='checkbox']")
	WebElement iconfirmCheckBox;
	String iconfirmCheckBoxXPath = "//div//input[@type='checkbox']";


	//Find Transfer Button:
	@FindBy(xpath = "//button[contains(text(),'Find Transfer')]")
	WebElement findtransferButton;
	String findtransferButtonXPath = "//button[contains(text(),'Find Transfer')]";


	//Exit link:
	@FindBy(xpath = "//a[contains(text(),'Exit')]")
	WebElement exitLink;
	String exitLinkXPath = "//a[contains(text(),'Exit')]";



	//Self-Service Portal:
	@FindBy(xpath = "//div[contains(text(),'Self-Service Portal')]")
	WebElement SelfServicePortal;
	String SelfServicePortalXPath = "//div[contains(text(),'Self-Service Portal')]";


	//Edit a Transfer Link:
	@FindBy(xpath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/amend')and contains(text(),'Edit a Transfer')]")
	WebElement editaTransfer;
	String editaTransferXPath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/amend')and contains(text(),'Edit a Transfer')]";


	@FindBy(xpath = "//a[contains(text(),'Edit Transfer')]")
	WebElement editOnlineTransfer;
	String editOnlineTransferXPath = "//a[contains(text(),'Edit Transfer')]";

	@FindBy(xpath = "//a[contains(text(),'Cancel Transfer')]")
	WebElement CancelOnlineTransfer;
	String CancelOnlineTransferXPath = "//a[contains(text(),'Cancel Transfer')]";

	//Edit transfer page title:
	@FindBy(xpath = "//div[contains(text(),'Edit Receiver Name')]")
	WebElement editaTransferPageTitle;
	String editaTransferPageTitleXPath = "//div[contains(text(),'Edit Receiver Name')]";

	//Next button:
	@FindBy(xpath = "//button[(@class='btn-primary cta ng-star-inserted')and contains(text(),'Next')]")
	WebElement nextbtneditaTransferPage;
	String nextbtneditaTransferPageXPath = "//button[(@class='btn-primary cta ng-star-inserted')and contains(text(),'Next')]";

	//NEW RECEIVER SECOND LAST NAME Input:
	@FindBy(xpath = "//input[(@id='receiverSecondLastName') and contains(@formcontrolname,'receiverSecondLastName')]")
	WebElement rcvsecondLastName;
	String rcvsecondLastNameXPath = "//input[(@id='receiverSecondLastName') and contains(@formcontrolname,'receiverSecondLastName')]";


	//Sender Email Address Input:
	@FindBy(xpath = "//input[(@id='emailAddress') and contains(@formcontrolname,'emailAddress')]")
	WebElement emailAddress;
	String emailAddressXPath = "//input[(@id='emailAddress') and contains(@formcontrolname,'emailAddress')]";

	//Submit button:
	@FindBy(xpath = "//div//button[contains(text(),'Submit')]")
	WebElement submitButton;
	String submitButtonXPath = "//div//button[contains(text(),'Submit')]";



	//Edit Update Page Title:
	@FindBy(xpath = "//div[contains(text(),'Receiver Name Updated')]")
	WebElement editupdatedPageTitle;
	String editupdatedPageTitleXPath = "//div[contains(text(),'Receiver Name Updated')]";



	//Next Time Modal:
	@FindBy(xpath = "//div[contains(text(),'Next Time, Send Online')]")
	WebElement nexttimeModal;
	String nexttimeModalXPath = "//div[contains(text(),'Next Time, Send Online')]";



	//Create Online Profile Button:
	@FindBy(xpath = "//div//button[contains(text(),'Create Online Profile')]")
	WebElement createprofileButton;
	String createprofileButtonXPath = "//div//button[contains(text(),'Create Online Profile')]";


	//Cancel a Transfer Link:
	@FindBy(xpath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/refund')and contains(text(),'Cancel a Transfer')]")
	WebElement cancelatransfer;
	String cancelatransferXPath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/refund')and contains(text(),'Cancel a Transfer')]";


	//Cancel Transfer Page Title:
	@FindBy(xpath = "//div[contains(text(),'Cancel Transfer')]")
	WebElement cancelaTransferPageTitle;
	String cancelaTransferPageTitleXPath = "//div[contains(text(),'Cancel Transfer')]";


	//Cancel Reason dropdown:
	@FindBy(xpath = "//label[@for='reason']//following-sibling::mat-select")
	WebElement cancelaTransferDropDown;
	String cancelaTransferDropDownXPath = "//label[@for='reason']//following-sibling::mat-select";

	//Reason for cancel:
	@FindBy(xpath = "//span[(@class='mat-option-text') and contains(text(),'Need to change the send amount')]")
	WebElement cancelReason;
	String cancelReasonXPath = "//span[(@class='mat-option-text') and contains(text(),'Need to change the send amount')]";

	//Sender's Email Address Input:
	@FindBy(xpath = "//input[(@id='senderEmail')]")
	WebElement sendersEmail;
	String sendersEmailXPath = "//input[(@id='senderEmail')]";


	//Ok Button:
	@FindBy(xpath = "//div//button[contains(text(),'Ok')]")
	WebElement okbutton;
	String okbuttonXPath = "//div//button[contains(text(),'Ok')]";


	//Done button:
	@FindBy(xpath = "//div//button[contains(text(),'Done')]")
	WebElement donebutton;
	String donebuttonXPath = "//div//button[contains(text(),'Done')]";


	//Cancelled Page Title:
	@FindBy(xpath = "//div[contains(text(),'Refund Ready for Pickup')]")
	WebElement CancelledPageTitle;
	String CancelledPageTitleXPath = "//div[contains(text(),'Refund Ready for Pickup')]";


	//Create Online Profile Button:
	@FindBy(xpath = "//div//button[contains(text(),'Create Online Profile')]")
	WebElement createOnlineProfileButton;
	String createOnlineProfileButtonXPath = "//div//button[contains(text(),'Create Online Profile')]";


	//RegistrationPage:
	@FindBy(xpath = "//div//div[@class='registration-profile-container']")
	WebElement registrationPage;
	String registrationPageXPath = "//div//div[@class='registration-profile-container']";

	//Online transaction Cancel Page Title:
	@FindBy(xpath = "//div[contains(text(),'Online Transfer')]")
	WebElement onlinecancelPageTitle;
	String onlinecancelPageTitleXPath = "//div[contains(text(),'Online Transfer')]";


	//Online transaction Cancel-Login Button:
	@FindBy(xpath = "//div[@fxlayoutalign='end center']//button[contains(text(),'Log In')]")
	WebElement onlinecancelLoginButton;
	String onlinecancelLoginButtonXPath = "//div[@fxlayoutalign='end center']//button[contains(text(),'Log In')]";


	//Online-Cancel-Login:
	@FindBy(xpath = "//div//h3[contains(text(),'Log into Your MoneyGram Profile')]")
	WebElement onlinecancelLoginPage;
	String onlinecancelLoginPageXPath = "//div//h3[contains(text(),'Log into Your MoneyGram Profile')]";


	//Maybe Later Link:
	@FindBy(xpath = "//div//a[contains(text(),'Maybe Later')]")
	WebElement maybelaterLink;
	String maybelaterLinkXPath = "//div//a[contains(text(),'Maybe Later')]";



	public SSPTrackTransferPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}
	public static final SoapUI1705Integration soapui1705Integration = new SoapUI1705Integration(); //use this to find commented out testrails code
	public WebElement getPageValidationElement() {
		return pageTitle;
	}
	public String getPageValidationElementXPath() {
		return pageTitleXPath;
	}

	public WebElement getHelpCenter() {
		return helpCenter;
	}
	public String getHelpCenterXPath() {
		return helpCenterXPath;
	}
	public WebElement getPageTitle() {
		return pageTitle;
	}
	public String getPageTitleXPath() {
		return pageTitleXPath;
	}
	public WebElement getTrackaTransfer() {
		return trackaTransfer;
	}
	public String getTrackaTransferXPath() {
		return trackaTransferXPath;
	}
	public WebElement getTrackPageTitle() {
		return trackPageTitle;
	}

	public String getTrackPageTitleXPath() {
		return trackPageTitleXPath;
	}
	public WebElement getReferenceNumber() {
		return referenceNumber;
	}

	public String getReferenceNumberXPath() {
		return referenceNumberXPath;
	}
	public WebElement getSendersLastName() {
		return sendersLastName;
	}

	public String getSendersLastNameXPath() {
		return sendersLastNameXPath;
	}
	public WebElement getSendersDOB() {
		return sendersDOB;
	}

	public String getSendersDOBXPath() {
		return sendersDOBXPath;
	}
	public WebElement getReceiversLastName() {
		return receiversLastName;
	}

	public String getReceiversLastNameXPath() {
		return receiversLastNameXPath;
	}
	public WebElement getIconfirmCheckBox() {
		return iconfirmCheckBox;
	}

	public String getIconfirmCheckBoxXPath() {
		return iconfirmCheckBoxXPath;
	}
	public WebElement getFindtransferButton() {
		return findtransferButton;
	}

	public String getFindtransferButtonXPath() {
		return findtransferButtonXPath;
	}
	public WebElement getExitLink() {
		return exitLink;
	}

	public String getExitLinkXPath() {
		return exitLinkXPath;
	}
	public WebElement getSelfServicePortal() {
		return SelfServicePortal;
	}

	public String getSelfServicePortalXPath() {
		return SelfServicePortalXPath;
	}


	public WebElement getEditaTransfer() {
		return editaTransfer;
	}

	public String getEditaTransferXPath() {
		return editaTransferXPath;
	}
	public WebElement getEditaTransferPageTitle() {
		return editaTransferPageTitle;
	}

	public String getEditaTransferPageTitleXPath() {
		return editaTransferPageTitleXPath;
	}

	public WebElement getNextbtneditaTransferPage() {
		return nextbtneditaTransferPage;
	}

	public String getNextbtneditaTransferPageXPath() {
		return nextbtneditaTransferPageXPath;
	}

	public WebElement getRcvsecondLastName() {
		return rcvsecondLastName;
	}

	public String getRcvsecondLastNameXPath() {
		return rcvsecondLastNameXPath;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public String getEmailAddressXPath() {
		return emailAddressXPath;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public String getSubmitButtonXPath() {
		return submitButtonXPath;
	}

	public WebElement getCancelaTransfer() {
		return cancelatransfer;
	}

	public String getCancelaTransferXPath() {
		return cancelatransferXPath;
	}

	public WebElement getCancelaTransferPageTitle() {
		return cancelaTransferPageTitle;
	}

	public String getCancelaTransferPageTitleXPath() {
		return cancelaTransferPageTitleXPath;
	}

	public WebElement getCancelaTransferDropDown() {
		return cancelaTransferDropDown;
	}

	public String getCancelaTransferDropDownXPath() {
		return cancelaTransferDropDownXPath;
	}

	public WebElement getCancelReason() {
		return cancelReason;
	}

	public String getCancelReasonXPath() {
		return cancelReasonXPath;
	}

	public WebElement getSendersEmail() {
		return sendersEmail;
	}

	public String getSendersEmailXPath() {
		return sendersEmailXPath;
	}

	public WebElement getOkbutton() {
		return okbutton;
	}

	public String getOkbuttonXPath() {
		return okbuttonXPath;
	}

	public WebElement getDonebutton() {
		return donebutton;
	}

	public String getDonebuttonXPath() {
		return donebuttonXPath;
	}

	public WebElement getCancelledPageTitle() {
		return CancelledPageTitle;
	}

	public String getCancelledPageTitleXPath() {
		return CancelledPageTitleXPath;
	}

	public WebElement getCreateOnlineProfileButton() {
		return createOnlineProfileButton;
	}

	public String getCreateOnlineProfileButtonXPath() {
		return createOnlineProfileButtonXPath;
	}

	public WebElement getRegistrationPage() {
		return registrationPage;
	}

	public String getRegistrationPageXPath() {
		return registrationPageXPath;
	}

	public WebElement getOnlinecancelPageTitle() {
		return onlinecancelPageTitle;
	}

	public String getOnlinecancelPageTitleXPath() {
		return onlinecancelPageTitleXPath;
	}

	public WebElement getOnlinecancelLoginButton() {
		return onlinecancelLoginButton;
	}

	public String getOnlinecancelLoginButtonXPath() {
		return onlinecancelLoginButtonXPath;
	}

	public WebElement getOnlinecancelLoginPage() {
		return onlinecancelLoginPage;
	}

	public String getOnlinecancelLoginPageXPath() {
		return onlinecancelLoginPageXPath;
	}

	public WebElement getEditupdatedPageTitle() {
		return editupdatedPageTitle;
	}

	public String getEditupdatedPageTitleXPath() {
		return editupdatedPageTitleXPath;
	}

	public WebElement getNexttimeModal() {
		return nexttimeModal;
	}

	public String getNexttimeModalXPath() {
		return nexttimeModalXPath;
	}

	public WebElement getCreateprofileButton() {
		return createprofileButton;
	}

	public String getCreateprofileButtonXPath() {
		return createprofileButtonXPath;
	}

	public WebElement getMaybelaterLink() {
		return maybelaterLink;
	}

	public String getMaybelaterLinkXPath() {
		return maybelaterLinkXPath;
	}



	public void validatePageIsOpen() {
		//actionExecutor.scrollToElementViaDynamicXPath(driver, helpCenterXPath, exceptionHandling);
		helpCenter.click();
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", helpCenter);

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SELF-SERVICE PORTAL PAGE");
		System.out.println("VALIDATING SELF-SERVICE PORTAL PAGE");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, pageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SELF-SERVICE PORTAL PAGE");
		System.out.println("VALIDATED SELF-SERVICE PORTAL PAGE");
	}


	public void validateOnlinePageIsOpen() {
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, iamDoneButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
			iamDoneButton.click();
		}
		//actionExecutor.waitFiveSeconds();
		//actionExecutor.scrollToElementViaDynamicXPath(driver, helpCenterXPath, exceptionHandling);
		helpCenter.click();
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", helpCenter);

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SELF-SERVICE PORTAL PAGE");
		System.out.println("VALIDATING SELF-SERVICE PORTAL PAGE");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, pageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SELF-SERVICE PORTAL PAGE");
		System.out.println("VALIDATED SELF-SERVICE PORTAL PAGE");
	}


	public void trackaTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName){
		String refNum1705 = soapui1705Integration.getReferenceNumber_1705();
		actionExecutor.scrollToElementViaDynamicXPath(driver, trackaTransferXPath, exceptionHandling);
		trackaTransfer.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,trackPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED THE TRACK A TRANSFER PAGE");
		System.out.println("VALIDATED THE TRACK A TRANSFER PAGE");
		actions
				.click(referenceNumber)
				.sendKeys(refNum1705)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)
				.click(findtransferButton)
				.build()
				.perform();
actionExecutor.waitFiveSeconds();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,SelfServicePortalXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED THE TRANSACTION STATUS");
		System.out.println("VALIDATED THE TRANSACTION STATUS");
	}


	public void trackaOnlineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName){

		actionExecutor.scrollToElementViaDynamicXPath(driver, trackaTransferXPath, exceptionHandling);
		trackaTransfer.click();


		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,trackPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED THE TRACK A TRANSFER PAGE");
		System.out.println("VALIDATED THE TRACK A TRANSFER PAGE");
		actions
				.click(referenceNumber)
				.sendKeys(refNum)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)
				.click(findtransferButton)
				.build()
				.perform();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,SelfServicePortalXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED THE TRANSACTION STATUS");
		System.out.println("VALIDATED THE TRANSACTION STATUS");
	}

	public void editaTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String newLastName, String email ) {
		refNum = soapui1705Integration.getReferenceNumber_1705();
		actionExecutor.scrollToElementViaDynamicXPath(driver, editaTransferXPath, exceptionHandling);
		editaTransfer.click();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, trackPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED EDIT A TRANSFER PAGE");
		System.out.println("VALIDATED EDIT A TRANSFER PAGE");
		actions
				.click(referenceNumber)
				.sendKeys(refNum)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)
				.click(findtransferButton)
				.build()
				.perform();
actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editaTransferPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED EDIT RECEIVER NAME PAGE");
		System.out.println("VALIDATED EDIT RECEIVER NAME PAGE");
		nextbtneditaTransferPage.click();

		//rcvsecondLastName.sendKeys(newLastName);
		actions
				.click(rcvsecondLastName)
				.sendKeys(newLastName)
				.click(emailAddress)
				.sendKeys(email)
				.build()
				.perform();

		/*if (emailAddress == null) {
			assert false;
			emailAddress.sendKeys(email);
		}*/

		nextbtneditaTransferPage.click();
		actionExecutor.waitFiveSeconds();
		submitButton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editupdatedPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED Receiver Name Updated PAGE");
		System.out.println("VALIDATED Receiver Name Updated PAGE");



			donebutton.click();

			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nexttimeModalXPath, 0));
			extentReportGenerator.addInfoMessage(currentTest, "VALIDATED NEXT TIME MODAL");
			System.out.println("VALIDATED NEXT TIME MODAL");

			createprofileButton.click();

			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, registrationPageXPath, 0));
			extentReportGenerator.addInfoMessage(currentTest, "VALIDATED REGISTRATION PAGE");
			System.out.println("VALIDATED REGISTRATION PAGE");



	}


	public void editofflineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String newLastName, String email ) {
		refNum = soapui1705Integration.getReferenceNumber_1705();
		actionExecutor.scrollToElementViaDynamicXPath(driver, editaTransferXPath, exceptionHandling);
		editaTransfer.click();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, trackPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED EDIT A TRANSFER PAGE");
		System.out.println("VALIDATED EDIT A TRANSFER PAGE");
		actions
				.click(referenceNumber)
				.sendKeys(refNum)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)
				.click(findtransferButton)
				.build()
				.perform();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editaTransferPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED EDIT RECEIVER NAME PAGE");
		System.out.println("VALIDATED EDIT RECEIVER NAME PAGE");
		nextbtneditaTransferPage.click();

		//rcvsecondLastName.sendKeys(newLastName);
		actions
				.click(rcvsecondLastName)
				.sendKeys(newLastName)
				.click(emailAddress)
				.sendKeys(email)
				.build()
				.perform();

		/*if (emailAddress == null) {
			assert false;
			emailAddress.sendKeys(email);
		}*/

		nextbtneditaTransferPage.click();
		actionExecutor.waitFiveSeconds();
		submitButton.click();
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editupdatedPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED Receiver Name Updated PAGE");
		System.out.println("VALIDATED Receiver Name Updated PAGE");


		actionExecutor.waitFiveSeconds();
		donebutton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nexttimeModalXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED NEXT TIME MODAL");
		System.out.println("VALIDATED NEXT TIME MODAL");

		createprofileButton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, registrationPageXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED REGISTRATION PAGE");
		System.out.println("VALIDATED REGISTRATION PAGE");



	}

	public void editOnlineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String newLastName, String email ) {
		//refNum = soapui1705Integration.getReferenceNumber_1705();
		actionExecutor.scrollToElementViaDynamicXPath(driver, editOnlineTransferXPath, exceptionHandling);
		editOnlineTransfer.click();

		actionExecutor.waitFiveSeconds();
		//rcvsecondLastName.sendKeys(newLastName);
		actions
				.click(rcvsecondLastName)
				.sendKeys(newLastName)
				.build()
				.perform();

		/*if (emailAddress == null) {
			assert false;
			emailAddress.sendKeys(email);
		}*/

		nextbtneditaTransferPage.click();

		actionExecutor.waitFiveSeconds();
		submitButton.click();

		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editupdatedPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED Receiver Name Updated PAGE");
		System.out.println("VALIDATED Receiver Name Updated PAGE");

		actionExecutor.waitFiveSeconds();


		donebutton.click();
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nexttimeModalXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED NEXT TIME MODAL");
		System.out.println("VALIDATED NEXT TIME MODAL");

		createprofileButton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, registrationPageXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED REGISTRATION PAGE");
		System.out.println("VALIDATED REGISTRATION PAGE");



	}


	public void editUserOnlineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String newLastName, String email ) {
		//refNum = soapui1705Integration.getReferenceNumber_1705();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editOnlineTransferXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, editOnlineTransferXPath, exceptionHandling);
			editOnlineTransfer.click();
		}

		actionExecutor.waitFiveSeconds();
		//rcvsecondLastName.sendKeys(newLastName);
		actions
				.click(rcvsecondLastName)
				.sendKeys(newLastName)
				.build()
				.perform();

		/*if (emailAddress == null) {
			assert false;
			emailAddress.sendKeys(email);
		}*/

		nextbtneditaTransferPage.click();
		actionExecutor.waitFiveSeconds();

		submitButton.click();
		actionExecutor.waitFiveSeconds();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editupdatedPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED Receiver Name Updated PAGE");
		System.out.println("VALIDATED Receiver Name Updated PAGE");


		donebutton.click();

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SELF-SERVICE PORTAL PAGE");
		System.out.println("VALIDATING SELF-SERVICE PORTAL PAGE");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, pageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SELF-SERVICE PORTAL PAGE");
		System.out.println("VALIDATED SELF-SERVICE PORTAL PAGE");

		/*
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nexttimeModalXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED NEXT TIME MODAL");
		System.out.println("VALIDATED NEXT TIME MODAL");


		createprofileButton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, registrationPageXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED REGISTRATION PAGE");
		System.out.println("VALIDATED REGISTRATION PAGE");
*/


	}

	public void cancelaTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName, String email){

		String refNum1705 = soapui1705Integration.getReferenceNumber_1705();
		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelatransferXPath, exceptionHandling);
		cancelatransfer.click();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,trackPageTitleXPath,0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED CANCEL A TRANSFER PAGE");
		System.out.println("VALIDATED CANCEL A TRANSFER PAGE");
		actions
				.click(referenceNumber)
				.sendKeys(refNum1705)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)
				.click(findtransferButton)
				.build()
				.perform();
		nextbtneditaTransferPage.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelaTransferDropDownXPath,exceptionHandling);
		cancelaTransferDropDown.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver,cancelReasonXPath,exceptionHandling);
		cancelReason.click();
		sendersEmail.click();
		sendersEmail.sendKeys(email);
		submitButton.click();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, okbuttonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, okbutton, exceptionHandling);
			okbutton.click();
		}
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, donebuttonXPath, 1) != null) {
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,CancelledPageTitleXPath,0));
			extentReportGenerator.addInfoMessage(currentTest, "VALIDATED CANCELED TRANSFER PAGE");
			System.out.println("VALIDATED CANCELED TRANSFER PAGE");
			actionExecutor.scrollToElement(driver, donebutton, exceptionHandling);
			donebutton.click();
		}
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, createOnlineProfileButtonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, createOnlineProfileButton, exceptionHandling);
			createOnlineProfileButton.click();
		}
		//Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,registrationPageXPath,0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED REGISTRATION PAGE");
		System.out.println("VALIDATED REGISTRATION PAGE");

	}

	public void cancelonlinetransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName){
		//actionExecutor.scrollToElementViaDynamicXPath(driver, cancelatransferXPath, exceptionHandling);
		//cancelatransfer.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver, CancelOnlineTransferXPath, exceptionHandling);
		CancelOnlineTransfer.click();
/*
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,trackPageTitleXPath,0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED CANCEL A TRANSFER PAGE");
		System.out.println("VALIDATED CANCEL A TRANSFER PAGE");
		actions
				.click(referenceNumber)
				.sendKeys(refNum)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)
				.click(findtransferButton)
				.build()
				.perform();
*/
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,onlinecancelPageTitleXPath,0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED ONLINE TRANSFER PAGE");
		System.out.println("VALIDATED ONLINE TRANSFER PAGE");

		onlinecancelLoginButton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,onlinecancelLoginPageXPath,0));
		extentReportGenerator.addInfoMessage(currentTest,"LOGIN PAGE VALIDATED");
		System.out.println("LOGIN PAGE VALIDATED");


	}

	public void cancelmaybelater(String refNum, String sdrlastName, String DOB, String rcvrLastName, String email){
		refNum = soapui1705Integration.getReferenceNumber_1705();
		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelatransferXPath, exceptionHandling);
		cancelatransfer.click();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,trackPageTitleXPath,0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED CANCEL A TRANSFER PAGE");
		System.out.println("VALIDATED CANCEL A TRANSFER PAGE");
		actions
				.click(referenceNumber)
				.sendKeys(refNum)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)
				.click(findtransferButton)
				.build()
				.perform();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextbtneditaTransferPageXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, nextbtneditaTransferPage, exceptionHandling);
			nextbtneditaTransferPage.click();
		}
		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelaTransferDropDownXPath,exceptionHandling);
		cancelaTransferDropDown.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver,cancelReasonXPath,exceptionHandling);
		cancelReason.click();
		sendersEmail.click();
		sendersEmail.sendKeys(email);
		actionExecutor.waitFiveSeconds();
		submitButton.click();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, okbuttonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, okbutton, exceptionHandling);

			okbutton.click();
		}
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, CancelledPageTitleXPath, 1) != null) {
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, CancelledPageTitleXPath, 0));
			extentReportGenerator.addInfoMessage(currentTest, "VALIDATED CANCELED TRANSFER PAGE");
			System.out.println("VALIDATED CANCELED TRANSFER PAGE");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, donebuttonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, donebutton, exceptionHandling);
			donebutton.click();
		}
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, maybelaterLinkXPath, 1) != null) {
			maybelaterLink.click();
		}

	}

}





