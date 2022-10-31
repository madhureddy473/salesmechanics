package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class ReceiverBubblePage extends BasePageAbstractTemplate {
String firstName ;
String lastName;
    @FindBy(xpath = "//div[@class = 'addReceiverContainer']//h1[contains(text(), 'Tell us about your receiver')]")
    WebElement addReceiverBubblePageHeader;
    String addReceiverBubblePageHeaderXPath = "//div[@class = 'addReceiverContainer']//h1[contains(text(), 'Tell us about your receiver')]";

    @FindBy(xpath = "//label[@for='firstName']//following-sibling::input[@formcontrolname='firstName' and @id='firstName']")
    WebElement firstNameInputBox;
    String firstNameInputBoxXPath = "//label[@for='firstName']//following-sibling::input[@formcontrolname='firstName' and @id='firstName']";

    @FindBy(xpath = "//label[@for='middleName']//following-sibling::input[@formcontrolname='middleName' and @id='middleName']")
    WebElement middleNameInputBox;
    String middleNameInputBoxXPath = "//label[@for='middleName']//following-sibling::input[@formcontrolname='middleName' and @id='middleName']";

    @FindBy(xpath = "//label[@for='lastName']//following-sibling::input[@formcontrolname='lastName' and @id='lastName']")
    WebElement lastNameInputBox;
    String lastNameInputBoxXPath = "//label[@for='lastName']//following-sibling::input[@formcontrolname='lastName' and @id='lastName']";

    @FindBy(xpath = "//label[@for='secondLastName']//following-sibling::input[@formcontrolname='secondLastName' and @id='secondLastName']")
    WebElement secondLastNameInputBox;
    String secondLastNameInputBoxXPath = "//label[@for='secondLastName']//following-sibling::input[@formcontrolname='secondLastName' and @id='secondLastName']";

    @FindBy(xpath = "//label[@for='recCountry']//following-sibling::input[@placeholder='Receiver Country']")
    WebElement recCountryInputBox;
    String recCountryInputBoxXPath = "//label[@for='recCountry']//following-sibling::input[@placeholder='Receiver Country']";

    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'Mexico')]")
    WebElement recCountryOption;
    String recCountryOptionXPath = "//span[@class='mat-option-text' and contains(text(),'Mexico')]";


    @FindBy(xpath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')]")
    WebElement iamDoneButton;
    String iamDoneButtonXPath = "//mg-send-success/div/div[contains(@class,'row button')]/div/div/a[contains(text(),'Done')]";


    @FindBy(xpath = "//label[@for='phoneNumber']//parent::div//following-sibling::div/mat-form-field[contains(@class,'country-code')]")
    WebElement countrycodeInputBox;
    String countrycodeInputBoxXPath = "//label[@for='phoneNumber']//parent::div//following-sibling::div/mat-form-field[contains(@class,'country-code')]";

    @FindBy(xpath = "//label[@for='phoneNumber']//parent::div//following-sibling::div/mat-form-field[contains(@class,'phone-number')]")
    WebElement phonenumberInputBox;
    String phonenumberInputBoxXPath = "//label[@for='phoneNumber']//parent::div//following-sibling::div/mat-form-field[contains(@class,'phone-number')]";

    @FindBy(xpath = "//mat-dialog-content/mg-add-receiver-bubble/div/form/div/button[text()='Save']")
    WebElement saveButton;
    String saveButtonXPath = "//mat-dialog-content/mg-add-receiver-bubble/div/form/div/button[text()='Save']";

    @FindBy(xpath = "//button[@aria-label='Add Receiver']")
    WebElement addReceiverButton;
    String addReceiverButtonXPath = "//button[@aria-label='Add Receiver']";

    @FindBy(xpath = "//cdk-virtual-scroll-viewport/div[@class='cdk-virtual-scroll-content-wrapper']/div[1]")
    WebElement newlyAddedBubbleButton;
    String newlyAddedBubbleButtonXPath = "//cdk-virtual-scroll-viewport/div[@class='cdk-virtual-scroll-content-wrapper']/div[1]";

    @FindBy(xpath = "//div[@class='text-center mg-bubble-receive-view-edit-row']/a[contains(text(),'Edit Receiver')]")
    WebElement editReceiverButton;
    String editReceiverButtonXPath = "//div[@class='text-center mg-bubble-receive-view-edit-row']/a[contains(text(),'Edit Receiver')]";

    @FindBy(xpath = "//button[contains(text(),'Save Receiver')]")
    WebElement saveReceiverButton;
    String saveReceiverButtonXPath = "//button[contains(text(),'Save Receiver')]";

    @FindBy(xpath = "//span[contains(text(),'I Understand')]/parent::button")
    WebElement iUnderstandButton;
    String iUnderstandButtonXPath = "//span[contains(text(),'I Understand')]/parent::button";



    @FindBy(xpath = "//a[contains(text(),'Delete Receiver')]")
    WebElement deleteReceiverButton;
    String deleteReceiverButtonXPath = "//a[contains(text(),'Delete Receiver')]";

    String receiverNameBubbleDynamicXPath = "//cdk-virtual-scroll-viewport/div/div[contains(@aria-label, '%s')]";
    String recCountrySelectOptionXPath = "//span[@class='mat-option-text' and contains(text(),'%s')]";


    public ReceiverBubblePage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
        super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
    }
    public String getReceiverNameBubbleDynamicXPath() {
        return receiverNameBubbleDynamicXPath;
    }
    public WebElement geteditReceiverButtonField() {
        return editReceiverButton;
    }
    public String geteditReceiverButtonXPath() {
        return editReceiverButtonXPath;
    }



    public WebElement getPageValidationElement() {
        return addReceiverBubblePageHeader;
    }
    public String getPageValidationElementXPath() {
        return addReceiverBubblePageHeaderXPath;
    }

    public WebElement getfirstNameInputBoxField() {
        return firstNameInputBox;
    }
    public String getfirstNameInputBoxFieldXPath() {
        return firstNameInputBoxXPath;
    }

    public WebElement getmiddleNameInputBoxField() {
        return middleNameInputBox;
    }
    public String getmiddleNameInputBoxFieldXPath() {
        return middleNameInputBoxXPath;
    }

    public WebElement getlastNameInputBoxField() {
        return lastNameInputBox;
    }
    public String getlastNameInputBoxFieldXPath() {
        return lastNameInputBoxXPath;
    }

    public WebElement getsecondLastNameInputBoxField() {
        return secondLastNameInputBox;
    }
    public String getsecondLastNameInputBoxFieldXPath() {
        return secondLastNameInputBoxXPath;
    }

    public WebElement getcountrycodeInputBoxField() {
        return countrycodeInputBox;
    }
    public String getcountrycodeInputBoxFieldXPath() {
        return countrycodeInputBoxXPath;
    }

    public WebElement getPhoneNumberInputBoxField() {
        return phonenumberInputBox;
    }
    public String getPhoneNumberInputBoxFieldXPath() {
        return phonenumberInputBoxXPath;
    }

    public WebElement getrecCountryOptionField() {
        return recCountryOption;
    }
    public String getrecCountryOptionFieldXPath() {
        return recCountryOptionXPath;
    }




    //validation methods begin
    public void validatePageIsOpen(){
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING TELL US ABOUT YOUR RECEIVER PAGE");
        System.out.println("VALIDATING TELL US ABOUT YOUR RECEIVER PAGE-ADD NEW BUBBLE");
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, addReceiverBubblePageHeaderXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATED TELL US ABOUT YOUR RECEIVER PAGE");
        System.out.println("VALIDATED TELL US ABOUT YOUR RECEIVER PAGE");
    }

    public void validateEditPageIsOpen(){
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATING EDIT BUBBLE PAGE");
        System.out.println("VALIDATING EDIT BUBBLE PAGE-EDIT BUBBLE");
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, editReceiverButtonXPath, 0));
        extentReportGenerator.addInfoMessage(currentTest, "VALIDATED EDIT BUBBLE POPUP");
        System.out.println("VALIDATED EDIT BUBBLE POPUP");
    }

    //validation methods end

    public void addreceiverBubble(String receiverCountry){
        if(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, iamDoneButtonXPath, 1) != null) {

            actionExecutor.scrollToElementViaDynamicXPath(driver, iamDoneButtonXPath, exceptionHandling);
            iamDoneButton.click();
        }
        actionExecutor.scrollToElementViaDynamicXPath(driver, addReceiverButtonXPath, exceptionHandling);

        addReceiverButton.click();
        validatePageIsOpen();
       // Actions actions = new Actions(driver);
         firstName = RandomStringUtils.randomAlphabetic(5).toLowerCase();
         lastName = RandomStringUtils.randomAlphabetic(5).toLowerCase();


       actions
                .click(firstNameInputBox)
                .sendKeys(firstName)

                .click(lastNameInputBox)
                .sendKeys(lastName)

                .click(recCountryInputBox)
                .sendKeys(receiverCountry)
                .build()
                .perform();

        actionExecutor.scrollToElement(driver, saveButton, exceptionHandling);
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, saveButtonXPath, 0));

        String xpathToreceiverCountryNameBubble = String.format(recCountrySelectOptionXPath, receiverCountry);
        driver.findElement(By.xpath(xpathToreceiverCountryNameBubble)).click();


       //recCountryOption.click();
        saveButton.click();
    }

