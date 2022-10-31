package com.qa.pages;
import java.sql.*;
import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import com.qa.utilFiles.coreCodeUtilFiles.restAPICommands.capi.CAPIRegistrationIDUpload;
import io.cucumber.java.Scenario;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;

public class AlmostFinishAndConfirmationPage extends BasePageAbstractTemplate{

	@FindBy(xpath = "//mg-fast-send-review/div/h3[contains(text(),'Before you send, please confirm')]")
	WebElement fastSendConfirmpopup;
	String fastSendConfirmpopupXPath = "//mg-fast-send-review/div/h3[contains(text(),'Before you send, please confirm')]";

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement fastsendAgainConfirm;
	String fastsendAgainConfirmXPath = "//button[contains(text(),'Confirm')]";



	@FindBy(xpath = "//input[@name='userID']")
	WebElement emtUserName;
	String emtUserNameXPath = "//input[@name='userID']";

	@FindBy(xpath = "//input[@name='userPassword']")
	WebElement emtPassword;
	String emtPasswordXPath = "//input[@name='userPassword']";

	@FindBy(xpath = "//input[@value='Login']")
	WebElement emtLoginButton;
	String emtLoginButtonXPath = "//input[@value='Login']";

	@FindBy(xpath = "//input[@name='tranId']")
	WebElement emtTranIDInput;
	String emtTranIDInputXPath = "//input[@name='tranId']";

	@FindBy(xpath = "//input[@type='submit']")
	WebElement emtsubmitButton;
	String emtsubmitButtonXPath = "//input[@type='submit']";

	@FindBy(xpath = "//input[@name='submitCancelTransaction']")
	WebElement emtsubmitCancelTransaction;
	String emtsubmitCancelTransactionXPath = "//input[@name='submitCancelTransaction']";

	@FindBy(xpath = "//a[contains(text(),'Take Ownership')]")
	WebElement emtTakeOwnership;
	String emtTakeOwnershipXPath = "//a[contains(text(),'Take Ownership')]";


	@FindBy(xpath = "//input[@value='Record']")
	WebElement emtRecordButton;
	String emtRecordButtonXPath = "//input[@value='Record']";

	@FindBy(xpath = "//input[@name='searchLoginId']")
	WebElement emtsearchEmailID;
	String emtsearchEmailIDXPath = "//input[@name='searchLoginId']";

	@FindBy(xpath = "//input[@name = 'userID']")
	WebElement emtUserIdInput;
	String emtUserIdInputXPath = "//input[@name = 'userID']";

	@FindBy(xpath = "//input[@name='selDates' and @value='N']")
	WebElement emtNoDateRadio;
	String emtNoDateRadioXPath = "//input[@name='selDates' and @value='N']";


	@FindBy(xpath = "//input[@value='Search']")
	WebElement emtSearchButton;
	String emtSearchButtonXPath = "//input[@value='Search']";

	@FindBy(xpath = "//font/b[contains(text(),'SEN')]")
	WebElement emtStatus;
	String emtStatusXPath = "//font/b[contains(text(),'SEN')]";

	@FindBy(xpath = "(//td[@class='TD-SMALL'])[1]")
	WebElement emtAdminUsername;
	String emtAdminUsernameXPath = "(//td[@class='TD-SMALL'])[1]";

	@FindBy(xpath = "//a[contains(@href,'transactionDetail')]")
	WebElement emttransactionDetailText;
	String emttransactionDetailTextXPath = "//a[contains(@href,'transactionDetail')]";


	@FindBy(xpath = "//td[contains(text(),'MGSEND (MoneyGram Send)')]")
	WebElement emtMGSEND;
	String emtMGSENDXPath = "//td[contains(text(),'MGSEND (MoneyGram Send)')]";

	@FindBy(xpath = "//input[(@type='text') and contains(@formcontrolname,'senderLastName')]")
	WebElement sendersLastName;
	String sendersLastNameXPath = "//input[(@type='text') and contains(@formcontrolname,'senderLastName')]";


	@FindBy(xpath = "//div[@class='spinner-container']/img[contains(@src,'assets/images/spinner.gif')]")
	WebElement spinnerloading;
	String spinnerloadingXPath = "//div[@class='spinner-container']/img[contains(@src,'assets/images/spinner.gif')]";



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


	@FindBy(xpath = "//div[contains(text(),'Self-Service Portal')]")
	WebElement SelfServicePortal;
	String SelfServicePortalXPath = "//div[contains(text(),'Self-Service Portal')]";

	@FindBy(xpath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/track')and contains(text(),'Track a Transfer')]")
	WebElement trackaTransfer;
	String trackaTransferXPath = "//a[(@href='/mgo/us/en/helpcenter/selfservice/track')and contains(text(),'Track a Transfer')]";

	@FindBy(xpath = "//div[contains(text(),'Find a Transfer')]")
	WebElement trackPageTitle;
	String trackPageTitleXPath = "//div[contains(text(),'Find a Transfer')]";


	@FindBy(xpath = "//input[(@type='text') and contains(@formcontrolname,'transactionReferenceNo')]")
	WebElement treferenceNumber;
	String treferenceNumberXPath = "//input[(@type='text') and contains(@formcontrolname,'transactionReferenceNo')]";


	@FindBy(xpath = "//input[@id='BackendFormTan']")
	WebElement sofortBackendFormTan;
	String sofortBackendFormTanXPath = "//input[@id='BackendFormTan']";

	@FindBy(xpath = "//input[@id='BackendFormLOGINNAMEUSERID']")
	WebElement sofortuserID;
	String sofortuserIDXPath = "//input[@id='BackendFormLOGINNAMEUSERID']";

	@FindBy(xpath = "//input[@id='BackendFormUSERPIN']")
	WebElement sofortpassword;
	String sofortpasswordXPath = "//input[@id='BackendFormUSERPIN']";

	@FindBy(xpath = "//button[contains(text(),'Weiter')]")
	WebElement sofortWeiter;
	String sofortWeiterXPath = "//button[contains(text(),'Weiter')]";



	@FindBy(xpath = "(//div[@id='modal-button-container']/button[contains(text(),'Alle akzeptieren')])[2]")
	WebElement sofortfirst;
	String sofortfirstXPath = "(//div[@id='modal-button-container']/button[contains(text(),'Alle akzeptieren')])[2]";

	@FindBy(xpath = "//input[@id='BankCodeSearch']")
	WebElement sofortBankCodeSearch;
	String sofortBankCodeSearchXPath = "//input[@id='BankCodeSearch']";

	@FindBy(xpath = "//a[@data-reference='Demo Bank']")
	WebElement sofortDemoBank;
	String sofortDemoBankXPath = "//a[@data-reference='Demo Bank']";



	@FindBy(xpath = "//button[@id='btn-yes']/span[contains(text(),'Yes, Continue')]")
	WebElement duplicateContinue;
	String duplicateContinueXPath = "//button[@id='btn-yes']/span[contains(text(),'Yes, Continue')]";

	@FindBy(xpath = "//p[contains(text(),'For security reasons')]")
	WebElement rejecttransmsginconfrmpage;
	String rejecttransmsginconfrmpageXPath = "//p[contains(text(),'For security reasons')]";

	@FindBy(xpath = "(//button[contains(text(),'Done')])[1]")
	WebElement iamDoneButtoncnfmt;
	String iamDoneButtoncnfmtXPath = "(//button[contains(text(),'Done')])[1]";

	@FindBy(xpath = "(//button[contains(text(),'Done')])[3]")
	WebElement iamDoneButtoncnfmt3;
	String iamDoneButtoncnfmt3XPath = "(//button[contains(text(),'Done')])[3]";

	@FindBy(xpath = "//div[@class='mgo-button-container']/button[contains(text(),'Done')]")
	WebElement iamDoneButtonFs;
	String iamDoneButtonFsXPath = "//div[@class='mgo-button-container']/button[contains(text(),'Done')]";


	@FindBy(xpath = "//a[contains(text(), 'View Profile Info')]")
	WebElement viewProfileInfoButton;
	String viewProfileInfoButtonXPath = "//a[contains(text(), 'View Profile Info')]";

	@FindBy(xpath = "//div[contains(text(),'has been sent to')]")
	WebElement emailtootptext;
	String emailtootptextXPath = "//div[contains(text(),'has been sent to')]";

	@FindBy(xpath = "//input[@id='postalCode-0']")
	WebElement editZipTextInput;
	String editZipTextInputXPath = "//input[@id='postalCode-0']";



	@FindBy(xpath = "//div[contains(text(),'It must be an official')]")
	WebElement IDuploadinconfrmpage;
	String IDuploadinconfrmpageXPath = "//div[contains(text(),'It must be an official')]";


	@FindBy(xpath = "(//h3[contains(text(),'We need a little bit more information')])[1]")
	WebElement moreInfoPage;
	String moreInfoPageXPath = "(//h3[contains(text(),'We need a little bit more information')])[1]";


	@FindBy(xpath = "//h6[contains(text(), 'Home & Billing Address')]/../a[contains(text(), 'Edit')]")
	WebElement editButoon;
	String editButoonXPath = "//h6[contains(text(), 'Home & Billing Address')]/../a[contains(text(), 'Edit')]";

	@FindBy(xpath = "//a[contains(text(), 'Cancel')]/../../button[contains(text(), 'Save')]")
	WebElement saveButton;
	String saveButtonXPath = "//a[contains(text(), 'Cancel')]/../../button[contains(text(), 'Save')]";


	@FindBy(xpath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]")
	WebElement whatsNewPopUpHeader;
	String whatsNewPopUpHeaderXPath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]";

