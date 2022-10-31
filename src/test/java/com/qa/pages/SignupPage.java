package com.qa.pages;

import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import com.aventstack.extentreports.ExtentTest;
import com.qa.appUtilFiles.ActionExecutor;
import com.qa.appUtilFiles.ExceptionHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.util.Locale;

public class SignupPage extends BasePageAbstractTemplate {

    @FindBy(xpath = "//input[@name='custLastName']")
    WebElement emtcustLastNameInput;
    String emtcustLastNameInputXPath = "//input[@name='custLastName']";

    @FindBy(xpath = "//input[@name='userID']")
    WebElement emtUserName;
    String emtUserNameXPath = "//input[@name='userID']";

    @FindBy(xpath = "//input[@name='userPassword']")
    WebElement emtPassword;
    String emtPasswordXPath = "//input[@name='userPassword']";

    @FindBy(xpath = "//input[@value='Login']")
    WebElement emtLoginButton;
    String emtLoginButtonXPath = "//input[@value='Login']";

    @FindBy(xpath = "//*[@id = 'oCMenu_top4']")
    WebElement emtConsumerMenuButton;
    String emtConsumerMenuButtonXPath = "//*[@id = 'oCMenu_top4']";

    @FindBy(xpath = "//div[text()='Advanced Consumer Search']")
    WebElement emtAdvancedConsumerSearchutton;
    String emtAdvancedConsumerSearchuttonXPath = "//div[text()='Advanced Consumer Search']";

    @FindBy(xpath = "//button[@class = 'btn-primary' and contains(text(), 'OK')]")
    WebElement whatsNewPopUpHeaderOKButton;
    String whatsNewPopUpHeaderOKButtonXPath = "//button[@class = 'btn-primary' and contains(text(), 'OK')]";


    @FindBy(xpath = "//button[contains(text(), 'Log Out')]")
    WebElement profilePendingLogOut;
    String profilePendingLogOutXPath = "//button[contains(text(), 'Log Out')]";

    @FindBy(xpath = "//input[@name='searchLoginId']")
    WebElement emtsearchEmailID;
    String emtsearchEmailIDXPath = "//input[@name='searchLoginId']";

    @FindBy(xpath = "//input[@value='Search']")
    WebElement emtSearchButton;
    String emtSearchButtonXPath = "//input[@value='Search']";

    @FindBy(xpath = "//a[text()='Detail']")
    WebElement emtDetailButton;
    String emtDetailButtonXPath = "//a[text()='Detail']";

    @FindBy(xpath = "//*[@id='contentWrapper']//a[contains(text(),'Edit Profile')]")
    WebElement emtEditProfileButton;
    String emtEditProfileButtonXPath = "//*[@id='contentWrapper']//a[contains(text(),'Edit Profile')]";

    @FindBy(xpath = "//input[@name='custFirstName']")
    WebElement emtcustFirstNameInput;
    String emtcustFirstNameInputXPath = "//input[@name='custFirstName']";

    @FindBy(xpath = "//input[@name='updateSubmit' or @value = 'Update Profile']")
    WebElement emtupdateSubmitButton;
    String emtupdateSubmitButtonXPath = "//input[@name='updateSubmit' or @value = 'Update Profile']";

    @FindBy(xpath = "//select[@name='custStatus']")
    WebElement emtcustStatusInput;
    String emtcustStatusInputXPath = "//select[@name='custStatus']";


    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    String submitXPath = "//button[@type='submit']";

