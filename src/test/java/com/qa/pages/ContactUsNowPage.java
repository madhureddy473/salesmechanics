package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import com.qa.utilFiles.coreCodeUtilFiles.GetPropertiesFromSysOrConfig;
import com.qa.utilFiles.coreCodeUtilFiles.restAPICommands.SoapUI1705Integration;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactUsNowPage extends BasePageAbstractTemplate {



    //Help Center Link:
    @FindBy(xpath = "//ul[@class='main-nav']/li[@class='ng-star-inserted']/a[(@href='/mgo/us/en/helpcenter') and contains(text(),'Help Center')]")
    WebElement helpCenter;
    String helpCenterXPath = "//ul[@class='main-nav']/li[@class='ng-star-inserted']/a[(@href='/mgo/us/en/helpcenter') and contains(text(),'Help Center')]";

    //Contact Us link:
    @FindBy(xpath = "//a//div//a[(@href='/mgo/us/en/help/contact') and contains(text(),'Contact')]")
    WebElement contactUsLink;
    String contactUsLinkXPath = "//a//div//a[(@href='/mgo/us/en/help/contact') and contains(text(),'Contact')]";

    //Page Title:
    @FindBy(xpath = "//div[@class='content-container']//h1")
    WebElement pageTitle;
    String pageTitleXPath = "//div[@class='content-container']//h1";

    //Comments Box:
    @FindBy(xpath = "//textarea[@id='textBox' and @formcontrolname='comment']")
    WebElement commentsBox;
    String commentsBoxXPath = "//textarea[@id='textBox' and @formcontrolname='comment']";

    //Legal FirstName Box:
    @FindBy(xpath = "//input[@type='text' and @id='legalFirstName']")
    WebElement legalFirstNameBox;
    String legalFirstNameBoxXPath = "//input[@type='text' and @id='legalFirstName']";

    //Legal LastName Box:
    @FindBy(xpath = "//input[@type='text' and @id='legalLastName']")
    WebElement legalLastNameBox;
    String legalLastNameBoxXPath = "//input[@type='text' and @id='legalLastName']";

    //Email Address:
    @FindBy(xpath = "//input[@type='text' and @id='emailId']")
    WebElement emailAddressBox;
    String emailAddressBoxXPath = "//input[@type='text' and @id='emailId']";


    //Service Type dropdown:
    @FindBy(xpath = "//mat-select[@role='listbox' and @formcontrolname='serviceType']")
    WebElement servicetypedropDown;
    String servicetypedropDownXPath = "//mat-select[@role='listbox' and @formcontrolname='serviceType']";

    //Service Type dropdown-Complaint:
    @FindBy(xpath = "//mat-select[@role='listbox' and @formcontrolname='serviceType']//div/div/span")
    WebElement servicetypedropDownComplaint;
    String servicetypedropDownComplaintXPath = "//mat-select[@role='listbox' and @formcontrolname='serviceType']//div/div/span";


    //Service Type option:
    @FindBy(xpath = "//div[@class='cdk-overlay-pane']//mat-option[@role='option']//span[contains(text(),'Money Transfer')]")
    WebElement servicetypeoption;
    String servicetypeoptionXPath = "//div[@class='cdk-overlay-pane']//mat-option[@role='option']//span[contains(text(),'Money Transfer')]";

    //Service Type option-Bill Pay:
    @FindBy(xpath = "//div[@class='cdk-overlay-pane']//mat-option[@role='option']//span[contains(text(),'Bill Payment')]")
    WebElement servicetypeoptionBillPay;
    String servicetypeoptionBillPayXPath = "//div[@class='cdk-overlay-pane']//mat-option[@role='option']//span[contains(text(),'Bill Payment')]";


    //Send Date:
    @FindBy(xpath = "//div//div//div//input[@formcontrolname='date']")
    WebElement sendDate;
    String sendDateXPath = "//div//div//div//input[@formcontrolname='date']";

    //Send Country dropdown:
    @FindBy(xpath = "//div//mat-select[@role='listbox' and @formcontrolname='sendCountry']")
    WebElement sendcountrydropdown;
    String sendcountrydropdownXPath = "//div//mat-select[@role='listbox' and @formcontrolname='sendCountry']";


    //Send Country dropdown Option:
    @FindBy(xpath = "//mat-option//span[contains(text(),'Albania')]")
    WebElement sendcountrydropdownOption;
    String sendcountrydropdownOptionXPath = "//mat-option//span[contains(text(),'Albania')]";

    //Receive Country dropdown:
    @FindBy(xpath = "//div//mat-select[@role='listbox' and @formcontrolname='receiveCountry']")
    WebElement receivecountrydropdown;
    String receivecountrydropdownXPath = "//div//mat-select[@role='listbox' and @formcontrolname='receiveCountry']";



    //Receive Country dropdown Option:
    @FindBy(xpath = "//mat-option//span[contains(text(),'India')]")
    WebElement receivecountrydropdownOption;
    String receivecountrydropdownOptionXPath = "//mat-option//span[contains(text(),'India')]";

    //Submit Button: //div/button[@type='submit']
    @FindBy(xpath = "//div/button[@type='submit']")
    WebElement submitButton;
    String submitButtonXPath = "//div/button[@type='submit']";

    //Modal text
    @FindBy(xpath = "//div/h3[contains(text(),'Thank you!')]")
    WebElement modalText;
    String modalTextXPath = "//div/h3[contains(text(),'Thank you!')]";

    //Back to Home button: //button[@id='modalConfirm']
    @FindBy(xpath = "//button[@id='modalConfirm']")
    WebElement backtohomeButton;
    String backtohomeButtonXPath = "//button[@id='modalConfirm']";



    //Complaint Radio Button:
    @FindBy(xpath = "//input[@type='radio' and @value='complaint']//parent::div")
    WebElement complaintradioButton;
    String complaintradioButtonXPath = "//input[@type='radio' and @value='complaint']//parent::div";



    //Report Fraud Radio Button:
    @FindBy(xpath = "//input[@type='radio' and @value='fraud_report']//parent::div")
    WebElement reportfraudradioButton;
    String reportfraudradioButtonXPath = "//input[@type='radio' and @value='fraud_report']//parent::div";


    //Transaction Reference Input:
    @FindBy(xpath = "//input[@id='trnRefNum' and @type='text']")
    WebElement txnrefInput;
    String txnrefInputXPath = "//input[@id='trnRefNum' and @type='text']";


    //Sender FirstName:
    @FindBy(xpath = "//input[@id='senderFirstName' and @type='text']")
    WebElement senderFN;
    String senderFNXPath = "//input[@id='senderFirstName' and @type='text']";


    //Sender LastName:
    @FindBy(xpath = "//input[@id='senderLastName' and @type='text']")
    WebElement senderLN;
    String senderLNXPath = "//input[@id='senderLastName' and @type='text']";


    //Payment Date:
    @FindBy(xpath = "//label[contains(text(),'PAYMENT DATE')]//following-sibling::input[@formcontrolname='date']")
    WebElement paymentDate;
    String paymentDateXPath = "//label[contains(text(),'PAYMENT DATE')]//following-sibling::input[@formcontrolname='date']";



    //Fraud Reporting Dropdown:
    @FindBy(xpath = "//mat-select[@formcontrolname='whoIsReporting' and @role='listbox']")
    WebElement fraudreportingdropDown;
    String fraudreportingdropDownXPath = "//mat-select[@formcontrolname='whoIsReporting' and @role='listbox']";



    //Fraud Reporting Option:
    @FindBy(xpath = "//div[@class='cdk-overlay-pane']//mat-option[@role='option']//span[contains(text(),'3rd Party on Behalf of Sender')]")
    WebElement fraudreportingOption;
    String fraudreportingOptionXPath = "//div[@class='cdk-overlay-pane']//mat-option[@role='option']//span[contains(text(),'3rd Party on Behalf of Sender')]";





    public ContactUsNowPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
        super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
    }

    public WebElement getPageValidationElement() {
        return pageTitle;
    }
    public String getPageValidationElementXPath() {
        return pageTitleXPath;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    public String getContactUsLinkXPath() {
        return contactUsLinkXPath;
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public String getPageTitleXPath() {
        return pageTitleXPath;
    }

    public WebElement getCommentsBox() {
        return commentsBox;
    }

    public String getCommentsBoxXPath() {
        return commentsBoxXPath;
    }

    public WebElement getLegalFirstNameBox() {
        return legalFirstNameBox;
    }

    public String getLegalFirstNameBoxXPath() {
        return legalFirstNameBoxXPath;
    }

    public WebElement getLegalLastNameBox() {
        return legalLastNameBox;
    }

    public String getLegalLastNameBoxXPath() {
        return legalLastNameBoxXPath;
    }

    public WebElement getEmailAddressBox() {
        return emailAddressBox;
    }

    public String getEmailAddressBoxXPath() {
        return emailAddressBoxXPath;
    }

    public WebElement getServicetypedropDown() {
        return servicetypedropDown;
    }

    public String getServicetypedropDownXPath() {
        return servicetypedropDownXPath;
    }

    public WebElement getServicetypeoption() {
        return servicetypeoption;
    }

    public String getServicetypeoptionXPath() {
        return servicetypeoptionXPath;
    }

    public WebElement getSendDate() {
        return sendDate;
    }

    public String getSendDateXPath() {
        return sendDateXPath;
    }

    public WebElement getSendcountrydropdown() {
        return sendcountrydropdown;
    }

    public String getSendcountrydropdownXPath() {
        return sendcountrydropdownXPath;
    }

    public WebElement getReceivecountrydropdown() {
        return receivecountrydropdown;
    }

    public String getReceivecountrydropdownXPath() {
        return receivecountrydropdownXPath;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public String getSubmitButtonXPath() {
        return submitButtonXPath;
    }

    public WebElement getModalText() {
        return modalText;
    }

    public String getModalTextXPath() {
        return modalTextXPath;
    }

    public WebElement getBacktohomeButton() {
        return backtohomeButton;
    }

    public String getBacktohomeButtonXPath() {
        return backtohomeButtonXPath;
    }

    public WebElement getHelpCenter() {
        return helpCenter;
    }

    public String getHelpCenterXPath() {
        return helpCenterXPath;
    }
    public WebElement getSendcountrydropdownOption() {
        return sendcountrydropdownOption;
    }

    public String getSendcountrydropdownOptionXPath() {
        return sendcountrydropdownOptionXPath;
    }

    public WebElement getReceivecountrydropdownOption() {
        return receivecountrydropdownOption;
    }

    public String getReceivecountrydropdownOptionXPath() {
        return receivecountrydropdownOptionXPath;
    }

    public WebElement getComplaintradioButton() {
        return complaintradioButton;
    }

    public String getComplaintradioButtonXPath() {
        return complaintradioButtonXPath;
    }

    public WebElement getReportfraudradioButton() {
        return reportfraudradioButton;
    }

    public String getReportfraudradioButtonXPath() {
        return reportfraudradioButtonXPath;
    }
    public WebElement getServicetypeoptionBillPay() {
        return servicetypeoptionBillPay;
    }

    public String getServicetypeoptionBillPayXPath() {
        return servicetypeoptionBillPayXPath;
    }

    public WebElement getTxnrefInput() {
        return txnrefInput;
    }

    public String getTxnrefInputXPath() {
        return txnrefInputXPath;
    }

    public WebElement getSenderFN() {
        return senderFN;
    }

    public String getSenderFNXPath() {
        return senderFNXPath;
    }

    public WebElement getSenderLN() {
        return senderLN;
    }

    public String getSenderLNXPath() {
        return senderLNXPath;
    }

    public WebElement getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentDateXPath() {
        return paymentDateXPath;
    }

    public WebElement getFraudreportingdropDown() {
        return fraudreportingdropDown;
    }

    public String getFraudreportingdropDownXPath() {
        return fraudreportingdropDownXPath;
    }

    public WebElement getFraudreportingOption() {
        return fraudreportingOption;
    }

    public String getFraudreportingOptionXPath() {
        return fraudreportingOptionXPath;
    }



    public void validatePageIsOpen() {

        helpCenter.click();

        actionExecutor.scrollToElement(driver, contactUsLink, exceptionHandling);
        contactUsLink.click();

        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", helpCenter);

        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING CONTACT US PAGE");
        System.out.println("VALIDATING CONTACT US PAGE");
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, pageTitleXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATED CONTACT US PAGE");
        System.out.println("VALIDATED CONTACT US PAGE");
    }

    public void feedbackform(String legalFirstName, String legalLastName, String emailAddress, String serviceType, String sendDt, String sendCountry, String receiveCountry){

        actionExecutor.scrollToElement(driver,commentsBox,exceptionHandling);
        commentsBox.click();
        commentsBox.sendKeys("This is a Feedback");

        actionExecutor.scrollToElement(driver,legalFirstNameBox,exceptionHandling);
        legalFirstNameBox.click();
        legalFirstNameBox.sendKeys(legalFirstName);
        legalLastNameBox.click();
        legalLastNameBox.sendKeys(legalLastName);
        emailAddressBox.click();
        emailAddressBox.sendKeys(emailAddress);

        actionExecutor.scrollToElement(driver,servicetypedropDown,exceptionHandling);
        servicetypedropDown.click();
        actionExecutor.scrollToElement(driver,servicetypeoption,exceptionHandling);
        servicetypeoption.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver,sendDateXPath,exceptionHandling);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", sendDate);
        //sendDate.click();
        sendDate.sendKeys(sendDt);


        actionExecutor.scrollToElement(driver,sendcountrydropdown,exceptionHandling);

        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();", sendcountrydropdown);
        //sendcountrydropdown.click();

        sendcountrydropdownOption.click();
        //sendcountrydropdown.sendKeys(sendCountry);

        actionExecutor.scrollToElement(driver,receivecountrydropdown,exceptionHandling);
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", receivecountrydropdown);

        receivecountrydropdownOption.click();
        //receivecountrydropdown.click();
        //receivecountrydropdown.sendKeys(receiveCountry);

        actionExecutor.scrollToElement(driver,submitButton,exceptionHandling);
        JavascriptExecutor executor3 = (JavascriptExecutor)driver;
        executor3.executeScript("arguments[0].click();", submitButton);
        //submitButton.click();
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,modalTextXPath,0));
        extentReportGenerator.addInfoMessage(currentTest,"VALIDATED THE MODAL");
        System.out.println("VALIDATED THE MODAL");
        backtohomeButton.click();
    }

    public void complaint_form(String legalFirstName, String legalLastName, String emailAddress, String serviceType, String sendDt, String sendCountry, String receiveCountry){
        actionExecutor.scrollToElementViaDynamicXPath(driver,complaintradioButtonXPath,exceptionHandling);
        complaintradioButton.click();

        actionExecutor.scrollToElement(driver,commentsBox,exceptionHandling);
        commentsBox.click();
        commentsBox.sendKeys("This is a Complaint");
        actionExecutor.scrollToElement(driver,legalFirstNameBox,exceptionHandling);
        legalFirstNameBox.click();
        legalFirstNameBox.sendKeys(legalFirstName);
        legalLastNameBox.click();
        legalLastNameBox.sendKeys(legalLastName);
        emailAddressBox.click();
        emailAddressBox.sendKeys(emailAddress);

        actionExecutor.scrollToElement(driver,servicetypedropDownComplaint,exceptionHandling);
        JavascriptExecutor executor4 = (JavascriptExecutor)driver;
        executor4.executeScript("arguments[0].click();", servicetypedropDownComplaint);
        //servicetypedropDownComplaint.click();

        actionExecutor.scrollToElement(driver,servicetypeoption,exceptionHandling);
        servicetypeoption.click();


        actionExecutor.scrollToElementViaDynamicXPath(driver,sendDateXPath,exceptionHandling);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", sendDate);
        //sendDate.click();
        sendDate.sendKeys(sendDt);

        actionExecutor.scrollToElement(driver,sendcountrydropdown,exceptionHandling);

        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click();", sendcountrydropdown);
        //sendcountrydropdown.click();
        actionExecutor.waitFiveSeconds();
        sendcountrydropdownOption.click();
        //sendcountrydropdown.sendKeys(sendCountry);

        actionExecutor.scrollToElement(driver,receivecountrydropdown,exceptionHandling);
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click();", receivecountrydropdown);

        receivecountrydropdownOption.click();
        //receivecountrydropdown.click();
        //receivecountrydropdown.sendKeys(receiveCountry);

        actionExecutor.scrollToElement(driver,submitButton,exceptionHandling);
        JavascriptExecutor executor3 = (JavascriptExecutor)driver;
        executor3.executeScript("arguments[0].click();", submitButton);
        //submitButton.click();
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,modalTextXPath,0));
        extentReportGenerator.addInfoMessage(currentTest,"VALIDATED THE MODAL");
        System.out.println("VALIDATED THE MODAL");
        backtohomeButton.click();

    }

    public void reportfraud(String legalFirstName, String legalLastName, String emailAddress, String serviceType, String paymentDt, String referenceNumber, String senderFirstName, String senderLastName){
        actionExecutor.scrollToElementViaDynamicXPath(driver,reportfraudradioButtonXPath,exceptionHandling);
        reportfraudradioButton.click();
        actionExecutor.scrollToElement(driver,commentsBox,exceptionHandling);
        commentsBox.sendKeys("This is Fraud Reporting");
        legalFirstNameBox.click();
        legalFirstNameBox.sendKeys(legalFirstName);
        legalLastNameBox.click();
        legalLastNameBox.sendKeys(legalLastName);
        emailAddressBox.click();
        emailAddressBox.sendKeys(emailAddress);
        actionExecutor.scrollToElement(driver,fraudreportingdropDown,exceptionHandling);
        JavascriptExecutor executor5 = (JavascriptExecutor)driver;
        executor5.executeScript("arguments[0].click();", fraudreportingdropDown);
        //fraudreportingdropDown.click();

        fraudreportingOption.click();
        actionExecutor.scrollToElement(driver,servicetypedropDown,exceptionHandling);
        servicetypedropDown.click();
        actionExecutor.waitFiveSeconds();
        servicetypeoptionBillPay.click();
        txnrefInput.click();
        txnrefInput.sendKeys(referenceNumber);
        actionExecutor.scrollToElementViaDynamicXPath(driver,senderFNXPath,exceptionHandling);
        JavascriptExecutor executor6 = (JavascriptExecutor)driver;
        executor6.executeScript("arguments[0].click();", senderFN);
        //senderFN.click();
        senderFN.sendKeys(senderFirstName);
        senderLN.click();
        senderLN.sendKeys(senderLastName);
        paymentDate.click();
        paymentDate.sendKeys(paymentDt);
        submitButton.click();
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver,modalTextXPath,0));
        extentReportGenerator.addInfoMessage(currentTest,"VALIDATED THE MODAL");
        System.out.println("VALIDATED THE MODAL");
        backtohomeButton.click();

    }
}







