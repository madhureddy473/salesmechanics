//for use only in step defs. Do not reference this or its objects on page classes

package com.qa.initializeDriversPagesAndUtilsClasses;

import com.aventstack.extentreports.ExtentTest;
import com.qa.pages.*;
import com.qa.pages.emtPage.ConsumerProfilePage;
import com.qa.pages.emtPage.TransactionDetailPage;
import com.qa.pages.feeEstimatorPageSubsidiaries.SendMoneyFraudProtectPage;
import com.qa.pages.feeEstimatorPageSubsidiaries.SendMoneyPaymentInfoPage;
import com.qa.pages.feeEstimatorPageSubsidiaries.SendMoneyReceiverInfoPage;
import com.qa.utilFiles.coreCodeUtilFiles.ExcelReader;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class InitializeDriverPagesAndUtils {
    private WebDriver webDriver;

    private HomePage homePage;
    private LoginPage loginPage;
    private SignupPage signupPage;
    private ContactUsPage contactuspage;
    private FeeEstimatorPage feeEstimatorPage;
    private ProfilePage profilePage;
    private SSPTrackTransferPage sspTrackTransfer;

    private ReceiverBubblePage bubbleAddReceivePage;

    private SendMoneyFraudProtectPage sendMoneyFraudProtectPage;
    private SendMoneyPaymentInfoPage sendMoneyPaymentInfoPage;
    private SendMoneyReceiverInfoPage sendMoneyReceiverInfoPage;

    private AlmostFinishAndConfirmationPage almostFinishAndConfirmationPage;
    private TransactionDetailPage transactionDetailPage;
    private ConsumerProfilePage consumerProfilePage;
    private ExcelReader excelReader;
    //ActionExecutor and ExceptionHandling utilities objects are created and used within classes themselves
    public Scenario scenario;

    //extent report objects
    private ExtentTest currentTestInitDrPgsAndUtils;
    private ExtentReportGenerator extentReportGeneratorInitDrPgsAndUtils;

    //will be using field approach for reporting (reporting objects will be fields and defined in constructors in all below classes)
    public void initializeDriverObject(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void initializeAllPagesAndUtils(ExtentTest currentTest, ExtentReportGenerator extentReportGenerator, Scenario scenario){
        //initializing page object classes
        homePage = new HomePage(webDriver, currentTest, extentReportGenerator, scenario);
        contactuspage = new ContactUsPage(webDriver, currentTest, extentReportGenerator, scenario);
        sspTrackTransfer = new SSPTrackTransferPage(webDriver, currentTest, extentReportGenerator, scenario);
        loginPage = new LoginPage(webDriver, currentTest, extentReportGenerator, scenario);
        signupPage = new  SignupPage(webDriver, currentTest, extentReportGenerator, scenario);
        feeEstimatorPage = new FeeEstimatorPage(webDriver, currentTest, extentReportGenerator, scenario);
        profilePage = new ProfilePage(webDriver,currentTest,extentReportGenerator,scenario);
         sendMoneyFraudProtectPage = new SendMoneyFraudProtectPage(webDriver, currentTest, extentReportGenerator, scenario);
        sendMoneyPaymentInfoPage = new SendMoneyPaymentInfoPage(webDriver, currentTest, extentReportGenerator, scenario);
        sendMoneyReceiverInfoPage = new SendMoneyReceiverInfoPage(webDriver, currentTest, extentReportGenerator, scenario);

        bubbleAddReceivePage = new ReceiverBubblePage(webDriver, currentTest, extentReportGenerator, scenario);
        almostFinishAndConfirmationPage = new AlmostFinishAndConfirmationPage(webDriver, currentTest, extentReportGenerator, scenario);
        transactionDetailPage = new TransactionDetailPage(webDriver, currentTest, extentReportGenerator, scenario);
        consumerProfilePage = new ConsumerProfilePage(webDriver, currentTest, extentReportGenerator, scenario);

        //initializes the excelReader
        excelReader = new ExcelReader(currentTest, extentReportGenerator);

        //utils
        this.scenario = scenario;

        //extent reporting objects
        currentTestInitDrPgsAndUtils = currentTest;
        extentReportGeneratorInitDrPgsAndUtils = extentReportGenerator;
    }
    //getDrivers
    public WebDriver getWebDriver(){
        return webDriver;
    }
    //getPages
    public HomePage getHomePage(){
        return homePage;
    }
    public SSPTrackTransferPage getSSPTrackTransferPage() {return sspTrackTransfer;}
    public SignupPage getsignupPage(){
        return signupPage;
    }
public  ContactUsPage getContactUsPage(){return contactuspage;}
    public LoginPage getLoginPage() {
        return loginPage;
    }
    public ReceiverBubblePage getBubbleAddReceivePage() {
        return bubbleAddReceivePage;
    }

    public FeeEstimatorPage getFeeEstimatorPage() {
        return feeEstimatorPage;
    }
    public ProfilePage getProfilePage(){ return profilePage; }


    public SendMoneyFraudProtectPage getSendMoneyFraudProtectPage() {
        return sendMoneyFraudProtectPage;
    }
    public SendMoneyPaymentInfoPage getSendMoneyPaymentInfoPage() {
        return sendMoneyPaymentInfoPage;
    }
    public SendMoneyReceiverInfoPage getSendMoneyReceiverInfoPage() {
        return sendMoneyReceiverInfoPage;
    }
    public AlmostFinishAndConfirmationPage getAlmostFinishAndConfirmationPage() {
        return almostFinishAndConfirmationPage;
    }

    public TransactionDetailPage getTransactionDetailPage() { return transactionDetailPage; }
    public ConsumerProfilePage getConsumerProfilePage() { return consumerProfilePage; }



    //getUtilities
    public ExcelReader getExcelReader() {
        return excelReader;
    }
    public Scenario getScenario(){return scenario;}
    //getExtentReportObjects
    public ExtentTest getCurrentTestInitDrPgsAndUtils() {
        return currentTestInitDrPgsAndUtils;
    }
    public ExtentReportGenerator getExtentReportGeneratorInitDrPgsAndUtils() {
        return extentReportGeneratorInitDrPgsAndUtils;
    }
}
