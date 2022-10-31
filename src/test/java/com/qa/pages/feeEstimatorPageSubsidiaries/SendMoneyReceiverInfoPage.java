package com.qa.pages.feeEstimatorPageSubsidiaries;

import com.aventstack.extentreports.ExtentTest;
import com.qa.pages.BasePageAbstractTemplate;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class SendMoneyReceiverInfoPage extends BasePageAbstractTemplate {





//input[@id='accountNumber']

	@FindBy(xpath = "//input[@id='identifier']")
	WebElement ibcnumber;
	String ibcnumberXPath = "//input[@id='identifier']";

	@FindBy(xpath = "//input[@id='nameText']")
	WebElement ibcbankname;
	String ibcbanknameXPath = "//input[@id='nameText']";

	@FindBy(xpath = "//input[@id='accountNumber']")
	WebElement ibcaccountNumber;
	String ibcaccountNumberXPath = "//input[@id='accountNumber']";

	@FindBy(xpath = "//input[@id='sourceOfFunds']")
	WebElement sourceOfFunds;
	String sourceOfFundsXPath = "//input[@id='sourceOfFunds']";

	@FindBy(xpath = "//span[contains(text(),'Loan')]")
	WebElement loan;
	String loanXPath = "//span[contains(text(),'Loan')]";

	@FindBy(xpath = "//input[@id='send_PurposeOfTransaction']")
	WebElement PurposeOfTransaction;
	String PurposeOfTransactionXPath = "//input[@id='send_PurposeOfTransaction']";

	@FindBy(xpath = "//span[contains(text(),'Gift')]")
	WebElement Gift;
	String GiftXPath = "//span[contains(text(),'Gift')]";



	@FindBy(xpath = "//mat-error[contains(text(),'We can only accept debit cards issued from Spain')]")
	WebElement errormessagecheckout;
	String errormessagecheckoutXPath = "//mat-error[contains(text(),'We can only accept debit cards issued from Spain')]";



	@FindBy(xpath = "//mat-radio-button/label/div/img[contains(@src,'visa')]")
	WebElement existingcardRadio;
	String existingcardRadioXPath = "//mat-radio-button/label/div/img[contains(@src,'visa')]";

	@FindBy(xpath = "//mat-radio-button/label/div/img[contains(@src,'bank')]")
	WebElement existingBankRadio;
	String existingBankRadioXPath = "//mat-radio-button/label/div/img[contains(@src,'bank')]";




	@FindBy(xpath = "//mat-radio-button/label/div[contains(text(),'Your Bank Account Information')]//../parent::mat-radio-button")
	WebElement BankAccountInformationRadio;
	String BankAccountInformationRadioXPath = "//mat-radio-button/label/div[contains(text(),'Your Bank Account Information')]//../parent::mat-radio-button";


	@FindBy(xpath = "//mat-radio-button/label/div[contains(text(),'Your Debit Card Information')]//../parent::mat-radio-button")
	WebElement DebitCardInformationRadio;
	String DebitCardInformationRadioXPath = "//mat-radio-button/label/div[contains(text(),'Your Debit Card Information')]//../parent::mat-radio-button";

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement DebitCardInformationNextButton;
	String DebitCardInformationButtonXPath = "//button[contains(text(),'Next')]";



	@FindBy(xpath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]")
	WebElement whatsNewPopUpHeader;
	String whatsNewPopUpHeaderXPath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]";

	@FindBy(xpath = "//mg-fastsend-receive-success/div/div/div/div[contains(@class,'reference-no') and contains(text(), 'NO.')]")
	WebElement fastsendRefNo;
	String fastsendRefNoXPath = "//mg-fastsend-receive-success/div/div/div/div[contains(@class,'reference-no') and contains(text(), 'NO.')]";

	@FindBy(xpath = "//input[@id='receiver_PersonalId1_Number']")
	WebElement idnumberText;
	String idnumberTextXPath = "//input[@id='receiver_PersonalId1_Number']";

	@FindBy(xpath = "//input[@id='receiver_PersonalId1_Issue_Country_SubdivisionCode']")
	WebElement IssueCountryInput;
	String IssueCountryInputXPath = "//input[@id='receiver_PersonalId1_Issue_Country_SubdivisionCode']";

	@FindBy(xpath = "//input[@id='sender_CitizenshipCountry']")
	WebElement sendercitizencountrylist;
	String sendercitizencountrylistXPath = "//input[@id='sender_CitizenshipCountry']";



	@FindBy(xpath = "//button[@id='senderNext']")
	WebElement addtnlinfopageNextbutton;
	String addtnlinfopageNextbuttonXPath = "//button[@id='senderNext']";


	@FindBy(xpath = "//span[contains(text(),' Afghanistan')]")
	WebElement sendercitizencountry;
	String sendercitizencountryXPath = "//span[contains(text(),' Afghanistan')]";

	@FindBy(xpath = "//mat-option/span[contains(text(),'Alaska')]/parent::mat-option")
	WebElement fsstateOptionBox;
	String fsstateOptionBoxXPath = "//mat-option/span[contains(text(),'Alaska')]/parent::mat-option";




	@FindBy(xpath = "//button[contains(text(),'Add New Debit Card')]")
	WebElement AddNewDebitCardButton;
	String AddNewDebitCardButtonXPath = "//button[contains(text(),'Add New Debit Card')]";

	@FindBy(xpath = "//button[contains(text(),'Add New Account')]")
	WebElement AddNewAccountButton;
	String AddNewAccountButtonXPath = "//button[contains(text(),'Add New Account')]";




	@FindBy(xpath = "//div[@class='mat-radio-label-content']/img[contains(@src,'visa')]")
	WebElement selectExistingCardButton;
	String selectExistingCardButtonXPath = "//div[@class='mat-radio-label-content']/img[contains(@src,'visa')]";



	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement DepositMoneyCardNumberInput;
	String DepositMoneyCardNumberInputXPath = "//input[@id='cardNumber']";

	@FindBy(xpath = "//input[@id='creditCardExpiration']")
	WebElement DepositMoneycreditCardExpirationInput;
	String DepositMoneycreditCardExpirationInputXPath = "//input[@id='creditCardExpiration']";

	@FindBy(xpath = "//button[@id='save' and contains(text(),'Save Card') and contains(@class,'mgo-button')]")
	WebElement DepositMoneySavecardButton;
	String DepositMoneySavecardButtonXPath = "//button[@id='save' and contains(text(),'Save Card') and contains(@class,'mgo-button')]";

	@FindBy(xpath = "//button[@id='reviewfastSendreceive']")
	WebElement DepositMoneyreviewfastSendreceiveButton;
	String DepositMoneyreviewfastSendreceiveButtonXPath = "//button[@id='reviewfastSendreceive']";

	@FindBy(xpath = "//button[@id='transactionSubmit']")
	WebElement DepositMoneytransactionSubmitButton;
	String DepositMoneytransactionSubmitButtonXPath = "//button[@id='transactionSubmit']";


	@FindBy(xpath = "//div/h3[contains(text(),'Send money with name and mobile number!')]")
	WebElement fastsendModelPage;
	String fastsendModelPageXPath = "//div/h3[contains(text(),'Send money with name and mobile number!')]";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-14']/label/div")
	WebElement fastsendCheckbox1;
	String fastsendCheckbox1XPath = "//mat-checkbox[@id='mat-checkbox-14']/label/div";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-15']/label/div")
	WebElement fastsendCheckbox2;
	String fastsendCheckbox2XPath = "//mat-checkbox[@id='mat-checkbox-15']/label/div";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-16']/label/div")
	WebElement fastsendCheckbox3;
	String fastsendCheckbox3XPath = "//mat-checkbox[@id='mat-checkbox-16']/label/div";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-17']/label/div")
	WebElement fastsendCheckbox4;
	String fastsendCheckbox4XPath = "//mat-checkbox[@id='mat-checkbox-17']/label/div";


	@FindBy(xpath = "//div[contains(@class,'mg-modal-actions')]/button[contains(text(),'Next')]")
	WebElement fastsendModelNextButton;
	String fastsendModelNextButtonXPath = "//div[contains(@class,'mg-modal-actions')]/button[contains(text(),'Next')]";


	//SignUP START
	@FindBy(xpath = "//a[contains(@id,'btn-no')]")
	WebElement notRightNowProfileCreatedButton;
	String notRightNowProfileCreatedButtonXPath = "//a[contains(@id,'btn-no')]";

	@FindBy(xpath = "//input[@id='emailAddress']")
	WebElement emailAddressInputBox;
	String emailAddressInputBoxXPath = "//input[@id='emailAddress']";

	@FindBy(xpath = "//input[@id='login_password']")
	WebElement passwordInputBox;
	String passwordInputBoxXPath = "//input[@id='login_password']";

	@FindBy(xpath = "//label[@for = 'confirm']//following-sibling::input[1]")
	WebElement confirmpasswordInputBox;
	String confirmpasswordInputBoxXPath = "//label[@for = 'confirm']//following-sibling::input[1]";

	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement RegphoneNumberInputBox;
	String RegphoneNumberInputBoxXPath = "//input[@id='phoneNumber']";

	@FindBy(xpath = "//button[@id = 'next']")
	WebElement RegnextButton;
	String RegnextButtonXPath = "//button[@id = 'next']";

	@FindBy(xpath = "//label[@for = 'personal_firstName']/following-sibling::input[@id='personal_firstName']")
	WebElement firstNameInputBox;
	String firstNameInputBoxXPath = "//label[@for = 'personal_firstName']/following-sibling::input[@id='personal_firstName']";

	@FindBy(xpath = "//label[@for = 'personal_lastName']/following-sibling::input[@id='personal_lastName']")
	WebElement lastNameInputBox;
	String lastNameInputBoxXPath = "//label[@for = 'personal_lastName']/following-sibling::input[@id='personal_lastName']";

	@FindBy(xpath = "//input[@id='personal_dateOfBirth']")
	WebElement dateOfBirthInputBox;
	String dateOfBirthInputBoxXPath = "//input[@id='personal_dateOfBirth']";

	@FindBy(xpath = "(//input[contains(@id,'addressLine')])[1]")
	WebElement addresslineInputBox;
	String addresslineInputBoxInputBoxXPath = "(//input[contains(@id,'addressLine')])[1]";

	@FindBy(xpath = "//button[contains(@id,'createProfile')]")
	WebElement createProfileButton;
	String createProfileButtonXPath = "//button[contains(@id,'createProfile')]";

	@FindBy(xpath = "//input[contains(@id,'city')]")
	WebElement cityInputBox;
	String cityInputBoxXPath = "//input[contains(@id,'city')]";

	@FindBy(xpath = "//input[contains(@id,'postalCode')]")
	WebElement postalCodeInputBox;
	String postalCodeInputBoxXPath = "//input[contains(@id,'postalCode')]";


	@FindBy(xpath = "(//mat-option/span[1]/parent::mat-option)[1]")
	WebElement stateFirstOptionBox;
	String stateFirstOptionBoxXPath = "(//mat-option/span[1]/parent::mat-option)[1]";

	//SignUP END


	@FindBy(xpath = "//div[@class = 'header-container']//h1[contains(text(), 'Receiver Information')]")
	WebElement receiverInformationPageHeader;
	String receiverInformationPageHeaderXPath = "//div[@class = 'header-container']//h1[contains(text(), 'Receiver Information')]";

	@FindBy(xpath = "//label[@for = 'firstName']//following-sibling::input[@id = 'firstName']")
	WebElement receiverFirstNameField;
	String receiverFirstNameFieldXPath = "//label[@for = 'firstName']//following-sibling::input[@id = 'firstName']";

		@FindBy(xpath = "//input[@id = 'firstName']")
	WebElement fastsendreceiverFirstNameField;
	String fastsendreceiverFirstNameFieldXPath = "//input[@id = 'firstName']";

	@FindBy(xpath = "//input[@id = 'lastName']")
	WebElement fastsendreceiverlastname;
	String fastsendreceiverlastnameXPath = "//input[@id = 'lastName']";


	@FindBy(xpath = "//label[@for = 'lastName']//following-sibling::input[@id = 'lastName']")
	WebElement receiverLastNameField;
	String receiverLastNameFieldXPath = "//div[@class = 'header-container']//h1[contains(text(), 'Receiver Information')]";

	@FindBy(xpath = "//button[@id = 'receiverNext' and @type = 'submit']")
	WebElement nextButton;
	String nextButtonXPath = "//button[@id = 'receiverNext' and @type = 'submit']";

	@FindBy(xpath = "//button[@id = 'next' and contains(text(),'Next')]")
	WebElement homeRegnextButton;
	String homeRegnextButtonXPath = "//button[@id = 'next' and contains(text(),'Next')]";

	@FindBy(xpath = "//mat-select[contains(@id,'state')]")
	WebElement stateInputBox;
	String stateInputBoxXPath = "//mat-select[contains(@id,'state')]";



	@FindBy(xpath = "//button[contains(text(),'Yes, It Is Correct')]")
	WebElement yesItIsCorrectButton;
	String yesItIsCorrectButtonXPath = "//button[contains(text(),'Yes, It Is Correct')]";

	@FindBy(xpath = "//button[@id = 'senderNext' and @type = 'submit']")
	WebElement senderNextButton;
	String senderNextButtonXPath = "//button[@id = 'senderNext' and @type = 'submit']";

	@FindBy(xpath = "//input[@id='profile_email']")
	WebElement profileemailAddressInputBox;
	String profileemailAddressInputBoxXPath = "//input[@id='profile_email']";


	@FindBy(xpath = "//input[@id='password']")
	WebElement profilePasswordInputBox;
	String profilePasswordInputBoxXPath = "//input[@id='password']";


	@FindBy(xpath = "//mg-sender-info/form/div/mg-credit-card/form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img")
	WebElement existingCardRadio;
	String existingCardRadioXPath = "//mg-sender-info/form/div/mg-credit-card/form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img";

	@FindBy(xpath = "//mg-credit-card/form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img")
	WebElement payAgainexistingCardRadio;
	String payAgainexistingCardRadioXPath = "//mg-credit-card/form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img";


	@FindBy(xpath = "//input[@id='verify_cvv']")
	WebElement cvvInput;
	String cvvInputXPath = "//input[@id='verify_cvv']";

	@FindBy(xpath = "(//button[contains(text(),'Verify CVV')])[2]")
	WebElement verifyCVVButton;
	String verifyCVVButtonXPath = "(//button[contains(text(),'Verify CVV')])[2]";


	@FindBy(xpath = "//mat-error[contains(text(),'We can only accept debit')]")
	WebElement creditcardErrorMessage;
	String creditcardErrorMessageXPath = "//mat-error[contains(text(),'We can only accept debit')]";

	@FindBy(xpath = "//mat-error[contains(text(),'We can only accept debit')]")
	WebElement creditcardErrorMessageGB;
	String creditcardErrorMessageGBXPath = "//mat-error[contains(text(),'We can only accept debit')]";


	@FindBy(xpath = "//input[@id='direction1']")
	WebElement direction1InputBox;
	String direction1InputBoxXPath = "//input[@id='direction1']";

	@FindBy(xpath = "//input[@id='accountNumber']")
	WebElement accountNumberInputBox;
	String accountNumberInputBoxXPath = "//input[@id='accountNumber']";

	@FindBy(xpath = "//span[@class = 'mat-button-wrapper' and contains(text(), 'Log In')]//parent::button")
	WebElement loginButton;
	String loginButtonXPath = "//span[@class = 'mat-button-wrapper' and contains(text(), 'Log In')]//parent::button";

	@FindBy(xpath = "//button[@class = 'btn-primary' and contains(text(), 'OK')]")
	WebElement whatsNewPopUpHeaderOKButton;
	String whatsNewPopUpHeaderOKButtonXPath = "//button[@class = 'btn-primary' and contains(text(), 'OK')]";


	@FindBy(xpath = "//mat-checkbox/label/div")
	WebElement receiverIFSCCheckBox;
	String receiverIFSCCheckBoxXPath = "//mat-checkbox/label/div";
	@FindBy(xpath = "//input[@id='accountNumberVerification']")
	WebElement accountNumberVerificationInputBox;
	String accountNumberVerificationInputBoxXPath = "//input[@id='accountNumberVerification']";

	@FindBy(xpath = "//label[contains(text(),'IFSC Code')]/following-sibling::input")
	WebElement receiverIFSCCodeInputBox;
	String receiverIFSCCodeInputBoxXPath = "//label[contains(text(),'IFSC Code')]/following-sibling::input";

	@FindBy(xpath = "//label[contains(text(),'Bank Routing Number')]/following-sibling::input")
	WebElement receiverBankRoutingNumberInputBox;
	String receiverBankRoutingNumberInputBoxXPath = "//label[contains(text(),'Bank Routing Number')]/following-sibling::input";



	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cardNumberInputBox;
	String cardNumberInputBoxXPath = "//input[@id='cardNumber']";

	@FindBy(xpath = "//input[@id='receiverAddress']")
	WebElement receiverAddressInputBox;
	String receiverAddressInputBoxXPath = "//input[@id='receiverAddress']";

	@FindBy(xpath = "//input[@id='creditCardExpiration']")
	WebElement creditCardExpirationInputBox;
	String creditCardExpirationInputBoxXPath = "//input[@id='creditCardExpiration']";


	@FindBy(xpath = "//button[@id='modalConfirm']")
	WebElement DepositMoneyButton;
	String DepositMoneyButtonXPath = "//button[@id='modalConfirm']";

	@FindBy(xpath = "//mat-dialog-container/mg-common-modal/div[2]/button[contains(text(),'Deposit Money')]")
	WebElement receiveRedirectDepositMoneyButton;
	String receiveRedirectDepositMoneyButtonXPath = "//mat-dialog-container/mg-common-modal/div[2]/button[contains(text(),'Deposit Money')]";



	@FindBy(xpath = "//input[@id='senderPhotoId']")
	WebElement senderPhotoIdInputBox;
	String senderPhotoIdInputBoxXPath = "//input[@id='senderPhotoId']";

	@FindBy(xpath = "//input[@id='senderPhotoIdExpiration']")
	WebElement senderPhotoIdExpirationInputBox;
	String senderPhotoIdExpirationInputBoxXPath = "//input[@id='senderPhotoIdExpiration']";

	@FindBy(xpath = "//input[@id='senderPhotoIdState']")
	WebElement senderPhotoIdStateInputBox;
	String senderPhotoIdStateInputBoxXPath = "//input[@id='senderPhotoIdState']";

	@FindBy(xpath = "//input[@id='receiverState']")
	WebElement receiverStateInputBox;
	String receiverStateInputBoxXPath = "//input[@id='receiverState']";


	@FindBy(xpath = "//input[@id='bankName']")
	WebElement receiverbankNameInputBox;
	String receiverbankNameInputBoxXPath = "//input[@id='bankName']";

	@FindBy(xpath = "//input[@id='receiverPostalCode']")
	WebElement receiverPostalCodeInputBox;
	String receiverPostalCodeInputBoxXPath = "//input[@id='receiverPostalCode']";

	@FindBy(xpath = "//input[@id='receiverCity']")
	WebElement receiverCityInputBox;
	String receiverCityInputBoxXPath = "//input[@id='receiverCity']";

	@FindBy(xpath = "//div[@id='con-notification']/button")
	WebElement notificationclosebutton;
	String notificationclosebuttonXPath = "//div[@id='con-notification']/button";


	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement phoneNumberInputBox;
	String phoneNumberInputBoxXPath = "//input[@id='phoneNumber']";

	@FindBy(xpath = "//span[@class='country-code']")
	WebElement countriesdropdown;
	String countriesdropdownXPath = "//span[@class='country-code']";

	@FindBy(xpath = "//span[@class='country-name']")
	WebElement countriescount;
	String countriescountXPath = "//span[@class='country-name']";

	@FindBy(xpath = "//input[@id='receiverState']")
	WebElement RegstateInputBox;
	String RegstateInputBoxXPath = "//input[@id='receiverState']";

	@FindBy(xpath = "//a[contains(text(),'Not Right Now')]")
	WebElement notRightNowButton;
	String notRightNowButtonXPath = "//a[contains(text(),'Not Right Now')]";

	//@FindBy(xpath = "//mat-option/span[contains(text(),'Alaska')]/parent::mat-option")
	//WebElement stateOptionBox;
	//String stateOptionBoxXPath = "//mat-option/span[contains(text(),'Alaska')]/parent::mat-option";

	//@FindBy(xpath = "//mat-option/span[contains(text(),'BUH')]/parent::mat-option")
	//WebElement bankNameOptionBox;
	//String bankNameOptionBoxXPath = "//mat-option/span[contains(text(),'BUH')]/parent::mat-option";

	@FindBy(xpath = "//span[@class='mat-option-text']")
	WebElement stateOptionBox;
	String stateOptionBoxXPath = "//span[@class='mat-option-text']";

	@FindBy(xpath = "//input[@id='senderOccupation']")
	WebElement senderOccupation;
	String senderOccupationXPath = "//input[@id='senderOccupation']";

	@FindBy(xpath = "//input[@id='relationshipToReceiver']")
	WebElement relationtoreciver;
	String relationtoreciverXPath = "//input[@id='relationshipToReceiver']";

	@FindBy(xpath = "//span[contains(text(),'Family Member')]")
	WebElement selectrelation;
	String selectrelationXPath = "//span[contains(text(),'Family Member')]";

	@FindBy(xpath = "//span[contains(text(),'Agriculture')]")
	WebElement occupationinput;
	String occupationinputXPath = "//span[contains(text(),'Agriculture')]";





	@FindBy(xpath = "//span[@class='mat-option-text']")
	WebElement bankNameOptionBox;
	String bankNameOptionBoxXPath = "//span[@class='mat-option-text']";

	private String receiverFirstNameString = RandomStringUtils.randomAlphabetic(1).toUpperCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
	private String receiverLastNameString = RandomStringUtils.randomAlphabetic(1).toUpperCase().concat((RandomStringUtils.randomAlphabetic(7)).toLowerCase());

	public String getreceiverFirstNameString() {
		return receiverFirstNameString;
	}

	public String getreceiverLastNameString() {
		return receiverLastNameString;
	}

	public SendMoneyReceiverInfoPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}

	public WebElement getPageValidationElement() {
		return receiverInformationPageHeader;
	}

	public String getPageValidationElementXPath() {
		return receiverInformationPageHeaderXPath;
	}

	public WebElement getReceiverInformationPageHeader() {
		return receiverInformationPageHeader;
	}

	public String getReceiverInformationPageHeaderXPath() {
		return receiverInformationPageHeaderXPath;
	}

	public WebElement getReceiverFirstNameField() {
		return receiverFirstNameField;
	}

	public String getReceiverFirstNameFieldXPath() {
		return receiverFirstNameFieldXPath;
	}

	public WebElement getReceiverLastNameField() {
		return receiverLastNameField;
	}

	public String getReceiverLastNameFieldXPath() {
		return receiverLastNameFieldXPath;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getSenderNextButton() {
		return senderNextButton;
	}


	public String getNextButtonXPath() {
		return nextButtonXPath;
	}

	public String getReceiverFirstNameString() {
		return receiverFirstNameString;
	}

	public String getReceiverLastNameString() {
		return receiverLastNameString;
	}
	String phonenumber;
	public void validatePageIsOpen() {
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND MONEY RECEIVER PAGE");
		System.out.println("VALIDATING SEND MONEY RECEIVER PAGE");
		actionExecutor.scrollToElementViaDynamicXPath(driver, receiverInformationPageHeaderXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverInformationPageHeaderXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SEND MONEY RECEIVER PAGE");
		System.out.println("VALIDATED SEND MONEY RECEIVER PAGE");
	}
	public void redirecttoSpain(){
		driver.navigate().to("https://webv2q1.aws.moneygram.com/mgo/es/en/");
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
			extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
			actionExecutor.scrollToElementViaDynamicXPath(driver, whatsNewPopUpHeaderOKButtonXPath, exceptionHandling);
			whatsNewPopUpHeaderOKButton.click();
		}
	}

	public  void loginAsReceiver() {
		actionExecutor.waitFiveSeconds();

		String userNameToUse;

		Actions actions = new Actions(driver);
		actions
				.click(emailAddressInputBox)
				.sendKeys("q1_new_user_spain@maildrop.com")
				.click(passwordInputBox)
				.sendKeys("testtest1")
				.build()
				.perform();

		actionExecutor.scrollToElement(driver, loginButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginButtonXPath, 0));
		loginButton.click();

	}

	public  void SignupasReceiver(){
		//validatePageIsOpen();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		String emailName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
		String emailIDGenerated = emailName + "@maildrop.cc";
		System.out.println("Receiver Account with email ID: " + emailIDGenerated + " has been successfully authenticated!");
		Actions actions = new Actions(driver);
		actions
				.click(profileemailAddressInputBox)
				.sendKeys(emailIDGenerated)
				.click(profilePasswordInputBox)
				.sendKeys("testtest1")
				.click(confirmpasswordInputBox)
				.sendKeys("testtest1")
				.click(phoneNumberInputBox)
				.sendKeys(phonenumber)


				.build()
				.perform();



		actionExecutor.scrollToElementViaDynamicXPath(driver, homeRegnextButtonXPath, exceptionHandling);

		homeRegnextButton.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver, firstNameInputBoxXPath, exceptionHandling);

		actions
				.click(firstNameInputBox)
				.sendKeys(receiverFirstNameString)
				.click(lastNameInputBox)
				.sendKeys(receiverLastNameString)
				.click(dateOfBirthInputBox)
				.sendKeys("01/01/1980")
				.click(addresslineInputBox)
				.sendKeys("1200 Main Street Dallas, TX,USA")
				.click(cityInputBox)
				.sendKeys("Dallas")
				.click(postalCodeInputBox)
				.sendKeys("56734")

				.build()
				.perform();



		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, stateInputBoxXPath, 1) != null ) {

			stateInputBox.click();
			stateFirstOptionBox.click();
		}


		createProfileButton.click();
		actionExecutor.waitFiveSeconds();

		actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowButtonXPath, exceptionHandling);
		notRightNowButton.click();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowProfileCreatedButtonXPath, exceptionHandling);
			notRightNowProfileCreatedButton.click();
		}

	}

	public void sofortddtnlinfo(){

		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceOfFundsXPath, 1) != null) {
			sourceOfFunds.click();
			loan.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderOccupationXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderOccupation, exceptionHandling);
			senderOccupation.click();
			actionExecutor.waitFiveSeconds();
			occupationinput.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, relationtoreciverXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, relationtoreciver, exceptionHandling);
			relationtoreciver.click();
			actionExecutor.waitFiveSeconds();
			selectrelation.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			PurposeOfTransaction.click();
			Gift.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendercitizencountrylistXPath, 1) != null) {
			sendercitizencountrylist.click();
			sendercitizencountry.click();
			actionExecutor.waitFiveSeconds();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, addtnlinfopageNextbuttonXPath, 1) != null) {
			addtnlinfopageNextbutton.click();

		}

	}


	public void receivermobilepreifixformoroco(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount) {

		validatePageIsOpen();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
			countriesdropdown.click();
			List list = driver.findElements(By.xpath(countriescountXPath));
			int size=list.size();
			if(size==1){
				extentReportGenerator.addInfoMessage(currentTest, "displaying all countries prefix codes");

			}

		}
	}



	public void receivermobilepreifix(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount) {

		validatePageIsOpen();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {

				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
			countriesdropdown.click();
			List list = driver.findElements(By.xpath(countriescountXPath));
					int size=list.size();
				if(size>232){
					extentReportGenerator.addInfoMessage(currentTest, "displaying all countries prefix codes");

				}

			}
	}



	public void fillOutReceiverustousDetails(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){

		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys("venu");
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys("madhav");
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys("9848865491");
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4622941100000061");
			actionExecutor.waitFiveSeconds();

		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceOfFundsXPath, 1) != null) {
			sourceOfFunds.click();
			loan.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			PurposeOfTransaction.click();
			Gift.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}





				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}


	public void fillOutReceiverustoesDetails(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){

		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys("pass");
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys("tttt");
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys("934845736");
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4622941100000061");
			actionExecutor.waitFiveSeconds();

		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceOfFundsXPath, 1) != null) {
			sourceOfFunds.click();
			loan.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			PurposeOfTransaction.click();
			Gift.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}





				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}


	public void fillOutReceiverDetails(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
        actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4622941100000061");


		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceOfFundsXPath, 1) != null) {
			sourceOfFunds.click();
			loan.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			PurposeOfTransaction.click();
			Gift.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}





				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}
	public void fillOutReceiverDetailswithtestdatasheet(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount, String cardNumberSTC){

		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			//cardNumberInputBox.sendKeys("4622941100000061");
			cardNumberInputBox.sendKeys(cardNumberSTC);
			actionExecutor.waitFiveSeconds();

		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceOfFundsXPath, 1) != null) {
			sourceOfFunds.click();
			loan.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			PurposeOfTransaction.click();
			Gift.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}





				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}


	public void fillOutReceiverDetailsReceiveRedirect(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys("pass");
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys("usmgofs");
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys("912886433");
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4622941100000061");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}



	public void verifyUKerrormessageDetails(){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		WebElement ukerror = driver.findElement(By.xpath("(//div[contains(@class,'ng-trigger ng-trigger-transitionMessages ng-star-inserted')])[7]"));
		String ActualError = ukerror.getText();
//String ExpectedError = "We can only accept debit cards issued from";
		boolean errormsg=ukerror.isDisplayed();

		if(errormsg){
			Assert.assertTrue(true,ActualError);
		}
		else{
			Assert.assertFalse(false,"Errormessage not displayed");
		}

//Assert.assertEquals(ActualError,ExpectedError);
//if(ActualError == ExpectedError){

	}

	public void verifyerrormessageDetailsGB(){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();

		//mat-error[contains(text(),'We had an issue')]
		WebElement errormsg = driver.findElement(By.xpath("//mat-error[contains(text(),'The debit card was declined')]"));
		boolean errorm=errormsg.isDisplayed();

String msg = errormsg.getText();
		if(errorm){
			Assert.assertTrue(true,msg);
		}
		else{
			Assert.assertFalse(false,"Errormessage not displayed");
		}

//Assert.assertEquals(ActualError,ExpectedError);
//if(ActualError == ExpectedError){

	}


	public void verifyGBerrormessageDetails(){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		String ActualError = creditcardErrorMessage.getText();
//String ExpectedError = "We can only accept debit cards issued from";
		boolean errormsg=creditcardErrorMessage.isDisplayed();

		if(errormsg){
			Assert.assertTrue(true,ActualError);
		}
		else{
			Assert.assertFalse(false,"Errormessage not displayed");
		}

//Assert.assertEquals(ActualError,ExpectedError);
//if(ActualError == ExpectedError){

	}


	public void verifyerrormessageDetails(){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		String ActualError = creditcardErrorMessage.getText();
//String ExpectedError = "We can only accept debit cards issued from";
		boolean errormsg=creditcardErrorMessage.isDisplayed();

		if(errormsg){
			Assert.assertTrue(true,ActualError);
		}
		else{
			Assert.assertFalse(false,"Errormessage not displayed");
		}

//Assert.assertEquals(ActualError,ExpectedError);
//if(ActualError == ExpectedError){

	}

	public void fillOutReceiverDetailss(String city, String phoneN){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
			String phonenumber ="758" +RandomStringUtils.randomNumeric(6);
			phoneNumberInputBox.sendKeys(phonenumber);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys("1234567890");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4036170000000001");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}



	}

	public void fillOutReceiverDetailsss(String city, String phoneN){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
			String phonenumber ="785" +RandomStringUtils.randomNumeric(6);
			phoneNumberInputBox.sendKeys(phonenumber);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys("1234567890");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4658584090000001");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}



	}






	public void fillOutReceiverSTCDetails(String city, String phoneN,String cardnumber,String preFix){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
			String phonenumber = preFix +RandomStringUtils.randomNumeric(7);
			phoneNumberInputBox.sendKeys(phonenumber);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys("1234567890");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys("1234567890");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys(cardnumber);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
			receiverIFSCCheckBox.click();
			actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
			receiverIFSCCodeInputBox.sendKeys("CITI0100000");

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

				actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
				nextButton.click();
			}

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
				yesItIsCorrectButton.click();
			}
		}

	}

	public void performDepositMoneyspainBankDepo(String ReceiverDebitcard){
		actionExecutor.waitFiveSeconds();
		DepositMoneyButton.click();
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notRightNowProfileCreatedButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowProfileCreatedButtonXPath, exceptionHandling);
			notRightNowProfileCreatedButton.click();
		}
		actionExecutor.waitFiveSeconds();


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, BankAccountInformationRadioXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, BankAccountInformationRadioXPath, exceptionHandling);
			BankAccountInformationRadio.click();
			DebitCardInformationNextButton.click();

		}
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingBankRadioXPath, 1) != null) {
			existingBankRadio.click();
		}
		else{

			AddNewAccountButton.click();

			ibcnumber.sendKeys("87654321");
			ibcbankname.sendKeys("Demo Bank Name");
			ibcaccountNumber.sendKeys("123456789123456789123456");


			actionExecutor.waitFiveSeconds();
			DepositMoneySavecardButton.click();
		}




		actionExecutor.waitFiveSeconds();
		//	DepositMoneySavecardButton.click();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, idnumberTextXPath, 1) != null) {
			idnumberText.sendKeys("675334276");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, IssueCountryInputXPath, 1) != null) {
			IssueCountryInput.click();
			fsstateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneyreviewfastSendreceiveButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DepositMoneyreviewfastSendreceiveButtonXPath, exceptionHandling);
			DepositMoneyreviewfastSendreceiveButton.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneytransactionSubmitButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DepositMoneytransactionSubmitButtonXPath, exceptionHandling);
			DepositMoneytransactionSubmitButton.click();
		}
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendRefNoXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		String referenceNoString = fastsendRefNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);


	}

	public void performDepositMoneyspain(String ReceiverDebitcard){
		actionExecutor.waitFiveSeconds();
		DepositMoneyButton.click();
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notRightNowProfileCreatedButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowProfileCreatedButtonXPath, exceptionHandling);
			notRightNowProfileCreatedButton.click();
		}
		actionExecutor.waitFiveSeconds();


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DebitCardInformationRadioXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DebitCardInformationRadioXPath, exceptionHandling);
			DebitCardInformationRadio.click();
			DebitCardInformationNextButton.click();

		}
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingcardRadioXPath, 1) != null) {
			existingcardRadio.click();
		}
		else{

			AddNewDebitCardButton.click();

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneyCardNumberInputXPath, 1) != null) {

				DepositMoneyCardNumberInput.sendKeys(ReceiverDebitcard);
				DepositMoneycreditCardExpirationInput.sendKeys("12/29");
			}
			actionExecutor.waitFiveSeconds();
			DepositMoneySavecardButton.click();
		}




		actionExecutor.waitFiveSeconds();
	//	DepositMoneySavecardButton.click();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, idnumberTextXPath, 1) != null) {
			idnumberText.sendKeys("675334276");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, IssueCountryInputXPath, 1) != null) {
			IssueCountryInput.click();
			fsstateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneyreviewfastSendreceiveButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DepositMoneyreviewfastSendreceiveButtonXPath, exceptionHandling);
			DepositMoneyreviewfastSendreceiveButton.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneytransactionSubmitButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DepositMoneytransactionSubmitButtonXPath, exceptionHandling);
			DepositMoneytransactionSubmitButton.click();
		}
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendRefNoXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		String referenceNoString = fastsendRefNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);


	}

	public void performDepositMoneyspaincheckoutfail(String ReceiverDebitcard){
		actionExecutor.waitFiveSeconds();
		DepositMoneyButton.click();
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notRightNowProfileCreatedButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowProfileCreatedButtonXPath, exceptionHandling);
			notRightNowProfileCreatedButton.click();
		}
		actionExecutor.waitFiveSeconds();


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DebitCardInformationRadioXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DebitCardInformationRadioXPath, exceptionHandling);
			DebitCardInformationRadio.click();
			DebitCardInformationNextButton.click();

		}
		actionExecutor.waitFiveSeconds();

			AddNewDebitCardButton.click();

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneyCardNumberInputXPath, 1) != null) {

				DepositMoneyCardNumberInput.sendKeys(ReceiverDebitcard);
				DepositMoneycreditCardExpirationInput.sendKeys("12/29");
			}
			actionExecutor.waitFiveSeconds();

			DepositMoneySavecardButton.click();





		actionExecutor.waitFiveSeconds();
		//	DepositMoneySavecardButton.click();
		actionExecutor.waitFiveSeconds();
		String errormsg= errormessagecheckout.getText();
		if(errormsg!=null) {
			Assert.assertTrue(true, errormsg);
		}
		else {
			Assert.fail("Now showing the error message");
		}

	}

	public void performDepositMoney(String ReceiverDebitcard){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiveRedirectDepositMoneyButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, receiveRedirectDepositMoneyButtonXPath, exceptionHandling);
			receiveRedirectDepositMoneyButton.click();
		}
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notRightNowProfileCreatedButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowProfileCreatedButtonXPath, exceptionHandling);
			notRightNowProfileCreatedButton.click();
		}
		actionExecutor.waitFiveSeconds();

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, selectExistingCardButtonXPath, 1) != null) {
			selectExistingCardButton.click();
		}
		else{
			AddNewDebitCardButton.click();
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneyCardNumberInputXPath, 1) != null) {
				DepositMoneyCardNumberInput.sendKeys(ReceiverDebitcard);
				DepositMoneycreditCardExpirationInput.sendKeys("12/29");

				actionExecutor.waitFiveSeconds();
				DepositMoneySavecardButton.click();
			}
		}


		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, idnumberTextXPath, 1) != null) {
			idnumberText.sendKeys("675334276");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, IssueCountryInputXPath, 1) != null) {
			IssueCountryInput.click();
			fsstateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneyreviewfastSendreceiveButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DepositMoneyreviewfastSendreceiveButtonXPath, exceptionHandling);
			DepositMoneyreviewfastSendreceiveButton.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DepositMoneytransactionSubmitButtonXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, DepositMoneytransactionSubmitButtonXPath, exceptionHandling);
			DepositMoneytransactionSubmitButton.click();
		}
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendRefNoXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForConfirmationPageChrome"))));
		String referenceNoString = fastsendRefNo.getText();
		if(referenceNoString.contains("REFERENCE NO. ")){
			referenceNoString = referenceNoString.replace("REFERENCE NO. ", "");
		} //can also be other texts to replace, for now will use reference no.
		System.out.println("THE REFERENCE NO. IS: " + referenceNoString);
		extentReportGenerator.addInfoMessage(currentTest, "THE REFERENCE NO. IS: " + referenceNoString);


		}

	public void fillDriverLicenseAdditionalInformation(){
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderPhotoIdInputBox, exceptionHandling);
			senderPhotoIdInputBox.sendKeys("35622512");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdExpirationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderPhotoIdExpirationInputBox, exceptionHandling);
			senderPhotoIdExpirationInputBox.sendKeys("1229");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdExpirationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderPhotoIdExpirationInputBox, exceptionHandling);
			senderPhotoIdExpirationInputBox.sendKeys("1229");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceOfFundsXPath, 1) != null) {
			sourceOfFunds.click();
			loan.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			PurposeOfTransaction.click();
			Gift.click();
		}

	}
	public void fillAdditionalReceiverInformation(String city, String phoneN){

		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);

		actionExecutor.scrollToElement(driver, direction1InputBox, exceptionHandling);
		direction1InputBox.sendKeys("Test");

		actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
		receiverCityInputBox.sendKeys("Test");

		actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
		phoneNumberInputBox.sendKeys("9849775540");
		//add support for city and phone number fields at some point



	}

	public void fastsendPopup(){

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendModelPageXPath, 1) != null) {
			fastsendCheckbox1.click();
			fastsendCheckbox2.click();
			fastsendCheckbox3.click();
			fastsendCheckbox4.click();
			fastsendModelNextButton.click();
		}
	}
	public void scrollToAndClickNextButton(){

actionExecutor.waitFiveSeconds();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notificationclosebuttonXPath, 1) != null) {
		boolean visi=	notificationclosebutton.isDisplayed();
			//actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			if(visi){
				notificationclosebutton.click();
			}

		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}
		fastsendPopup();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
			nextButton.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
			yesItIsCorrectButton.click();
		}
		//actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
		//nextButton.click();

	}

	public void scrollToAndClickSenderNextButton(){
		actionExecutor.scrollToElement(driver, senderNextButton, exceptionHandling);
		senderNextButton.click();
	}


	public void selecPayAgaintExistingCardandVerifyCVV(){
		//actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
		//nextButton.click();

		actionExecutor.scrollToElement(driver, payAgainexistingCardRadio, exceptionHandling);
		payAgainexistingCardRadio.click();

		actions
				.click(cvvInput)
				.sendKeys("456")
				.build()
				.perform();

		actionExecutor.scrollToElement(driver, verifyCVVButton, exceptionHandling);
		verifyCVVButton.click();

	}
	public void selectExistingCardandVerifyCVV(){
		//actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
		//nextButton.click();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingCardRadioXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, existingCardRadio, exceptionHandling);
			existingCardRadio.click();

			actions
					.click(cvvInput)
					.sendKeys("456")
					.build()
					.perform();

			actionExecutor.scrollToElement(driver, verifyCVVButton, exceptionHandling);
			verifyCVVButton.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderOccupationXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderOccupation, exceptionHandling);
			senderOccupation.click();
			actionExecutor.waitFiveSeconds();
			occupationinput.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, relationtoreciverXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, relationtoreciver, exceptionHandling);
			relationtoreciver.click();
			actionExecutor.waitFiveSeconds();
			selectrelation.click();
		}




	}

	public void fillOutReceiverDetail(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		//validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				String phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4622941100000061");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}

	public void fillOutReceiverDetailswithUSAcheckoutcard(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4658584090000001");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}

	public void fillOutReceiverDetailswithspaincheckoutcard(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4658584090000001");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}

	public void fillOutReceiverDetailswithcheckoutcard(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4658584090000001");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}

	public void fillOutReceiverDetailswithUSAcybersource(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4622941100000061");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}

	public void fillOutReceiverDetailswithspaincybersource(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4036170000000001");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}

	public void fillOutReceiverDetailswithcybersource(String city, String phoneN,String AccNo,String RcvMobileNo,String IFSCCode,String PhonePrefix,String phoneNumberCount){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, receiverFirstNameField, exceptionHandling);
		receiverFirstNameField.sendKeys(receiverFirstNameString);
		actionExecutor.scrollToElement(driver, receiverLastNameField, exceptionHandling);
		receiverLastNameField.sendKeys(receiverLastNameString);
		//add support for city and phone number fields at some point

		if(!RcvMobileNo.equalsIgnoreCase("--blank--")) {
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, phoneNumberInputBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, phoneNumberInputBox, exceptionHandling);
				int phonecount = Integer.parseInt(phoneNumberCount);
				phonenumber =PhonePrefix +RandomStringUtils.randomNumeric(phonecount);
				phoneNumberInputBox.sendKeys(phonenumber);
			}
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberInputBox, exceptionHandling);
			accountNumberInputBox.sendKeys(AccNo);
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, accountNumberVerificationInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, accountNumberVerificationInputBox, exceptionHandling);
			accountNumberVerificationInputBox.sendKeys(AccNo);
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverbankNameInputBoxXPath, 1) != null) {
			receiverbankNameInputBox.click();
			bankNameOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverPostalCodeInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverPostalCodeInputBox, exceptionHandling);
			receiverPostalCodeInputBox.sendKeys("56733");
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverAddressInputBoxXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, receiverAddressInputBox, exceptionHandling);
			receiverAddressInputBox.sendKeys("0Test address");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, cardNumberInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, cardNumberInputBox, exceptionHandling);
			cardNumberInputBox.sendKeys("4622941100000061");
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, creditCardExpirationInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, creditCardExpirationInputBox, exceptionHandling);
			creditCardExpirationInputBox.sendKeys("1229");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverCityInputBoxXPath, 1) != null) {

			actionExecutor.scrollToElement(driver, receiverCityInputBox, exceptionHandling);
			receiverCityInputBox.sendKeys("cisco");
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateInputBoxXPath, 1) != null) {
			receiverStateInputBox.click();
			stateOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderPhotoIdStateInputBoxXPath, 1) != null) {
			senderPhotoIdStateInputBox.click();
			stateOptionBox.click();
		}


		if(!IFSCCode.equalsIgnoreCase("--blank--")) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCheckBoxXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCheckBoxXPath, exceptionHandling);
				receiverIFSCCheckBox.click();

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverIFSCCodeInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverIFSCCodeInputBoxXPath, exceptionHandling);
					receiverIFSCCodeInputBox.sendKeys(IFSCCode);
				}
				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverBankRoutingNumberInputBoxXPath, 1) != null) {
					actionExecutor.scrollToElementViaDynamicXPath(driver, receiverBankRoutingNumberInputBoxXPath, exceptionHandling);
					receiverBankRoutingNumberInputBox.sendKeys(IFSCCode);
				}



				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {

					actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
					nextButton.click();
				}

				if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesItIsCorrectButtonXPath, 1) != null) {
					actionExecutor.scrollToElement(driver, yesItIsCorrectButton, exceptionHandling);
					yesItIsCorrectButton.click();
				}
			}
		}

	}


}