	@FindBy(xpath = "//div[contains(text(),'Plus Rewards Discount')]")
	WebElement loyaltydiscount;
	String loyaltydiscountXPath = "//div[contains(text(),'Plus Rewards Discount')]";

	@FindBy(xpath = "//a[contains(text(), 'Track + Receive')]")
	WebElement track;
	String trackXPath = "//a[contains(text(), 'Track + Receive')]";

	@FindBy(xpath = "//input[@id='referenceNumber']")
	WebElement refNumber;
	String refNumberXPath = "//input[@id='referenceNumber']";

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;
	String lastnameXPath = "//input[@id='lastName']";

	@FindBy(xpath = "//button[@type='submit']")
	WebElement trackyourMoney;
	String trackyourMoneyXPath = "//button[@type='submit']";

	@FindBy(xpath = "//label[contains(text(), 'ID Type')]")
	WebElement IDType;
	String IDTypeXPath = "//label[contains(text(), 'ID Type')]";


	@FindBy(xpath = "//label[contains(text(), 'ID number')]")
	WebElement IDNumber;
	String IDNumberXPath = "//label[contains(text(), 'ID number')]";

	@FindBy(xpath = "//label[contains(text(), 'Occupation')]")
	WebElement Occupation;
	String OccupationXPath = "//label[contains(text(), 'Occupation')]";

	@FindBy(xpath = "//label[contains(text(), 'Social Security Number')]")
	WebElement SocialSecurityNumber;
	String SocialSecurityNumberXPath = "//label[contains(text(), 'Social Security Number')]";


	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/mg-send-block/div/div[2]/div/h3")
	WebElement blockedtransaction;
	String blockedtransactionXPath = "//*[@id=\"cdk-step-content-0-2\"]/mg-send-block/div/div[2]/div/h3";

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/mg-send-block/div/div[5]/div/div/button")
	WebElement iamDone;
	String iamDoneXPath = "//*[@id=\"cdk-step-content-0-2\"]/mg-send-block/div/div[5]/div/div/button";


	@FindBy(xpath = "//p[contains(text(),'For security reasons')]")
	WebElement reviewvaldnmsginconfrmpage;
	String reviewvaldnmsginconfrmpageXPath = "//p[contains(text(),'For security reasons')]";

	@FindBy(xpath = "//*[@id='loginButn']")
	WebElement Loginbutton;
	String LoginbuttonXPath = "//*[@id='loginButn']";

	@FindBy(xpath = "//*[@id=\"emailAddress\"]")
	WebElement username;
	String usernameXPath = "//*[@id=\"emailAddress\"]";

	@FindBy(xpath = "//button[@id='logoutButn']")
	WebElement homepageLogout;
	String homepageLogoutXPath = "//button[@id='logoutButn']";


	@FindBy(xpath = "//button[@id='btn-logout']")
	WebElement homepageLogoutConfirm;
	String homepageLogoutConfirmXPath = "//button[@id='btn-logout']";






	@FindBy(xpath = "//*[@id=\"login_password\"]")
	WebElement password;
	String passwordXPath = "//*[@id=\"login_password\"]";

	@FindBy(xpath = "//*[@id=\"labels.logIn\"]")
	WebElement loginbutton;
	String loginbuttonXPath = "//*[@id=\"labels.logIn\"]";

	@FindBy(xpath = "//*[@id=\"cdk-step-content-1-1\"]/mg-profile-closed/div/h3")
	WebElement blockedlogin;
	String blockedloginXPath = "//*[@id=\"cdk-step-content-1-1\"]/mg-profile-closed/div/h3";


	@FindBy(xpath = "//h1[@class = 'title' and contains(text(), 'Summary')]")
	WebElement almostFinishPageHeader;
	String almostFinishPageHeaderXPath = "//h1[@class = 'title' and contains(text(), 'Summary')]";

	@FindBy(xpath = "//button[@class = 'mgo-button' and @id = 'transactionSubmit']")
	WebElement submitTransaction;
	String submitTransactionXPath = "//button[@class = 'mgo-button' and @id = 'transactionSubmit']";

	@FindBy(xpath = "//span[contains(text(),'Yes, Continue')]")
	WebElement interacduplicatecontinue;
	String interacduplicatecontinueXPath = "//span[contains(text(),'Yes, Continue')]";



	@FindBy(xpath = "//button/span[contains(text(),'Yes, Continue')]/parent::button")
	WebElement yesContinueButton;
	String yesContinueButtonXPath = "//button/span[contains(text(),'Yes, Continue')]/parent::button";

	@FindBy(xpath = "//button[@id='btn-yes']")
	WebElement btnyesContinueButton;
	String btnyesContinueButtonXPath = "//button[@id='btn-yes']";



	@FindBy(xpath = "//mg-send-need-more-info/div/form/div/button[contains(text(),'Submit')]")
	WebElement birthCountrySubmitButton;
	String birthCountrySubmitButtonXPath = "//mg-send-need-more-info/div/form/div/button[contains(text(),'Submit')]";

	@FindBy(xpath = "//button[@class = 'btn-primary' and contains(text(), 'Ok')]")
	WebElement whatsNewPopUpHeaderOKButton;
	String whatsNewPopUpHeaderOKButtonXPath = "//button[@class = 'btn-primary' and contains(text(), 'Ok')]";


	@FindBy(xpath = "//button[contains(text(),'Track Your Money')]")
	WebElement trackYourMoneyButton;
	String trackYourMoneyButtonXPath = "//button[contains(text(),'Track Your Money')]";




	@FindBy(xpath = "//button[@class = 'mgo-button' and contains(text(),'Submit Payment')]")
	WebElement paybillsubmitTransaction;
	String paybillsubmitTransactionXPath = "//button[@class = 'mgo-button' and contains(text(),'Submit Payment')]";

	@FindBy(xpath = "//mat-option/span[contains(text(),'Mexico')]")
	WebElement optionSpan;
	String optionSpanXPath = "//mat-option/span[contains(text(),'Mexico')]";

	@FindBy(xpath = "//input[@id='senderBirthCountry']")
	WebElement senderBirthCountry;
	String senderBirthCountryXPath = "//input[@id='senderBirthCountry']";

	@FindBy(xpath = "//mg-send-success/div/div[contains(@class,'button-')]/div/div/button[contains(text(),'Tell Us How')]")
	WebElement tellUsHowsurvey;
	String tellUsHowsurveyXPath = "//mg-send-success/div/div[contains(@class,'button-')]/div/div/button[contains(text(),'Tell Us How')]";

	@FindBy(xpath = "//mg-sent/div/div[contains(@class,'button-')]/div/div/button[contains(text(),'Tell Us How')]")
	WebElement PayBillstellUsHowsurvey;
	String PayBillstellUsHowsurveyXPath = "//mg-sent/div/div[contains(@class,'button-')]/div/div/button[contains(text(),'Tell Us How')]";


	@FindBy(xpath = "(//mat-radio-group[1]/div/mat-radio-button[5])[1]")
	WebElement surveyQuestionOne;
	String surveyQuestionOneXPath = "(//mat-radio-group[1]/div/mat-radio-button[5])[1]";

