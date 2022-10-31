package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.appUtilFiles.ActionExecutor;
import com.qa.appUtilFiles.ExceptionHandling;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.groovy.util.SystemUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Scenario;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePageAbstractTemplate {
	@FindBy(xpath = "//button[contains(text(),'Send Code')]")
	WebElement sendotpbutton;
	String sendotpbuttonXPath = "//button[contains(text(),'Send Code')]";

	@FindBy(xpath = "//div[contains(text(),'A one-time security code has been sent to')]")
	WebElement otpsentmsg;
	String otpsentmsgXPath = "//div[contains(text(),'A one-time security code has been sent to')]";

	@FindBy(xpath = "//h3[contains(text(),'Transaction on Hold')]")
	WebElement holdMessagePrompt;
	String holdMessagePromptXPath = "//h3[contains(text(),'Transaction on Hold')]";

	@FindBy(xpath = "//i[contains(text(),'expand_more')]")
	WebElement changeLanguage;
	String changeLanguageXPath= "//i[contains(text(),'expand_more')]";

	@FindBy(xpath = "//button[@role='menuitem']")
	WebElement selectLanguage;
	String selectLanguageXPath = "//button[@role='menuitem']";

	@FindBy(xpath = "//mg-receiver-bubbles/div/cdk-virtual-scroll-viewport")
	WebElement bubblesCount;
	String bubblesCountXPath = "//mg-receiver-bubbles/div/cdk-virtual-scroll-viewport";


	@FindBy(xpath = "(//div[@class='subtext-div text-center'])[1]")
	WebElement IDuploadPrompt;
	String IDuploadPromptXPath = "(//div[@class='subtext-div text-center'])[1]";

	@FindBy(xpath = "//a//img[contains(@alt, 'MoneyGram')]")
	WebElement mgoLogo;
	String mgoLogoXPath = "//a//img[contains(@alt, 'MoneyGram')]";

	@FindBy(xpath = "//a[contains(text(),'Find a Location')]")
	WebElement mgoFindlocationlink;
	String mgoFindlocationlinkXPath = "//a[contains(text(),'Find a Location')]";


	@FindBy(xpath = "//mat-select[@panelclass='countryDropdown']")
	WebElement selectLocationCountryDropDown;
	String selectLocationCountryDropDownXPath = "//mat-select[@panelclass='countryDropdown']";

	//Reason for cancel:
	@FindBy(xpath = "//div[contains(text(),'United Kingdom Of Great Britain And Northern Ireland')]")
	WebElement selectLocationCountryOption;
	String selectLocationCountryOptionXPath = "//div[contains(text(),'United Kingdom Of Great Britain And Northern Ireland')]";

	@FindBy(xpath = "(//a[contains(text(),'TESCO')])[2]")
	WebElement selectlocationfromResults;
	String selectlocationfromResultsXPath = "(//a[contains(text(),'TESCO')])[2]";


	@FindBy(xpath = "//input[contains(@id,'searchKeyword')]")
	WebElement setLocationText;
	String setLocationTextXPath = "//input[contains(@id,'searchKeyword')]";

	@FindBy(xpath = "//mat-icon[contains(@class,'search') and contains(text(),'search')]")
	WebElement searchicon;
	String searchiconXPath = "//mat-icon[contains(@class,'search') and contains(text(),'search')]";


	@FindBy(xpath = "//a/span[contains(text(),' Start your transaction online at Tesco')]")
	WebElement selectOnlineTrans;
	String selectOnlineTransXPath = "//a/span[contains(text(),' Start your transaction online at Tesco')]";



	@FindBy(xpath = "//h2[contains(text(),'Find a Location')]")
	WebElement findaLocationTexthtag;
	String findaLocationTexthtagXPath = "//h2[contains(text(),'Find a Location')]";


	@FindBy(xpath = "//div[@class = 'estimator-container']")
	WebElement feeEstimatorBox;
	String feeEstimatorBoxXPath = "//div[@class = 'estimator-container']";

	@FindBy(xpath = "//div/mg-marketing-add-new-banner/div/div/h1")
	WebElement WhatsNewOnHomePage;
	String WhatsNewOnHomePageXPath = "//div/mg-marketing-add-new-banner/div/div/h1";

	@FindBy(xpath = "//div/mgo-refer/div/div/button")
	WebElement summaryHomePage;
	String summaryHomePageXPath = "//div/mgo-refer/div/div/button";



	@FindBy(xpath = "//button[@id = 'loginButn']")
	WebElement loginButton;
	String loginButtonXPath = "//button[@id = 'loginButn']";

	@FindBy(xpath = "//button[@id = 'signUpButn']")
	WebElement signUpButton;
	String signUpButtonXPath = "//button[@id = 'signUpButn']";

	@FindBy(xpath = "//div[contains(text(),'Legal Name')]//following-sibling::div")
	WebElement userLegalNameDiv;
	String userLegalNameDivXPath = "//div[contains(text(),'Legal Name')]//following-sibling::div";


	@FindBy(xpath = "//mgo-auth-home-transactions/div/div[@class='ng-star-inserted']/ul/li")
	WebElement firsttransactionsDiv;
	String firsttransactionsDivXPath = "//mgo-auth-home-transactions/div/div[@class='ng-star-inserted']/ul/li";

	@FindBy(xpath = "//button[contains(text(),'Cancel Payment')]")
	WebElement cancelPaymentButton;
	String cancelPaymentButtonXPath = "//button[contains(text(),'Cancel Payment')]";

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement ContinuecancelPaymentButton;
	String ContinuecancelPaymentButtonXPath = "//button[contains(text(),'Continue')]";

	@FindBy(xpath = "//button[@id='truste-show-consent']")
	WebElement coockiePreferences;
	String coockiePreferencesXPath = "//button[@id='truste-show-consent']";

	@FindBy(xpath = "//input[@id='searchKeyword']")
	WebElement viewCoockieSettings;
	String viewCoockieSettingsXPath = "a[contains(text(),'View Cookie Settings')]";


	@FindBy(xpath = "a[contains(text(),'Submit Preferences')]")
	WebElement submitPreferences;
	String submitPreferencesXPath = "//a[contains(text(),'Submit Preferences')]";


	@FindBy(xpath = "//button[contains(text(),'Cancel Payment') and @type='submit']")
	WebElement confirmCancellationButton;
	String confirmCancellationButtonXPath = "//button[contains(text(),'Cancel Payment') and @type='submit']";

	@FindBy(xpath = "//button[contains(text(),'View Receipt')]")
	WebElement viewReceiptButton;
	String viewReceiptButtonXPath = "//button[contains(text(),'View Receipt')]";





	@FindBy(xpath = "//div[contains(text(),'Location Send Tax')]")
	WebElement locatiotaxinreceipt;
	String locatiotaxinreceiptXPath = "//div[contains(text(),'Location Send Tax')]";


	@FindBy(xpath = "//button[contains(text(),'I Understand')]")
	WebElement cancelTransactionIUnderstandButton;
	String cancelTransactionIUnderstandButtonXPath = "//button[contains(text(),'I Understand')]";


	@FindBy(xpath = "//label[@for='dropdown']//following-sibling::mat-select")
	WebElement reasonforCancelingDropdpwn;
	String reasonforCancelingDropdpwnXPath = "//label[@for='dropdown']//following-sibling::mat-select";

	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'Need to change receiver')]")
	WebElement reasonforCanceling;
	String reasonforCancelingXPath = "//span[@class='mat-option-text' and contains(text(),'Need to change receiver')]";


	@FindBy(xpath = "//button[contains(text(), 'Send to Someone New')]")
	WebElement sendSomeoneNewButton;
	String sendSomeoneNewButtonXPath = "//button[contains(text(), 'Send to Someone New')]";

	@FindBy(xpath = "//button[contains(text(), 'An eine neue Person senden')]")
	WebElement desendSomeoneNewButton;
	String desendSomeoneNewButtonXPath = "//button[contains(text(), 'An eine neue Person senden')]";

	@FindBy(xpath = "//h4[contains(text(), 'Welcome, ')]")
	WebElement welcomeNameHeader;
	String welcomeNameHeaderXPath = "//h4[contains(text(), 'Welcome, ')]";

	@FindBy(xpath = "(//span[contains(text(),'Series No.')])[1]")
	WebElement seriesnumberr;
	String seriesnumberrXPath = "(//span[contains(text(),'Series No.')])[1]";



	@FindBy(xpath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]")
	WebElement whatsNewPopUpHeader;
	String whatsNewPopUpHeaderXPath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]";

	@FindBy(xpath = "//div[@id='q1' and @role='form']")
	WebElement surveyForm;
	String surveyFormXPath = "//div[@id='q1' and @role='form']";

	@FindBy(xpath = "//button[@class='cf-container__close']")
	WebElement surveyFormClose;
	String surveyFormCloseXPath = "//button[@class='cf-container__close']";

	@FindBy(xpath =  "//iframe[@class='cf-container__frame']")
	WebElement surveyFormiFrame;
	String surveyFormiFrameXPath = "//iframe[@class='cf-container__frame']";

	@FindBy(xpath = "//h3[contains(text(), 'Profile Pending')]")
	WebElement profilePendingPopupHeader;
	String profilePendingPopupHeaderXPath = "//h3[contains(text(), 'Profile Pending')]";

	@FindBy(xpath = "//button[contains(text(), 'Log Out')]")
	WebElement profilePendingLogOut;
	String profilePendingLogOutXPath = "//button[contains(text(), 'Log Out')]";

	@FindBy(xpath = "//button[@class = 'btn-primary' and contains(text(), 'Ok') or contains(text(), 'OK')]")
	WebElement whatsNewPopUpHeaderOKButton;
	String whatsNewPopUpHeaderOKButtonXPath = "//button[@class = 'btn-primary' and contains(text(), 'Ok') or contains(text(), 'OK')]";

	@FindBy(xpath = "//h1[contains(text(), 'Cookie Settings')]")
	WebElement cookieSettingsPopUpHeader;
	String cookieSettingsPopUpHeaderXPath = "//h1[contains(text(), 'Cookie Settings')]";

	@FindBy(xpath = "//button[@class = 'truste-button2' and contains(text(), 'Accept Cookies')]")
	WebElement acceptCookiesButton;
	String acceptCookiesButtonXPath = "//button[@class = 'truste-button2' and contains(text(), 'Accept Cookies')]";

	@FindBy(xpath = "//a[contains(text(),'View Profile Info') and @role = 'button']")
	WebElement viewProfileInfo;
	String viewProfileInfoXPath = "//a[contains(text(),'View Profile Info') and @role = 'button']";

	@FindBy(xpath = "//h6[contains(text(),'Mobile Number')]//following-sibling::a")
	WebElement editMobileNumber;
	String editMobileNumberXPath = "//h6[contains(text(),'Mobile Number')]//following-sibling::a";


	@FindBy(xpath = "//mg-send-success/div/div[@class='row button-container']/div/div/a[contains(text(), 'm Done')]")
	WebElement iamDoneButtonn;
	String iamDoneButtonnXPath = "//mg-send-success/div/div[@class='row button-container']/div/div/a[contains(text(), 'm Done')]";


	@FindBy(xpath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')] | //button[contains(@class,'mgo-button')][contains(text(),'Done')]")
	WebElement iamDoneButton;
	String iamDoneButtonXPath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')] | //button[contains(@class,'mgo-button')][contains(text(),'Done')]";

	@FindBy(xpath = "(//a[contains(text(),'m Done')])[3]")
	WebElement iamDoneeButton;
	String iamDoneeButtonXPath = "(//a[contains(text(),'m Done')])[3]";


	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement interaciamDoneButton;
	String interaciamDoneButtonXPath = "//button[contains(text(),'Done')]";

	@FindBy(xpath = "//mgo-auth-home-transactions/div/div/ul/li/div/div/span/button[contains(@class,'auth-tran-history') and contains(text(),'Send Again')]")
	WebElement sendAgainButton;
	String sendAgainButtonXPath = "//mgo-auth-home-transactions/div/div/ul/li/div/div/span/button[contains(@class,'auth-tran-history') and contains(text(),'Send Again')]";

	@FindBy(xpath = "//button/span[contains(text(),'Send Once')]/parent::button")
	WebElement sendOnceButton;
	String sendOnceButtonXPath = "//button/span[contains(text(),'Send Once')]/parent::button";


	@FindBy(xpath = "//button[contains(text(),'Set Schedule')]")
	WebElement setScheduleButton;
	String setScheduleButtonXPath = "//button[contains(text(),'Set Schedule')]";

	@FindBy(xpath = "//button[contains(text(),'Weekly')]")
	WebElement weeklyButton;
	String weeklyButtonXPath = "//button[contains(text(),'Weekly')]";

	@FindBy(xpath = "//button[contains(text(),'Monthly')]")
	WebElement monthlyButton;
	String monthlyButtonXPath = "//button[contains(text(),'Monthly')]";

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement seriesNextButton;
	String seriesNextButtonXPath = "//button[contains(text(),'Next')]";

	@FindBy(xpath = "//button[contains(text(),'Schedule Transfer')]")
	WebElement scheduleTransferButton;
	String scheduleTransferButtonXPath = "//button[contains(text(),'Schedule Transfer')]";

	@FindBy(xpath = "//mg-recurring-payment-success/div/div/div/div[2]/h3")
	WebElement seriesNumberText;
	String seriesNumberTextXPath = "//mg-recurring-payment-success/div/div/div/div[2]/h3";

	@FindBy(xpath = "//button[contains(text(),'m Done')]")
	WebElement iAmDoneButton;
	String iAmDoneButtonXPath = "//button[contains(text(),'m Done')]";

	@FindBy(xpath = "//input[@id='start-date']")
	WebElement startDateInput;
	String startDateInputXPath = "//input[@id='start-date']";

	@FindBy(xpath = "//mg-recurring-send/div/div/ul/li/div/div[4]/a[contains(text(),'Delete')]")
	WebElement deleteScheduleButton;
	String deleteScheduleButtonXPath = "//mg-recurring-send/div/div/ul/li/div/div[4]/a[contains(text(),'Delete')]";

	@FindBy(xpath = "//button/span[contains(text(),'Delete Schedule')]")
	WebElement confirmDeleteScheduleButton;
	String confirmDeleteScheduleButtonXPath = "//button/span[contains(text(),'Delete Schedule')]";


	//-----PayBills

	@FindBy(xpath = "//a[contains(@href,'paybills')]")
	WebElement payBillsLink;
	String payBillsLinkXPath = "//a[contains(@href,'paybills')]";

	@FindBy(xpath = "//input[contains(@placeholder,'Biller Name or Receive Code')]")
	WebElement billerNameorReceiveCodeInput;
	String billerNameorReceiveCodeInputXPath = "//input[contains(@placeholder,'Biller Name or Receive Code')]";

	@FindBy(xpath = "//mat-option/span[contains(text(),'BEALLS COMMUNICATION GROUP INC (3216)')]")
	WebElement billerNameOption;
	String billerNameOptionXPath = "//mat-option//span[contains(text(),'BEALLS COMMUNICATION GROUP INC (3216)')]";

	@FindBy(xpath = "//mat-option/span[contains(text(),'FRONTIER UTILITIES (9772)')]")
	WebElement billerFrontNameOption;
	String billerFrontNameOptionXPath = "//mat-option/span[contains(text(),'FRONTIER UTILITIES (9772)')]";


	@FindBy(xpath = "//mg-biller-search/form/div/button/span[contains(text(),'Pay Bill')]/parent::button")
	WebElement payBillButton;
	String payBillButtonXPath = "//mg-biller-search/form/div/button/span[contains(text(),'Pay Bill')]/parent::button";

	@FindBy(xpath = "//input[contains(@id,'payAmount')]")
	WebElement payAmountInput;
	String payAmountInputXPath = "//input[contains(@id,'payAmount')]";

	@FindBy(xpath = "//button[contains(text(),'Pay This Biller')]")
	WebElement payBillerButton;
	String payBillerButtonXPath = "//button[contains(text(),'Pay This Biller')]";


	@FindBy(xpath = "//mat-radio-button[contains(@class,'checked')]/label/div[contains(@class,'mat-radio-labe') and contains(text(),'Debit Card')]")
	WebElement defaultPaymentOptionRadio;
	String defaultPaymentOptionRadioXPath = "//mat-radio-button[contains(@class,'checked')]/label/div[contains(@class,'mat-radio-labe') and contains(text(),'Debit Card')]";



	@FindBy(xpath = "//mgo-auth-home-transactions/div/div[2]/ul/li/div/div[7]/span/button[contains(text(),'Pay Again')]")
	WebElement payAgainHomeButton;
	String payAgainHomeButtonXPath = "//mgo-auth-home-transactions/div/div[2]/ul/li/div/div[7]/span/button[contains(text(),'Pay Again')]";

	@FindBy(xpath = "//mg-biller-fees/form/div[2]/div[3]/div[2]/div/button[contains(text(),'Next')]")
	WebElement payBillerNextButton;
	String payBillerNextButtonXPath = "//mg-biller-fees/form/div[2]/div[3]/div[2]/div/button[contains(text(),'Next')]";

	@FindBy(xpath = "//input[@id='billerAccountNumber']")
	WebElement billerAccountNumberInput;
	String billerAccountNumberInputXPath = "//input[@id='billerAccountNumber']";

	@FindBy(xpath = "//input[@id='validateAccountNumber']")
	WebElement validateBillerAccountNumberInput;
	String validateBillerAccountNumberInputXPath = "//input[@id='validateAccountNumber']";


	@FindBy(xpath = "//mg-biller-info/form/div/button[contains(text(),'Next')]")
	WebElement billerInfoNextButton;
	String billerInfoNextButtonXPath = "//mg-biller-info/form/div/button[contains(text(),'Next')]";

	@FindBy(xpath = "(//span[contains(@class,'card-number')]/span[contains(text(),'Debit Card')])[1]")
	WebElement paybillsCCOptionRadioButton;
	String paybillsCCOptionRadioButtonXPath = "(//span[contains(@class,'card-number')]/span[contains(text(),'Debit Card')])[1]";

	@FindBy(xpath = "//input[@id='verify_cvv']")
	WebElement verifyCVVInput;
	String verifyCVVInputXPath = "//input[@id='verify_cvv']";

	@FindBy(xpath = "//button[@id='verifyCVVButton']")
	WebElement verifyCVVButton;
	String verifyCVVButtonXPath = "//button[@id='verifyCVVButton']";

	@FindBy(xpath = "//input[@id='senderOccupation']")
	WebElement senderOccupationInput;
	String senderOccupationInputXPath = "//input[@id='senderOccupation']";

	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement profileMobilenumberInput;
	String profileMobilenumberInputXPath = "//input[@id='phoneNumber']";

	@FindBy(xpath = "//h1[contains(text(),'Notifications')]")
	WebElement notificationsHeaderText;
	String notificationsHeaderTextXPath = "//h1[contains(text(),'Notifications')]";

	@FindBy(xpath = "//div[contains(text(),'Transactions & Account')]/parent::div/parent::div//div[contains(@class,'notification-type-checkbox')]/mat-checkbox/label/span/span[contains(text(),'Text')]/parent::span/parent::label/parent::mat-checkbox[contains(@class,'checked')]")
	WebElement defaultCheckBoxSelectionText;
	String defaultCheckBoxSelectionTextXPath = "//div[contains(text(),'Transactions & Account')]/parent::div/parent::div//div[contains(@class,'notification-type-checkbox')]/mat-checkbox/label/span/span[contains(text(),'Text')]/parent::span/parent::label/parent::mat-checkbox[contains(@class,'checked')]";


	@FindBy(xpath = "//button[@class='con-x' and @aria-label='close']")
	WebElement closeIconButton;
	String closeIconButtonXPath = "//button[@class='con-x' and @aria-label='close']";

	@FindBy(xpath = "//button[@class = 'con-x' and @aria-label = 'close']")
	WebElement closeRedPopUp;
	String closeRedPopUpXPath = "//button[@class = 'con-x' and @aria-label = 'close']";

	@FindBy(xpath = "//div[@id='concierge-widgets']")
	WebElement closeiwidgets;
	String closeiwidgetsXPath = "//div[@id='concierge-widgets']";



	@FindBy(xpath = "//mat-option/span[contains(text(),'Agriculture')]")
	WebElement senderOccupationOption;
	String senderOccupationOptionXPath = "//mat-option/span[contains(text(),'Agriculture')]";

	@FindBy(xpath = "//mg-phone-number/following-sibling::div/div[contains(@class,'mobile')]/span/button[contains(text(),'Save')]")
	WebElement saveMobileNumberButton;
	String saveMobileNumberButtonXPath = "//mg-phone-number/following-sibling::div/div[contains(@class,'mobile')]/span/button[contains(text(),'Save')]";


	@FindBy(xpath = "//input[@id='legalIdNumber']")
	WebElement legalIdNumberInput;
	String legalIdNumberInputXPath = "//input[@id='legalIdNumber']";


	@FindBy(xpath = "//mg-edit-phone-number/div/div/h4")
	WebElement updatedMobileNumber;
	String updatedMobileNumberXPath = "//mg-edit-phone-number/div/div/h4";

	@FindBy(xpath = "//button[contains(text(),'Select Location')]")
	WebElement selectLocationButton;
	String selectLocationButtonXPath = "//button[contains(text(),'Select Location')]";

	@FindBy(xpath = "//button[contains(text(),'Envoyer')]")
	WebElement frenchsendsomeonenewbutton;
	String frenchsendsomeonenewbuttonXPath = "//button[contains(text(),'Envoyer')]";


	@FindBy(xpath = "//input[@id='searchKeyword']")
	WebElement searchKeywordInputBox;
	String searchKeywordInputBoxXPath = "//input[@id='searchKeyword']";

	@FindBy(xpath = "(//div[@class='btn-container']/button[contains(text(),'Select Location')])[1]")
	WebElement resultLocationButton;
	String resultLocationButtonXPath = "(//div[@class='btn-container']/button[contains(text(),'Select Location')])[1]";

	@FindBy(xpath = "//mat-icon[contains(text(),'search') and contains(@class,'search')]")
	WebElement iconSearchButton;
	String iconSearchButtonXPath = "//mat-icon[contains(text(),'search') and contains(@class,'search')]";


	@FindBy(xpath = "//h2[contains(text(),'Select a Payment Location')]/parent::form/form/mat-form-field/div/div/div/mat-icon")
	WebElement formiconSearchButton;
	String formiconSearchButtonXPath = "//h2[contains(text(),'Select a Payment Location')]/parent::form/form/mat-form-field/div/div/div/mat-icon";



	@FindBy(xpath = "//mg-payment-information/form/div/button[@type='submit' and contains(text(),'Next')]")
	WebElement paymentinformationNextButton;
	String paymentinformationNextButtonXPath = "//mg-payment-information/form/div/button[@type='submit' and contains(text(),'Next')]";

	String paymentOptionDynamicXPath = "//div[@class = 'payment-options-container']//div[contains(text(), '%s')]";
//----End PayBills
		@FindBy(xpath = "//button[@type = 'submit' and @id = 'nextEstimate']")
		WebElement nextButtonFeeEstimatorPage;
		String nextButtonFeeEstimatorPageXPath = "//button[@type = 'submit' and @id = 'nextEstimate']";

	@FindBy(xpath = "//div[contains(@aria-label,'Manage receive')]")
	WebElement receiverBubble;
	String receiverBubbleXPath = "//div[contains(@aria-label,'Manage receive')]";

	@FindBy(xpath = "//img[contains(@src,'online-bank-account')]")
	WebElement selectReceiverBank;
	String selectReceiverBankXPath = "//img[contains(@src,'online-bank-account')]";

	@FindBy(xpath = "//img[contains(@src,'mobile-wallet-icon')]")
	WebElement selectmobilewalleticonReceiverBank;
	String selectmobilewalleticonReceiverBankXPath = "//img[contains(@src,'mobile-wallet-icon')]";

	@FindBy(xpath = "//button[contains(text(),'Send Money')]")
	WebElement sendmoneyviabubble;
	String sendmoneyviabubbleXPath = "//button[contains(text(),'Send Money')]";

	@FindBy(xpath = "//div[@class='mat-radio-inner-circle']")
	WebElement selectreceivemethodinSendagainSTC;
	String selectreceivemethodinSendagainSTCXPath = "//div[@class='mat-radio-inner-circle']";

	@FindBy(xpath = "//*[@id=\"invite\"]")
	WebElement invitefriend;
	String invitefriendXPath = "//*[@id=\"invite\"]";

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/mg-registration-invited-welcome/div/div/button")
	WebElement getstartedbuttonReferalpage;
	String getstartedbuttonReferalpageXPath = "//*[@id=\"cdk-step-content-0-0\"]/mg-registration-invited-welcome/div/div/button";





	String scheduleDateXPath = "//mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr/td[@aria-label='%s']";

	String seriesNoString = null;
	public HomePage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}

	public WebElement getPageValidationElement() {
		return mgoLogo;
	}
	public String getPageValidationElementXPath() {
		return mgoLogoXPath;
	}
	public WebElement getMgoLogo() {
		return mgoLogo;
	}
	public String getMgoLogoXPath() {
		return mgoLogoXPath;
	}
	public WebElement getFeeEstimatorBox() {
		return feeEstimatorBox;
	}
	public String getFeeEstimatorBoxXPath() {
		return feeEstimatorBoxXPath;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getsignUpButton() {
		return signUpButton;
	}
	public String getLoginButtonXPath() { return loginButtonXPath; }

	public WebElement getSendSomeoneNewButton() { return sendSomeoneNewButton; }
	public String getSendSomeoneNewButtonXPath() {
		return sendSomeoneNewButtonXPath;
	}

	public WebElement degetSendSomeoneNewButton() { return desendSomeoneNewButton; }
	public String degetSendSomeoneNewButtonXPath() {
		return desendSomeoneNewButtonXPath;
	}

	public WebElement getWelcomeNameHeader() {
		return welcomeNameHeader;
	}
	public String getWelcomeNameHeaderXPath() {
		return welcomeNameHeaderXPath;
	}
	public WebElement getWhatsNewPopUpHeaderOKButton() {
		return whatsNewPopUpHeaderOKButton;
	}
	public String getWhatsNewPopUpHeaderOKButtonXPath() {
		return whatsNewPopUpHeaderOKButtonXPath;
	}
	public WebElement getCookieSettingsPopUpHeader() {
		return cookieSettingsPopUpHeader;
	}
	public String getCookieSettingsPopUpHeaderXPath() {
		return cookieSettingsPopUpHeaderXPath;
	}
	public WebElement getAcceptCookiesButton() {
		return acceptCookiesButton;
	}
	public String getAcceptCookiesButtonXPath() {
		return acceptCookiesButtonXPath;
	}
	public WebElement getViewProfileInfo() {
		return viewProfileInfo;
	}
	public WebElement geteditMobileNumber() {
		return editMobileNumber;
	}




		String userLegalNameString;
	int startBubblexpathCount;
	public String getViewProfileInfoXPath() {
		return viewProfileInfoXPath;
	}
	//validation methods begin
	public void validateHomePageLoggedOutIsOpen(){
		int waitTimeForHomePageToLoad = Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForHomePageToLoadUp"));
		Instant start = Instant.now();
		boolean hasHomePageLoadedUp = false;

		while(!hasHomePageLoadedUp){
			if((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, feeEstimatorBoxXPath, 1) != null && exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginButtonXPath, 1) != null) || exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, 1) != null){
				System.out.println("HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				extentReportGenerator.addInfoMessage(currentTest, "HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				hasHomePageLoadedUp = true;
			}
			Instant end = Instant.now();
			long secondsPassed = Duration.between(start, end).getSeconds();
			if(secondsPassed > waitTimeForHomePageToLoad){
				extentReportGenerator.addWarningMessage(currentTest, "HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				System.out.println("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				Assert.fail("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				break;
			}
		}

		handleWhatsNewPopUp();
		handleSurveyFormPopUp();
		handleCookiesPopUp();
		handleSurveyFormPopUp();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, feeEstimatorBoxXPath, 0));
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginButtonXPath, 0));
	}

	public void surveyAbandon(){


		handleSurveyFormPopUp();


	}









	public void scrollDownToAndclickreferfriend(){
		//validatePageIsOpen();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, invitefriendXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, invitefriend, exceptionHandling);
			invitefriend.click();
		}
	}

	public void registerreferalprofile() throws IOException, UnsupportedFlavorException {

		scrollDownToAndclickreferfriend();
		//WebElement invitefren = driver.findElement(By.xpath("//*[@id=\"invite\"]"));
		//invitefren.click();
		actionExecutor.waitFiveSeconds();
		WebElement copylink = driver.findElement(By.xpath("//*[@id=\"copyLink\"]"));

		copylink.click();

		Clipboard c= Toolkit.getDefaultToolkit().getSystemClipboard();
		String urll = (String) c.getData(DataFlavor.stringFlavor);
		System.out.println(urll);


	//	((JavascriptExecutor) driver).executeScript("window.open()");
		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		///driver.switchTo().window(tabs.get(1));
		//actionExecutor.waitFiveSeconds();
		driver.navigate().to(urll);
		//driver.get(urll);

		getstartedbuttonReferalpage.click();
		actionExecutor.waitFiveSeconds();

	}



	public  void userAdditionalDetailsPayBills(){
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderOccupationInputXPath, 1) != null )
		{

			actions
					.click(senderOccupationInput)
					.sendKeys("Agriculture")
					.build()
					.perform();
			senderOccupationOption.click();

			actions
					.click(legalIdNumberInput)
					.sendKeys("345678334")
					.build()
					.perform();


		}
		actionExecutor.scrollToElementViaDynamicXPath(driver, paymentinformationNextButtonXPath, exceptionHandling);
		paymentinformationNextButton.click();
	}

