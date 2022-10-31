package com.qa.pages.emtPage;

import com.aventstack.extentreports.ExtentTest;
import com.qa.pages.BasePageAbstractTemplate;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TransactionDetailPage extends BasePageAbstractTemplate {

    GetPropertiesFromSysOrConfig s = new GetPropertiesFromSysOrConfig();

    public TransactionDetailPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
        super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
    }


    public void NavigateToEMT()
    {
        actionExecutor.waitFiveSeconds();
        extentReportGenerator.addWarningMessage(currentTest, "Navigate to EMT Admin Portal.");
        System.out.println("Navigate to EMT Admin Portal.");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        java.util.ArrayList<String> tabs = new java.util.ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

        //WebDriver driver = new ChromeDriver(capability);
        String EMTurl = s.getPropertyFromSysOrConfig("EMTApplicationURL");
        driver.navigate().to(EMTurl);

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtUserNameXPath, exceptionHandling);
        emtUserName.click();
        emtUserName.sendKeys(s.getPropertyFromSysOrConfig("EMT_UserName"));

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtPasswordXPath, exceptionHandling);
        emtPassword.click();
        emtPassword.sendKeys(s.getPropertyFromSysOrConfig("EMT_Password"));

        actionExecutor.scrollToElementViaDynamicXPath(driver, emtLoginButtonXPath, exceptionHandling);
        emtLoginButton.click();
        extentReportGenerator.addWarningMessage(currentTest, "Click on EMT Login Button.");
        System.out.println("Click on EMT Login Button.");
    }

    public void verifyEMTfields(String TranID, String TranType, String StatusNo){

        NavigateToEMT();
        extentReportGenerator.addWarningMessage(currentTest, "ENTER TRAN ID AND CLICK GO BUTTON.");
        System.out.println("ENTER TRAN ID AND CLICK GO BUTTON.");
        emtTranIDInput.sendKeys(TranID);
        emtsubmitButton.click();
        String status = emtStatus.getText();
        String MGSEND = emtMGSEND.getText();

        System.out.println("GET THE STATUS.: " + status);
        System.out.println("GET THE MGSEND.: " + MGSEND);
        Assert.assertEquals( status, "SEN");
        Assert.assertEquals( MGSEND, "MGSEND (MoneyGram Send)");
    }

    public void cancelTransaction(String TranID, String TranType, String StatusNo){

        NavigateToEMT();
        emtTranIDInput.sendKeys(TranID);
        emtsubmitButton.click();
        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, emtTakeOwnershipXPath, 1) != null) {
            extentReportGenerator.addWarningMessage(currentTest, "Click on Take Owner ship Button.");
            System.out.println("Click on Take Owner ship Button.");
            emtTakeOwnership.click();
        }
        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, emtsubmitCancelTransactionXPath, 1) != null) {
            extentReportGenerator.addWarningMessage(currentTest, "Click on Cancel Transaction Button.");
            System.out.println("Click on Cancel Transaction Button.");
            emtsubmitCancelTransaction.click();
        }
        if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, emtRecordButtonXPath, 1) != null) {
            extentReportGenerator.addWarningMessage(currentTest, "Click on Record Button.");
            System.out.println("Click on Record Button.");
            emtRecordButton.click();
        }
        String status = emtStatus.getText();
        String MGSEND = emtMGSEND.getText();
        System.out.println("Get the Updated Status.:" + status);
        Assert.assertEquals( status, "CXL");
    }

    public void emtProfileSearch(String refNum , String emailID ){

        NavigateToEMT();

        extentReportGenerator.addWarningMessage(currentTest, "Navigate to Consumer Page.");
        System.out.println("Navigate to Consumer Page.");
        actionExecutor.scrollToElementViaDynamicXPath(driver,emtConsumerMenuButtonXPath, exceptionHandling);
        emtConsumerMenuButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtAdvancedConsumerSearchuttonXPath, exceptionHandling);
        emtAdvancedConsumerSearchutton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtsearchEmailIDXPath, exceptionHandling);
        emtsearchEmailID.click();
        emtsearchEmailID.sendKeys(emailID);

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSearchButtonXPath, exceptionHandling);
        emtSearchButton.click();

		/*
		emtTranIDInput.sendKeys(TranID);
		emtsubmitButton.click();

		emtsubmitCancelTransaction.click();
		emtRecordButton.click();
		String status = emtStatus.getText();
		String MGSEND = emtMGSEND.getText();

		Assert.assertEquals( status, "CXL");
	*/
    }

    public void emtAdminProfileSearch(){

        NavigateToEMT();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtUserAdminMenuButtonXPath, exceptionHandling);
        emtUserAdminMenuButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSearchUserButtonXPath, exceptionHandling);
        emtSearchUserButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtUserIdInputXPath, exceptionHandling);
        emtUserIdInput.click();
        emtUserIdInput.sendKeys("cvg7");

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSearchButtonXPath, exceptionHandling);
        emtSearchButton.click();

        String adminUserName = emtAdminUsername.getText();
        Assert.assertEquals( adminUserName, "CVG7");

    }

    public void emtReportAdhocSearch(String RefNumber , String trnid){

        NavigateToEMT();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtAdhocMenuButtonXPath, exceptionHandling);
        emtAdhocMenuButton.click();

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSAdhocButtonXPath, exceptionHandling);
        emtSAdhocButton.click();

        emtreferenceNumberInput.sendKeys(RefNumber);

        //actionExecutor.scrollToElementViaDynamicXPath(driver,emtNoDateRadioXPath, exceptionHandling);
        //emtNoDateRadio.click();
        actionExecutor.scrollToElementViaDynamicXPath(driver,emtSearchButtonXPath, exceptionHandling);
        emtSearchButton.click();

        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, emttransactionDetailTextXPath, 1) != null) {
            String resulttranID = emttransactionDetailText.getText();
            Assert.assertEquals(resulttranID, trnid);
        }

    }
    @FindBy(xpath = "//div[@class='content-container']//h1")
    WebElement pageTitle;
    String pageTitleXPath = "//div[@class='content-container']//h1";

    @FindBy(xpath = "//*[@class='error']/ancestor::td[1]/h3[contains(text(), 'Transaction Detail')]")
    WebElement TransactionDetailHeader;
    String TransactionDetailHeaderXPath = "//*[@class='error']/ancestor::td[1]/h3[contains(text(), 'Transaction Detail')]";


    public WebElement getPageValidationElement() {
        return pageTitle;
    }
    public String getPageValidationElementXPath() {
        return pageTitleXPath;
    }

    public void validatePageIsOpen() {
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING SEND MONEY FRAUD PROTECTION PAGE");
        System.out.println("VALIDATING EMT ADMIN TRANSACTION PAGE");
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, TransactionDetailHeaderXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATED SEND MONEY FRAUD PROTECTION PAGE");
        System.out.println("VALIDATED EMT ADMIN TRANSACTION PAGE");
    }


    @FindBy(xpath = "//input[@name='userID']")
    WebElement emtUserName;
    String emtUserNameXPath = "//input[@name='userID']";

    @FindBy(xpath = "//input[@name='userPassword']")
    WebElement emtPassword;
    String emtPasswordXPath = "//input[@name='userPassword']";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[contains(text(), 'Transaction Type')]/ancestor::td[1]/following-sibling::td")
    WebElement transactionType;
    String transactionTypeXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[contains(text(), 'Transaction Type')]/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Status:']/ancestor::td[1]/following-sibling::td")
    WebElement status;
    String statusXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Status:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Funding Status:']/ancestor::td[1]/following-sibling::td")
    WebElement fundingStatus;
    String fundingStatusXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Funding Status:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Legacy Reference Number:']/ancestor::td[1]/following-sibling::td")
    WebElement legacyReferenceNumber;
    String legacyReferenceNumberXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Legacy Reference Number:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Send Amount:']/ancestor::td[1]/following-sibling::td")
    WebElement sendAmount;
    String sendAmountXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Send Amount:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Send Fee:']/ancestor::td[1]/following-sibling::td")
    WebElement sendFee;
    String sendFeeXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Send Fee:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Total Amount:']/ancestor::td[1]/following-sibling::td")
    WebElement totalAmount;
    String totalAmountXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Total Amount:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Send Currency:']/ancestor::td[1]/following-sibling::td")
    WebElement sendCurrency;
    String sendCurrencyXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Send Currency:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Exchange Rate:']/ancestor::td[1]/following-sibling::td")
    WebElement exchangeRate;
    String exchangeRateXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Exchange Rate:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Receive Country:']/ancestor::td[1]/following-sibling::td")
    WebElement receiveCountry;
    String receiveCountryXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Receive Country:']/ancestor::td[1]/following-sibling::td";

    @FindBy(xpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Receive Currency:']/ancestor::td[1]/following-sibling::td")
    WebElement receiveCurrency;
    String receiveCurrencyXpath = "//*[@class='TD-LABEL-SMALL-TRANDETAIL']/b[text()='Receive Currency:']/ancestor::td[1]/following-sibling::td";


    @FindBy(xpath = "//select[@name='custStatus']")
    WebElement emtcustStatusInput;
    String emtcustStatusInputXPath = "//select[@name='custStatus']";

    @FindBy(xpath = "//textarea[@name='commentText']")
    WebElement emtcommentTextInput;
    String emtcommentTextInputXPath = "//textarea[@name='commentText']";


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


    @FindBy(xpath = "//a[text()='Detail']")
    WebElement emtDetailButton;
    String emtDetailButtonXPath = "//a[text()='Detail']";

    @FindBy(xpath = "//select[@name='custStatus']/option[contains(@value,'ACT:L08')]")
    WebElement emtcustStatusOptionInput;
    String emtcustStatusOptionInputXPath = "//select[@name='custStatus']/option[contains(@value,'ACT:L08')]";


    @FindBy(xpath = "//input[@name='currentCustStatus']/following-sibling::input[@value='Update Status']")
    WebElement emtcurrentCustStatusButton;
    String emtcurrentCustStatusButtonXPath = "//input[@name='currentCustStatus']/following-sibling::input[@value='Update Status']";

    @FindBy(xpath = "//input[@value='Add Comment']")
    WebElement emtAddCommentButton;
    String emtAddCommentButtonXPath = "//input[@value='Add Comment']";



    @FindBy(xpath = "//*[@id = 'oCMenu_top4']")
    WebElement emtConsumerMenuButton;
    String emtConsumerMenuButtonXPath = "//*[@id = 'oCMenu_top4']";

    @FindBy(xpath = "//div[text()='Advanced Consumer Search']")
    WebElement emtAdvancedConsumerSearchutton;
    String emtAdvancedConsumerSearchuttonXPath = "//div[text()='Advanced Consumer Search']";

    @FindBy(xpath = "//*[@id = 'oCMenu_top2']")
    WebElement emtUserAdminMenuButton;
    String emtUserAdminMenuButtonXPath = "//*[@id = 'oCMenu_top2']";

    @FindBy(xpath = "//div[text()='Search User']")
    WebElement emtSearchUserButton;
    String emtSearchUserButtonXPath = "//div[text()='Search User']";


    @FindBy(xpath = "//*[@id = 'oCMenu_top1']")
    WebElement emtAdhocMenuButton;
    String emtAdhocMenuButtonXPath = "//*[@id = 'oCMenu_top1']";

    @FindBy(xpath = "//div[text()='Ad-hoc']")
    WebElement emtSAdhocButton;
    String emtSAdhocButtonXPath = "//div[text()='Ad-hoc']";

    @FindBy(xpath = "//input[@name='referenceNumber']")
    WebElement emtreferenceNumberInput;
    String emtreferenceNumberInputXPath = "//input[@name='referenceNumber']";

    public void verifyEMTFields(HashMap<String, String> tranData){

        NavigateToEMT();
        extentReportGenerator.addWarningMessage(currentTest, "ENTER TRAN ID AND CLICK GO BUTTON.");
        actionExecutor.waitFiveSeconds();
        actionExecutor.scrollToElementViaDynamicXPath(driver, emtTranIDInputXPath, exceptionHandling);
        emtTranIDInput.sendKeys(tranData.get("EMG_TRAN_ID"));
        actionExecutor.scrollToElementViaDynamicXPath(driver, emtsubmitButtonXPath, exceptionHandling);
        emtsubmitButton.click();

        actionExecutor.waitFiveSeconds();
        actionExecutor.scrollToElementViaDynamicXPath(driver, transactionTypeXpath, exceptionHandling);
        Assert.assertTrue(transactionType.getText().contains(tranData.get("EMG_TRAN_TYPE_CODE")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, transactionTypeXpath, exceptionHandling);
        Assert.assertTrue(transactionType.getText().contains(tranData.get("EMG_TRAN_TYPE_CODE")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, statusXpath, exceptionHandling);
        Assert.assertTrue(status.getText().contains(tranData.get("TRAN_STAT_CODE")));

        actionExecutor.waitFiveSeconds();
        actionExecutor.scrollToElementViaDynamicXPath(driver, fundingStatusXpath, exceptionHandling);
        Assert.assertTrue(fundingStatus.getText().contains(tranData.get("TRAN_SUB_STAT_CODE")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, legacyReferenceNumberXpath, exceptionHandling);
        Assert.assertTrue(legacyReferenceNumber.getText().contains(tranData.get("LGCY_REF_NBR")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, sendAmountXpath, exceptionHandling);
        Assert.assertTrue(sendAmount.getText().contains(tranData.get("SND_ISO_CRNCY_ID")));
        Assert.assertTrue(sendAmount.getText().contains(tranData.get("SND_FACE_AMT")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, sendFeeXpath, exceptionHandling);
        Assert.assertTrue(sendFee.getText().contains(tranData.get("SND_ISO_CRNCY_ID")));
        Assert.assertTrue(sendFee.getText().contains(tranData.get("SND_FEE_AMT")));

        actionExecutor.waitFiveSeconds();
        actionExecutor.scrollToElementViaDynamicXPath(driver, totalAmountXpath, exceptionHandling);
        Assert.assertTrue(totalAmount.getText().contains(tranData.get("SND_ISO_CRNCY_ID")));
        Assert.assertTrue(totalAmount.getText().contains(tranData.get("SND_TOT_AMT")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, sendCurrencyXpath, exceptionHandling);
        Assert.assertTrue(sendCurrency.getText().contains(tranData.get("SND_ISO_CRNCY_ID")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, exchangeRateXpath, exceptionHandling);
        Assert.assertTrue(exchangeRate.getText().contains(tranData.get("SND_FX_CNSMR_RATE")));

        actionExecutor.waitFiveSeconds();
        actionExecutor.scrollToElementViaDynamicXPath(driver, receiveCountryXpath, exceptionHandling);
        Assert.assertTrue(receiveCountry.getText().contains(tranData.get("RCV_ISO_CNTRY_CODE")));

        actionExecutor.scrollToElementViaDynamicXPath(driver, receiveCurrencyXpath, exceptionHandling);
        Assert.assertTrue(receiveCurrency.getText().contains(tranData.get("RCV_ISO_CRNCY_ID")));
        actionExecutor.waitFiveSeconds();


    }











}