public void verifyBubbleandDelete()
{


    validateEditPageIsOpen();
    editReceiverButton.click();
    deleteReceiverButton.click();
    extentReportGenerator.addInfoMessage(currentTest, "USER DELETED THE RECEIVER BUBBLE");
    System.out.println("USER DELETED THE RECEIVER BUBBLE");
}
    public void verifyBubbleandClickEditandThenDelete()  {

        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, newlyAddedBubbleButtonXPath, 0));
       // driver.manage().timeouts().implicitlyWait(155000, TimeUnit.SECONDS);
     //   actionExecutor.waitFiveSeconds();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String strReceiverName = firstName + ' ' + lastName;
        System.out.println("Click on Newly added Receiver Bubble :" + strReceiverName);
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
       actionExecutor.waitFiveSeconds();

            String xpathToreceiverNameBubble = String.format(receiverNameBubbleDynamicXPath, strReceiverName);
        actionExecutor.waitFiveSeconds();
            driver.findElement(By.xpath(xpathToreceiverNameBubble)).click();

       // actionExecutor.waitFiveSeconds();
        validateEditPageIsOpen();
        actionExecutor.waitFiveSeconds();
        editReceiverButton.click();
        actionExecutor.waitFiveSeconds();
        deleteReceiverButton.click();
        extentReportGenerator.addInfoMessage(currentTest, "USER DELETED THE RECEIVER BUBBLE");
        System.out.println("USER DELETED THE RECEIVER BUBBLE");

    }

    public void verifyBubbleandEdit()  {

        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, newlyAddedBubbleButtonXPath, 0));
       //actionExecutor.waitFiveSeconds();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String strReceiverName = firstName + ' ' + lastName;
        System.out.println("Click on Newly added Receiver Bubble :" + strReceiverName);
       // actionExecutor.waitFiveSeconds();
        String xpathToreceiverNameBubble = String.format(receiverNameBubbleDynamicXPath, strReceiverName);

        driver.findElement(By.xpath(xpathToreceiverNameBubble)).click();
       // newlyAddedBubbleButton.click();
      //  actionExecutor.waitFiveSeconds();
        validateEditPageIsOpen();
        editReceiverButton.click();
        // Actions actions = new Actions(driver);
        String firstName = "edit";
        String lastName = "edit";
       // actionExecutor.waitFiveSeconds();
        actions
                .click(firstNameInputBox)
                .sendKeys(firstName)

                .click(lastNameInputBox)
                .sendKeys(lastName)
            .build()
                .perform();
        //actionExecutor.waitFiveSeconds();
        saveReceiverButton.click();
        actionExecutor.waitFiveSeconds();
        iUnderstandButton.click();
        actionExecutor.waitFiveSeconds();
        extentReportGenerator.addInfoMessage(currentTest, "USER UPDATED THE FIRST NAME AND LAST NAME");
        System.out.println("USER UPDATED THE FIRST NAME AND LAST NAME");
    }

}