public void verifyNotificationOption(){
	if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notificationsHeaderTextXPath, 1) != null ) {

		Boolean isNotificationsDisplay = driver.findElement(By.xpath(notificationsHeaderTextXPath)).isDisplayed();
		if(isNotificationsDisplay){
			extentReportGenerator.addInfoMessage(currentTest, "THE NOTIFICATION BLOCK. IS: Displayed ");
			extentReportGenerator.addInfoMessage(currentTest, "VALIDATING DEFAULT NOTIFICATION TEXT SELECTION");
			System.out.println("VALIDATING DEFAULT NOTIFICATION TEXT SELECTION");
			Boolean isDefaultTextSelection = driver.findElement(By.xpath(defaultCheckBoxSelectionTextXPath)).isDisplayed();
			if(isDefaultTextSelection){
				extentReportGenerator.addInfoMessage(currentTest, "VALIDATED DEFAULT NOTIFICATION TEXT SELECTION IS TEXT");
			}
		}
	}
}


	public  void userEditMobilenumberandVerify(String countryPreFix){
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, profileMobilenumberInputXPath, 1) != null )
		{
			String phonenumber = countryPreFix + RandomStringUtils.randomNumeric(7);

			profileMobilenumberInput.clear();
			profileMobilenumberInput.sendKeys(phonenumber);


			saveMobileNumberButton.click();

		}
		actionExecutor.scrollToElementViaDynamicXPath(driver, updatedMobileNumberXPath, exceptionHandling);
		String UpdatedMobileNo = updatedMobileNumber.getText();
		System.out.println("UPDATED MOBILE NUMBER. IS: " + UpdatedMobileNo);
	}



	public void performinteracSendAgain(){
		actionExecutor.scrollToElementViaDynamicXPath(driver, interaciamDoneButtonXPath, exceptionHandling);
		interaciamDoneButton.click();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND AGAIN FROM HOME PAGE");
		System.out.println("VALIDATING SEND AGAIN FROM HOME PAGE");
		actionExecutor.waitFiveSeconds();

		actionExecutor.scrollToElementViaDynamicXPath(driver, sendAgainButtonXPath, exceptionHandling);
		sendAgainButton.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendOnceButtonXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, sendOnceButtonXPath, exceptionHandling);
			sendOnceButton.click();
		}

		actionExecutor.scrollToElementViaDynamicXPath(driver, nextButtonFeeEstimatorPageXPath, exceptionHandling);
		nextButtonFeeEstimatorPage.click();

		boolean isvisible = closeiwidgets.isDisplayed();
		if(isvisible) {
			closeRedPopUp.click();

		}

	}



	public void performfastsendSendAgain(){
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, iamDoneButtonnXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonnXPath, exceptionHandling);
			iamDoneButtonn.click();
		}
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND AGAIN FROM HOME PAGE");
		System.out.println("VALIDATING SEND AGAIN FROM HOME PAGE");

		actionExecutor.scrollToElementViaDynamicXPath(driver, sendAgainButtonXPath, exceptionHandling);
		sendAgainButton.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendOnceButtonXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, sendOnceButtonXPath, exceptionHandling);
			sendOnceButton.click();
		}

		actionExecutor.scrollToElementViaDynamicXPath(driver, nextButtonFeeEstimatorPageXPath, exceptionHandling);
		nextButtonFeeEstimatorPage.click();

		boolean isvisible = closeiwidgets.isDisplayed();
		if(isvisible) {
			closeRedPopUp.click();

		}

	}

	public void performSendAgain(){
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, iamDoneButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
			iamDoneButton.click();
		}
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND AGAIN FROM HOME PAGE");
		System.out.println("VALIDATING SEND AGAIN FROM HOME PAGE");
actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendAgainButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, sendAgainButtonXPath, exceptionHandling);
			sendAgainButton.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendOnceButtonXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, sendOnceButtonXPath, exceptionHandling);
			sendOnceButton.click();
		}
		actionExecutor.scrollToElementViaDynamicXPath(driver, nextButtonFeeEstimatorPageXPath, exceptionHandling);
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonFeeEstimatorPageXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, nextButtonFeeEstimatorPageXPath, exceptionHandling);
			nextButtonFeeEstimatorPage.click();
		}

boolean isvisible = closeiwidgets.isDisplayed();
		if(isvisible) {
			//closeRedPopUp.click();

		}

	}

	public void performSendAgainViaRcvBubble(){

		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		actionExecutor.waitFiveSeconds();
		iamDoneButton.click();

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND AGAIN BUTTON VIA RECEIVER BUBBLE");
		System.out.println("VALIDATING SEND AGAIN BUTTON VIA RECEIVER BUBBLE");


		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBubbleXPath, 0));
		receiverBubble.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, selectReceiverBankXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, selectReceiverBankXPath, exceptionHandling);
			selectReceiverBank.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, selectmobilewalleticonReceiverBankXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, selectmobilewalleticonReceiverBankXPath, exceptionHandling);
			selectmobilewalleticonReceiverBank.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendmoneyviabubbleXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, sendmoneyviabubbleXPath, exceptionHandling);
			sendmoneyviabubble.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, selectreceivemethodinSendagainSTCXPath, 1) != null){
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectreceivemethodinSendagainSTC);
			//selectreceivemethodinSendagainSTC.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, seriesNextButtonXPath, 1) != null){
			//actionExecutor.scrollToElementViaDynamicXPath(driver, seriesNextButtonXPath, exceptionHandling);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", seriesNextButton);

			// seriesNextButton.click();
		}



	}
	public void payBillsandPayAgain(String paymentOption){

		actionExecutor.scrollToElementViaDynamicXPath(driver, payAgainHomeButtonXPath, exceptionHandling);
		payAgainHomeButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerButtonXPath, exceptionHandling);
		payBillerButton.click();

		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerNextButtonXPath, exceptionHandling);
		payBillerNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerInfoNextButtonXPath, exceptionHandling);
		billerInfoNextButton.click();


		//actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerNextButtonXPath, exceptionHandling);
		//payBillerNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, paybillsCCOptionRadioButtonXPath, exceptionHandling);
		paybillsCCOptionRadioButton.click();

		actions

				.click(verifyCVVInput)
				.sendKeys("456")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, verifyCVVButtonXPath, exceptionHandling);
		verifyCVVButton.click();

	//	actionExecutor.scrollToElementViaDynamicXPath(driver, paymentinformationNextButtonXPath, exceptionHandling);
	//	paymentinformationNextButton.click();

	}

	public void userPayBills(String paymentOption){
		extentReportGenerator.addInfoMessage(currentTest, "Home page - Pay Bills");

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillsLinkXPath, exceptionHandling);
		payBillsLink.click();
		actionExecutor.waitFiveSeconds();

		actionExecutor.scrollToElementViaDynamicXPath(driver,billerNameorReceiveCodeInputXPath, exceptionHandling);

		//actions
		//		.click(billerNameorReceiveCodeInput)
		//		.sendKeys("BEALLS COMMUNICATION GROUP INC")
		//		.build()
		//		.perform();

		billerNameorReceiveCodeInput.click();
		billerNameorReceiveCodeInput.sendKeys("BEALLS");
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, billerNameOptionXPath, exceptionHandling);
		billerNameOption.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillButtonXPath, exceptionHandling);
		payBillButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payAmountInputXPath, exceptionHandling);
		actions
				.click(payAmountInput)
				.sendKeys("10")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerButtonXPath, exceptionHandling);
		payBillerButton.click();

		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerNextButtonXPath, exceptionHandling);
		payBillerNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerAccountNumberInputXPath, exceptionHandling);
		actions
				.click(billerAccountNumberInput)
				.sendKeys("1234567890")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerInfoNextButtonXPath, exceptionHandling);
		billerInfoNextButton.click();


		}


	public void userPayBillsaccount(String paymentOption){
		extentReportGenerator.addInfoMessage(currentTest, "Home page - Pay Bills");

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillsLinkXPath, exceptionHandling);
		payBillsLink.click();
		actionExecutor.waitFiveSeconds();

		actionExecutor.scrollToElementViaDynamicXPath(driver,billerNameorReceiveCodeInputXPath, exceptionHandling);
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		billerNameorReceiveCodeInput.click();
		billerNameorReceiveCodeInput.sendKeys("BEALLS");
		//actions
				//.click(billerNameorReceiveCodeInput)
				//.sendKeys("BEALLS COMMUNICATION GROUP INC")
				//.build()
				//.perform();//

		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, billerNameOptionXPath, exceptionHandling);
		billerNameOption.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillButtonXPath, exceptionHandling);
		payBillButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payAmountInputXPath, exceptionHandling);
		actions
				.click(payAmountInput)
				.sendKeys("10")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerButtonXPath, exceptionHandling);
		payBillerButton.click();

		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerNextButtonXPath, exceptionHandling);
		payBillerNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerAccountNumberInputXPath, exceptionHandling);
		actions
				.click(billerAccountNumberInput)
				.sendKeys("1234567890")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerInfoNextButtonXPath, exceptionHandling);
		billerInfoNextButton.click();


	}


	public void userValidatetheBubble() {
		int endBubblexpathCount = driver.findElements(By.xpath(bubblesCountXPath)).size();
		if(startBubblexpathCount == endBubblexpathCount)
		{
			Assert.assertTrue(true,"Bubble count is same, No New Bubble added in paybill Transaction");
		}
		else
		{
			Assert.fail("New Bubble is added when Performing PayBill Transaction");
		}
	}
		public void userPayBillsnonUS(String paymentOption){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		startBubblexpathCount = driver.findElements(By.xpath(bubblesCountXPath)).size();
		extentReportGenerator.addInfoMessage(currentTest, "Home page - Pay Bills");

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillsLinkXPath, exceptionHandling);
		payBillsLink.click();
		actionExecutor.waitFiveSeconds();

		actionExecutor.scrollToElementViaDynamicXPath(driver,billerNameorReceiveCodeInputXPath, exceptionHandling);

		actions
				.click(billerNameorReceiveCodeInput)
				.sendKeys("BEALLS COMMUNICATION GROUP INC")
				.build()
				.perform();


		actionExecutor.scrollToElementViaDynamicXPath(driver, billerNameOptionXPath, exceptionHandling);
		billerNameOption.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillButtonXPath, exceptionHandling);
		payBillButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payAmountInputXPath, exceptionHandling);
		actions
				.click(payAmountInput)
				.sendKeys("10")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerButtonXPath, exceptionHandling);
		payBillerButton.click();

		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerNextButtonXPath, exceptionHandling);
		payBillerNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerAccountNumberInputXPath, exceptionHandling);
		actions
				.click(billerAccountNumberInput)
				.sendKeys("1234567890")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerInfoNextButtonXPath, exceptionHandling);
		billerInfoNextButton.click();


	}

	public void userPayBillsviaPWC(String paymentOption){
		extentReportGenerator.addInfoMessage(currentTest, "Home page - Pay Bills");
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillsLinkXPath, exceptionHandling);
		payBillsLink.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver,billerNameorReceiveCodeInputXPath, exceptionHandling);

		actions
				.click(billerNameorReceiveCodeInput)
				.sendKeys("FRONTIER UTILITIES")
				.build()
				.perform();

actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, billerFrontNameOptionXPath, exceptionHandling);
		billerFrontNameOption.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillButtonXPath, exceptionHandling);
		payBillButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, payAmountInputXPath, exceptionHandling);
		actions
				.click(payAmountInput)
				.sendKeys("10")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerButtonXPath, exceptionHandling);
		payBillerButton.click();
		actionExecutor.waitFiveSeconds();

		selectLocationButton.click();
		actionExecutor.waitFiveSeconds();
		actions

				.click(searchKeywordInputBox)
				.sendKeys("TX-12 Loop, Dallas, TX, USA")
				.build()
				.perform();
		actionExecutor.waitFiveSeconds();
		iconSearchButton.click();
		actionExecutor.waitFiveSeconds();
		//actionExecutor.scrollToElement(driver, formiconSearchButton, exceptionHandling);
		//formiconSearchButton.click();

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		//WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Select a Payment Location')]"));ele.click();
		actionExecutor.scrollToElement(driver, resultLocationButton, exceptionHandling);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", resultLocationButton);
		//resultLocationButton.click();
		//actionExecutor.waitFiveSeconds();
		//actionExecutor.waitFiveSeconds();
		//actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerNextButtonXPath, exceptionHandling);
		actionExecutor.waitFiveSeconds();
		payBillerNextButton.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver, billerAccountNumberInputXPath, exceptionHandling);
		actions
				.click(billerAccountNumberInput)
				.sendKeys("98758")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, validateBillerAccountNumberInputXPath, exceptionHandling);
		actions
				.click(validateBillerAccountNumberInput)
				.sendKeys("98758")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, billerInfoNextButtonXPath, exceptionHandling);
		billerInfoNextButton.click();


	}

	public void userVerifyDefaultPayBills(String paymentOption){
		extentReportGenerator.addInfoMessage(currentTest, "Home page - Pay Bills");
		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillsLinkXPath, exceptionHandling);
		payBillsLink.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver,billerNameorReceiveCodeInputXPath, exceptionHandling);

		//actions
		//		.click(billerNameorReceiveCodeInput)
		//		.sendKeys("BEALLS COMMUNICATION GROUP INC")
		//		.build()
		//		.perform();

		billerNameorReceiveCodeInput.click();
		billerNameorReceiveCodeInput.sendKeys("BEALLS");
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, billerNameOptionXPath, exceptionHandling);
		billerNameOption.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillButtonXPath, exceptionHandling);
		payBillButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payAmountInputXPath, exceptionHandling);
		actions
				.click(payAmountInput)
				.sendKeys("10")
				.build()
				.perform();

		actionExecutor.scrollToElementViaDynamicXPath(driver, payBillerButtonXPath, exceptionHandling);
		payBillerButton.click();

		actionExecutor.scrollToElement(driver, defaultPaymentOptionRadio, exceptionHandling);
		Boolean isselect = driver.findElement(By.xpath(defaultPaymentOptionRadioXPath)).isDisplayed();
		if(isselect){
			extentReportGenerator.addInfoMessage(currentTest, "THE DEFAULT PAYMENT OPTION IS DEBIT CARD");
			System.out.println("THE DEFAULT PAYMENT OPTION IS DEBIT CARD");
		}
		else{
			Assert.fail("THE DEFAULT PAYMENT OPTION IS NOT A DEBIT CARD");
			System.out.println("THE DEFAULT PAYMENT OPTION IS NOT A DEBIT CARD");
		}


	}

	public void validatelocations() {
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING FIND A LOCATION MENU LINK");
		System.out.println("VALIDATING FIND A LOCATION MENU LINK");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, mgoFindlocationlinkXPath, 0));
		mgoFindlocationlink.click();
		extentReportGenerator.addInfoMessage(currentTest, "Click on Find a location link");
		System.out.println("Click on Find a location link");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, findaLocationTexthtagXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED FIND A LOCATION PAGE");
	}

	public void selectLocationandSearch(){
		selectLocationCountryDropDown.click();
		selectLocationCountryOption.click();
		setLocationText.sendKeys("London");
		searchicon.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		selectlocationfromResults.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		selectOnlineTrans.click();
	}

	public void validatePageIsOpen() {
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING HOME PAGE");
		System.out.println("VALIDATING HOME PAGE");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, mgoLogoXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "HOME PAGE LOGO IS OPEN");
		System.out.println("HOME PAGE LOGO IS OPEN");
	}

	public void validateHomePageLoggedInIsOpen(){
		//can see if fee estimator box and login button both appear for logged out status. Can see if "Send to someone new" and "Welcome" appear for logged in status
		int waitTimeForHomePageToLoad = Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForHomePageToLoadUp"));
		Instant start = Instant.now();
		boolean hasHomePageLoadedUp = false;
		while(!hasHomePageLoadedUp){
			if((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendSomeoneNewButtonXPath, 1) != null && exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, welcomeNameHeaderXPath, 1) != null) || exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, 1) != null){
				System.out.println("HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				extentReportGenerator.addInfoMessage(currentTest, "HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				hasHomePageLoadedUp = true;
			}
			Instant end = Instant.now();
			long secondsPassed = Duration.between(start, end).getSeconds();
			if(secondsPassed > waitTimeForHomePageToLoad){
				extentReportGenerator.addWarningMessage(currentTest, "HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				System.out.println("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				Assert.fail("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				break;
			}
		}
		handleWhatsNewPopUp();
		handleSurveyFormPopUp();
	}

	public void validateWhatsnew_content(){
		boolean whatsnewelement = WhatsNewOnHomePage.isDisplayed();

		if(whatsnewelement){
			Assert.assertTrue(true,"Whats new content is displayed as expected");
		}
		else{
			Assert.assertFalse(false,"Whats new content is not displayed");
		}
	}

	public void validateSummary_content(){
		boolean summaryelement = summaryHomePage.isDisplayed();

		if(summaryelement){
			Assert.assertTrue(true,"summary content is displayed as expected");
		}
		else{
			Assert.assertFalse(false,"summary content is not displayed");
		}
	}


	public void validateHomePageLoggedInIsOpen(String username, String password){
		//actionExecutor.waitFiveSeconds();
		//can see if fee estimator box and login button both appear for logged out status. Can see if "Send to someone new" and "Welcome" appear for logged in status
		int waitTimeForHomePageToLoad = Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForHomePageToLoadUp"));
		LoginPage loginPage = new LoginPage(driver, currentTest, extentReportGenerator, scenario);
		Instant start = Instant.now();
		while(true){ //infinite loop, breaks after time in waitTimeForHomePageToLoad expires
			if((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendSomeoneNewButtonXPath, 1) != null && exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, welcomeNameHeaderXPath, 1) != null) || exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, 1) != null){
				if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, profilePendingPopupHeaderXPath, 1) != null){
					waitTimeForHomePageToLoad = Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForHomePageToLoadUpProfilePendingStatus"));
					Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, profilePendingLogOutXPath, 0));
					profilePendingLogOut.click();
					//simple login flow here
					Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginButtonXPath, 0));
					handleWhatsNewPopUp();
					loginButton.click();
					loginPage.simpleLogin(username, password);
					handleSurveyFormPopUp();
				} else {
				System.out.println("HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				extentReportGenerator.addInfoMessage(currentTest, "HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				break;
				}
			}
			Instant end = Instant.now();
			long secondsPassed = Duration.between(start, end).getSeconds();
			if(secondsPassed > waitTimeForHomePageToLoad){
				extentReportGenerator.addWarningMessage(currentTest, "HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				System.out.println("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				Assert.fail("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				break;
			}
		}
		handleWhatsNewPopUp();
		handleSurveyFormPopUp();
	}
	//validation methods end

	public void handleProfilePending(){

	}
	//flows related to this page begin
	public void handleWhatsNewPopUp(){



		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
			extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
			actionExecutor.scrollToElementViaDynamicXPath(driver, whatsNewPopUpHeaderOKButtonXPath, exceptionHandling);

			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", whatsNewPopUpHeaderOKButton);
		//	whatsNewPopUpHeaderOKButton.click();
		}
	}
	public void handleCookiesPopUp(){


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cookieSettingsPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
			extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
			actionExecutor.scrollToElementViaDynamicXPath(driver, acceptCookiesButtonXPath, exceptionHandling);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", acceptCookiesButton);
			//acceptCookiesButton.click();
		}
	}

	public void handleSurveyFormPopUp(){


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, surveyFormXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
			driver.switchTo().frame(surveyFormiFrame);
			extentReportGenerator.addInfoMessage(currentTest, "Abandon Survey For has appeared");
			actionExecutor.scrollToElementViaDynamicXPath(driver, surveyFormCloseXPath, exceptionHandling);

			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", surveyFormClose);
			//acceptCookiesButton.click();
		}
	}







	private void openViewDetailsFromTile(){

		extentReportGenerator.addInfoMessage(currentTest, "Home page with view details tile has finished loading");
		actionExecutor.scrollToElementViaDynamicXPath(driver, firsttransactionsDivXPath, exceptionHandling);

		firsttransactionsDiv.click();



	}
	public void userAttemptsToAddMonthlyScheduleDetails(){
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();
		actionExecutor.waitFiveSeconds();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SCHEDULE TRANSACTION PAGE");
		System.out.println("VALIDATING SCHEDULE TRANSACTION PAGE");
		//openViewDetailsFromTile();

		actionExecutor.scrollToElementViaDynamicXPath(driver, sendAgainButtonXPath, exceptionHandling);
		sendAgainButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, setScheduleButtonXPath, exceptionHandling);
		setScheduleButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, monthlyButtonXPath, exceptionHandling);
		monthlyButton.click();
		actionExecutor.waitFiveSeconds();
		DateFormat df = new SimpleDateFormat("M/d/yyyy");
		Date today = Calendar.getInstance().getTime();

		Date dts = new Date();
		System.out.println("Today:    "+dts);
		Calendar c = Calendar.getInstance();
		c.setTime(dts);
		c.add(Calendar.DATE, 2);
		dts = c.getTime();

		String reportDate = df.format(dts);

		System.out.println(reportDate);

		actionExecutor.scrollToElementViaDynamicXPath(driver, startDateInputXPath, exceptionHandling);
		startDateInput.click();
		actionExecutor.waitFiveSeconds();
		String xpathToSchedule = String.format(scheduleDateXPath, reportDate);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToSchedule, exceptionHandling);
		driver.findElement(By.xpath(xpathToSchedule)).click();



		actionExecutor.scrollToElementViaDynamicXPath(driver, seriesNextButtonXPath, exceptionHandling);
		seriesNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, scheduleTransferButtonXPath, exceptionHandling);
		scheduleTransferButton.click();
		actionExecutor.waitFiveSeconds();
		seriesNoString = seriesNumberText.getText();
		System.out.println("THE SERIES NO. IS: " + seriesNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE SERIES NO. IS: " + seriesNoString);

		actionExecutor.scrollToElementViaDynamicXPath(driver, iAmDoneButtonXPath, exceptionHandling);
		iAmDoneButton.click();

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SCHEDULE TRANSACTION PAGE");
		System.out.println("VALIDATED SCHEDULE TRANSACTION PAGE");
	}

	public void deleteWeeklyScheduleTransaction(){
	actionExecutor.scrollToElementViaDynamicXPath(driver, deleteScheduleButtonXPath, exceptionHandling);
	deleteScheduleButton.click();

	actionExecutor.scrollToElementViaDynamicXPath(driver, confirmDeleteScheduleButtonXPath, exceptionHandling);
	confirmDeleteScheduleButton.click();
	}



	public void seriesdetailsvalidation(){ //starts from the home page

		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SCHEDULE TRANSACTION PAGE");
		System.out.println("VALIDATING SCHEDULE TRANSACTION PAGE");
		//openViewDetailsFromTile();

		actionExecutor.scrollToElementViaDynamicXPath(driver, sendAgainButtonXPath, exceptionHandling);
		sendAgainButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, setScheduleButtonXPath, exceptionHandling);
		setScheduleButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, weeklyButtonXPath, exceptionHandling);
		weeklyButton.click();
		DateFormat df = new SimpleDateFormat("M/d/yyyy");
		Date today = Calendar.getInstance().getTime();

		Date dts = new Date();
		System.out.println("Today:    "+dts);
		Calendar c = Calendar.getInstance();
		c.setTime(dts);
		c.add(Calendar.DATE, 2);
		dts = c.getTime();

		String reportDate = df.format(dts);

		System.out.println(reportDate);

		actionExecutor.scrollToElementViaDynamicXPath(driver, startDateInputXPath, exceptionHandling);
		startDateInput.click();

		String xpathToSchedule = String.format(scheduleDateXPath, reportDate);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToSchedule, exceptionHandling);
		driver.findElement(By.xpath(xpathToSchedule)).click();



		actionExecutor.scrollToElementViaDynamicXPath(driver, seriesNextButtonXPath, exceptionHandling);
		seriesNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, scheduleTransferButtonXPath, exceptionHandling);
		scheduleTransferButton.click();

		seriesNoString = seriesNumberText.getText();
		System.out.println("THE SERIES NO. IS: " + seriesNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE SERIES NO. IS: " + seriesNoString);

		actionExecutor.scrollToElementViaDynamicXPath(driver, iAmDoneButtonXPath, exceptionHandling);
		iAmDoneButton.click();

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SCHEDULE TRANSACTION PAGE");
		System.out.println("VALIDATED SCHEDULE TRANSACTION PAGE");

		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, seriesnumberrXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null) {


					boolean seriesnum =seriesnumberr.isDisplayed();
			if(seriesnum){
				extentReportGenerator.addInfoMessage(currentTest, "Series number is displayed in scheduled transaction history");

			}

		}
		}


	public void scheduleWeeklySendAgainTransaction(){ //starts from the home page
actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();
		actionExecutor.waitFiveSeconds();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SCHEDULE TRANSACTION PAGE");
		System.out.println("VALIDATING SCHEDULE TRANSACTION PAGE");
		//openViewDetailsFromTile();

		actionExecutor.scrollToElementViaDynamicXPath(driver, sendAgainButtonXPath, exceptionHandling);
		sendAgainButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, setScheduleButtonXPath, exceptionHandling);
		setScheduleButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, weeklyButtonXPath, exceptionHandling);
		weeklyButton.click();
		DateFormat df = new SimpleDateFormat("M/d/yyyy");
		Date today = Calendar.getInstance().getTime();

		Date dts = new Date();
		System.out.println("Today:    "+dts);
		Calendar c = Calendar.getInstance();
		c.setTime(dts);
		c.add(Calendar.DATE, 2);
		dts = c.getTime();

		String reportDate = df.format(dts);

		System.out.println(reportDate);

		actionExecutor.scrollToElementViaDynamicXPath(driver, startDateInputXPath, exceptionHandling);
		startDateInput.click();

		String xpathToSchedule = String.format(scheduleDateXPath, reportDate);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToSchedule, exceptionHandling);
		driver.findElement(By.xpath(xpathToSchedule)).click();



		actionExecutor.scrollToElementViaDynamicXPath(driver, seriesNextButtonXPath, exceptionHandling);
		seriesNextButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, scheduleTransferButtonXPath, exceptionHandling);
		scheduleTransferButton.click();

		seriesNoString = seriesNumberText.getText();
		System.out.println("THE SERIES NO. IS: " + seriesNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE SERIES NO. IS: " + seriesNoString);

		actionExecutor.scrollToElementViaDynamicXPath(driver, iAmDoneButtonXPath, exceptionHandling);
		iAmDoneButton.click();

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SCHEDULE TRANSACTION PAGE");
		System.out.println("VALIDATED SCHEDULE TRANSACTION PAGE");


	}