	@FindBy(xpath = "(//mat-radio-group[1]/div/mat-radio-button[5])[2]")
	WebElement surveyQuestionTwo;
	String surveyQuestionTwoXPath = "(//mat-radio-group[1]/div/mat-radio-button[5])[2]";

	@FindBy(xpath = "//button[contains(text(),'Submit Survey')]")
	WebElement submitSurvey;
	String submitSurveyXPath = "//button[contains(text(),'Submit Survey')]";

	@FindBy(xpath = "//input[@formcontrolname='promoCode']")
	WebElement promoCode;
	String promoCodeXPath = "//input[@formcontrolname='promoCode']";

	@FindBy(xpath = "//mg-pwc-confirmation//h3[contains(text(), 'Ready to Pay')]")
	WebElement readyToPaySentSuccessfully;
	String readyToPaySentSuccessfullyXPath = "//mg-pwc-confirmation//h3[contains(text(), 'Ready to Pay')]";

	@FindBy(xpath = "//mg-send-success/div/div/div[contains(text(),'Your transfer is in progress')]")
	WebElement pwmbSentSuccessfully;
	String pwmbSentSuccessfullyXPath = "//mg-send-success/div/div/div[contains(text(),'Your transfer is in progress')]";



	@FindBy(xpath = "//mg-send-success//div[contains(text(), 'Your transfer is sent')]")
	WebElement transferSentSuccessfully;
	String transferSentSuccessfullyXPath = "//mg-send-success//div[contains(text(), 'Your transfer is sent')]";

	@FindBy(xpath = "//mg-send-success-stp//div[contains(text(), 'Your transfer is on its way')]")
	WebElement transferFastSendSentSuccessfully;
	String transferFastSendSentSuccessfullyXPath = "//mg-send-success-stp//div[contains(text(), 'Your transfer is on its way')]";




	@FindBy(xpath = "//div[contains(text(),'Your transfer is sent!')]")
	WebElement interacsentsuccessfully;
	String interacsentsuccessfullyXPath = "//div[contains(text(),'Your transfer is sent!')]";



	@FindBy(xpath = "//mg-rtb-confirmation//div[contains(text(), 'Your transfer is sent')]")
	WebElement soforttransferSentSuccessfully;
	String soforttransferSentSuccessfullyXPath = "//mg-rtb-confirmation//div[contains(text(), 'Your transfer is sent')]";



	@FindBy(xpath = "//div/span[contains(text(), 'Not for cash pick up')]")
	WebElement notcashpickupSuccessfully;
	String notcashpickupSuccessfullyXPath = "//div/span[contains(text(), 'Not for cash pick up')]";

	@FindBy(xpath = "//div[contains(@class,'reference-no') and contains(text(), 'NO.')] | //div[contains(@class,'auth-no') and contains(text(), 'NO.')]")
	WebElement referenceNo;
	String referenceNoXPath = "//div[contains(@class,'reference-no') and contains(text(), 'NO.')] | //div[contains(@class,'auth-no') and contains(text(), 'NO.')]";


	@FindBy(xpath = "//mg-send-success-stp//div[contains(text(), 'Your transfer is on its way')]/parent::div/parent::div/div[2]/div/div[contains(text(),'NO')]")
	WebElement fastSendreferenceNo;
	String fastSendreferenceNoXPath = "//mg-send-success-stp//div[contains(text(), 'Your transfer is on its way')]/parent::div/parent::div/div[2]/div/div[contains(text(),'NO')]";



	@FindBy(xpath = "(//div[contains(@class,'reference-no') and contains(text(), 'NO.')] | //div[contains(@class,'auth-no') and contains(text(), 'NO.')])[1]")
	WebElement referenceNoFastSend;
	String referenceNoFastSendXPath = "(//div[contains(@class,'reference-no') and contains(text(), 'NO.')] | //div[contains(@class,'auth-no') and contains(text(), 'NO.')])[1]";




	@FindBy(xpath = "//mg-send-success-stp/div/div/div/div[contains(@class,'reference-no') and contains(text(), 'NO.')]")
	WebElement receiveRedirectreferenceNo;
	String receiveRedirectreferenceNoXPath = "//mg-send-success-stp/div/div/div/div[contains(@class,'reference-no') and contains(text(), 'NO.')]";



	@FindBy(xpath = "//mg-pwc-confirmation/div/div/div/div/p[contains(text(),'AUTHORIZATION NO')]")
	WebElement authorizationNo;
	String authorizationNoXPath = "//mg-pwc-confirmation/div/div/div/div/p[contains(text(),'AUTHORIZATION NO')]";

	@FindBy(xpath = "//mg-ready-to-pay/div/div/div/div[contains(text(),'AUTHORIZATION NO')]")
	WebElement PWCauthorizationNo;
	String PWCauthorizationNoXPath = "//mg-ready-to-pay/div/div/div/div[contains(text(),'AUTHORIZATION NO')]";



	@FindBy(xpath = "//mg-send-success/div/div/div/div[contains(text(),'AUTHORIZATION NO')]")
	WebElement pwmbAuthorizationNo;
	String pwmbAuthorizationNoXPath = "//mg-send-success/div/div/div/div[contains(text(),'AUTHORIZATION NO')]";


	@FindBy(xpath = "//div/span[contains(text(),'Transaction Complete')]")
	WebElement transactionStatus;
	String transactionStatusXPath = "//div/span[contains(text(),'Transaction Complete')]";

	@FindBy(xpath = "//div/span[contains(text(),'Ready for Pickup')]")
	WebElement transactionStatuReadyforPickup;
	String transactionStatuReadyforPickupXPath = "//div/span[contains(text(),'Ready for Pickup')]";



