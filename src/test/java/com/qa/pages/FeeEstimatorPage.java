package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.lang.Thread;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FeeEstimatorPage extends BasePageAbstractTemplate {

	@FindBy(xpath = "//div[@class = 'header-container']//h1[contains(text(), 'Estimated Rates & Fees')]")
	WebElement feeEstimatorPageHeader;
	String feeEstimatorPageHeaderXPath = "//div[@class = 'header-container']//h1[contains(text(), 'Estimated Rates & Fees')]";

	@FindBy(xpath = "//button[@class = 'con-x' and @aria-label = 'close']")
	WebElement closeRedPopUp;
	String closeRedPopUpXPath = "//button[@class = 'con-x' and @aria-label = 'close']";

	@FindBy(xpath = "//input[@placeholder='Receiver State']")
	WebElement receiverState;
	String receiverStateXPath = "//input[@placeholder='Receiver State']";

	@FindBy(xpath = "//h6[contains(text(),'Some options not supported')]")
	WebElement ValidationmsgHighAmounts;
	String ValidationmsgHighAmountsXPath = "//h6[contains(text(),'Some options not supported')]";

	@FindBy(xpath = "//span[contains(text(),'LOCATION SEND TAX')]")
	WebElement locatiotaxfeeEstimationpage;
	String locatiotaxfeeEstimationpageXPath = "//span[contains(text(),'LOCATION SEND TAX')]";

	@FindBy(xpath = "//div[contains(text(),'Location Send Tax')]")
	WebElement locatiotaxsummarypage;
	String locatiotaxsummarypageXPath = "//div[contains(text(),'Location Send Tax')]";


	@FindBy(xpath = "//label[@for = 'send']//following-sibling::input[@id = 'send']")
	WebElement feeEstimatorSendAmountField;
	String feeEstimatorSendAmountFieldXPath = "//label[@for = 'send']//following-sibling::input[@id = 'send']";

	@FindBy(xpath = "//button[contains(text(),'Select Location')]")
	WebElement selectLocationButton;
	String selectLocationButtonXPath = "//button[contains(text(),'Select Location')]";

	@FindBy(xpath = "//a[(@href='/walmart/us/en/locations') and contains(text(),'Find a Location')]")
	WebElement findLocationButton;
	String findLocationButtonXPath = "//a[(@href='/walmart/us/en/locations') and contains(text(),'Find a Location')]";

	@FindBy(xpath = "//div//h6//a[contains(text(),'WALMART - #2463')]")
	WebElement walmartLocation;
	String walmartLocationXPath = "//div//h6//a[contains(text(),'WALMART - #2463')]";

	@FindBy(xpath = "//input[@id='searchKeyword']")
	WebElement searchKeywordInputBox;
	String searchKeywordInputBoxXPath = "//input[@id='searchKeyword']";

	@FindBy(xpath = "(//button[contains(text(),'Select Location')])[3]")
	WebElement resultLocationButton;
	String resultLocationButtonXPath = "(//button[contains(text(),'Select Location')])[3]";

	@FindBy(xpath = "//mat-icon[contains(text(),'search') and contains(@class,'search')]")
	WebElement iconSearchButton;
	String iconSearchButtonXPath = "//mat-icon[contains(text(),'search') and contains(@class,'search')]";

	@FindBy(xpath = "//input[@id = 'receiveCountry']")
	WebElement feeEstimatorReceiverCountryField;
	String feeEstimatorReceiverCountryFieldXPath = "//input[@id = 'receiveCountry' and @aria-label = 'Receiver Country']";

	String feeEstimatorReceiverCountryAutoFillXPath = "//div[contains(@role, 'listbox')]//mat-option[@role = 'option']//span[@class = 'mat-option-text' and contains(text(), '%s')]";

	@FindBy(xpath = "//button[@type = 'submit' and @id = 'startEstimate']")
	WebElement estimateFeesButton;
	String estimateFeesButtonXPath = "//button[@type = 'submit' and @id = 'startEstimate']";

	@FindBy(xpath = "//span[@aria-haspopup='true']/i")
	WebElement currencydropdown;
	String currencydropdownXPath = "//span[@aria-haspopup='true']/i";

	@FindBy(xpath = "//button[@role='menuitem'][2]")
	WebElement haiticurrency;
	String haiticurrencyXPath = "//button[@role='menuitem'][2]";


	@FindBy(xpath = "//button[contains(text(),'Estimate Fees')]")
	WebElement feeestimate;
	String feeestimateXPath = "//button[contains(text(),'Estimate Fees')]";

	@FindBy(xpath = "mg-general-info-modal//div//h4[contains(text(),'NEW! Send Up to $18K to India')]")
	WebElement modalIndia;
	String modalIndiaXPath = "mg-general-info-modal//div//h4[contains(text(),'NEW! Send Up to $18K to India')]";

	@FindBy(xpath = "mg-general-info-modal//div//button[contains(text(),'OK')]")
	WebElement modalIndiaOKButton;
	String modalIndiaOKButtonXPath = "mg-general-info-modal//div//button[contains(text(),'OK')]";

	@FindBy(xpath = "//div/div//mat-option[@role='option']/span[contains(text(),'India')]")
	WebElement IndiaOption;
	String IndiaOptionXPath = "//div/div//mat-option[@role='option']/span[contains(text(),'India')]";



	@FindBy(xpath = "//mg-exchange-rate//div[@class = 'current-rate-exchange ng-star-inserted']")
	WebElement currencyExchangeRate;
	String currencyExchangeRateXPath = "//mg-exchange-rate//div[@class = 'current-rate-exchange ng-star-inserted']";

	String paymentOptionDynamicXPath = "//div[@class = 'payment-options-container']//div[contains(text(), '%s')]";
	String receiveOptionDynamicXPath = "//div[@class = 'receiver-methods-container']//div[contains(text(), '%s')]";
	String bankForReceiverDynamicXPath = "//div[contains(@class, 'receive-options')]//div[contains(text(), '%s')]";

	@FindBy(xpath = "//input[contains(@id,'sendAmount')]")
	WebElement sendAmountInput;
	String sendAmountInputXPath = "//input[contains(@id,'sendAmount')]";

	@FindBy(xpath = "//input[contains(@id,'receiveAmount')]")
	WebElement receiveAmountInput;
	String receiveAmountXPath = "//input[contains(@id,'receiveAmount')]";

	@FindBy(xpath = "//a[contains(text(),'Not Right Now')]")
	WebElement notrightnowFeeEstimatorPage;
	String notrightnowFeeEstimatorPageXPath = "//a[contains(text(),'Not Right Now')]";

	@FindBy(xpath = "//button[contains(text(),' Mobile Number ')]")
	WebElement fastsendmobileprompt;
	String fastsendmobilepromptXPath = "//button[contains(text(),' Mobile Number ')]";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-6']/label/div")
	WebElement fastsendCheckbox1;
	String fastsendCheckbox1XPath = "//mat-checkbox[@id='mat-checkbox-6']/label/div";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-7']/label/div")
	WebElement fastsendCheckbox2;
	String fastsendCheckbox2XPath = "//mat-checkbox[@id='mat-checkbox-7']/label/div";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-8']/label/div")
	WebElement fastsendCheckbox3;
	String fastsendCheckbox3XPath = "//mat-checkbox[@id='mat-checkbox-8']/label/div";

	@FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-9']/label/div")
	WebElement fastsendCheckbox4;
	String fastsendCheckbox4XPath = "//mat-checkbox[@id='mat-checkbox-9']/label/div";


	@FindBy(xpath = "//div[contains(@class,'mg-modal-actions')]/button[contains(text(),'Next')]")
	WebElement fastsendModelNextButton;
	String fastsendModelNextButtonXPath = "//div[contains(@class,'mg-modal-actions')]/button[contains(text(),'Next')]";

	@FindBy(xpath = "//div/h3[contains(text(),'Send money with name and mobile number!')]")
	WebElement fastsendModelPage;
	String fastsendModelPageXPath = "//div/h3[contains(text(),'Send money with name and mobile number!')]";

	@FindBy(xpath = "(//a[contains(text(),'Learn More')])[4]")
	WebElement learnmoreFeeEstimatorPage;
	String learnmoreFeeEstimatorPageXPath = "(//a[contains(text(),'Learn More')])[4]";

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement learnmoreOKFeeEstimatorPage;
	String learnmoreOKFeeEstimatorPageXPath = "//button[contains(text(),'OK')]";

	@FindBy(xpath = "//h3[contains(text(),'Instant Bank Transfer Limits')]")
	WebElement trueLayerModal;
	String trueLayerModalXPath = "//h3[contains(text(),'Instant Bank Transfer Limits')]";

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement trueLayerModalContinue;
	String trueLayerModalContinueXPath = "//button[contains(text(),'Continue')]";

	@FindBy(xpath = "//div//img[@alt='Hint']")
	WebElement toolTipFeeEstimatorPage;
	String toolTipFeeEstimatorPageXPath = "//div//img[@alt='Hint']";



	@FindBy(xpath = "//button[@type = 'submit' and @id = 'nextEstimate']")
	WebElement nextButtonFeeEstimatorPage;
	String nextButtonFeeEstimatorPageXPath = "//button[@type = 'submit' and @id = 'nextEstimate']";//img[@alt='Hint']

	public FeeEstimatorPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}

	public WebElement getPageValidationElement() {
		return feeEstimatorPageHeader;
	}

	public String getPageValidationElementXPath() {
		return feeEstimatorPageHeaderXPath;
	}

	public WebElement getFeeEstimatorPageHeader() {
		return feeEstimatorPageHeader;
	}

	public String getFeeEstimatorPageHeaderXPath() {
		return feeEstimatorPageHeaderXPath;
	}

	public WebElement getCloseRedPopUp() {
		return closeRedPopUp;
	}

	public String getCloseRedPopUpXPath() {
		return closeRedPopUpXPath;
	}

	public WebElement getFeeEstimatorSendAmountField() {
		return feeEstimatorSendAmountField;
	}

	public String getFeeEstimatorSendAmountFieldXPath() {
		return feeEstimatorSendAmountFieldXPath;
	}

	public WebElement getFeeEstimatorReceiverCountryField() {
		return feeEstimatorReceiverCountryField;
	}

	public String getFeeEstimatorReceiverCountryFieldXPath() {
		return feeEstimatorReceiverCountryFieldXPath;
	}

	public String getFeeEstimatorReceiverCountryAutoFillXPath() {
		return feeEstimatorReceiverCountryAutoFillXPath;
	}

	public WebElement getEstimateFeesButton() {
		return estimateFeesButton;
	}

	public String getEstimateFeesButtonXPath() {
		return estimateFeesButtonXPath;
	}

	public WebElement getCurrencyExchangeRate() {
		return currencyExchangeRate;
	}

	public String getCurrencyExchangeRateXPath() {
		return currencyExchangeRateXPath;
	}

	public WebElement getNextButtonFeeEstimatorPage() {
		return nextButtonFeeEstimatorPage;
	}

	public String getNextButtonFeeEstimatorPageXPath() {
		return nextButtonFeeEstimatorPageXPath;
	}

	public String getPaymentOptionDynamicXPath() {
		return paymentOptionDynamicXPath;
	}

	public String getReceiveOptionDynamicXPath() {
		return receiveOptionDynamicXPath;
	}

	public String getBankForReceiverDynamicXPath() {
		return bankForReceiverDynamicXPath;
	}

	public WebElement getToolTipFeeEstimatorPage() {
		return toolTipFeeEstimatorPage;
	}

	public String getToolTipFeeEstimatorPageXPath() {
		return toolTipFeeEstimatorPageXPath;
	}

	//validation methods begin
	public void validatePageIsOpen() {
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING FEE ESTIMATOR PAGE");
		System.out.println("VALIDATING FEE ESTIMATOR PAGE");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, feeEstimatorPageHeaderXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING FEE ESTIMATOR PAGE");
		System.out.println("VALIDATING FEE ESTIMATOR PAGE");
	}
	//validation methods end

	/*public void changerreceivecurrencyy(){

		WebElement elee = driver.findElement(By.xpath("(//i[contains(text(),'expand_more')])[3]"));
		elee.click();

		WebElement elee1 = driver.findElement(By.xpath("//button[contains(text(),'AFN')]"));
		elee1.click();

	}*/

	public void changerreceivecurrency(){

		WebElement elee = driver.findElement(By.xpath("(//i[contains(text(),'expand_more')])[3]"));
elee.click();

		WebElement elee1 = driver.findElement(By.xpath("//button[contains(text(),'HTG')]"));
		elee1.click();

	}


	public void estimateFeesWithSendstoWV(String sendAmount, String receiveCountry) {
		validatePageIsOpen();
//		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, closeRedPopUpXPath, 1) != null){
		//closeRedPopUp.click();
//		}
		String processedAmount;
		if (sendAmount.equalsIgnoreCase("random")) {
			String firstNumber = RandomStringUtils.randomNumeric(1);
			if (Integer.parseInt(firstNumber) < 6) {
				firstNumber = Integer.toString(Integer.parseInt(firstNumber) + 6);
			}
			processedAmount = firstNumber + "." + RandomStringUtils.randomNumeric(2);
		} else {
			processedAmount = sendAmount;
		}
		actions
				.click(feeEstimatorSendAmountField)
				.sendKeys(processedAmount)
				.click(feeEstimatorReceiverCountryField)
				.sendKeys(receiveCountry)
				.build()
				.perform();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreOKFeeEstimatorPageXPath, 1) != null) {
			learnmoreOKFeeEstimatorPage.click();
			//actionExecutor.waitFiveSeconds();
		}


		//actionExecutor.waitFiveSeconds();
	//	Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry), 0));
		//driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();
		//actionExecutor.waitFiveSeconds();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreOKFeeEstimatorPageXPath, 1) != null) {
			learnmoreOKFeeEstimatorPage.click();
		//	actionExecutor.waitFiveSeconds();
			driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();
		}

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateXPath, 1) != null) {
			receiverState.click();
			receiverState.sendKeys("West Virginia");
			//driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, "West Virginia"))).click();

		}

		actionExecutor.scrollToElement(driver, estimateFeesButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "Estimate Fees Button has appeared, clicking");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		estimateFeesButton.click();
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, currencyExchangeRateXPath, exceptionHandling);
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 0));
		}
	}


	//flows related to this page begin
	public void estimateFeesWithSendAmountAndReceiveCountry(String sendAmount, String receiveCountry) {
		validatePageIsOpen();
//		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, closeRedPopUpXPath, 1) != null){
		//closeRedPopUp.click();
//		}
		String processedAmount;
		if (sendAmount.equalsIgnoreCase("random")) {
			String firstNumber = RandomStringUtils.randomNumeric(1);
			if (Integer.parseInt(firstNumber) < 6) {
				firstNumber = Integer.toString(Integer.parseInt(firstNumber) + 6);
			}
			processedAmount = firstNumber + "." + RandomStringUtils.randomNumeric(2);
		} else {
			processedAmount = sendAmount;
		}
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, feeEstimatorSendAmountFieldXPath, 1) != null) {
			actions
					.click(feeEstimatorSendAmountField)
					.sendKeys(processedAmount)
					.click(feeEstimatorReceiverCountryField)
					.sendKeys(receiveCountry)
					.build()
					.perform();
		}
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreOKFeeEstimatorPageXPath, 1) != null) {
			learnmoreOKFeeEstimatorPage.click();
			//actionExecutor.waitFiveSeconds();
		}

