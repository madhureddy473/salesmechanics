package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.appUtilFiles.ExceptionHandling;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import com.qa.utilFiles.coreCodeUtilFiles.restAPICommands.EMTAdminCommands;
import com.qa.utilFiles.coreCodeUtilFiles.restAPICommands.capi.CAPIRegistrationIDUpload;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePageAbstractTemplate {

	@FindBy(xpath = "//h3[contains(text(), 'Log into Your MoneyGram Profile')]")
	WebElement loginPageHeader;
	String loginPageHeaderXPath = "//h3[contains(text(), 'Log into Your MoneyGram Profile')]";

	@FindBy(xpath = "//label[@for = 'emailAddress']//following-sibling::input[1]")
	WebElement emailAddressInputBox;
	String emailAddressInputBoxXPath = "//label[@for = 'emailAddress']//following-sibling::input[1]";



	@FindBy(xpath = "//mat-icon[contains(text(), 'visibility')]")
	WebElement passwordVisibilityIcon;
	String passwordVisibilityIconXPath;

	@FindBy(xpath = "//label[@for = 'login_password']//following-sibling::input[1]")
	WebElement passwordInputBox;
	String passwordInputBoxXPath = "//label[@for = 'login_password']//following-sibling::input[1]";

	@FindBy(xpath = "//span[@class = 'mat-button-wrapper' and contains(text(), 'Log In')]//parent::button")
	WebElement loginButton;
	String loginButtonXPath = "//span[@class = 'mat-button-wrapper' and contains(text(), 'Log In')]//parent::button";

	private final EMTAdminCommands emtAdminCommands = new EMTAdminCommands();
	private final CAPIRegistrationIDUpload capiRegistration = new CAPIRegistrationIDUpload();
	private boolean ignoreIDUploadFromAPI = false;
	private String userNameToUse;
	private String passwordToUse;

	public LoginPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
		super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
	}

	public WebElement getPageValidationElement() {
		return loginPageHeader;
	}
	public String getPageValidationElementXPath() {
		return loginPageHeaderXPath;
	}
	public WebElement getLoginPageHeader() {
		return loginPageHeader;
	}
	public String getLoginPageHeaderXPath() {
		return loginPageHeaderXPath;
	}
	public WebElement getEmailAddressInputBox() {
		return emailAddressInputBox;
	}

	public String getEmailAddressInputBoxXPath() {
		return emailAddressInputBoxXPath;
	}

	public WebElement getPasswordInputBox() {
		return passwordInputBox;
	}

	public String getPasswordInputBoxXPath() {
		return passwordInputBoxXPath;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public String getLoginButtonXPath() {
		return loginButtonXPath;
	}
	public String getUserNameToUse(){
		return userNameToUse;
	}
	public String getPasswordToUse(){
		return passwordToUse;
	}
	//validation methods begin
	public void validatePageIsOpen(){
		extentReportGenerator.addInfoMessage(currentTest, "VALIDATING LOGIN PAGE");
		System.out.println("VALIDATING LOGIN PAGE");
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginPageHeaderXPath, 0));
		extentReportGenerator.addInfoMessage(currentTest, "LOGIN PAGE IS OPEN");
		System.out.println("LOGIN PAGE IS OPEN");
	}
	//validation methods end
	public void loginWithRegistrationViaAPI(String userName, String password){
		validatePageIsOpen();
			if(userName.contains("regNewAcc_")){
				extentReportGenerator.addInfoMessage(currentTest, "REGISTERING a new account for this test.");
				capiRegistration.createProfileLoopForDuplicateEmailPhone(userName, currentTest, extentReportGenerator, emtAdminCommands.getProfileToUseArray()[5]);
				if(ignoreIDUploadFromAPI){
					extentReportGenerator.addWarningMessage(currentTest, "IGNORING ID UPLOAD PORTION OF API BECAUSE ignoreIDUploadFromAPI IS SET TO TRUE.");
					System.out.println("IGNORING ID UPLOAD PORTION OF API BECAUSE ignoreIDUploadFromAPI IS SET TO TRUE.");
				} else if(!capiRegistration.isStatusAuthenticated() || new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("idUploadOverride").equalsIgnoreCase("true")) {
					emtAdminCommands.emtUpdateProfileNameDOB(currentTest, extentReportGenerator, capiRegistration.getRegistrationJSON(), capiRegistration.getProfileID());
					capiRegistration.uploadIDOnFidoPassport(currentTest, extentReportGenerator, capiRegistration.getAccessToken(), CAPIRegistrationIDUpload.getLocaleHeader(), emtAdminCommands.getProfileToUse());
					if(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("emtIDUploadStatusOverride").equalsIgnoreCase("true")){
						emtAdminCommands.emtUpdateProfileStatus(currentTest, extentReportGenerator, capiRegistration.getProfileID());
					}
				} //can consider getting rid of the isStatusAuthenticated entirely and do this for every country and account, testing ID upload for every country without having to turn it on.
//			capiRegistration.uploadID(currentTest, extentReportGenerator, emtAdminCommands.getProfileToUse()); //old mitek method
				userNameToUse = capiRegistration.getEmailIDGenerated();

				extentReportGenerator.addInfoMessage(currentTest, "REGISTERED a new account for this test: " + userNameToUse);
			} else {
				userNameToUse = userName;
			}
			passwordToUse = password;
		simpleLogin(userNameToUse, passwordToUse);

	}

	public void loginWithexistingcredentials(String userName, String password){
		validatePageIsOpen();
		String userNameToUse;

		Actions actions = new Actions(driver);
		actions
				.click(emailAddressInputBox)
				.sendKeys("qwerty111@maildrop.com")
				.click(passwordInputBox)
				.sendKeys("qwerty@123")
				.build()
				.perform();

		actionExecutor.scrollToElement(driver, loginButton, exceptionHandling);
		Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginButtonXPath, 0));
		loginButton.click();
	}


	public void simpleLogin(String userNameToUse, String password){


		if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, emailAddressInputBoxXPath, 1) != null) {

			Actions actions = new Actions(driver);
			actions
					.moveToElement(emailAddressInputBox)
					.click(emailAddressInputBox)
					.sendKeys(userNameToUse)
					.moveToElement(passwordVisibilityIcon)
					.click(passwordVisibilityIcon)
					.moveToElement(passwordInputBox)
					.click(passwordInputBox)
					.sendKeys(password)
					.build()
					.perform();

			actionExecutor.scrollToElement(driver, loginButton, exceptionHandling);
			Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, loginButtonXPath, 0));
			loginButton.click();
		}
	}
	//flows related to this page begin



}