	@FindBy(xpath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')]")
	WebElement iamDoneButton;
	String iamDoneButtonXPath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')]";


	@FindBy(xpath = "//mg-send-success-stp/div/div[contains(@class,'button-container')]/div/div/button[contains(text(),'m Done')]")
	WebElement iamDoneFastsendButton;
	String iamDoneFastsendButtonXPath = "//mg-send-success-stp/div/div[contains(@class,'button-container')]/div/div/button[contains(text(),'m Done')]";

	@FindBy(xpath = "//textarea[@id='Q1']")
	WebElement littlebitq1;
	String littlebitq1XPath = "//textarea[@id='Q1']";

	@FindBy(xpath = "//textarea[@id='Q2']")
	WebElement littlebitq2;
	String littlebitq2XPath = "//textarea[@id='Q2']";

	@FindBy(xpath = "(//mg-gffp-radio-button/div/label[contains(text(),'Are you making a ')]/parent::div/mat-radio-group/div/mat-radio-button)[1]")
	WebElement littlebitRadio1;
	String littlebitRadio1XPath = "(//mg-gffp-radio-button/div/label[contains(text(),'Are you making a ')]/parent::div/mat-radio-group/div/mat-radio-button)[1]";

	@FindBy(xpath = "(//mg-gffp-radio-button/div/label[contains(text(),'Have you ever met ')]/parent::div/mat-radio-group/div/mat-radio-button)[1]")
	WebElement littlebitRadio2;
	String littlebitRadio2XPath = "(//mg-gffp-radio-button/div/label[contains(text(),'Have you ever met ')]/parent::div/mat-radio-group/div/mat-radio-button)[1]";

	@FindBy(xpath = "//mg-send-manual-review//button[@type='submit']")
	WebElement littlebitSubmit;
	String littlebitSubmitXPath = "//mg-send-manual-review//button[@type='submit']";





	@FindBy(xpath = "//mg-send-success-stp/div/div[contains(@class,'row button')]/div/div/button[contains(text(),'Done')]")
	WebElement iamDoneButtonstp;
	String iamDoneButtonstpXPath = "//mg-send-success-stp/div/div[contains(@class,'row button')]/div/div/button[contains(text(),'Done')]";

	@FindBy(xpath = "//span[contains(text(),'Please select an ID type')]")
	WebElement gffid1forDE;
	String gffid1forDEXPath = "//span[contains(text(),'Please select an ID type')]";

	@FindBy(xpath = "//*[@id=\"cdk-step-content-1-0\"]/mg-send-summary/div/div[4]/div[2]/div[3]/div[2]")
	WebElement referealdiscamount;
	String referealdiscamountXPath = "//*[@id=\"cdk-step-content-1-0\"]/mg-send-summary/div/div[4]/div[2]/div[3]/div[2]";


	@FindBy(xpath = "//mg-sent/div/div[contains(@class,'row ng-star-inserted')]/div/a[contains(text(),'Done')]")
	WebElement payBillsiamDoneButton;
	String payBillsiamDoneButtonXPath = "//mg-sent/div/div[contains(@class,'row ng-star-inserted')]/div/a[contains(text(),'Done')]";

	@FindBy(xpath = "//mg-sent/div/div[contains(@class,'row button-container ng-star-inserted')]/div/div/button[contains(text(),'Done')]")
	WebElement walmartpayBillsiamDoneButton;
	String walmartpayBillsiamDoneButtonXPath = "//mg-sent/div/div[contains(@class,'row button-container ng-star-inserted')]/div/div/button[contains(text(),'Done')]";


	@FindBy(xpath = "//input[@id='IDEBIT_TRACK2']")
	WebElement IDEBITTRACK2;
	String IDEBITTRACK2XPath = "//input[@id='IDEBIT_TRACK2']";

	@FindBy(xpath = "//input[@id='IDEBIT_ISSCONF']")
	WebElement IDEBITISSCONF;
	String IDEBITISSCONFXPath = "//input[@id='IDEBIT_ISSCONF']";

	@FindBy(xpath = "//input[@id='IDEBIT_ISSNAME'] ")
	WebElement IDEBITISSNAME;
	String IDEBIT_ISSNAMEXPath = "//input[@id='IDEBIT_ISSNAME'] ";


	@FindBy(xpath = "//input[contains(@id,'referenceNumber')]")
	WebElement referenceNumberInput;
	String referenceNumberInputXPath = "//input[contains(@id,'referenceNumber')]";

	@FindBy(xpath = "//input[@id='buttonProcessIOP']")
	WebElement proceedinterac;
	String proceedinteracXPath = "//input[@id='buttonProcessIOP']";

	@FindBy(xpath = "//a[@class='issuerLink']")
	WebElement issuebanklink;
	String issuebanklinkXPath = "//a[@class='issuerLink']";

	@FindBy(xpath = "//input[@value='Fund Payment']")
	WebElement depositfund;
	String depositfundXPath = "//input[@value='Fund Payment']";

	@FindBy(xpath = "//div[@class = 'mgo-button-container']//button//following-sibling::a[contains(text(), 'Done')]")
	WebElement confirmationPageIAmDone;
	String confirmationPageIAmDoneXPath = "//div[@class = 'mgo-button-container']//button//following-sibling::a[contains(text(), 'Done')]";




	//Poli radio button:
	@FindBy(xpath = "//input[@type='radio' and @value='POLi']")
	WebElement poliradioButton;
	String poliradioButtonXPath = "//input[@type='radio' and @value='POLi']";


	//Prepare transaction Button:
	@FindBy(xpath = "//button[(@id='transactionSubmit')and contains(text(),'Prepare Transaction')]")
	WebElement preparetransactionButton;
	String preparetransactionButtonXPath = "//button[(@id='transactionSubmit')and contains(text(),'Prepare Transaction')]";


	//Poli page Title
	@FindBy(xpath = "//div//img[@alt='POLi Payments' and @title='POLi Payments']")
	WebElement poliPage;
	String poliPageXPath = "//div//img[@alt='POLi Payments' and @title='POLi Payments']";


	//Poli Page-Continue button :
	@FindBy(xpath = "//div//footer//button[@name='continue']")
	WebElement poliPagecontinueButton;
	String poliPagecontinueButtonXPath = "//div//footer//button[@name='continue']";


	//Poli page-Username:
	@FindBy(xpath = "//input[@name='Username']")
	WebElement poliPageUsername;
	String poliPageUsernameXPath = "//input[@name='Username']";

	//Poli page-Password:
	@FindBy(xpath = "//input[@name='Password']")
	WebElement poliPagePassword;
	String poliPagePasswordXPath = "//input[@name='Password']";


	//Poli Page Login Button:
	@FindBy(xpath = "//footer//button[@type='submit' and @class='button stp-button primary-button']")
	WebElement poliPageloginButton;
	String poliPageloginButtonXPath = "//footer//button[@type='submit' and @class='button stp-button primary-button']";


	//Footer Continue Button:
	@FindBy(xpath = "//div[@id='footer']/div/div/button/div[contains(text(),'Continue')]/parent::button")
	WebElement poliPagefootercontinueButton;
	String poliPagefootercontinueButtonXPath = "//div[@id='footer']/div/div/button/div[contains(text(),'Continue')]/parent::button";

	//Footer Confirm Button:
	@FindBy(xpath = "//footer//button[@type='submit' and @class='button stp-button primary-button']")
	WebElement poliPagefooterconfirmButton;
	String poliPagefooterconfirmButtonXPath = "//footer//button[@type='submit' and @class='button stp-button primary-button']";

	//Reference Page Title:
	@FindBy(xpath = "//div[contains(text(),'Your transfer is sent!')]")
	WebElement refpageTitle;
	String refpageTitleXPath = "//div[contains(text(),'Your transfer is sent!')]";

	public WebElement getPoliradioButton() {
		return poliradioButton;
	}

	public String getPoliradioButtonXPath() {
		return poliradioButtonXPath;
	}

	public WebElement getPreparetransactionButton() {
		return preparetransactionButton;
	}

	public String getPreparetransactionButtonXPath() {
		return preparetransactionButtonXPath;
	}

	public WebElement getPoliPage() {
		return poliPage;
	}

	public String getPoliPageXPath() {
		return poliPageXPath;
	}

	public WebElement getPoliPagecontinueButton() {
		return poliPagecontinueButton;
	}

	public String getPoliPagecontinueButtonXPath() {
		return poliPagecontinueButtonXPath;
	}

	public WebElement getPoliPageUsername() {
		return poliPageUsername;
	}

	public String getPoliPageUsernameXPath() {
		return poliPageUsernameXPath;
	}

	public WebElement getPoliPagePassword() {
		return poliPagePassword;
	}

	public String getPoliPagePasswordXPath() {
		return poliPagePasswordXPath;
	}

	public WebElement getPoliPageloginButton() {
		return poliPageloginButton;
	}

	public String getPoliPageloginButtonXPath() {
		return poliPageloginButtonXPath;
	}

	public WebElement getPoliPagefootercontinueButton() {
		return poliPagefootercontinueButton;
	}

	public String getPoliPagefootercontinueButtonXPath() {
		return poliPagefootercontinueButtonXPath;
	}

	public WebElement getPoliPagefooterconfirmButton() {
		return poliPagefooterconfirmButton;
	}

	public String getPoliPagefooterconfirmButtonXPath() {
		return poliPagefooterconfirmButtonXPath;
	}

	public WebElement getRefpageTitle() {
		return refpageTitle;
	}

	public String getRefpageTitleXPath() {
		return refpageTitleXPath;
	}

	//True Layer Radio Button:
	@FindBy(xpath = "//input[@type = 'radio' and @value = 'trueLayer']/parent::div/div[2]")
	WebElement trueLayerButton;
	String trueLayerButtonXPath = "//input[@type = 'radio' and @value = 'trueLayer']/parent::div/div[2]";


	//True Layer Bank Button:
	@FindBy(xpath = "//button[@title='Mock UK Payments - Redirect Flow']")
	WebElement trueLayerBankButton;
	String trueLayerBankButtonXPath = "//button[@title='Mock UK Payments - Redirect Flow']";

	//True Layer Continue Desktop Button:
	@FindBy(xpath = "//button[@type='button' and @data-testid='continue-desktop']")
	WebElement continueDesktopButton;
	String continueDesktopButtonXPath = "//button[@type='button' and @data-testid='continue-desktop']";

	@FindBy(xpath = "//button[@title='Mock German Payments – Redirect Flow']")
	WebElement trueLayerBankButtonDE;
	String trueLayerBankButtonDEXPath = "//button[@title='Mock German Payments – Redirect Flow']";

	//True Layer Continue button:
	//@FindBy(xpath = "//label[contains(text(),'continue to Mock UK Payments - Redirect Flow')]")
	@FindBy(xpath = "//button[@type='button' and @data-testid='confirm-redirect-button']")
	WebElement trueLayerBankButtonContinueButton;
	String trueLayerBankButtonContinueButtonXPath = "//button[@type='button' and @data-testid='confirm-redirect-button']";

	//True Layer Username textbox:
	@FindBy(xpath = "//input[@id='username' and @name='username']")
	WebElement trueLayerUsernameTextBox;
	String trueLayerUsernameTextBoxXPath = "//input[@id='username' and @name='username']";

	//Pin box 3:
	@FindBy(xpath = "//input[@id='security-code-3' and @name='security-code-3']")
	WebElement pin3TextBox;
	String pin3TextBoxXPath = "//input[@id='security-code-3' and @name='security-code-3']";

	//Pin box 4:
	@FindBy(xpath = "//input[@id='security-code-4' and @name='security-code-4']")
	WebElement pin4TextBox;
	String pin4TextBoxXPath = "//input[@id='security-code-4' and @name='security-code-4']";

	//Pin box 6:
	@FindBy(xpath = "//input[@id='security-code-6' and @name='security-code-6']")
	WebElement pin6TextBox;
	String pin6TextBoxXPath = "//input[@id='security-code-6' and @name='security-code-6']";

	//True Layer Continue Button:
	@FindBy(xpath = "//button[@id='continue' and @type='submit']")
	WebElement trueLayercontinueButton;
	String trueLayercontinueButtonXPath = "//button[@id='continue' and @type='submit']";

	//True Layer Mock Bank Continue Button:
	@FindBy(xpath = "//button[@id='continue' and @type='button']")
	WebElement trueLayerBankcontinueButton;
	String trueLayerBankcontinueButtonXPath = "//button[@id='continue' and @type='button']";




	String referenceNoString = null;
	String tranIDNoString = null;
	String tranTypeCodeString = null;
	String tranStatusCodeString = null;

	String authorizationString =null;
	String authorizationNoString=null;
	String pwmbAuthorizationNoString =null;
	String fastSendReferenceNo=null;
	public AlmostFinishAndConfirmationPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}
	public HashMap<String, String> getEmgDBValues() {	return emgDBValues; 	}