    @FindBy(xpath = "//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
    WebElement termsChecked;
    String termsCheckedXPath = "//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']";

    @FindBy(xpath = "//span[contains(text(),'Both Email and Text')]")
    WebElement email;
    String emailXPath = "//span[contains(text(),'Both Email and Text')]";

    @FindBy(xpath = "//button[contains(text(),'Join Plus Rewards')]")
    WebElement JoinPlusRewards;
    String JoinPlusRewardsXPath = "//button[contains(text(),'Join Plus Rewards')]";


    @FindBy(xpath = "//select[@name='custStatus']/option[contains(@value,'ACT:L08')]")
    WebElement emtcustStatusOptionInput;
    String emtcustStatusOptionInputXPath = "//select[@name='custStatus']/option[contains(@value,'ACT:L08')]";


    @FindBy(xpath = "//input[@name='currentCustStatus']/following-sibling::input[@value='Update Status']")
    WebElement emtcurrentCustStatusButton;
    String emtcurrentCustStatusButtonXPath = "//input[@name='currentCustStatus']/following-sibling::input[@value='Update Status']";

    @FindBy(xpath = "//button[contains(text(),'Log Out')]")
    WebElement emtpassportlogoutButton;
    String emtpassportlogoutButtonXPath = "//button[contains(text(),'Log Out')]";

    @FindBy(xpath = "//button[@id='loginButn']")
    WebElement homePageLoginButton;
    String homePageLoginButtonXPath = "//button[@id='loginButn']";

    @FindBy(xpath = "//input[@id='emailAddress']")
    WebElement homePageLoginEmailInput;
    String homePageLoginEmailInputXPath = "//input[@id='emailAddress']";

    @FindBy(xpath = "//input[@id='login_password']")
    WebElement homePageLoginPasswordInput;
    String homePageLoginPasswordInputXPath = "//input[@id='login_password']";

    @FindBy(xpath = "//button[@id='labels.logIn']")
    WebElement homePageLoginuserpasswordButton;
    String homePageLoginuserpasswordButtonXPath = "//button[@id='labels.logIn']";


    @FindBy(xpath = "//input[@class='onfido-sdk-ui-CustomFileInput-input']")
WebElement uploadfilepassportPath;
    String uploadfilepassportPathXPath = "//input[@class='onfido-sdk-ui-CustomFileInput-input']";

    @FindBy(xpath = "//button[@data-onfido-qa='passport']")
    WebElement passportSelect;
    String passportSelectXPath = "//button[@data-onfido-qa='passport']";

    @FindBy(xpath = "//button[@data-onfido-qa='uploaderButtonLink']")
    WebElement passportuploaderButtonLink;
    String passportuploaderButtonLinkXPath = "//button[@data-onfido-qa='uploaderButtonLink']";

    @FindBy(xpath = "//button/span[contains(text(),'Upload photo')]/parent::button")
    WebElement uploadButton;
    String uploadButtonXPath = "//button/span[contains(text(),'Upload photo')]/parent::button";

    @FindBy(xpath = "//button/span[contains(text(),'Confirm')]/parent::button")
    WebElement ConfirmButton;
    String ConfirmButtonXPath = "//button/span[contains(text(),'Confirm')]/parent::button";



    @FindBy(xpath = "//h3[contains(text(), 'need to collect the essentials.')]")
    WebElement signupPageHeader;
    String signupPageHeaderXPath = "//h3[contains(text(), 'need to collect the essentials.')]";

    @FindBy(xpath = "//input[@id='countryOfBirth']")
    WebElement countryOfBirthInput;
    String countryOfBirthInputXPath = "//input[@id='countryOfBirth']";

    @FindBy(xpath = "//mat-option/span[contains(text(),'Spain')]/parent::mat-option")
    WebElement countryOfBirthOptionInput;
    String countryOfBirthOptionInputXPath = "//mat-option/span[contains(text(),'Spain')]/parent::mat-option";
    @FindBy(xpath = "//h3[contains(text(), 'Profile Pending')]")
    WebElement profilePendingPopupHeader;
    String profilePendingPopupHeaderXPath = "//h3[contains(text(), 'Profile Pending')]";

    @FindBy(xpath = "//label[@for = 'profile_email']//following-sibling::input[1]")
    WebElement emailAddressInputBox;
    String emailAddressInputBoxXPath = "//label[@for = 'profile_email']//following-sibling::input[1]";

    @FindBy(xpath = "//label[@for = 'password']//following-sibling::input[1]")
    WebElement passwordInputBox;
    String passwordInputBoxXPath = "//label[@for = 'password']//following-sibling::input[1]";

    @FindBy(xpath = "//label[@for = 'confirm']//following-sibling::input[1]")
    WebElement confirmpasswordInputBox;
    String confirmpasswordInputBoxXPath = "//label[@for = 'confirm']//following-sibling::input[1]";


    @FindBy(xpath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]")
    WebElement whatsNewPopUpHeader;
    String whatsNewPopUpHeaderXPath = "//div[@class = 'ng-star-inserted']//h1[contains(text(), 's New')]";


    @FindBy(xpath = "//input[@id='phoneNumber']")
    WebElement phoneNumberInputBox;
    String phoneNumberInputBoxXPath = "//input[@id='phoneNumber']";

    @FindBy(xpath = "//button[@id = 'next']")
    WebElement nextButton;
    String nextButtonXPath = "//button[@id = 'next']";

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

    @FindBy(xpath = "//mat-select[contains(@id,'state')]")
    WebElement stateInputBox;
    String stateInputBoxXPath = "//mat-select[contains(@id,'state')]";

    @FindBy(xpath = "//mat-option/span[contains(text(),'Alaska')]/parent::mat-option")
    WebElement stateOptionBox;
    String stateOptionBoxXPath = "//mat-option/span[contains(text(),'Alaska')]/parent::mat-option";

    //@FindBy(xpath = "(//mat-option/span[1]/parent::mat-option)[1]")
   // WebElement stateFirstOptionBox;
    //String stateFirstOptionBoxXPath = "(//mat-option/span[1]/parent::mat-option)[1]";

    @FindBy(xpath = "//span[contains(text(),'Alaska')]")
    WebElement stateFirstOptionBox;
    String stateFirstOptionBoxXPath = "//span[contains(text(),'Alaska')]";

    //span[contains(text(),'Ontario')]

    @FindBy(xpath = "//a[contains(text(),'Not Right Now')]")
    WebElement notRightNowButton;
    String notRightNowButtonXPath = "//a[contains(text(),'Not Right Now')]";

    @FindBy(xpath = "//mg-rewards/div//mat-checkbox/label/div")
    WebElement rewardsIunderstandCheckBox;
    String rewardsIunderstandCheckBoxXPath = "//mg-rewards/div//mat-checkbox/label/div";

    @FindBy(xpath = "//button[@id='signUpButn']")
    WebElement signUpButn;
    String signUpButnXPath = "//button[@id='signUpButn']";

    @FindBy(xpath = "//input[@id='profile_email']")
    WebElement inputemail;
    String inputemailXPath = "//input[@id='profile_email']";

    @FindBy(xpath = "//input[@id='password']")
    WebElement inputpassword;
    String inputpasswordXPath = "//input[@id='password']";

    @FindBy(xpath = "//input[@id='confirm']")
    WebElement confirmpassword;
    String confirmpasswordXPath = "//input[@id='confirm']";

    @FindBy(xpath = "//input[@id='phoneNumber']")
    WebElement inputphonenumber;
    String inputphonenumberXPath = "//input[@id='phoneNumber']";

    @FindBy(xpath = "//label[contains(text(),'Phone Number')]")
    WebElement mobilenumberlabel;
    String mobilenumberlabelXPath = "//label[contains(text(),'Phone Number')]";

    @FindBy(xpath = "//a[contains(text(),'Not Right Now')]")
    WebElement signupnptrightnow;
    String signupnptrightnowXPath = "//a[contains(text(),'Not Right Now')]";

    @FindBy(xpath = "//p[contains(text(),'Canadian Driving Licence')]")
    WebElement canadianPRID;
    String canadianPRIDXPath = "//p[contains(text(),'Canadian Driving Licence')]";

    @FindBy(xpath = "//mat-error[contains(text(),'Invalid phone number')]")
    WebElement phonevalidatnmsg;
    String phonevalidatnmsgXPath = "//mat-error[contains(text(),'Invalid phone number')]";

    @FindBy(xpath = "//button[@id='next']")
    WebElement nextbutton;
    String nextbuttonXPath = "//button[@id='next']";

    @FindBy(xpath = "//button[contains(text(),'Yes, Sign Up')]")
    WebElement yesSignUprewardsButton;
    String yesSignUprewardsButtonXPath = "//button[contains(text(),'Yes, Sign Up')]";

    @FindBy(xpath = "//button[@id='enroll']")
    WebElement enroll;
    String enrollXPath = "//button[@id='enroll']";



    @FindBy(xpath = "//mg-loyalty-widget/div/div/div[2]/span")
    WebElement membersMemberPlusRewardNumber;
    String membersMemberPlusRewardNumberXPath = "//mg-loyalty-widget/div/div/div[2]/span";

    @FindBy(xpath = "//button[contains(text(), 'Send to Someone New')]")
    WebElement sendSomeoneNewButton;
    String sendSomeoneNewButtonXPath = "//button[contains(text(), 'Send to Someone New')]";


    @FindBy(xpath = "//a[contains(@id,'btn-no')]")
    WebElement notRightNowProfileCreatedButton;
    String notRightNowProfileCreatedButtonXPath = "//a[contains(@id,'btn-no')]";

    @FindBy(xpath = "//button[contains(text(),'Send to Someone New')]")
    WebElement sendtoSomeoneNewButton;
    String sendtoSomeoneNewButtonXPath = "//button[contains(text(),'Send to Someone New')]";

    @FindBy(xpath = "//button[contains(text(),'Join Plus Rewards')]")
    WebElement joinPlusRewardsButton;
    String joinPlusRewardsButtonXPath = "//button[contains(text(),'Join Plus Rewards')]";

    @FindBy(xpath = "//h4[contains(text(), 'Welcome, ')]")
    WebElement welcomeNameHeader;
    String welcomeNameHeaderXPath = "//h4[contains(text(), 'Welcome, ')]";

     String memberPlusRewardNumberString= null;


    public SignupPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
        super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
    }

