package com.qa.pages.feeEstimatorPageSubsidiaries;

import com.aventstack.extentreports.ExtentTest;
import com.qa.pages.BasePageAbstractTemplate;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SendMoneyFraudProtectPage extends BasePageAbstractTemplate {

	@FindBy(xpath = "//div[@class = 'header-container']//h1[contains(text(), 'Fraud Protection')]")
	WebElement fraudProtectPageHeader;
	String fraudProtectPageHeaderXPath = "//div[@class = 'header-container']//h1[contains(text(), 'Fraud Protection')]";

	@FindBy(xpath = "//button[@type = 'submit' and @id = 'reviewSend']")
	WebElement reviewAndSendButton;
	String reviewAndSendButtonXPath = "//button[@type = 'submit' and @id = 'reviewSend']";

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	WebElement fastsendreviewAndSendButton;
	String fastsendreviewAndSendButtonXPath = "//button[contains(text(),'Ok')]";

	@FindBy(xpath = "//div/h3[contains(text(),'Before you send, please confirm')]")
	WebElement fastsendConfirmPage;
	String fastsendConfirmPageXPath = "//div/h3[contains(text(),'Before you send, please confirm')]";

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement fastsendConfirmButton;
	String fastsendConfirmButtonXPath = "//button[contains(text(),'Confirm')]";

	@FindBy(xpath = "//button[@type = 'submit' and contains(text(),'Review & Send')]")
	WebElement payBillsreviewAndSendButton;
	String payBillsreviewAndSendButtonXPath = "//button[@type = 'submit' and contains(text(),'Review & Send')]";



	public SendMoneyFraudProtectPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}

	public WebElement getPageValidationElement() {
		return fraudProtectPageHeader;
	}

	public String getPageValidationElementXPath() {
		return fraudProtectPageHeaderXPath;
	}
	public WebElement getFraudProtectPageHeader() {
		return fraudProtectPageHeader;
	}

	public String getFraudProtectPageHeaderXPath() {
		return fraudProtectPageHeaderXPath;
	}

	public void validatePageIsOpen() {
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND MONEY FRAUD PROTECTION PAGE");
		System.out.println("VALIDATING SEND MONEY FRAUD PROTECTION PAGE");
		actionExecutor.scrollToElementViaDynamicXPath(driver, fraudProtectPageHeaderXPath, exceptionHandling); //must scroll down to this section on occasion
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fraudProtectPageHeaderXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SEND MONEY FRAUD PROTECTION PAGE");
		System.out.println("VALIDATED SEND MONEY FRAUD PROTECTION PAGE");
	}

	public void fastsendConfirm(){
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendConfirmPageXPath, 1) != null) {
			fastsendConfirmButton.click();
		}
		}
	public void fastsendReviewAndSend(){
		actionExecutor.waitFiveSeconds();
		actionExecutor.waitFiveSeconds();
		actionExecutor.scrollToElementViaDynamicXPath(driver, fastsendConfirmButtonXPath, exceptionHandling); //must scroll down to this section on occasion
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendConfirmButtonXPath, 1) != null) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", fastsendConfirmButton);
			actionExecutor.waitFiveSeconds();
			if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, fastsendConfirmButtonXPath, 1) != null) {
				fastsendConfirmButton.click();
			}
		}

	}

	public void scrollDownToAndSelectReviewAndSend(){
		validatePageIsOpen();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, reviewAndSendButtonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, reviewAndSendButton, exceptionHandling);
			reviewAndSendButton.click();

		}

	}

	public void scrollDownToAndSelectPayBillsReviewAndSend(){
		validatePageIsOpen();
		actionExecutor.scrollToElement(driver, payBillsreviewAndSendButton, exceptionHandling);
		payBillsreviewAndSendButton.click();
	}

	public void scrollDownAndSelectReviewAndSend(){
		//validatePageIsOpen();
		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, reviewAndSendButtonXPath, 1) != null) {
			actionExecutor.scrollToElement(driver, reviewAndSendButton, exceptionHandling);
			reviewAndSendButton.click();
		}
	}
}