	HashMap<String, String> emgDBValues = new HashMap<>();

	public WebElement getPageValidationElement() {
		return almostFinishPageHeader;
	}

	public String getPageValidationElementXPath() {
		return almostFinishPageHeaderXPath;
	}

	public WebElement getAlmostFinishPageHeader() {
		return almostFinishPageHeader;
	}

	public String getAlmostFinishPageHeaderXPath() {
		return almostFinishPageHeaderXPath;
	}

	public WebElement getSubmitTransaction() {
		return submitTransaction;
	}

	public String getSubmitTransactionXPath() {
		return submitTransactionXPath;
	}

	public WebElement getTransferSentSuccessfully() {
		return transferSentSuccessfully;
	}

	public String getTransferSentSuccessfullyXPath() {
		return transferSentSuccessfullyXPath;
	}

	public WebElement getReferenceNo() {
		return referenceNo;
	}

	public WebElement getFastsendRefno() {
		return  referenceNo;
	}

	public WebElement getPWCauthorizationNo() {
		return PWCauthorizationNo;
	}

	public WebElement getauthorizationNo() {
		return authorizationNo;
	}


	public WebElement gettransactionStatus() {
		return transactionStatus;
	}

	public WebElement gettransactionStatuReadyforPickup() {
		return transactionStatuReadyforPickup;
	}


	public String getReferenceNoXPath() {
		return referenceNoXPath;
	}

	public WebElement getConfirmationPageIAmDone() {
		return confirmationPageIAmDone;
	}

	public String getConfirmationPageIAmDoneXPath() {
		return confirmationPageIAmDoneXPath;
	}

	public String getReferenceNoString() {
		return referenceNoString;
	}

	public  String getTranIDNoString(){return tranIDNoString;}

	public  String gettranTypeCodeString(){return tranTypeCodeString;}

	public  String gettranStatusCodeString(){return tranStatusCodeString;}

	@FindBy(xpath = "//a[contains(@href,'receive')]")
	WebElement viewReceivePage;
	String viewReceivePageXPath = "//a[contains(@href,'receive')]";

	@FindBy(xpath = "//div[contains(text(), 'Ready For Pickup')]")
	WebElement ReadyToPayTrancation;
	String ReadyToPayTrancationXPath = "//div[contains(text(), 'Ready For Pickup')]";
	private final CAPIRegistrationIDUpload capiRegistration = new CAPIRegistrationIDUpload();

	public WebElement getviewReceivePage() {
		return viewReceivePage;
	}


	public WebElement getiamDoneButton() {
		return iamDoneButton;
	}
	public void validatePageIsOpen() {
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND MONEY FRAUD PROTECTION PAGE");
		System.out.println("VALIDATING SEND MONEY ALMOST FINISH PAGE");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, almostFinishPageHeaderXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SEND MONEY FRAUD PROTECTION PAGE");
		System.out.println("VALIDATED SEND MONEY ALMOST FINISH PAGE");
	}

	public void readyToPayTransaction(){



		boolean prompt = ReadyToPayTrancation.isDisplayed();
		if (prompt) {
			extentReportGenerator.addInfoMessage(currentTest, "Ready to pay is been displayed for the recent transcation");
			String idupload = ReadyToPayTrancation.getText();
			System.out.println(idupload);
		} else {
			Assert.fail("Ready to pay is been not displayed for the recent transcation");
			System.out.println("Ready to pay is been not displayed for the recent transcation");
		}

	}
	public void payBillsSubmitSurvey(){
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING PAY BILLS SURVEY PAGE");
		System.out.println("VALIDATING PAY BILLS SURVEY PAGE");

		actionExecutor.scrollToElement(driver, PayBillstellUsHowsurvey, exceptionHandling);
		PayBillstellUsHowsurvey.click();

		actionExecutor.scrollToElement(driver, surveyQuestionOne, exceptionHandling);
		surveyQuestionOne.click();
		actionExecutor.scrollToElement(driver, surveyQuestionTwo, exceptionHandling);
		surveyQuestionTwo.click();
		actionExecutor.scrollToElement(driver, submitSurvey, exceptionHandling);
		submitSurvey.click();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED PAY BILLS SURVEY AND SUBMITTED PAGE");
		System.out.println("VALIDATED PAY BILLS SURVEY AND SUBMITTED PAGE");

	}

	public void validatesFieldsforDE(){
		//actionExecutor.scrollToElementViaDynamicXPath(driver, gffid1forDEXPath, exceptionHandling); //must scroll down to this section on occasion
		//Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, IDTypeXPath, 0));

		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();


		boolean gffidde =gffid1forDE.isDisplayed();
		if(gffidde){
			extentReportGenerator.addInfoMessage(currentTest, "For the higher amounts Application is madatorily asking for GFFID type1");

		}

		else{
			Assert.fail("Applicationn is not prompting for GFFID1");
		}
			}

	public void validatesFields(){
		actionExecutor.scrollToElementViaDynamicXPath(driver, IDTypeXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, IDTypeXPath, 0));