    public WebElement getPageValidationElement() {
        return signupPageHeader;
    }
    public String getPageValidationElementXPath() {
        return signupPageHeaderXPath;
    }
    public WebElement getSignupPageHeader() {
        return signupPageHeader;
    }
    public String getSignupPageHeaderXPath() {
        return signupPageHeaderXPath;
    }

    public WebElement getPlusRewardNumber() {
        return membersMemberPlusRewardNumber;
    }

    String emailIDGenerated;
    String firstName;
    //validation methods begin
    public void validatePageIsOpen(){
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SIGN UP PAGE");
        System.out.println("VALIDATING SIGN UP PAGE");
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, signupPageHeaderXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "SIGN UP PAGE IS OPEN");
        System.out.println("SIGN UP PAGE IS OPEN");
    }
    public  void verifyJoinPlusRewardsButton(){
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING JOIN PLUS REWARDS BUTTON IN DASHBOARD PAGE");
        System.out.println("VALIDATING JOIN PLUS REWARDS BUTTON IN DASHBOARD PAGE");
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, joinPlusRewardsButtonXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATED JOIN PLUS REWARDS BUTTON IN DASHBOARD PAGE");
        System.out.println("VALIDATED JOIN PLUS REWARDS BUTTON IN DASHBOARD PAGE");
    }

    public  void enrollplusnumdashboard()
    {

        JoinPlusRewards.click();
     //   actionExecutor.scrollToElementViaDynamicXPath(driver, termsCheckedXPath, exceptionHandling);

                email.click();
        termsChecked.click();
                submit.click();



        }


    public  void verifyMemberPlusRewardNumber()
    {
        actionExecutor.waitFiveSeconds();
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING MEMBER PLUS REWARD NUMBER IN DASHBOARD PAGE");
        System.out.println("VALIDATING MEMBER PLUS REWARD NUMBER IN DASHBOARD PAGE");
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, membersMemberPlusRewardNumberXPath, 1) != null ) {

            memberPlusRewardNumberString = membersMemberPlusRewardNumber.getText();
        }
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, membersMemberPlusRewardNumberXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATED MEMBER PLUS REWARD NUMBER IN DASHBOARD PAGE");
        System.out.println("VALIDATED MEMBER PLUS REWARD NUMBER IN DASHBOARD PAGE");
        System.out.println("VALIDATED MEMBER PLUS REWARD NUMBER IN DASHBOARD PAGE" + memberPlusRewardNumberString);
        extentReportGenerator.addInfoMessage(currentTest, "MEMBER PLUS REWARD NUMBER IS: " + memberPlusRewardNumberString);

    }

    public void signUpWithoutEnrollnonUS(){
        actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowButtonXPath, exceptionHandling);
        notRightNowButton.click();


    }

    public void signUpWithoutEnroll(){
        actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowButtonXPath, exceptionHandling);
        notRightNowButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, notRightNowProfileCreatedButtonXPath, exceptionHandling);
        notRightNowProfileCreatedButton.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver, sendtoSomeoneNewButtonXPath, exceptionHandling);

    }

    public void handleWhatsNewPopUp(){
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
            extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
            actionExecutor.scrollToElementViaDynamicXPath(driver, whatsNewPopUpHeaderOKButtonXPath, exceptionHandling);
            whatsNewPopUpHeaderOKButton.click();
        }
    }

    public void VerifyIDUpload(){

        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, rewardsIunderstandCheckBoxXPath, 1) != null) {
            actionExecutor.scrollToElementViaDynamicXPath(driver, rewardsIunderstandCheckBoxXPath, exceptionHandling);
            rewardsIunderstandCheckBox.click();
        }
        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesSignUprewardsButtonXPath, 1) != null) {
            actionExecutor.scrollToElementViaDynamicXPath(driver, yesSignUprewardsButtonXPath, exceptionHandling);
            yesSignUprewardsButton.click();
        }

    }
    public void uploadPassportID() {

        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, rewardsIunderstandCheckBoxXPath, 1) != null) {
          actionExecutor.scrollToElementViaDynamicXPath(driver, rewardsIunderstandCheckBoxXPath, exceptionHandling);
            rewardsIunderstandCheckBox.click();
        }
        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesSignUprewardsButtonXPath, 1) != null) {
            actionExecutor.scrollToElementViaDynamicXPath(driver, yesSignUprewardsButtonXPath, exceptionHandling);
            yesSignUprewardsButton.click();
        }


        ((JavascriptExecutor) driver).executeScript("window.open()");
       java.util.ArrayList<String> tabs = new java.util.ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

        //WebDriver driver = new ChromeDriver(capability);

        driver.navigate().to("https://q1wsintapps.qacorp.moneygram.com//eMoneyGramAdm//login.do");


        actionExecutor.scrollToElementViaDynamicXPath(driver, emtUserNameXPath, exceptionHandling);
        emtUserName.click();
        emtUserName.sendKeys("q2_manager");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtPasswordXPath, exceptionHandling);
        emtPassword.click();
        emtPassword.sendKeys("Quality124#");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtLoginButtonXPath, exceptionHandling);
        emtLoginButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtConsumerMenuButtonXPath, exceptionHandling);
        emtConsumerMenuButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtAdvancedConsumerSearchuttonXPath, exceptionHandling);
        emtAdvancedConsumerSearchutton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtsearchEmailIDXPath, exceptionHandling);
        emtsearchEmailID.click();
        emtsearchEmailID.sendKeys(emailIDGenerated);

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSearchButtonXPath, exceptionHandling);
        emtSearchButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtDetailButtonXPath, exceptionHandling);
        emtDetailButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtEditProfileButtonXPath, exceptionHandling);
        emtEditProfileButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcustFirstNameInputXPath, exceptionHandling);

        emtcustFirstNameInput.clear();
        emtcustFirstNameInput.click();
        emtcustFirstNameInput.sendKeys("pass");

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtupdateSubmitButtonXPath, exceptionHandling);
        emtupdateSubmitButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcustStatusInputXPath, exceptionHandling);
        emtcustStatusInput.click();
        emtcustStatusOptionInput.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcurrentCustStatusButtonXPath, exceptionHandling);
        emtcurrentCustStatusButton.click();
        driver.switchTo().window(tabs.get(0));
