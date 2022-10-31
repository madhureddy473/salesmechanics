package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProfilePage extends BasePageAbstractTemplate {

    @FindBy(xpath = "//div[@class='content-container']//h1[contains(text(),'Personal Information')]")
    WebElement personalInformationProfilePageHeader;
    String personalInformationProfilePageHeaderXPath = "//div[@class='content-container']//h1[contains(text(),'Personal Information')]";

    @FindBy(xpath = "//div[@class='content-container']//h1[contains(text(),'Payment Methods')]")
    WebElement PaymentMethodsHeader;
    String PaymentMethodsHeaderXPath = "//div[@class='content-container']//h1[contains(text(),'Payment Methods')]";

    @FindBy(xpath = "//div[@class='card-info-div info']//h6[contains(text(),'Debit/Credit Card Information')]")
    WebElement DebitCreditCardInformationHeader;
    String DebitCreditCardInformationHeaderXPath = "//div[@class='card-info-div info']//h6[contains(text(),'Debit/Credit Card Information')]";

    @FindBy(xpath = "//mg-add-card//h6[contains(text(),'Add Debit/Credit Card Information')]")
    WebElement AddDebitCreditCardInformationHeader;
    String AddDebitCreditCardInformationHeaderXPath = "//mg-add-card//h6[contains(text(),'Add Debit/Credit Card Information')]";

    @FindBy(xpath = "//button[@class='btn-medium btn-secondary mb-none']")
    WebElement AddNewCardProfilePage;
    String AddNewCardProfilePageXPath = "//button[@class='btn-medium btn-secondary mb-none']";

    @FindBy(xpath = "//a//following-sibling::button[contains(@type,'submit') and contains(text(),'Save Card')] | //div[@class='hide-on-mobile desktop-buttons']//button[contains(@type,'submit') and contains(@id,'saveCard')]")
    WebElement SaveCardProfilePage;
    String SaveCardProfilePageXPath = "//a//following-sibling::button[contains(@type,'submit') and contains(text(),'Save Card')] | //div[@class='hide-on-mobile desktop-buttons']//button[contains(@type,'submit') and contains(@id,'saveCard')]";


    @FindBy(xpath = "//button[contains(@id,'btn-logout')]")
    WebElement DeleteCardProfilePage;
    String DeleteCardProfilePageXPath = "//button[contains(@id,'btn-logout')]";

    @FindBy(xpath = "//input[contains(@formcontrolname,'cardNumber') and contains(@id,'cardNumber')]")
    WebElement CardNumberProfilePage;
    String CardNumberProfilePageXPath = "//input[contains(@formcontrolname,'cardNumber') and contains(@id,'cardNumber')]";

    @FindBy(xpath = "//input[contains(@formcontrolname,'expiry') and contains(@id,'expiry')]")
    WebElement ExpDateProfilePage;
    String ExpDateProfilePageXPath = "//input[contains(@formcontrolname,'expiry') and contains(@id,'expiry')]";

    @FindBy(xpath = "//input[contains(@formcontrolname,'cvv') and contains(@id,'cvv')]")
    WebElement CVVProfilePage;
    String CVVProfilePageXPath = "//input[contains(@formcontrolname,'cvv') and contains(@id,'cvv')]";

    @FindBy(xpath = "//div[@class='save-container']//a[contains(text(),'Cancel')]")
    WebElement CancelProfilePage;
    String CancelProfilePageXPath = "//div[@class='save-container']//a[contains(text(),'Cancel')]";

    @FindBy(xpath = "//mgo-credit-card/div/div/a[contains(text(),'Edit')]")
    WebElement EditCardProfilePage;
    String EditCardProfilePageXPath = "//mgo-credit-card/div/div/a[contains(text(),'Edit')]";

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    WebElement DeleteLinkProfilePage;
    String DeleteLinkProfilePageXPath = "//a[contains(text(),'Delete')]";


    @FindBy(xpath = "//a[contains(text(),'keep it') and contains(@id,'btn-stay')]")
    WebElement KeepItProfilePage;
    String KeepItProfilePageXPath = "//a[contains(text(),'keep it') and contains(@id,'btn-stay')]";


    public ProfilePage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
        super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
    }

    public WebElement getPageValidationElement() {
        return personalInformationProfilePageHeader;
    }

    public String getPageValidationElementXPath() {
        return personalInformationProfilePageHeaderXPath;
    }

    public WebElement PaymentMethodsHeader() {
        return PaymentMethodsHeader;
    }

    public String PaymentMethodsHeaderXPath() {
        return PaymentMethodsHeaderXPath;
    }

    public WebElement getDebitCreditCardInformationHeader() {
        return DebitCreditCardInformationHeader;
    }

    public String getDebitCreditCardInformationHeaderXPath() {
        return DebitCreditCardInformationHeaderXPath;
    }

    public WebElement getAddDebitCreditCardInformationHeader() {
        return AddDebitCreditCardInformationHeader;
    }

    public String getAddDebitCreditCardInformationHeaderXPath() {
        return AddDebitCreditCardInformationHeaderXPath;
    }

    public WebElement getAddNewCardProfilePage() {
        return AddNewCardProfilePage;
    }

    public String getAddNewCardProfilePageXPath() {
        return AddNewCardProfilePageXPath;
    }

    public WebElement getSaveCardProfilePage() {
        return SaveCardProfilePage;
    }

    public String getSaveCardProfilePageXPath() {
        return SaveCardProfilePageXPath;
    }

    public WebElement getDeleteCardProfilePage() {
        return DeleteCardProfilePage;
    }

    public String getDeleteCardProfilePageXPath() {
        return DeleteCardProfilePageXPath;
    }

    public WebElement getCardNumberProfilePage() {
        return CardNumberProfilePage;
    }

    public String getCardNumberProfilePageXPath() {
        return CardNumberProfilePageXPath;
    }

    public WebElement getExpDateProfilePage() {
        return ExpDateProfilePage;
    }

    public String getExpDateProfilePageXPath() {
        return ExpDateProfilePageXPath;
    }

    public WebElement getCVVProfilePage() {
        return CVVProfilePage;
    }

    public String getCVVXPath() {
        return CVVProfilePageXPath;
    }

    public WebElement getCancelProfilePage() {
        return CancelProfilePage;
    }

    public String getCancelProfilePageXPath() {
        return CancelProfilePageXPath;
    }

    public WebElement getEditCardProfilePage() {
        return EditCardProfilePage;
    }

    public String getEditCardXPath() {
        return EditCardProfilePageXPath;
    }

    public WebElement getKeepItProfilePage() {
        return KeepItProfilePage;
    }

    public String getKeepItProfilePageXPath() {
        return KeepItProfilePageXPath;
    }

    public WebElement getDeleteLinkProfilePage() {
        return DeleteLinkProfilePage;
    }

    public String getDeleteLinkProfilePageXPath() {
        return DeleteLinkProfilePageXPath;
    }

    //validation methods begin
    public void validatePageIsOpen() {
        extentReportGenerator.addInfoMessage(currentTest, "Validating the Profile Page");
        System.out.println("Validating the Profile Page");
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, personalInformationProfilePageHeaderXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "Validated the Profile Page");
        System.out.println("Validated the Profile Page");

    }
    //validation methods begin

    //flows related to this page begin
    public void addNewCard(String creditCardNumber, String expiryMonth, String expiryYear, String cvv) {
        validatePageIsOpen();
        actionExecutor.scrollToElement(driver, AddNewCardProfilePage, exceptionHandling);
        AddNewCardProfilePage.click();
        actionExecutor.scrollToElement(driver, CardNumberProfilePage, exceptionHandling);
        actions
                .click(CardNumberProfilePage)
                .sendKeys(creditCardNumber)
                .click(ExpDateProfilePage)
                .sendKeys(expiryMonth + "/" + expiryYear)
                .click(CVVProfilePage)
                .sendKeys(cvv)
                //.click(SaveCardProfilePage)

                .build()
                .perform();
        actionExecutor.scrollToElement(driver, SaveCardProfilePage, exceptionHandling);
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, SaveCardProfilePageXPath, 0));
        SaveCardProfilePage.click();
    }


        public void editCard(String cvv){
       // actionExecutor.waitFiveSeconds();
            validatePageIsOpen();
            if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, EditCardProfilePageXPath, 1) != null) {

                EditCardProfilePage.click();
            }

            if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, CVVProfilePageXPath, 1) != null) {

                actionExecutor.scrollToElement(driver, CVVProfilePage, exceptionHandling);

                actions

                        .click(CVVProfilePage)
                        .sendKeys(cvv)
                        //.click(SaveCardProfilePage)

                        .build()
                        .perform();
            }
            actionExecutor.scrollToElement(driver, SaveCardProfilePage, exceptionHandling);
            Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, SaveCardProfilePageXPath, 0));
actionExecutor.waitFiveSeconds();
            if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, SaveCardProfilePageXPath, 1) != null) {
                actionExecutor.scrollToElement(driver, SaveCardProfilePage, exceptionHandling);
                SaveCardProfilePage.click();
            }
        }

        public void deleteCard(){
            validatePageIsOpen();
            actionExecutor.waitFiveSeconds();
            actionExecutor.scrollToElement(driver, DeleteLinkProfilePage, exceptionHandling);
            if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, DeleteLinkProfilePageXPath, 1) != null) {
                DeleteLinkProfilePage.click();
            }

            actionExecutor.scrollToElement(driver, DeleteCardProfilePage, exceptionHandling);
           // actionExecutor.waitFiveSeconds();
            actions

                    .click(DeleteCardProfilePage)
                    .build()
                    .perform();


        }



    }