		actionExecutor.scrollToElementViaDynamicXPath(driver, IDNumberXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, IDNumberXPath, 0));

		actionExecutor.scrollToElementViaDynamicXPath(driver, OccupationXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, OccupationXPath, 0));

		actionExecutor.scrollToElementViaDynamicXPath(driver, SocialSecurityNumberXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, SocialSecurityNumberXPath, 0));
	}

	public void trackTransaction() {

		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, trackXPath, exceptionHandling);
		track.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, refNumberXPath, exceptionHandling);
		refNumber.click();
		refNumber.sendKeys(referenceNoString);

		/*
		actionExecutor.scrollToElementViaDynamicXPath(driver, lastnameXPath, exceptionHandling);
		lastname.click();
		lastname.sendKeys("Dvtjukjl");
*/
		actionExecutor.scrollToElementViaDynamicXPath(driver, trackyourMoneyXPath, exceptionHandling);
		trackyourMoney.click();
	}



	public void submitSurvey(){
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND MONEY SURVEY PAGE");
		System.out.println("VALIDATING SEND MONEY SURVEY PAGE");

		actionExecutor.scrollToElement(driver, tellUsHowsurvey, exceptionHandling);
		tellUsHowsurvey.click();
		actionExecutor.scrollToElement(driver, surveyQuestionOne, exceptionHandling);
		surveyQuestionOne.click();
		actionExecutor.scrollToElement(driver, surveyQuestionTwo, exceptionHandling);
		surveyQuestionTwo.click();
		actionExecutor.scrollToElement(driver, submitSurvey, exceptionHandling);
		submitSurvey.click();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SEND MONEY SURVEY AND SUBMITTED PAGE");
		System.out.println("VALIDATED SEND MONEY SURVEY AND SUBMITTED PAGE");
	}


	public void submitinteracTransaction(){

		validatePageIsOpen();
		WebElement completetrns = driver.findElement(org.openqa.selenium.By.xpath("//button[@id='transactionSubmit']"));
		actionExecutor.scrollToElement(driver, completetrns, exceptionHandling);
		completetrns.click();


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, interacduplicatecontinueXPath, 1) != null) {

			interacduplicatecontinue.click();
		}


		proceedinterac.click();
		//actionExecutor.waitFiveSeconds();

		issuebanklink.click();
		//actionExecutor.waitFiveSeconds();

		IDEBITTRACK2.clear();
		IDEBITTRACK2.sendKeys("3728024906540591206=01121122334455000");

		IDEBITISSCONF.clear();
		IDEBITISSCONF.sendKeys("123456");

		 IDEBITISSNAME.clear();
		IDEBITISSNAME.sendKeys("RBC");
	//	actionExecutor.waitFiveSeconds();

		depositfund.click();
		actionExecutor.waitFiveSeconds();
		//actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		//submitTransaction.click();
		//



		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, interacsentsuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}
	public void promocodeTransaction(){
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING PROMOCODE AND ENTER PROMOCODE PAGE");
		System.out.println("VALIDATING PROMOCODE AND ENTER PROMOCODE PAGE");
		actions
				.click(promoCode)
				.sendKeys("JEWELMG1")
				.build()
				.perform();
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED PROMOCODE AND ENTER PROMOCODE PAGE");
		System.out.println("VALIDATED PROMOCODE AND ENTER PROMOCODE PAGE");
	}

	public void payBillssubmitAutorizationTransaction(){

		validatePageIsOpen();

		actionExecutor.scrollToElement(driver, paybillsubmitTransaction, exceptionHandling);
		paybillsubmitTransaction.click();

		//Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		authorizationString = PWCauthorizationNo.getText();
		if(authorizationString.contains("AUTHORIZATION NO. ")){
			authorizationString = authorizationString.replace("AUTHORIZATION NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE AUTHORIZATION NO. IS: " + authorizationString);
		extentReportGenerator.addInfoMessage(currentTest, "THE AUTHORIZATION NO. IS: " + authorizationString);

		//actionExecutor.scrollToElementViaDynamicXPath(driver, payBillsiamDoneButtonXPath, exceptionHandling);
		//payBillsiamDoneButton.click();

	}

	public void payBillssubmitTransaction(){
		validatePageIsOpen();

		actionExecutor.scrollToElement(driver, paybillsubmitTransaction, exceptionHandling);
		paybillsubmitTransaction.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, referenceNo, exceptionHandling);
			//Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, referenceNoXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null) {
			actionExecutor.scrollToElement(driver, referenceNo, exceptionHandling);
		}
		//actionExecutor.loadingWait(driver,spinnerloading);
		referenceNoString = referenceNo.getText();

		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, payBillsiamDoneButtonXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, payBillsiamDoneButtonXPath, exceptionHandling);
			payBillsiamDoneButton.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, walmartpayBillsiamDoneButtonXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, walmartpayBillsiamDoneButtonXPath, exceptionHandling);
		walmartpayBillsiamDoneButton.click();
		}


	}

	public void logOut()
	{

		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();
		actionExecutor.waitFiveSeconds();
		homepageLogout.click();
		actionExecutor.waitFiveSeconds();
		homepageLogoutConfirm.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
			extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
			actionExecutor.scrollToElementViaDynamicXPath(driver, whatsNewPopUpHeaderOKButtonXPath, exceptionHandling);
			whatsNewPopUpHeaderOKButton.click();
		}

	}


	public void fastSendlogOut()
	{
actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, iamDoneFastsendButtonXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneFastsendButtonXPath, exceptionHandling);
			iamDoneFastsendButton.click();
		}
		actionExecutor.waitFiveSeconds();
		homepageLogout.click();
		actionExecutor.waitFiveSeconds();
		homepageLogoutConfirm.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
			extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
			actionExecutor.scrollToElementViaDynamicXPath(driver, whatsNewPopUpHeaderOKButtonXPath, exceptionHandling);
			whatsNewPopUpHeaderOKButton.click();
		}

	}

	public void VerifyLoyalty20percentDiscountAndsubmitTransaction() {
		validatePageIsOpen();
		boolean disccount = loyaltydiscount.isDisplayed();
		if (disccount) {
			extentReportGenerator.addInfoMessage(currentTest, "20 percent discount is dislayed on 2nd transaction as expected");
		}
		else{
			Assert.fail("Loyalty discount is not displayed as expected");
		}


		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);

		submitTransaction.click();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesContinueButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, yesContinueButtonXPath, exceptionHandling);
			yesContinueButton.click();
		}

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderBirthCountryXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, senderBirthCountryXPath, exceptionHandling);
			actions


					.click(senderBirthCountry)
					.sendKeys("Mexico")
					.build()
					.perform();
			optionSpan.click();

			actionExecutor.scrollToElementViaDynamicXPath(driver, birthCountrySubmitButtonXPath, exceptionHandling);
			birthCountrySubmitButton.click();

			actionExecutor.scrollToElementViaDynamicXPath(driver, yesContinueButtonXPath, exceptionHandling);
			yesContinueButton.click();
		}
	}

	public void submitTransaction_sofort(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();

		//driver.switchTo().frame(1);
		sofortfirst.click();

		sofortBankCodeSearch.sendKeys("Demo Bank");

		sofortDemoBank.click();

		sofortuserID.sendKeys("1234");

		sofortpassword.sendKeys("1234");

		sofortWeiter.click();
		actionExecutor.waitFiveSeconds();
		sofortWeiter.click();
		sofortBackendFormTan.sendKeys("1234");
		actionExecutor.waitFiveSeconds();
		sofortWeiter.click();


		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, soforttransferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}
		public void submitTransaction(){
		validatePageIsOpen();
		actionExecutor.waitFiveSeconds();
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, submitTransactionXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
				submitTransaction.click();
			}

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);

		}

	public void GetReferenceNumberFromDatabase(String RefNumber) throws Exception {
		extentReportGenerator.addWarningMessage(currentTest, "Connect to EMT Database. Get TranID by Reference Number");
		System.out.println("Connect to EMT Database. Get TranID by Reference Number.");
		DBHelpers dbHelpers = new DBHelpers();

		Connection con = null;
		ResultSet rs = null;
		try {
			String query = "select * from emg_transaction Where LGCY_REF_NBR =" + "'" + RefNumber +"'";

			String dbURL = "jdbc:oracle:thin:@//oscoltpiiq1.ad.moneygram.com:1521/emgq1s1.ad.moneygram.com";
			String dbUser = "emgmgi";
			String dbPassword = "c9l3brla";
			con = dbHelpers.GetDBConnection(dbURL, dbUser, dbPassword);
			rs = dbHelpers.getResultSet(con, query);
			rs.next();

			emgDBValues.put("EMG_TRAN_ID", rs.getString("EMG_TRAN_ID"));
			emgDBValues.put("EMG_TRAN_TYPE_CODE", rs.getString("EMG_TRAN_TYPE_CODE"));
			emgDBValues.put("SND_CUST_ACCT_ID", rs.getString("SND_CUST_ACCT_ID"));
			emgDBValues.put("LGCY_REF_NBR", rs.getString("LGCY_REF_NBR"));
			emgDBValues.put("TRAN_STAT_CODE", rs.getString("TRAN_STAT_CODE"));
			emgDBValues.put("TRAN_SUB_STAT_CODE", rs.getString("TRAN_SUB_STAT_CODE"));
			emgDBValues.put("SND_ISO_CNTRY_CODE", rs.getString("SND_ISO_CNTRY_CODE"));
			emgDBValues.put("SND_ISO_CRNCY_ID", rs.getString("SND_ISO_CRNCY_ID"));
			emgDBValues.put("SND_FACE_AMT", rs.getString("SND_FACE_AMT"));
			emgDBValues.put("SND_FEE_AMT", rs.getString("SND_FEE_AMT"));
			emgDBValues.put("SND_TOT_AMT", rs.getString("SND_TOT_AMT"));
			emgDBValues.put("SND_FX_CNSMR_RATE", rs.getString("SND_FX_CNSMR_RATE"));
			emgDBValues.put("RCV_ISO_CNTRY_CODE", rs.getString("RCV_ISO_CNTRY_CODE"));
			emgDBValues.put("RCV_ISO_CRNCY_ID", rs.getString("RCV_ISO_CRNCY_ID"));


		}
		catch (Exception e) {
			throw e;

		}
		finally {
			if (!(rs == null)) {
				//rs.close();
				//	dbHelpers.closeResultSet(rs);
			}
			if (!(con == null)) {
				//con.close();
			}
		}
	}




	public void submitTransactionFastSend(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferFastSendSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNoFastSend.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, iamDoneButtonFsXPath, 1) != null) {
			iamDoneButtonFs.click();
		}

	}


		public void submitTransaction_Poli(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, preparetransactionButton, exceptionHandling);
		preparetransactionButton.click();
		actionExecutor.waitFiveSeconds();
		/*Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,poliPageXPath,0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATING THE POLI PAYMENTS PAGE");
		System.out.println("VALIDATING THE POLI PAYMENTS PAGE");*/

		poliPagecontinueButton.click();
		actionExecutor.waitFiveSeconds();
		poliPageUsername.click();
		poliPageUsername.sendKeys("DemoShopper");
		poliPagePassword.click();
		poliPagePassword.sendKeys("DemoShopper");
		poliPageloginButton.click();

			//WebElement ele = driver.findElement(By.xpath("(//button[@class='stp-button button tertiary-button']//preceding::button[1]//div"));
			//ele.sendKeys(Keys.ENTER);
        poliPagefootercontinueButton.click();

		actionExecutor.waitFiveSeconds();
		poliPagefooterconfirmButton.click();


			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, refpageTitleXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
			referenceNoString = referenceNo.getText();
			if(referenceNoString.contains("REFERENCE NO. ")){
				referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
			} //can also be other texts to replace, for now will use reference no.
			System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
			extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);

		}

	public void submitTransaction_TrueLayer(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, preparetransactionButton, exceptionHandling);
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		preparetransactionButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		trueLayerBankButton.click();
		actionExecutor.waitFiveSeconds();
		trueLayerBankButtonContinueButton.click();
		continueDesktopButton.click();
		trueLayerUsernameTextBox.click();
		trueLayerUsernameTextBox.sendKeys("test_executed");
		actionExecutor.waitFiveSeconds();
		pin3TextBox.click();
		pin3TextBox.sendKeys("5");
		pin4TextBox.click();
		pin4TextBox.sendKeys("7");
		pin6TextBox.click();
		pin6TextBox.sendKeys("8");
		trueLayercontinueButton.click();
		actionExecutor.waitFiveSeconds();
		trueLayerBankcontinueButton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, refpageTitleXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);

	}

	public void submitTransaction_TrueLayer_DE() {
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, preparetransactionButton, exceptionHandling);
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		preparetransactionButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		trueLayerBankButtonDE.click();
		actionExecutor.waitFiveSeconds();
		trueLayerBankButtonContinueButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