public void getUserLastName()
{
	 userLegalNameString = userLegalNameDiv.getText();
	String[] fullName = userLegalNameString.split(" ");
	String lastName= fullName[1];
	System.out.println("THE lastName NO. IS: " + lastName);
}
	public void cancelSingleTopMostTransactionFromHomePage(){ //starts from the home page
actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();
		actionExecutor.waitFiveSeconds();
		extentReportGenerator.addInfoMessage(currentTest, "Cancelling the transaction");
		System.out.println("Cancelling the transactio");
		openViewDetailsFromTile();

		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelPaymentButtonXPath, exceptionHandling);
    	cancelPaymentButton.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, ContinuecancelPaymentButtonXPath, 1) != null) {
			ContinuecancelPaymentButton.clear();
		}




		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelTransactionIUnderstandButtonXPath, exceptionHandling);
		cancelTransactionIUnderstandButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, reasonforCancelingDropdpwnXPath, exceptionHandling);
		reasonforCancelingDropdpwn.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver, reasonforCancelingXPath, exceptionHandling);
		reasonforCanceling.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, confirmCancellationButtonXPath, exceptionHandling);

		confirmCancellationButton.click();

		//validateHomePageOpenLoggedIn();
		//Assert.assertTrue((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(homePageDriver, sendAgainTileTextSpecificallyForCancelXPath, 0) != null));
	}




	public void cancelFastSendTransaction(){ //starts from the home page

		//actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneeButtonXPath, exceptionHandling);
		//iamDoneeButton.click();
		actionExecutor.waitFiveSeconds();
		extentReportGenerator.addInfoMessage(currentTest, "Cancelling the transaction");
		System.out.println("Cancelling the transactio");
		openViewDetailsFromTile();

		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelPaymentButtonXPath, exceptionHandling);
		cancelPaymentButton.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, ContinuecancelPaymentButtonXPath, 1) != null) {
			ContinuecancelPaymentButton.clear();
		}




		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelTransactionIUnderstandButtonXPath, exceptionHandling);
		cancelTransactionIUnderstandButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, reasonforCancelingDropdpwnXPath, exceptionHandling);
		reasonforCancelingDropdpwn.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver, reasonforCancelingXPath, exceptionHandling);
		reasonforCanceling.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, confirmCancellationButtonXPath, exceptionHandling);

		confirmCancellationButton.click();

		//validateHomePageOpenLoggedIn();
		//Assert.assertTrue((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(homePageDriver, sendAgainTileTextSpecificallyForCancelXPath, 0) != null));
	}


	public void clicksOnCookiePrefernces() {

		int waitTimeForHomePageToLoad = Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForHomePageToLoadUp"));
		Instant start = Instant.now();
		boolean hasHomePageLoadedUp = false;

		while(!hasHomePageLoadedUp){
			if((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, feeEstimatorBoxXPath, 1) != null && exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginButtonXPath, 1) != null) || exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, 1) != null){
				System.out.println("HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				extentReportGenerator.addInfoMessage(currentTest, "HOME PAGE (LOGGED OUT STATUS) HAS APPEARED! BREAKING LOOP WAITING FOR HOME PAGE.");
				hasHomePageLoadedUp = true;
			}
			Instant end = Instant.now();
			long secondsPassed = Duration.between(start, end).getSeconds();
			if(secondsPassed > waitTimeForHomePageToLoad){
				extentReportGenerator.addWarningMessage(currentTest, "HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				System.out.println("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				Assert.fail("HOME PAGE TIMER HAS ELAPSED AND HOME PAGE IS STILL NOT LOADED! FAILING.");
				break;
			}
		}
		handleWhatsNewPopUp();
		handleSurveyFormPopUp();

		actionExecutor.scrollToElementViaDynamicXPath(driver, coockiePreferencesXPath, exceptionHandling);
		coockiePreferences.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, viewCoockieSettingsXPath, exceptionHandling);
		viewCoockieSettings.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, submitPreferencesXPath, exceptionHandling);
		submitPreferences.click();

	}
	public void cancelSingleTopMostTransactionViewNewModel(){ //starts from the home page

		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING FEE ESTIMATOR PAGE");
		System.out.println("VALIDATING FEE ESTIMATOR PAGE");
		openViewDetailsFromTile();

		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelPaymentButtonXPath, exceptionHandling);
		cancelPaymentButton.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, cancelTransactionIUnderstandButtonXPath, exceptionHandling);
		cancelTransactionIUnderstandButton.click();

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED CANCEL MODEL POPUP");
		System.out.println("VALIDATED CANCEL MODEL POPUP");


	}

	public void TransactionsReceiptLocationtax(){ //starts from the home page
		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneeButtonXPath, exceptionHandling);
		iamDoneeButton.click();
		openViewDetailsFromTile();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING VIEW RECEIPT PAGE");
		System.out.println("VALIDATING VIEW RECEIPT PAGE");
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, viewReceiptButtonXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, viewReceiptButtonXPath, exceptionHandling);
			viewReceiptButton.click();
			actionExecutor.waitFiveSeconds();
		}
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, locatiotaxinreceiptXPath, 1) != null) {

			extentReportGenerator.addInfoMessage(currentTest, "Location tax is being displayed in receipt");
		}
		else{
			extentReportGenerator.addInfoMessage(currentTest, "Location tax is  not displayed in receipt");

			Assert.fail("Location tax is not displayed in summary page ");
		}
	}

	public void TransactionsReceiptSingleTopMostTransactionFromHomePage(){ //starts from the home page
		actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
		iamDoneButton.click();
		openViewDetailsFromTile();
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING VIEW RECEIPT PAGE");
		System.out.println("VALIDATING VIEW RECEIPT PAGE");

		actionExecutor.scrollToElementViaDynamicXPath(driver, viewReceiptButtonXPath, exceptionHandling);
		viewReceiptButton.click();

		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED VIEW RECEIPT PAGE");
		System.out.println("VALIDATED VIEW RECEIPT PAGE");

	}
	public void validateIDuploadpopisdisplayed() {

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		Boolean prompt = IDuploadPrompt.isDisplayed();
		if (prompt) {
			extentReportGenerator.addInfoMessage(currentTest, "ID upload prompt is been displayed");
			String idupload = IDuploadPrompt.getText();
			System.out.println(idupload);
		} else {
			Assert.fail("Application is not prompting for ID upload");
			System.out.println("Application is not prompting for ID upload");
		}
	}



	public void validateUKuserblockedisdisplayed() {

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		WebElement userblocked =driver.findElement(By.xpath("//div[contains(text(),'After careful review')]"));
		Boolean userblockedmsg = userblocked.isDisplayed();
		if (userblockedmsg) {
			extentReportGenerator.addInfoMessage(currentTest, "user blocked msg is displayed");
			String valdationmsg = IDuploadPrompt.getText();
			System.out.println(valdationmsg);
		} else {
			Assert.fail("user blocked msg is not displayed");
			System.out.println("user blocked msg is not displayed");
		}
	}

	public void validateUSuserblockedisdisplayed() {

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		WebElement userblocked =driver.findElement(By.xpath("//mat-error[contains(text(),'Your login information')]"));
		Boolean userblockedmsg = userblocked.isDisplayed();
		if (userblockedmsg) {
			extentReportGenerator.addInfoMessage(currentTest, "user blocked msg is displayed");
			String valdationmsg = IDuploadPrompt.getText();
			System.out.println(valdationmsg);
		} else {
			Assert.fail("user blocked msg is not displayed");
			System.out.println("user blocked msg is not displayed");
		}
	}

	public void validateuserblockedisdisplayed() {

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		WebElement userblocked =driver.findElement(By.xpath("//div[contains(text(),'After careful review')]"));
		Boolean userblockedmsg = userblocked.isDisplayed();
		if (userblockedmsg) {
			extentReportGenerator.addInfoMessage(currentTest, "user blocked msg is displayed");
			String valdationmsg = IDuploadPrompt.getText();
			System.out.println(valdationmsg);
		} else {
			Assert.fail("user blocked msg is not displayed");
			System.out.println("user blocked msg is not displayed");
		}
	}
	public void changeLanguage(){

		actionExecutor.scrollToElementViaDynamicXPath(driver, changeLanguageXPath, exceptionHandling);
		changeLanguage.click();

		actionExecutor.scrollToElementViaDynamicXPath(driver, selectLanguageXPath, exceptionHandling);
		selectLanguage.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		frenchsendsomeonenewbutton.click();




	}


	public void validatesTransctionHoldMessage(){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		Boolean prompt = holdMessagePrompt.isDisplayed();
		if (prompt) {
			extentReportGenerator.addInfoMessage(currentTest, "ID upload prompt is been displayed");
			String idupload = holdMessagePrompt.getText();
			System.out.println(idupload);
		} else {
			Assert.fail("Application is not prompting for hold message");
			System.out.println("Application is not prompting for hold message");
		}
	}

	public void validateOTPmessagedisplayed() {

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		sendotpbutton.click();
		actionExecutor.waitFiveSeconds();
		Boolean promptt = otpsentmsg.isDisplayed();
		if (promptt) {
			extentReportGenerator.addInfoMessage(currentTest, "Application is prompting for OTP to complete the registration");
			String otpmessage = IDuploadPrompt.getText();
			System.out.println(otpmessage);
		} else {
			Assert.fail("Application is not prompting for OTP to complete the registration");
			System.out.println("Application is not prompting for OTP to complete the registration");
		}
	}

	public void validateforgotpwdisdisplayed() {

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		WebElement ele =driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/mg-otp-notify/div/div[1]"));
		Boolean otpprmptttt = ele.isDisplayed();
		if (otpprmptttt) {
			extentReportGenerator.addInfoMessage(currentTest, "OTP prmpt for forgot pwd is been displayed");
			String elee = IDuploadPrompt.getText();
			System.out.println(elee);
		} else {
			Assert.fail("Application is not prompting for otp for forgot pwd");
			System.out.println("Application is not prompting for otp for forgot pwd");
		}
	}
}