;
        actionExecutor.scrollToElementViaDynamicXPath(driver, passportSelectXPath, exceptionHandling);
        passportSelect.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, passportuploaderButtonLinkXPath, exceptionHandling);
        passportuploaderButtonLink.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, uploadButtonXPath, exceptionHandling);
     //   uploadButton.click();
       java.io.File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path + "\\src\\test\\projectTestResources\\registration\\uploadPhotos\\ESPassport.png";
        uploadfilepassportPath.sendKeys(path);
        //uploadfilepassportPath.sendKeys("C:\\Users\\cvg7\\MGO_US_OCT_14_Master\\mgowebregression\\src\\test\\projectTestResources\\registration\\uploadPhotos\\ESPassport.png");// For setting a profile picture
       // uploadfilepassportPath.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, ConfirmButtonXPath, exceptionHandling);
        ConfirmButton.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver, emtpassportlogoutButtonXPath, exceptionHandling);
        emtpassportlogoutButton.click();



       // handleWhatsNewPopUp();
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
            extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
            actionExecutor.scrollToElementViaDynamicXPath(driver, whatsNewPopUpHeaderOKButtonXPath, exceptionHandling);
            whatsNewPopUpHeaderOKButton.click();
        }
        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginButtonXPath, exceptionHandling);
        homePageLoginButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginEmailInputXPath, exceptionHandling);
        homePageLoginEmailInput.click();
        homePageLoginEmailInput.sendKeys(emailIDGenerated);

        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginPasswordInputXPath, exceptionHandling);
        homePageLoginPasswordInput.click();
        homePageLoginPasswordInput.sendKeys("testtest1");

        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginuserpasswordButtonXPath, exceptionHandling);
        homePageLoginuserpasswordButton.click();
        LoginPage loginPage = new LoginPage(driver, currentTest, extentReportGenerator, scenario);
        while(true) {
            if ((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendSomeoneNewButtonXPath, 1) != null && exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, welcomeNameHeaderXPath, 1) != null) || exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, 1) != null) {

                if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, profilePendingPopupHeaderXPath, 1) != null) {
                    profilePendingLogOut.click();
                    handleWhatsNewPopUp();
                    homePageLoginButton.click();

                    loginPage.simpleLogin(emailIDGenerated, "testtest1");
                }
                else{
                    break;
                }
            }
        }


        }


    public void joinrewardsfromdashboard()
    {
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING MEMBER PLUS REWARD NUMBER IN DASHBOARD PAGE");
        System.out.println("VALIDATING JOIN PLUS REWARDS BUTTON IN DASHBOARD PAGE");


        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, enrollXPath, 1) != null){
            enroll.click();

            WebElement emailradiobutton = driver.findElement(By.xpath("//input[@value='email']"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", emailradiobutton);



            WebElement checkbuttonforrewards = driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
            checkbuttonforrewards.click();
            WebElement yessignupbutton = driver.findElement(By.xpath("//button[@type='submit']"));

            boolean signupenabled =yessignupbutton.isEnabled();
            if (signupenabled){
                extentReportGenerator.addInfoMessage(currentTest, "user is able to signup for rewards from dash board");
                yessignupbutton.click();


            }
        }

        else {
            extentReportGenerator.addInfoMessage(currentTest, "Unable to signup for rewards from dash board");
        }

actionExecutor.waitFiveSeconds();

    }




    public void withoutuploadPassportID() {

        /*
        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, rewardsIunderstandCheckBoxXPath, 1) != null) {
            actionExecutor.scrollToElementViaDynamicXPath(driver, rewardsIunderstandCheckBoxXPath, exceptionHandling);
            rewardsIunderstandCheckBox.click();
        }
        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesSignUprewardsButtonXPath, 1) != null) {
            actionExecutor.scrollToElementViaDynamicXPath(driver, yesSignUprewardsButtonXPath, exceptionHandling);
            yesSignUprewardsButton.click();
        }
        */



        ((JavascriptExecutor) driver).executeScript("window.open()");
        java.util.ArrayList<String> tabs = new java.util.ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

        //WebDriver driver = new ChromeDriver(capability);

        driver.navigate().to("https://q1wsintapps.qacorp.moneygram.com//eMoneyGramAdm//login.do");


        actionExecutor.scrollToElementViaDynamicXPath(driver, emtUserNameXPath, exceptionHandling);
        emtUserName.click();
        emtUserName.sendKeys("q2_manager");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtPasswordXPath, exceptionHandling);
        emtPassword.click();
        emtPassword.sendKeys("Quality123#");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtLoginButtonXPath, exceptionHandling);
        emtLoginButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtConsumerMenuButtonXPath, exceptionHandling);
        emtConsumerMenuButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtAdvancedConsumerSearchuttonXPath, exceptionHandling);
        emtAdvancedConsumerSearchutton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtsearchEmailIDXPath, exceptionHandling);
        emtsearchEmailID.click();
        emtsearchEmailID.sendKeys(emailIDGenerated);

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSearchButtonXPath, exceptionHandling);
        emtSearchButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtDetailButtonXPath, exceptionHandling);
        emtDetailButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtEditProfileButtonXPath, exceptionHandling);
        emtEditProfileButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcustFirstNameInputXPath, exceptionHandling);

        emtcustFirstNameInput.clear();
        emtcustFirstNameInput.click();
        emtcustFirstNameInput.sendKeys("pass");

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtupdateSubmitButtonXPath, exceptionHandling);
        emtupdateSubmitButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcustStatusInputXPath, exceptionHandling);
        emtcustStatusInput.click();
        emtcustStatusOptionInput.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcurrentCustStatusButtonXPath, exceptionHandling);
        emtcurrentCustStatusButton.click();
        driver.switchTo().window(tabs.get(0));

        actionExecutor.scrollToElementViaDynamicXPath(driver, passportSelectXPath, exceptionHandling);
        passportSelect.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, passportuploaderButtonLinkXPath, exceptionHandling);
        passportuploaderButtonLink.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, uploadButtonXPath, exceptionHandling);
        //   uploadButton.click();
        java.io.File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path + "\\src\\test\\projectTestResources\\registration\\uploadPhotos\\ESPassport.png";
        uploadfilepassportPath.sendKeys(path);
        //uploadfilepassportPath.sendKeys("C:\\Users\\cvg7\\MGO_US_OCT_14_Master\\mgowebregression\\src\\test\\projectTestResources\\registration\\uploadPhotos\\ESPassport.png");// For setting a profile picture
        // uploadfilepassportPath.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, ConfirmButtonXPath, exceptionHandling);
        ConfirmButton.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver, emtpassportlogoutButtonXPath, exceptionHandling);
        emtpassportlogoutButton.click();



        // handleWhatsNewPopUp();
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, Integer.parseInt(new GetPropertiesFromSysOrConfig().getPropertyFromSysOrConfig("waitForInviteFriendsWhatsNew"))) != null){
            extentReportGenerator.addInfoMessage(currentTest, "WHAT'S NEW POP UP HAS APPEARED! HANDLING");
            actionExecutor.scrollToElementViaDynamicXPath(driver, whatsNewPopUpHeaderOKButtonXPath, exceptionHandling);
            whatsNewPopUpHeaderOKButton.click();
        }
        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginButtonXPath, exceptionHandling);
        homePageLoginButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginEmailInputXPath, exceptionHandling);
        homePageLoginEmailInput.click();
        homePageLoginEmailInput.sendKeys(emailIDGenerated);

        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginPasswordInputXPath, exceptionHandling);
        homePageLoginPasswordInput.click();
        homePageLoginPasswordInput.sendKeys("testtest1");

        actionExecutor.scrollToElementViaDynamicXPath(driver, homePageLoginuserpasswordButtonXPath, exceptionHandling);
        homePageLoginuserpasswordButton.click();
        LoginPage loginPage = new LoginPage(driver, currentTest, extentReportGenerator, scenario);
        while(true) {
            if ((exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, sendSomeoneNewButtonXPath, 1) != null && exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, welcomeNameHeaderXPath, 1) != null) || exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatsNewPopUpHeaderXPath, 1) != null) {

                if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, profilePendingPopupHeaderXPath, 1) != null) {
                    profilePendingLogOut.click();
                    handleWhatsNewPopUp();
                    homePageLoginButton.click();

                    loginPage.simpleLogin(emailIDGenerated, "testtest1");
                }
                else{
                    break;
                }
            }
        }


    }


    public void signUpandvalidateCanadaPR()
    {

       //actionExecutor.scrollToElementViaDynamicXPath(driver, signupnptrightnowXPath, exceptionHandling);
        //signupnptrightnow.click();

        WebElement ele = driver.findElement(By.xpath("//button[contains(text(),' Upload an ID ')]"));
        ele.click();

        boolean CAPRID = canadianPRID.isDisplayed();

        if(CAPRID){
            extentReportGenerator.addInfoMessage(currentTest, "Validation message for invalid phone number is displayed and unable to proceed further in the registration");
        }

    }


    public void signUpandvalidatephonenumber()
    {

        actionExecutor.scrollToElementViaDynamicXPath(driver, signUpButnXPath, exceptionHandling);
        signUpButn.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver, inputemailXPath, exceptionHandling);
        inputemail.sendKeys("q1_new_login@maildrop.com");
        actionExecutor.scrollToElementViaDynamicXPath(driver, inputpasswordXPath, exceptionHandling);
        inputpassword.sendKeys("testtest1");
        actionExecutor.scrollToElementViaDynamicXPath(driver, confirmpasswordXPath, exceptionHandling);
        confirmpassword.sendKeys("testtest1");
        actionExecutor.scrollToElementViaDynamicXPath(driver, inputphonenumberXPath, exceptionHandling);
        inputphonenumber.sendKeys("23456");
        mobilenumberlabel.click();

        actionExecutor.waitFiveSeconds();


        boolean phonenumValmsg = phonevalidatnmsg.isDisplayed();
        boolean nextbuttonn = nextbutton.isEnabled();
        if(phonenumValmsg){
            extentReportGenerator.addInfoMessage(currentTest, "Validation message for invalid phone number is displayed and unable to proceed further in the registration");
        }

    }

    public void signUpWithEnroll()
    {
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, rewardsIunderstandCheckBoxXPath, 1) != null ) {
            actionExecutor.scrollToElementViaDynamicXPath(driver, rewardsIunderstandCheckBoxXPath, exceptionHandling);
        }
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, rewardsIunderstandCheckBoxXPath, 1) != null ) {
            rewardsIunderstandCheckBox.click();
        }
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, yesSignUprewardsButtonXPath, 1) != null ) {

            yesSignUprewardsButton.click();
        }
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, notRightNowProfileCreatedButtonXPath, 1) != null ) {

            notRightNowProfileCreatedButton.click();
        }

       // actionExecutor.scrollToElementViaDynamicXPath(driver, sendtoSomeoneNewButtonXPath, exceptionHandling);

    }
    //validation methods end
    public void signUpprocess(String password, String registrationPhonePrefix, String registrationDateOfBirth, String registrationAddressline, String registrationCity, String registrationPostalCode){
        validatePageIsOpen();
        String emailName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        emailIDGenerated = emailName + "@maildrop.cc";
        String phonenumber = registrationPhonePrefix +RandomStringUtils.randomNumeric(7);
        Actions actions = new Actions(driver);
        actions
                .click(emailAddressInputBox)
                .sendKeys(emailIDGenerated)
                .click(passwordInputBox)
                .sendKeys(password)
                .click(confirmpasswordInputBox)
                .sendKeys(password)
                .click(phoneNumberInputBox)
                .sendKeys(phonenumber)


                .build()
                .perform();



        actionExecutor.scrollToElementViaDynamicXPath(driver, nextButtonXPath, exceptionHandling);

        nextButton.click();
        actionExecutor.scrollToElementViaDynamicXPath(driver, firstNameInputBoxXPath, exceptionHandling);

        firstName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        String lastName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());

        actions
                .click(firstNameInputBox)
                .sendKeys(firstName)
                .click(lastNameInputBox)
                .sendKeys(lastName)
                .click(dateOfBirthInputBox)
                .sendKeys("10121988")
                .click(addresslineInputBox)
                .sendKeys("oadress line")
                .click(cityInputBox)
                .sendKeys("cisco")
                .click(postalCodeInputBox)
                .sendKeys("56321")

                .build()
                .perform();


        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, stateInputBoxXPath, 1) != null ) {

            stateInputBox.click();
            stateFirstOptionBox.click();
        }

        createProfileButton.click();



    }

    public void signUp(String password, String registrationPhonePrefix, String registrationDateOfBirth, String registrationAddressline, String registrationCity, String registrationPostalCode){
        validatePageIsOpen();
        String emailName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        emailIDGenerated = emailName + "@maildrop.cc";
       String phonenumber = registrationPhonePrefix +RandomStringUtils.randomNumeric(7);
        Actions actions = new Actions(driver);
        actions
                .click(emailAddressInputBox)
                .sendKeys(emailIDGenerated)
                .click(passwordInputBox)
                .sendKeys(password)
                .click(confirmpasswordInputBox)
                .sendKeys(password)
                .click(phoneNumberInputBox)
                .sendKeys(phonenumber)


                .build()
                .perform();



        actionExecutor.scrollToElementViaDynamicXPath(driver, nextButtonXPath, exceptionHandling);

        nextButton.click();


         firstName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        String lastName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        actionExecutor.waitFiveSeconds();
        actionExecutor.scrollToElementViaDynamicXPath(driver, firstNameInputBoxXPath, exceptionHandling);

        actions
                .click(firstNameInputBox)
                .sendKeys(firstName)
                .click(lastNameInputBox)
                .sendKeys(lastName)
                .click(dateOfBirthInputBox)
                .sendKeys(registrationDateOfBirth)
                .click(addresslineInputBox)
                .sendKeys(registrationAddressline)
                .click(cityInputBox)
                .sendKeys(registrationCity)
                .click(postalCodeInputBox)
                .sendKeys(registrationPostalCode)

                .build()
                .perform();

        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, countryOfBirthInputXPath, 1) != null ) {
            countryOfBirthInput.click();
            countryOfBirthOptionInput.click();
        }

        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, stateInputBoxXPath, 1) != null ) {

            stateInputBox.click();
            stateFirstOptionBox.click();
        }
        createProfileButton.click();



    }
    public void EMTLoginandchangeLN() {

        WebElement editprofile = driver.findElement(By.xpath("(//a[contains(@class,'mb-none view-link')])[1]"));
        editprofile.click();

        WebElement emailname = driver.findElement(By.xpath("(//div[contains(@class,'align-items-center')])[6]/div[2]"));
        String emailcreated = emailname.getText();
        System.out.println("Email created is " + emailcreated);

        editprofile.click();
        actionExecutor.waitFiveSeconds();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        java.util.ArrayList<String> tabs = new java.util.ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        //WebDriver driver = new ChromeDriver(capability);

        driver.navigate().to("https://q1wsintapps.qacorp.moneygram.com//eMoneyGramAdm//login.do");


        actionExecutor.scrollToElementViaDynamicXPath(driver, emtUserNameXPath, exceptionHandling);
        emtUserName.click();
        emtUserName.sendKeys("q2_manager");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtPasswordXPath, exceptionHandling);
        emtPassword.click();
        emtPassword.sendKeys("Quality123#");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtLoginButtonXPath, exceptionHandling);
        emtLoginButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtConsumerMenuButtonXPath, exceptionHandling);
        emtConsumerMenuButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtAdvancedConsumerSearchuttonXPath, exceptionHandling);
        emtAdvancedConsumerSearchutton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtsearchEmailIDXPath, exceptionHandling);
        emtsearchEmailID.click();


        emtsearchEmailID.sendKeys(emailcreated);

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtSearchButtonXPath, exceptionHandling);
        emtSearchButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtDetailButtonXPath, exceptionHandling);
        emtDetailButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtEditProfileButtonXPath, exceptionHandling);
        emtEditProfileButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtcustFirstNameInputXPath, exceptionHandling);

        emtcustLastNameInput.clear();
        emtcustLastNameInput.click();
        emtcustLastNameInput.sendKeys("Reject");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtupdateSubmitButtonXPath, exceptionHandling);
        emtupdateSubmitButton.click();

        driver.switchTo().window(tabs.get(0));
        actionExecutor.waitFiveSeconds();
        driver.navigate().refresh();
        actionExecutor.waitFiveSeconds();

    }
        public void signUpPlusSignEmail(String password, String registrationPhonePrefix, String registrationDateOfBirth, String registrationAddressline, String registrationCity, String registrationPostalCode){
        validatePageIsOpen();
        String emailFirstName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        String emailLastName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        String emailIDGenerated = emailFirstName +"+" +emailLastName + "@maildrop.cc";
        String phonenumber = registrationPhonePrefix +RandomStringUtils.randomNumeric(7);
        Actions actions = new Actions(driver);
        actions
                .click(emailAddressInputBox)
                .sendKeys(emailIDGenerated)
                .click(passwordInputBox)
                .sendKeys(password)
                .click(confirmpasswordInputBox)
                .sendKeys(password)
                .click(phoneNumberInputBox)
                .sendKeys(phonenumber)


                .build()
                .perform();
        actionExecutor.scrollToElementViaDynamicXPath(driver, nextButtonXPath, exceptionHandling);

        nextButton.click();
        actionExecutor.scrollToElementViaDynamicXPath(driver, firstNameInputBoxXPath, exceptionHandling);

        String firstName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());
        String lastName =RandomStringUtils.randomAlphabetic(1).toLowerCase().concat((RandomStringUtils.randomAlphabetic(6)).toLowerCase());

        actions
                .click(firstNameInputBox)
                .sendKeys(firstName)
                .click(lastNameInputBox)
                .sendKeys(lastName)
                .click(dateOfBirthInputBox)
                .sendKeys(registrationDateOfBirth)
                .click(addresslineInputBox)
                .sendKeys(registrationAddressline)
                .click(cityInputBox)
                .sendKeys(registrationCity)
                .click(postalCodeInputBox)
                .sendKeys(registrationPostalCode)

                .build()
                .perform();

        stateInputBox.click();
            actionExecutor.waitFiveSeconds();
        stateOptionBox.click();
        createProfileButton.click();
            actionExecutor.waitFiveSeconds();


    }

    public void EMTLoginandchangeLNReview() {

        WebElement editprofile = driver.findElement(By.xpath("(//a[contains(@class,'mb-none view-link')])[1]"));
        editprofile.click();
        actionExecutor.waitFiveSeconds();
        WebElement emailname = driver.findElement(By.xpath("(//div[contains(@class,'align-items-center')])[6]/div[2]"));
        String emailcreated = emailname.getText();
        System.out.println("Email created is " + emailcreated);
        actionExecutor.waitFiveSeconds();
        editprofile.click();
        actionExecutor.waitFiveSeconds();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        java.util.ArrayList<String> tabs = new java.util.ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

        //WebDriver driver = new ChromeDriver(capability);

        driver.navigate().to("https://q1wsintapps.qacorp.moneygram.com//eMoneyGramAdm//login.do");


        actionExecutor.scrollToElementViaDynamicXPath(driver, emtUserNameXPath, exceptionHandling);
        emtUserName.click();
        emtUserName.sendKeys("q2_manager");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtPasswordXPath, exceptionHandling);
        emtPassword.click();
        emtPassword.sendKeys("Quality123#");

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtLoginButtonXPath, exceptionHandling);
        emtLoginButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtConsumerMenuButtonXPath, exceptionHandling);
        emtConsumerMenuButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtAdvancedConsumerSearchuttonXPath, exceptionHandling);
        emtAdvancedConsumerSearchutton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtsearchEmailIDXPath, exceptionHandling);
        emtsearchEmailID.click();



        emtsearchEmailID.sendKeys(emailcreated);

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSearchButtonXPath, exceptionHandling);
        emtSearchButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtDetailButtonXPath, exceptionHandling);
        emtDetailButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtEditProfileButtonXPath, exceptionHandling);
        emtEditProfileButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcustFirstNameInputXPath, exceptionHandling);

        emtcustLastNameInput.clear();
        emtcustLastNameInput.click();
        emtcustLastNameInput.sendKeys("Review");

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtupdateSubmitButtonXPath, exceptionHandling);
        emtupdateSubmitButton.click();

        driver.switchTo().window(tabs.get(0));
        actionExecutor.waitFiveSeconds();
        driver.navigate().refresh();
        actionExecutor.waitFiveSeconds();




    }
}