//		trueLayerBankButtonContinueButton.click();
		//continueDesktopButton.click();
		trueLayerUsernameTextBox.click();
		actionExecutor.waitFiveSeconds();
		trueLayerUsernameTextBox.sendKeys("test_executed");
		actionExecutor.waitFiveSeconds();
		pin3TextBox.click();
		pin3TextBox.sendKeys("5");
		pin4TextBox.click();
		pin4TextBox.sendKeys("7");
		pin6TextBox.click();
		pin6TextBox.sendKeys("8");
		trueLayercontinueButton.click();
		actionExecutor.waitFiveSeconds();
		trueLayerBankcontinueButton.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, refpageTitleXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}

	public void trackaOnlineTransfer(String refNum, String sdrlastName, String DOB, String rcvrLastName){


		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, trackaTransferXPath, exceptionHandling);
		trackaTransfer.click();


		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,trackPageTitleXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest,"VALIDATED THE TRACK A TRANSFER PAGE");
		System.out.println("VALIDATED THE TRACK A TRANSFER PAGE");
		actions
				.click(treferenceNumber)
				.sendKeys(refNum)
				.click(sendersLastName)
				.sendKeys(sdrlastName)
				.click(sendersDOB)
				.sendKeys(DOB)
				.click(receiversLastName)
				.sendKeys(rcvrLastName)
				.click(iconfirmCheckBox)

				.build()
				.perform();
		actionExecutor.waitFiveSeconds();
		findtransferButton.click();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,SelfServicePortalXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED THE TRANSACTION STATUS");
		System.out.println("VALIDATED THE TRANSACTION STATUS");
	}


	public void validaterefdisount(){

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, referealdiscamountXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		boolean discamnt =referealdiscamount.isDisplayed();
		if(discamnt){
			String discamt =referealdiscamount.getText();
			System.out.println("Referal discount amount displayed in summary page is:   " + discamt);
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}

	public void ReceiveRedirectsubmitTransaction(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastSendreferenceNoXPath, 1) != null) {
			referenceNoString = fastSendreferenceNo.getText();
			if(referenceNoString.contains("REFERENCE NO. ")){
				referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
			} //can also be other texts to replace, for now will use reference no.
		}
