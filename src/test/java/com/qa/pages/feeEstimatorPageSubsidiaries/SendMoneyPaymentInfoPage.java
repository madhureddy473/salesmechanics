package com.qa.pages.feeEstimatorPageSubsidiaries;

import com.aventstack.extentreports.ExtentTest;
import com.qa.pages.BasePageAbstractTemplate;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SendMoneyPaymentInfoPage extends BasePageAbstractTemplate {

	@FindBy(xpath = "(//span[contains(text(),'Demo Checking Account')])[1]")
	WebElement existingBankaccountRadio;
	String existingBankaccountRadioXPath = "(//span[contains(text(),'Demo Checking Account')])[1]";



	@FindBy(xpath = "//mat-option/span[contains(text(),'Agriculture')]/parent::mat-option")
	WebElement senderOccupationOptionBox;
	String senderOccupationOptionBoxXPath = "//mat-option/span[contains(text(),'Agriculture')]/parent::mat-option";
	@FindBy(xpath = "//mat-option/span[contains(@class,'mat-option-text')]/parent::mat-option")
	WebElement chooseOption;
	String chooseOptionXPath = "//mat-option/span[contains(@class,'mat-option-text')]/parent::mat-option";

	@FindBy(xpath = "//input[@id='relationshipToReceiver']")
	WebElement relationshipToReceiver;
	String relationshipToReceiverXPath = "//input[@id='relationshipToReceiver']";

	@FindBy(xpath = "//mat-option/span[contains(text(),'Family Member')]/parent::mat-option")
	WebElement relationshipToReceiverOptionBox;
	String relationshipToReceiverOptionBoxXPath = "//mat-option/span[contains(text(),'Gift')]/parent::mat-option";


	@FindBy(xpath = "//input[@id='sender_CitizenshipCountry']")
	WebElement senderCitizenshipCountry;
	String senderCitizenshipCountryXPath = "//input[@id='sender_CitizenshipCountry']";


	@FindBy(xpath = "//mat-option/span[contains(text(),'Spain')]/parent::mat-option")
	WebElement senderCitizenshipCountryOptionBox;
	String senderCitizenshipCountryOptionBoxXPath = "//mat-option/span[contains(text(),'Spain')]/parent::mat-option";

	@FindBy(xpath = "//input[@id='verify_cvv']")
	WebElement cvvInput;
	String cvvInputXPath = "//input[@id='verify_cvv']";



	@FindBy(xpath = "//input[@id='sendPurposeOfTransactionPartnerField']")
	WebElement sendPurposeOfTransactionPartnerFieldInput;
	String sendPurposeOfTransactionPartnerFieldInputXPath = "//input[@id='sendPurposeOfTransactionPartnerField']";

	@FindBy(xpath = "//mat-option/span[contains(text(),'Gift')]/parent::mat-option")
	WebElement sendPurposeOfTransactionPartnerFieldOptionBox;
	String sendPurposeOfTransactionPartnerFieldOptionBoxXPath = "//mat-option/span[contains(text(),'Gift')]/parent::mat-option";

	@FindBy(xpath = "//mat-option/span[contains(text(),'For family maintenance')]/parent::mat-option")
	WebElement sendPurposeOfTransactionFFMPartnerFieldOptionBox;
	String sendPurposeOfTransactionFFMPartnerFieldOptionBoxXPath = "//mat-option/span[contains(text(),'For family maintenance')]/parent::mat-option";

	@FindBy(xpath = "//input[@id='legalIdNumber']")
	WebElement additionalinfolegalID;
	String additionalinfolegalIDXPath = "//input[@id='legalIdNumber']";

	@FindBy(xpath = "//input[@id='send_PurposeOfTransaction']")
	WebElement PurposeOfTransaction;
	String PurposeOfTransactionXPath = "//input[@id='send_PurposeOfTransaction']";

		@FindBy(xpath = "//input[@id='sendPurposeOfTransactionPartnerField']")
	WebElement PurposeOffunds;
	String PurposeOffundsXPath = "//input[@id='sendPurposeOfTransactionPartnerField']";

	@FindBy(xpath = "//span[contains(text(),' For family maintenance ')]")
	WebElement PurposeOffundsoption;
	String PurposeOffundsoptionXPath = "//span[contains(text(),' For family maintenance ')]";



	@FindBy(xpath = "//mat-option/span[contains(text(),'Gift')]/parent::mat-option")
	WebElement PurposeOfTransactionOptionBox;
	String PurposeOfTransactionOptionBoxXPath = "//mat-option/span[contains(text(),'Gift')]/parent::mat-option";

	@FindBy(xpath = "//mat-option/span[contains(text(),'Spende')]/parent::mat-option")
	WebElement dePurposeOfTransactionOptionBox;
	String dePurposeOfTransactionOptionBoxXPath = "//mat-option/span[contains(text(),'Spende')]/parent::mat-option";


	@FindBy(xpath = "//input[@id='sourceOfFunds']")
	WebElement sourceofFund;
	String sourceofFundXPath = "//input[@id='sourceOfFunds']";

	@FindBy(xpath = "//mat-option/span[contains(text(),'Loan')]/parent::mat-option")
	WebElement SourceofFundOptionBox;
	String sourceofFundOptionBoxXPath = "//mat-option/span[contains(text(),'Loan')]/parent::mat-option";

	@FindBy(xpath = "(//button[contains(text(),'Verify CVV')])[2]")
	WebElement verifyCVVButton;
	String verifyCVVButtonXPath = "(//button[contains(text(),'Verify CVV')])[2]";

	@FindBy(xpath = "//input[@id='senderOccupation']")
	WebElement senderOccupation;
	String senderOccupationXPath = "//input[@id='senderOccupation']";

	@FindBy(xpath = "//div[@class = 'header-container']//h1[contains(text(), 'Payment Information')]")
	WebElement paymentInformationPageHeader;
	String paymentInformationPageHeaderXPath = "//div[@class = 'header-container']//h1[contains(text(), 'Payment Information')]";

	@FindBy(xpath = "//form//button[contains(@id, 'Add New Card') or contains(text(), 'Add New Card')]")
	WebElement addNewCardButton;
	String addNewCardButtonXPath = "//form//button[contains(@id, 'Add New Card') or contains(text(), 'Add New Card')]";

	@FindBy(xpath = "//form//button[contains(@id, 'Add New Card') or contains(text(), 'Neue Karte hinzufügen')]")
	WebElement deaddNewCardButton;
	String deaddNewCardButtonXPath = "//form//button[contains(@id, 'Add New Card') or contains(text(), 'Neue Karte hinzufügen')]";


	@FindBy(xpath = "//div[contains(@class, 'add-card-container')]//input[contains(@id, 'cardNumber')]")
	WebElement cardNumberField;
	String cardNumberFieldXPath = "//div[contains(@class, 'add-card-container')]//input[contains(@id, 'cardNumber')]";

	@FindBy(xpath = "//div[contains(@class, 'add-card-container')]//input[contains(@id, 'expiry')]")
	WebElement expirationDateField;
	String expirationDateXPathField = "//div[contains(@class, 'add-card-container')]//input[contains(@id, 'expiry')]";

	@FindBy(xpath = "//div[contains(@class, 'add-card-container')]//input[contains(@id, 'cvv')]")
	WebElement cvvField;
	String cvvFieldXPath = "//div[contains(@class, 'add-card-container')]//input[contains(@id, 'cvv')]";

	@FindBy(xpath = "//input[@id='senderBirthCountry']")
	WebElement senderBirthCountry;
	String senderBirthCountryXPath = "//input[@id='senderBirthCountry']";

	@FindBy(xpath = "//button[contains(text(),'Add New Account')]")
	WebElement addNewAccountButton;
	String addNewAccountButtonXPath = "//button[contains(text(),'Add New Account')]";

	@FindBy(xpath = "//input[@id='lbx-listBank-inputSearch']")
	WebElement serachInput;
	String serachInputXPath = "//input[@id='lbx-listBank-inputSearch']";

	@FindBy(xpath = "//div/span[text()='Demo Bank']")
	WebElement serachResultsDivOption;
	String serachResultsDivOptionXPath = "//div/span[text()='Demo Bank']";

	@FindBy(xpath = "//button[contains(text(),'OK, got it!')]")
	WebElement serachsliderButton;
	String serachsliderButtonXPath = "//button[contains(text(),'OK, got it!')]";

	@FindBy(xpath = "//input[@id='lbx-formAuthenticate-inputusername']")
	WebElement usernameBankInput;
	String usernameBankInputXPath = "//input[@id='lbx-formAuthenticate-inputusername']";

	@FindBy(xpath = "//mg-sender-info/form/div/mg-credit-card/form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img")
	WebElement existingCardRadio;
	String existingCardRadioXPath = "//mg-sender-info/form/div/mg-credit-card/form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img";

	@FindBy(xpath = "//form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img")
	WebElement walmartexistingCardRadio;
	String walmartexistingCardRadioXPath = "//form/mat-radio-group/div/div/mat-radio-button/label/div[@class='mat-radio-label-content']/div/img";


	@FindBy(xpath = "//input[@id='lbx-formAuthenticate-inputpassword']")
	WebElement passwordBankInput;
	String passwordBankInputXPath = "//input[@id='lbx-formAuthenticate-inputpassword']";

	@FindBy(xpath = "//iframe[@id='paywithmybank-iframe']")
	WebElement paywithmybankIframe;
	String paywithmybankIframeXPath = "//iframe[@id='paywithmybank-iframe']";

	@FindBy(xpath = "//div[@id='paywithmybank-lightbox']/div[@id='paywithmybank-outer-panel']/div[@id='paywithmybank-panel']/iframe")
	WebElement iframeGotIt;
	String iframeGotItXPath = "//div[@id='paywithmybank-lightbox']/div[@id='paywithmybank-outer-panel']/div[@id='paywithmybank-panel']/iframe";


	@FindBy(xpath = "//iframe[@id='lbx-iframeAuthenticate']")
	WebElement loginBoxIframe;
	String loginBoxIframeIframeXPath = "//iframe[@id='lbx-iframeAuthenticate']";


	@FindBy(xpath = "//button[@id='lbx-formLogin-submit']")
	WebElement loginSubmitButton;
	String loginSubmitButtonXPath = "//button[@id='lbx-formLogin-submit']";

	@FindBy(xpath = "//button[@id='lbx-accountList-submit']")
	WebElement loginAccountListButton;
	String loginAccountListButtonXPath = "//button[@id='lbx-accountList-submit']";



	@FindBy(xpath = "//a//following-sibling::button[contains(@id, 'saveCard')]")
	WebElement saveCardButton;
	String saveCardButtonXPath = "//a//following-sibling::button[contains(@id, 'saveCard')]";

	@FindBy(xpath = "//div[@class = 'accounts-container']//mat-radio-button")
	WebElement existingCardRadioButton;
	String existingCardRadioButtonXPath = "//div[@class = 'accounts-container']//mat-radio-button";

	@FindBy(xpath = "//button[@id = 'senderNext' and @type = 'submit']")
	WebElement nextButton;
	String nextButtonXPath = "//button[@id = 'senderNext' and @type = 'submit']";

	@FindBy(xpath = "//mat-option/span[contains(text(),'Mexico')]")
	WebElement optionSpan;
	String optionSpanXPath = "//mat-option/span[contains(text(),'Mexico')]";

	@FindBy(xpath = "//div//h5[contains(text(),'Why do we need your SSN?')]")
	WebElement ssnTooltip;
	String ssnTooltipXPath = "//div//h5[contains(text(),'Why do we need your SSN?')]";



	public SendMoneyPaymentInfoPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}

	public WebElement getPageValidationElement() {
		return paymentInformationPageHeader;
	}

	public String getPageValidationElementXPath() {
		return paymentInformationPageHeaderXPath;
	}

	public WebElement getPaymentInformationPageHeader() {
		return paymentInformationPageHeader;
	}

	public String getPaymentInformationPageHeaderXPath() {
		return paymentInformationPageHeaderXPath;
	}

	public WebElement getAddNewCardButton() {
		return addNewCardButton;
	}

	public String getAddNewCardButtonXPath() {
		return addNewCardButtonXPath;
	}

	public WebElement getCardNumberField() {
		return cardNumberField;
	}

	public String getCardNumberFieldXPath() {
		return cardNumberFieldXPath;
	}

	public WebElement getExpirationDateField() {
		return expirationDateField;
	}

	public String getExpirationDateXPathField() {
		return expirationDateXPathField;
	}

	public WebElement getCvvField() {
		return cvvField;
	}

	public String getCvvFieldXPath() {
		return cvvFieldXPath;
	}

	public WebElement getSaveCardButton() {
		return saveCardButton;
	}

	public String getSaveCardButtonXPath() {
		return saveCardButtonXPath;
	}

	public WebElement getExistingCardRadioButton() {
		return existingCardRadioButton;
	}

	public String getExistingCardRadioButtonXPath() {
		return existingCardRadioButtonXPath;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public String getNextButtonXPath() {
		return nextButtonXPath;
	}

	public void validatePageIsOpen() {
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND MONEY ADD CARD PAGE");
		System.out.println("VALIDATING SEND MONEY ADD CARD PAGE");
		actionExecutor.scrollToElementViaDynamicXPath(driver, paymentInformationPageHeaderXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, paymentInformationPageHeaderXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SEND MONEY ADD CARD PAGE");
		System.out.println("VALIDATED SEND MONEY ADD CARD PAGE");
	}

	public void addSendAgainAdditionalDetails(){
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderBirthCountryXPath, 1) != null) {

			actions
					.click(senderBirthCountry)
					.sendKeys("Mexico")
					.build()
					.perform();
			optionSpan.click();
		}
	/*
	if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
		actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);
		PurposeOfTransaction.click();
		actionExecutor.scrollToElement(driver, PurposeOfTransactionOptionBox, exceptionHandling);
		PurposeOfTransactionOptionBox.click();
	}

	 */


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceofFundXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, sourceofFund, exceptionHandling);

			sourceofFund.click();
			SourceofFundOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);

			PurposeOfTransaction.click();
			PurposeOfTransactionOptionBox.click();
		}
    /*
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderOccupationXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderOccupation, exceptionHandling);
			senderOccupation.click();
			senderOccupationOptionBox.click();
		}
		*/

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, relationshipToReceiverXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, relationshipToReceiver, exceptionHandling);
			relationshipToReceiver.click();
			relationshipToReceiverOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderCitizenshipCountryXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderCitizenshipCountry, exceptionHandling);
			senderCitizenshipCountry.click();
			senderCitizenshipCountryOptionBox.click();
		}




	}

	public void addAdditionalinfoDetails() {

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceofFundXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, sourceofFund, exceptionHandling);

			sourceofFund.click();
			SourceofFundOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);
			PurposeOfTransaction.click();
			actionExecutor.scrollToElement(driver, PurposeOfTransactionOptionBox, exceptionHandling);
			PurposeOfTransactionOptionBox.click();
		}

	}

	public void addAdditionalDetailsforgffidCA() {
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);
			PurposeOfTransaction.click();
			actionExecutor.scrollToElement(driver, PurposeOfTransactionOptionBox, exceptionHandling);
			PurposeOfTransactionOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderOccupationXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderOccupation, exceptionHandling);
			senderOccupation.click();
			senderOccupationOptionBox.click();
		}
		else{

			extentReportGenerator.addInfoMessage(currentTest, "Sender occupation and Purpose of transaction are not asking as mandatory doccument");



		}
	}

	public void deaddAdditionalDetails() {
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);
			PurposeOfTransaction.click();
			actionExecutor.scrollToElement(driver, dePurposeOfTransactionOptionBox, exceptionHandling);
			dePurposeOfTransactionOptionBox.click();
		}
	}

	public void addAdditionalDetails(){
	if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderBirthCountryXPath, 1) != null) {

		actions
				.click(senderBirthCountry)
				.sendKeys("Mexico")
				.build()
				.perform();
		optionSpan.click();
	}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, additionalinfolegalIDXPath, 1) != null) {

				/*actions
						.click(additionalinfolegalID)
						.sendKeys("897645362")
						.build()
						.perform();
				actionExecutor.waitFiveSeconds();*/
			actionExecutor.scrollToElement(driver, additionalinfolegalID, exceptionHandling);
			//additionalinfolegalID.click();
			additionalinfolegalID.sendKeys("897645362");


		}


	/*
	if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
		actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);
		PurposeOfTransaction.click();
		actionExecutor.scrollToElement(driver, PurposeOfTransactionOptionBox, exceptionHandling);
		PurposeOfTransactionOptionBox.click();
	}

	 */



}


	public void wmaddBankAccountInformationDetails() {
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingBankaccountRadioXPath, 1) != null) {
			existingBankaccountRadio.click();
		}

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOffundsXPath, 1) != null) {
			PurposeOffunds.click();

			PurposeOffundsoption.click();
		}



	}

	public void addBankAccountInformationDetails(){

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingBankaccountRadioXPath, 1) != null) {
			existingBankaccountRadio.click();
		}

		else{
			actionExecutor.scrollToElement(driver, addNewAccountButton, exceptionHandling);
			addNewAccountButton.click();
			driver.switchTo().frame(paywithmybankIframe);
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, serachInputXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, serachInputXPath, exceptionHandling);
				serachInput.click();
			}

			serachInput.sendKeys("Demo Bank");
			actionExecutor.scrollToElementViaDynamicXPath(driver, serachResultsDivOptionXPath, exceptionHandling);
			serachResultsDivOption.click();

			serachsliderButton.click();
			driver.switchTo().frame(loginBoxIframe);


			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, usernameBankInputXPath, 1) != null) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, usernameBankInputXPath, exceptionHandling);

				actions
						.click(usernameBankInput)
						.sendKeys("12345")
						.click(passwordBankInput)
						.sendKeys("12345")
						.build()
						.perform();

			}
			//	actionExecutor.scrollToElementViaDynamicXPath(driver, loginSubmitButtonXPath, exceptionHandling);
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginSubmitButtonXPath, 1) != null) {
				loginSubmitButton.click();
			}



			//actionExecutor.scrollToElement(driver, paywithmybankIframe, exceptionHandling);
			driver.switchTo().frame(paywithmybankIframe);


			actionExecutor.scrollToElement(driver, loginAccountListButton, exceptionHandling);
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginAccountListButtonXPath, 1) != null) {

				loginAccountListButton.click();
			}
		}



		driver.switchTo().defaultContent();
	}
	public void verifySSNandoccupation(){


		WebElement ele = driver.findElement(By.xpath("//label[contains(text(),'Occupation')]"));
		WebElement ele1 = driver.findElement(By.xpath("//label[contains(text(),'Social Security Number')]"));
		actionExecutor.scrollToElement(driver, ele, exceptionHandling);
		boolean bol =ele.isDisplayed();
		boolean bol1 =ele1.isDisplayed();
		if(bol && bol1){
			extentReportGenerator.addInfoMessage(currentTest,"SSN and occupation are mandatory as part of GFFID2 validation");
		}
		else{
			Assert.fail("GFFID2 is asking as mandatory doccument");
		}

	}

	public void validateSSNToolTip() {
		actionExecutor.scrollToElementViaDynamicXPath(driver, ssnTooltipXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, ssnTooltipXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "SSN Tooltip is displayed");
		System.out.println("SSN Tooltip is displayed");
	}

	public void addOrUseExistingCard(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, addNewCardButtonXPath, 1) == null) {
			validatePageIsOpen();
		}
actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, addNewCardButton, exceptionHandling);
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingCardRadioButtonXPath, 1) == null) {
			addNewCardButton.click();
			actionExecutor.scrollToElement(driver, cardNumberField, exceptionHandling);
			actions
					.click(cardNumberField)
					.sendKeys(creditCardNumber)
					.click(expirationDateField)
					.sendKeys(expiryMonth + "/" + expiryYear)
					.click(cvvField)
					.sendKeys(cvv)
					.build()
					.perform();

			actionExecutor.scrollToElement(driver, saveCardButton, exceptionHandling);
			saveCardButton.click();
		} else {

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingCardRadioXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, existingCardRadio, exceptionHandling);
				existingCardRadio.click();
			}

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, walmartexistingCardRadioXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, walmartexistingCardRadio, exceptionHandling);
				walmartexistingCardRadio.click();
			}



			actions
					.click(cvvInput)
					.sendKeys("456")
					.build()
					.perform();

			actionExecutor.scrollToElement(driver, verifyCVVButton, exceptionHandling);
			verifyCVVButton.click();

			//add code for existing card here (click the existing card radio button (defined) and click verify cvv (not defined))
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceofFundXPath, 1) != null) {
			//actionExecutor.scrollToElement(driver, sourceofFund, exceptionHandling);
			actionExecutor.waitFiveSeconds();
			sourceofFund.click();
			actionExecutor.waitFiveSeconds();
			SourceofFundOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);

			PurposeOfTransaction.click();
			PurposeOfTransactionOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderOccupationXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderOccupation, exceptionHandling);
			senderOccupation.click();
			senderOccupationOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, relationshipToReceiverXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, relationshipToReceiver, exceptionHandling);
			relationshipToReceiver.click();
			relationshipToReceiverOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderCitizenshipCountryXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderCitizenshipCountry, exceptionHandling);
			senderCitizenshipCountry.click();
			senderCitizenshipCountryOptionBox.click();
		}


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendPurposeOfTransactionPartnerFieldInputXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, sendPurposeOfTransactionPartnerFieldInput, exceptionHandling);
			sendPurposeOfTransactionPartnerFieldInput.click();

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendPurposeOfTransactionPartnerFieldOptionBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, sendPurposeOfTransactionPartnerFieldOptionBox, exceptionHandling);
				sendPurposeOfTransactionPartnerFieldOptionBox.click();
			}
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendPurposeOfTransactionFFMPartnerFieldOptionBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, sendPurposeOfTransactionFFMPartnerFieldOptionBox, exceptionHandling);
				sendPurposeOfTransactionFFMPartnerFieldOptionBox.click();

			}

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, additionalinfolegalIDXPath, 1) != null) {

				/*actions
						.click(additionalinfolegalID)
						.sendKeys("897645362")
						.build()
						.perform();
				actionExecutor.waitFiveSeconds();*/
				actionExecutor.scrollToElement(driver, additionalinfolegalID, exceptionHandling);
				//additionalinfolegalID.click();
				additionalinfolegalID.sendKeys("897645362");


			}


		}
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingCardRadioButtonXPath, 0));

	}

	public void addOrUseExistingCards(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
		//validatePageIsOpen();
		actionExecutor.scrollToElement(driver, deaddNewCardButton, exceptionHandling);
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingCardRadioButtonXPath, 1) == null) {
			deaddNewCardButton.click();
			actionExecutor.scrollToElement(driver, cardNumberField, exceptionHandling);
			actions
					.click(cardNumberField)
					.sendKeys(creditCardNumber)
					.click(expirationDateField)
					.sendKeys(expiryMonth + "/" + expiryYear)
					.click(cvvField)
					.sendKeys(cvv)
					.build()
					.perform();

			actionExecutor.scrollToElement(driver, saveCardButton, exceptionHandling);
			saveCardButton.click();
		} else {

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingCardRadioXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, existingCardRadio, exceptionHandling);
				existingCardRadio.click();
			}

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, walmartexistingCardRadioXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, walmartexistingCardRadio, exceptionHandling);
				walmartexistingCardRadio.click();
			}



			actions
					.click(cvvInput)
					.sendKeys("456")
					.build()
					.perform();

			actionExecutor.scrollToElement(driver, verifyCVVButton, exceptionHandling);
			verifyCVVButton.click();

			//add code for existing card here (click the existing card radio button (defined) and click verify cvv (not defined))
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sourceofFundXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, sourceofFund, exceptionHandling);

			sourceofFund.click();
			chooseOption.click();
			//SourceofFundOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, PurposeOfTransactionXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, PurposeOfTransaction, exceptionHandling);

			PurposeOfTransaction.click();
			chooseOption.click();
			//			PurposeOfTransactionOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderOccupationXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderOccupation, exceptionHandling);
			senderOccupation.click();
			chooseOption.click();
			//			senderOccupationOptionBox.click();
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, relationshipToReceiverXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, relationshipToReceiver, exceptionHandling);
			relationshipToReceiver.click();
			chooseOption.click();
			//			relationshipToReceiverOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, senderCitizenshipCountryXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, senderCitizenshipCountry, exceptionHandling);
			senderCitizenshipCountry.click();
			chooseOption.click();
			//			senderCitizenshipCountryOptionBox.click();
		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, additionalinfolegalIDXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, additionalinfolegalID, exceptionHandling);
			additionalinfolegalID.sendKeys("897645362");

		}

		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendPurposeOfTransactionPartnerFieldInputXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, sendPurposeOfTransactionPartnerFieldInput, exceptionHandling);
			sendPurposeOfTransactionPartnerFieldInput.click();

			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendPurposeOfTransactionPartnerFieldOptionBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, sendPurposeOfTransactionPartnerFieldOptionBox, exceptionHandling);
				chooseOption.click();
				//				sendPurposeOfTransactionPartnerFieldOptionBox.click();
			}
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendPurposeOfTransactionFFMPartnerFieldOptionBoxXPath, 1) != null) {
				actionExecutor.scrollToElement(driver, sendPurposeOfTransactionFFMPartnerFieldOptionBox, exceptionHandling);
				chooseOption.click();
				//				sendPurposeOfTransactionFFMPartnerFieldOptionBox.click();

			}
		}
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, existingCardRadioButtonXPath, 0));

	}

	public void scrollDownToAndClickNextButton(){


actionExecutor.waitFiveSeconds();
		Boolean Display = driver.findElement(By.xpath(nextButtonXPath)).isDisplayed();
		if(Display) {
			actionExecutor.scrollToElement(driver, nextButton, exceptionHandling);
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonXPath, 1) != null) {
				nextButton.click();
			}
		}
	}
}