/*
		actionExecutor.waitFiveSeconds();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry), 0));
		driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();
		actionExecutor.waitFiveSeconds();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreOKFeeEstimatorPageXPath, 1) != null) {
			learnmoreOKFeeEstimatorPage.click();
			//actionExecutor.waitFiveSeconds();
			//driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();
		}
*/
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateXPath, 1) != null) {
			receiverState.click();
			receiverState.sendKeys("Texas");
			//driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, "Texas"))).click();

		}

		actionExecutor.scrollToElement(driver, estimateFeesButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "Estimate Fees Button has appeared, clicking");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		estimateFeesButton.click();
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, currencyExchangeRateXPath, exceptionHandling);
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 0));
			extentReportGenerator.addInfoMessage(currentTest, "FX rate is displayed");
		}
	}



	public void estimateFeesHaiti(String sendAmount, String receiveCountry) {
		validatePageIsOpen();
//		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, closeRedPopUpXPath, 1) != null){
		//closeRedPopUp.click();
//		}
		String processedAmount;
		if (sendAmount.equalsIgnoreCase("random")) {
			String firstNumber = RandomStringUtils.randomNumeric(1);
			if (Integer.parseInt(firstNumber) < 6) {
				firstNumber = Integer.toString(Integer.parseInt(firstNumber) + 6);
			}
			processedAmount = firstNumber + "." + RandomStringUtils.randomNumeric(2);
		} else {
			processedAmount = sendAmount;
		}
		actions
				.click(feeEstimatorSendAmountField)
				.sendKeys(processedAmount)
				.click(feeEstimatorReceiverCountryField)
				.sendKeys(receiveCountry)
				.build()
				.perform();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreOKFeeEstimatorPageXPath, 1) != null) {
			learnmoreOKFeeEstimatorPage.click();
			//actionExecutor.waitFiveSeconds();
		}



		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry), 0));
		driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();


		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreOKFeeEstimatorPageXPath, 1) != null) {
			learnmoreOKFeeEstimatorPage.click();

			driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();
		}

		actionExecutor.scrollToElement(driver, estimateFeesButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "Estimate Fees Button has appeared, clicking");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		estimateFeesButton.click();
		actionExecutor.waitFiveSeconds();
		currencydropdown.click();
		haiticurrency.click();
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 1) != null) {
			actionExecutor.scrollToElementViaDynamicXPath(driver, currencyExchangeRateXPath, exceptionHandling);
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 0));
			extentReportGenerator.addInfoMessage(currentTest, "FX rate is displayed");
		}
	}

	public void tooltip(){

		actionExecutor.scrollToElement(driver, toolTipFeeEstimatorPage, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,toolTipFeeEstimatorPageXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "Tool tip is displayed");
	}


	public void estimateFeesWithSendAmountAndReceiveCountryGFFP1(String sendAmount, String receiveCountry){
		validatePageIsOpen();
//		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, closeRedPopUpXPath, 1) != null){
//			closeRedPopUp.click();
//		}
		String processedAmount;
		if(sendAmount.equalsIgnoreCase("random")){
			String firstNumber = RandomStringUtils.randomNumeric(1);
			if(Integer.parseInt(firstNumber) < 6){
				firstNumber = Integer.toString(Integer.parseInt(firstNumber) + 6);
			}
			processedAmount = "3500.00";
		} else {
			processedAmount = "3500.00";
		}
		actions
				.click(feeEstimatorSendAmountField)
				.sendKeys(processedAmount)
				.click(feeEstimatorReceiverCountryField)
				.sendKeys(receiveCountry)
				.build()
				.perform();
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry), 0));
		driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();

		actionExecutor.scrollToElement(driver, estimateFeesButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "Estimate Fees Button has appeared, clicking");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		estimateFeesButton.click();
		actionExecutor.scrollToElementViaDynamicXPath(driver, currencyExchangeRateXPath, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 0));
	}

	public void verifymsgOnDeliveryoptions(){


		boolean valmsg =ValidationmsgHighAmounts.isDisplayed();
		String validMsg =ValidationmsgHighAmounts.getText();
		if(valmsg){
			extentReportGenerator.addInfoMessage(currentTest, "Expected Validation message for Delivery options based on high amounts: "+ validMsg);

		}

	}

	public void selectPaymentReceiveAndBankForReceiverMethods(String paymentOption, String receiveOption, String bankForReceiverOption) {
		//scroll down and click the correct payment option
		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		Boolean paymentOptionDisplay = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isDisplayed();
		if (paymentOptionDisplay) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, xpathToPaymentOptionElement, 1) != null) {

				driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				Boolean isselect = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isSelected();
				if (!isselect) {
					driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				}
			}
		}

		//scroll down and click the correct receive option
		String xpathToReceiveOptionElement = String.format(receiveOptionDynamicXPath, receiveOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToReceiveOptionElement, exceptionHandling);
		Boolean receiveOptionDisplay = driver.findElement(By.xpath(xpathToReceiveOptionElement)).isDisplayed();
		if (receiveOptionDisplay) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, xpathToReceiveOptionElement, 1) != null) {
				driver.findElement(By.xpath(xpathToReceiveOptionElement)).click();
				Boolean isselect = driver.findElement(By.xpath(xpathToReceiveOptionElement)).isSelected();
				if (!isselect) {
					driver.findElement(By.xpath(xpathToReceiveOptionElement)).click();
				}
			}
		}


		//scroll down and click correct bankForReceiver option, but only if it is available
		if (!bankForReceiverOption.equalsIgnoreCase("--blank--")) {
			String xpathToBankForReceiverOptionElement = String.format(bankForReceiverDynamicXPath, bankForReceiverOption);
			Boolean receiverBankotionDisplay = driver.findElement(By.xpath(xpathToBankForReceiverOptionElement)).isDisplayed();
			if (receiverBankotionDisplay) {
				actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToBankForReceiverOptionElement, exceptionHandling);
				driver.findElement(By.xpath(xpathToBankForReceiverOptionElement)).click();

				Boolean isselect = driver.findElement(By.xpath(xpathToBankForReceiverOptionElement)).isSelected();
				if (!isselect) {
					driver.findElement(By.xpath(xpathToBankForReceiverOptionElement)).click();
				}

			}
		}


	}

	public void selectCashatLocationPaymentOptionAndCashPickupForReceiverMethodsCA(String paymentOption, String receiveOption, String bankForReceiverOption, String pwcAddress) {
		//scroll down and click the correct payment option
		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		Boolean paymentOptionDisplay = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isDisplayed();
		if (paymentOptionDisplay) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, xpathToPaymentOptionElement, 1) != null) {

				driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				Boolean isselect = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isSelected();
				if (!isselect) {
					driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				}
			}
		}


		selectLocationButton.click();
		actions

				.click(searchKeywordInputBox)
				.sendKeys(pwcAddress)
				.build()
				.perform();

		actionExecutor.scrollToElement(driver, iconSearchButton, exceptionHandling);
		iconSearchButton.click();

		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, resultLocationButton, exceptionHandling);
		resultLocationButton.click();

		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);


		//scroll down and click the correct receive option
		String xpathToReceiveOptionElement = String.format(receiveOptionDynamicXPath, receiveOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToReceiveOptionElement, exceptionHandling);
		driver.findElement(By.xpath(xpathToReceiveOptionElement)).click();
	}



	public void selectCashatLocationPaymentOptionAndCashPickupForReceiverMethodsGB(String paymentOption, String receiveOption, String bankForReceiverOption, String pwcAddress) {
		//scroll down and click the correct payment option
		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		Boolean paymentOptionDisplay = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isDisplayed();
		if (paymentOptionDisplay) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, xpathToPaymentOptionElement, 1) != null) {

				driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				Boolean isselect = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isSelected();
				if (!isselect) {
					driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				}
			}
		}


		selectLocationButton.click();

		actionExecutor.waitFiveSeconds();
		searchKeywordInputBox.click();

		actionExecutor.waitFiveSeconds();
		searchKeywordInputBox.sendKeys(pwcAddress);
		//actions

				//.click(searchKeywordInputBox)
				//.sendKeys("Saltburn By The Sea")
				//.build()
				//.perform();
		actionExecutor.waitFiveSeconds();

		actionExecutor.scrollToElement(driver, iconSearchButton, exceptionHandling);
		iconSearchButton.click();

		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, resultLocationButton, exceptionHandling);

		actionExecutor.waitFiveSeconds();
		resultLocationButton.click();

		actionExecutor.waitFiveSeconds();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, nextButtonFeeEstimatorPageXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);
		}

		actionExecutor.waitFiveSeconds();
		//scroll down and click the correct receive option
		String xpathToReceiveOptionElement = String.format(receiveOptionDynamicXPath, receiveOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToReceiveOptionElement, exceptionHandling);
		driver.findElement(By.xpath(xpathToReceiveOptionElement)).click();
	}
   public void walmartLocations(String pwcAddress){
	   findLocationButton.click();

	   actionExecutor.waitFiveSeconds();
	   searchKeywordInputBox.click();

	   actionExecutor.waitFiveSeconds();
	   searchKeywordInputBox.sendKeys(pwcAddress);

	   actionExecutor.waitFiveSeconds();
	   actionExecutor.scrollToElement(driver, iconSearchButton, exceptionHandling);
	   iconSearchButton.click();

	   actionExecutor.waitFiveSeconds();
	   actionExecutor.scrollToElement(driver, walmartLocation,exceptionHandling);
	   Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, walmartLocationXPath, 0));
	   extentReportGenerator.addInfoMessage(currentTest, "All Walmart Locations displayed");

   }


	public void WVPaymentOptionAndCashPickupForReceiverMethods(String paymentOption, String receiveOption, String bankForReceiverOption, String pwcAddress) {
		//scroll down and click the correct payment option
		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		Boolean paymentOptionDisplay = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isDisplayed();
		if (paymentOptionDisplay) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, xpathToPaymentOptionElement, 1) != null) {

				driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				Boolean isselect = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isSelected();
				if (!isselect) {
					driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				}
			}
		}
		actionExecutor.waitFiveSeconds();
		selectLocationButton.click();

		actionExecutor.waitFiveSeconds();
		searchKeywordInputBox.click();

		actionExecutor.waitFiveSeconds();
		searchKeywordInputBox.sendKeys(pwcAddress);

		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, iconSearchButton, exceptionHandling);
		iconSearchButton.click();

		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, resultLocationButton, exceptionHandling);

		actionExecutor.waitFiveSeconds();
		resultLocationButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);
		//scroll down and click the correct receive option
		String xpathToReceiveOptionElement = String.format(receiveOptionDynamicXPath, receiveOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToReceiveOptionElement, exceptionHandling);

		driver.findElement(By.xpath(xpathToReceiveOptionElement)).click();

	}


	public void selectCashatLocationPaymentOptionAndCashPickupForReceiverMethods(String paymentOption, String receiveOption, String bankForReceiverOption, String pwcAddress) {
		//scroll down and click the correct payment option
		String xpathToPaymentOptionElement = String.format(paymentOptionDynamicXPath, paymentOption);
		actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToPaymentOptionElement, exceptionHandling);
		Boolean paymentOptionDisplay = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isDisplayed();
		if (paymentOptionDisplay) {
			if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, xpathToPaymentOptionElement, 1) != null) {

				driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				Boolean isselect = driver.findElement(By.xpath(xpathToPaymentOptionElement)).isSelected();
				if (!isselect) {
					driver.findElement(By.xpath(xpathToPaymentOptionElement)).click();
				}
			}
		}

		actionExecutor.waitFiveSeconds();
		selectLocationButton.click();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, searchKeywordInputBox, exceptionHandling);
		actions

				.click(searchKeywordInputBox)
				.sendKeys(pwcAddress)
				.build()
				.perform();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, iconSearchButton, exceptionHandling);
		iconSearchButton.click();


		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElement(driver, resultLocationButton, exceptionHandling);
		resultLocationButton.click();

		actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);

		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		//scroll down and click the correct receive option
		String xpathToReceiveOptionElement = String.format(receiveOptionDynamicXPath, receiveOption);
		//actionExecutor.scrollToElementViaDynamicXPath(driver, xpathToReceiveOptionElement, exceptionHandling);
		driver.findElement(By.xpath(xpathToReceiveOptionElement)).click();
	}

	public void testButtonfastsendFeeEstimator() {

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreFeeEstimatorPageXPath, 1) != null) {
			learnmoreFeeEstimatorPage.click();

		}
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, learnmoreOKFeeEstimatorPageXPath, 1) != null) {
			learnmoreOKFeeEstimatorPage.click();

		}

		actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);

		nextButtonFeeEstimatorPage.click();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendmobilepromptXPath, 1) != null) {
			fastsendmobileprompt.click();
		}

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendModelPageXPath, 1) != null) {
			fastsendCheckbox1.click();
			fastsendCheckbox2.click();
			fastsendCheckbox3.click();
			fastsendCheckbox4.click();
			fastsendModelNextButton.click();
		}
	}

	public void testButtonFeeEstimator() {


			actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);

		nextButtonFeeEstimatorPage.click();

	if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notrightnowFeeEstimatorPageXPath, 1) != null) {
		notrightnowFeeEstimatorPage.click();
	}

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendmobilepromptXPath, 1) != null) {
			fastsendmobileprompt.click();
		}

	}

	public void SendAgainFeeEstimator() {

		String processedAmount;

		String firstNumber = RandomStringUtils.randomNumeric(1);
		processedAmount = firstNumber + "." + RandomStringUtils.randomNumeric(2);

		sendAmountInput.click();
		sendAmountInput.sendKeys("\u0008");
		sendAmountInput.sendKeys("\u0008");
		sendAmountInput.sendKeys("\u0008");
		sendAmountInput.sendKeys("\u0008");


		sendAmountInput.sendKeys(processedAmount);
		receiveAmountInput.click();




		actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);

		nextButtonFeeEstimatorPage.click();

	}




	public void verifynumberofbubbles(){
		//actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);
		//driver.manage().timeouts().implicitlyWait(155000, TimeUnit.SECONDS);

		List<WebElement> listt =driver.findElements(By.xpath("//div[@class='bubble ng-star-inserted']"));

		if(listt.size()>5){
			extentReportGenerator.addInfoMessage(currentTest, "Able to generate morethan 5 receiver bubbles");
		}
	}


	public void verifiesLocationtaxsummarypage(){

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, locatiotaxsummarypageXPath, 1) != null) {

			extentReportGenerator.addInfoMessage(currentTest, "Location tax is being displayed in summary page");
		}
		else{
			extentReportGenerator.addInfoMessage(currentTest, "Location tax is  not displayed in summary page");

			Assert.fail("Location tax is not displayed in summary page ");
		}
	}

	public void verifiesLocationtaxFeeEstimator(){

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, locatiotaxfeeEstimationpageXPath, 1) != null) {

			extentReportGenerator.addInfoMessage(currentTest, "Location tax is being displayed in Fee Estimation page");
		}
		else{
			extentReportGenerator.addInfoMessage(currentTest, "Location tax is  not displayed in Fee Estimation page");

			Assert.fail("Location tax is not displayed in fee estimator page ");
		}
	}

	public void scrollDownAndClickNextButtonFeeEstimator(){
		actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);
		//driver.manage().timeouts().implicitlyWait(155000, TimeUnit.SECONDS);
		nextButtonFeeEstimatorPage.click();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, trueLayerModalContinueXPath, 1) != null) {
			trueLayerModalContinue.click();
			actionExecutor.waitFiveSeconds();
			//actionExecutor.waitFiveSeconds();
		}
	}



	public void verifyssnoccupationinreceiverinfo(){
		//actionExecutor.scrollToElement(driver, nextButtonFeeEstimatorPage, exceptionHandling);


WebElement ssn= driver.findElement(By.xpath("//label[contains(text(),'Occupation')]"));
		WebElement drivinglicence= driver.findElement(By.xpath("//label[contains(text(),'Social Security')]"));


		boolean ssnreduired =ssn.isDisplayed();
		if(ssnreduired){

			extentReportGenerator.addInfoMessage(currentTest, "SSN is required in receiver info page");

		}
		boolean DLreduired =drivinglicence.isDisplayed();
		if(DLreduired){

			extentReportGenerator.addInfoMessage(currentTest, "Driving license is required in receiver info page");

		}
	}



	public void estimateFeeWithSendAmountAndReceiveCountryy(String sendAmount, String receiveCountry) {
		//validatePageIsOpen();
//		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, closeRedPopUpXPath, 1) != null){
		//closeRedPopUp.click();
//		}
		String processedAmount;
		if (sendAmount.equalsIgnoreCase("random")) {
			String firstNumber = RandomStringUtils.randomNumeric(1);
			if (Integer.parseInt(firstNumber) < 6) {
				firstNumber = Integer.toString(Integer.parseInt(firstNumber) + 6);
			}
			processedAmount = firstNumber + "." + RandomStringUtils.randomNumeric(2);
		} else {
			processedAmount = sendAmount;
		}

		actions
				.click(feeEstimatorSendAmountField)
				.sendKeys(processedAmount)
				.click(feeEstimatorReceiverCountryField)
				.sendKeys(receiveCountry)
				.build()
				.perform();


		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry), 0));
		driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateXPath, 1) != null) {
			receiverState.click();
			receiverState.sendKeys("Texas");
			driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, "Texas"))).click();

		}

		actionExecutor.scrollToElement(driver, estimateFeesButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "Estimate Fees Button has appeared, clicking");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		estimateFeesButton.click();
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, currencyExchangeRateXPath, exceptionHandling);
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 0));
		}
	}


	public void estimateFeeWithSendAmountAndReceiveCountry(String sendAmount, String receiveCountry) {
		//validatePageIsOpen();
//		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, closeRedPopUpXPath, 1) != null){
		//closeRedPopUp.click();
//		}
		String processedAmount;
		if (sendAmount.equalsIgnoreCase("random")) {
			String firstNumber = RandomStringUtils.randomNumeric(1);
			if (Integer.parseInt(firstNumber) < 6) {
				firstNumber = Integer.toString(Integer.parseInt(firstNumber) + 6);
			}
			processedAmount = firstNumber + "." + RandomStringUtils.randomNumeric(2);
		} else {
			processedAmount = sendAmount;
		}
		actions
				.click(feeEstimatorSendAmountField)
				.sendKeys(processedAmount)
				.click(feeEstimatorReceiverCountryField)
				.sendKeys(receiveCountry)
				.build()
				.perform();


		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry), 0));
		driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, receiveCountry))).click();

		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, receiverStateXPath, 1) != null) {
			receiverState.click();
			receiverState.sendKeys("Texas");
			driver.findElement(By.xpath(String.format(feeEstimatorReceiverCountryAutoFillXPath, "Texas"))).click();

		}

		actionExecutor.scrollToElement(driver, estimateFeesButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "Estimate Fees Button has appeared, clicking");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, estimateFeesButtonXPath, 0));
		estimateFeesButton.click();
		if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 1) != null) {

			actionExecutor.scrollToElementViaDynamicXPath(driver, currencyExchangeRateXPath, exceptionHandling);
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, currencyExchangeRateXPath, 0));
		}
	}
}