//		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notcashpickupSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));

		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}


	public void submitPayments(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, paybillsubmitTransaction, exceptionHandling);
		paybillsubmitTransaction.click();

		//Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);

	}

	public void submitblockedTransaction() throws InterruptedException {
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, blockedtransactionXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		//referenceNoString = referenceNo.getText();
		String blockedTransactionn = blockedtransaction.getText();

		boolean blockedTransaction =blockedtransaction.isDisplayed();
		Assert.assertTrue(blockedTransaction,blockedTransactionn);
		iamDone.click();
		Thread.sleep(5000);



	}

	public void verifyreloginForblocked() throws InterruptedException {
		//validatePageIsOpen();
		actionExecutor.scrollToElement(driver, Loginbutton, exceptionHandling);
		Loginbutton.click();
		Loginbutton.sendKeys("qwerty111@maildrop.com");
		password.sendKeys("qwerty@123");
		loginbutton.click();
		Thread.sleep(5000);

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, blockedloginXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		//referenceNoString = referenceNo.getText();
		String blockedloginn = blockedlogin.getText();

		boolean blockedlogi =blockedlogin.isDisplayed();
		Assert.assertTrue(blockedlogi,blockedloginn);
	}

	public void submitPWMBTransaction(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, pwmbSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		pwmbAuthorizationNoString = pwmbAuthorizationNo.getText();
		if(pwmbAuthorizationNoString.contains("AUTHORIZATION NO. ")){
			pwmbAuthorizationNoString = pwmbAuthorizationNoString.replace("AUTHORIZATION NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE AUTHORIZATION NO. IS: " + pwmbAuthorizationNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE AUTHORIZATION NO. IS: " + pwmbAuthorizationNoString);
	}

	public void submitPaywithCashTransaction(){
		validatePageIsOpen();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, submitTransactionXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
			submitTransaction.click();
		}

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, readyToPaySentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		authorizationNoString = authorizationNo.getText();
		if(authorizationNoString.contains("AUTHORIZATION NO. ")){
			authorizationNoString = authorizationNoString.replace("AUTHORIZATION NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE AUTHORIZATION NO. IS: " + authorizationNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE AUTHORIZATION NO. IS: " + authorizationNoString);
	}
public void performReceive(){
	extentReportGenerator.addInfoMessage(currentTest, "VALIDATING RECEIVE PAGE AND ENTER REFERENCE NUMBER :" + referenceNumberInput);
	System.out.println("VALIDATING RECEIVE PAGE AND ENTER REFERENCE NUMBER :" + referenceNoString);
		actions
				.click(referenceNumberInput)
				.sendKeys(referenceNoString)
				.build()
				.perform();
	trackYourMoneyButton.click();
	String transStatus = gettransactionStatuReadyforPickup().getText();
	extentReportGenerator.addInfoMessage(currentTest, "Transaction Status is : " + transStatus);
	extentReportGenerator.addInfoMessage(currentTest, "VALIDATED RECEIVE PAGE AND REFERENCE NUMBER :" + referenceNoString);

}
	public void FastSend_submitSendAgainTransaction() {

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastSendConfirmpopupXPath, 1) != null) {
			fastsendAgainConfirm.click();

		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, submitTransactionXPath, 1) != null) {
			submitTransaction.click();
			actionExecutor.waitFiveSeconds();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, btnyesContinueButtonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, btnyesContinueButton, exceptionHandling);
			btnyesContinueButton.click();
		}

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}
	public void submitSendAgainTransaction() {
		//validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();

		actionExecutor.waitFiveSeconds();

		actionExecutor.waitFiveSeconds();


		//actionExecutor.scrollToElement(driver, yesContinueButton, exceptionHandling);
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, btnyesContinueButtonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, btnyesContinueButton, exceptionHandling);
			//actionExecutor.scrollToElementViaDynamicXPath(driver, yesContinueButtonXPath, exceptionHandling);
			btnyesContinueButton.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderBirthCountryXPath, 1) != null) {
		actionExecutor.scrollToElementViaDynamicXPath(driver, senderBirthCountryXPath, exceptionHandling);
		actions


					.click(senderBirthCountry)
					.sendKeys("Mexico")
					.build()
					.perform();
			optionSpan.click();

			actionExecutor.scrollToElementViaDynamicXPath(driver, birthCountrySubmitButtonXPath, exceptionHandling);
			birthCountrySubmitButton.click();


		}
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, duplicateContinueXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, duplicateContinue, exceptionHandling);
			//actionExecutor.scrollToElementViaDynamicXPath(driver, yesContinueButtonXPath, exceptionHandling);
			duplicateContinue.click();
		}
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}


	public void submitSendAgainTransactionNew(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();

		//actionExecutor.loadingWait(driver,spinnerloading);
		//actionExecutor.scrollToElement(driver, yesContinueButton, exceptionHandling);
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesContinueButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, yesContinueButtonXPath, exceptionHandling);
			yesContinueButton.click();
		}

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}

	public void submitSendAgainTransactionViaBubble(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, duplicateContinueXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, duplicateContinue, exceptionHandling);
			duplicateContinue.click();
		}


		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, transferSentSuccessfullyXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		referenceNoString = referenceNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);
	}

	public void submitTheTransaction(){
		//validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();

	}


	public void zipNotMandatory(){
		actionExecutor.scrollToElement(driver, viewProfileInfoButton, exceptionHandling);
		viewProfileInfoButton.click();

		actionExecutor.scrollToElement(driver, editButoon, exceptionHandling);
		editButoon.click();


		actionExecutor.scrollToElement(driver, saveButton, exceptionHandling);
		saveButton.click();

	}
	public void moreInfoPage(){


		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		Boolean prompt = moreInfoPage.isDisplayed();
		if (prompt) {
			extentReportGenerator.addInfoMessage(currentTest, "more info prompt is been displayed");
			String idupload = moreInfoPage.getText();
			System.out.println(idupload);
		} else {
			Assert.fail("Application is not prompting for more info");
			System.out.println("Application is not prompting for more info");
		}


	}

	public void SendmoneyrefersubmitTransaction(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();

		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, IDuploadinconfrmpageXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		String validatnmsg = IDuploadinconfrmpage.getText();
		extentReportGenerator.addInfoMessage(currentTest, "Validation message for ID upload in confirmation page is displayed as: "+ validatnmsg);

	}

	public void submitemailotpTransaction() throws InterruptedException {
validatePageIsOpen();

		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, emailtootptextXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		//referenceNoString = referenceNo.getText();
		String otpemail = emailtootptext.getText();

		boolean emailotp =emailtootptext.isDisplayed();
		Assert.assertTrue(emailotp,otpemail);

	}
	public void tranactiorejected(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, rejecttransmsginconfrmpage, exceptionHandling);
		boolean rejecttrsn = rejecttransmsginconfrmpage.isDisplayed();
		if(rejecttrsn){
			String valmsg = rejecttransmsginconfrmpage.getText();
			extentReportGenerator.addInfoMessage(currentTest, "Validation msg for Actimize Reject in summary page is displayed as:  " + valmsg);

		}
		actionExecutor.scrollToElement(driver, iamDoneButtoncnfmt, exceptionHandling);
		iamDoneButtoncnfmt.click();
		actionExecutor.waitFiveSeconds();
		WebElement elem =driver.findElement(By.xpath("(//div[contains(text(),'Declined')])[1]"));
		String status = elem.getText();
		extentReportGenerator.addInfoMessage(currentTest, "Transaction status is displayed as  " + status);


	}


	public void ActimizeReviewGB() {
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, moreInfoPageXPath, 1) != null) {
			littlebitq1.sendKeys("Brother");
			littlebitq2.sendKeys("Bank loan");
			actionExecutor.scrollToElement(driver, littlebitRadio1, exceptionHandling);
			littlebitRadio1.click();
			actionExecutor.scrollToElement(driver, littlebitRadio2, exceptionHandling);
			littlebitRadio2.click();
			actionExecutor.scrollToElement(driver, littlebitSubmit, exceptionHandling);
			littlebitSubmit.click();
			actionExecutor.waitFiveSeconds();
			actionExecutor.waitFiveSeconds();

			actionExecutor.waitFiveSeconds();


			iamDoneButtoncnfmt3.click();
			actionExecutor.waitFiveSeconds();
			actionExecutor.waitFiveSeconds();
			actionExecutor.waitFiveSeconds();
			WebElement elem = driver.findElement(By.xpath("(//div[contains(text(),'Waiting For Approval')])[1]"));
			String status = elem.getText();
			extentReportGenerator.addInfoMessage(currentTest, "Transaction status is displayed as  " + status);

		}

	}
	public void tranactioreviewGB() {
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();


		//WebElement reviewmsg = driver.findElement(By.xpath("(//h3[contains(text(),'We need a little bit more')])[1]"));

		actionExecutor.scrollToElement(driver, gffid1forDE, exceptionHandling);


		boolean rejecttrsn = gffid1forDE.isDisplayed();
		if (rejecttrsn) {
			String valmsg = gffid1forDE.getText();
			extentReportGenerator.addInfoMessage(currentTest, "Validation msg for Actimize REview in summary page is displayed as:  " + valmsg);

		} else {
			Assert.fail("Application is not asking for more information");

		}


}


	public void tranactioreview() {
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, submitTransaction, exceptionHandling);
		submitTransaction.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();


		WebElement reviewmsg = driver.findElement(By.xpath("(//h3[contains(text(),'We need a little bit more')])[1]"));

		actionExecutor.scrollToElement(driver, reviewmsg, exceptionHandling);


		boolean rejecttrsn = reviewmsg.isDisplayed();
		if (rejecttrsn) {
			String valmsg = reviewmsg.getText();
			extentReportGenerator.addInfoMessage(currentTest, "Validation msg for Actimize REview in summary page is displayed as:  " + valmsg);

		} else {
			Assert.fail("Application is not asking for more information");

		}

		WebElement rlnshiptorevr = driver.findElement(By.xpath("(//textarea[@id='Q1'])"));
		rlnshiptorevr.click();
		rlnshiptorevr.sendKeys("Family friend");
		WebElement reasonforsend = driver.findElement(By.xpath("(//textarea[@id='Q2'])"));
		reasonforsend.click();
		reasonforsend.sendKeys("Family maintainance");
		WebElement anypurchase = driver.findElement(By.xpath("(//div[contains(@class,'mat-radio-inner-circle')])[22]"));
		WebElement meetperson = driver.findElement(By.xpath("(//div[contains(@class,'mat-radio-inner-circle')])[24]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", anypurchase);
		executor.executeScript("arguments[0].click();", meetperson);
		WebElement submitreview = driver.findElement(By.xpath("(//button[@type='submit'])[5]"));
		submitreview.click();

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		iamDoneButtoncnfmt.click();
		actionExecutor.waitFiveSeconds();
		WebElement elem = driver.findElement(By.xpath("(//div[contains(text(),'Waiting For Approval')])[1]"));
		String status = elem.getText();
		extentReportGenerator.addInfoMessage(currentTest, "Transaction status is displayed as  " + status);

	}
}
