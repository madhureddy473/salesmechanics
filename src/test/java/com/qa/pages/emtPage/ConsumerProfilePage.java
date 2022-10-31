package com.qa.pages.emtPage;

        import com.aventstack.extentreports.ExtentTest;
        import com.qa.pages.BasePageAbstractTemplate;
        import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
        import io.cucumber.java.Scenario;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.Select;
        import org.testng.Assert;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Locale;

public class ConsumerProfilePage extends BasePageAbstractTemplate {


    public ConsumerProfilePage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario) {
        super(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass, scenario);
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

    @FindBy(xpath = "//textarea[@name='commentText']")
    WebElement emtcommentTextInput;
    String emtcommentTextInputXPath = "//textarea[@name='commentText']";
    @FindBy(xpath = "//input[@value='Add Comment']")
    WebElement emtAddCommentButton;
    String emtAddCommentButtonXPath = "//input[@value='Add Comment']";
    public void emtUpdateCommnets() {

        extentReportGenerator.addWarningMessage(currentTest, "Click on Details Button.");
        System.out.println("Click on Details Button.");
        actionExecutor.scrollToElementViaDynamicXPath(driver,emtDetailButtonXPath, exceptionHandling);
        emtDetailButton.click();

        extentReportGenerator.addWarningMessage(currentTest, "Add comments and Click on Add comments Button.");
        System.out.println("Add comments and Click on Add comments Button.");
        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcommentTextInputXPath, exceptionHandling);
        emtcommentTextInput.sendKeys("test comments");

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtAddCommentButtonXPath, exceptionHandling);
        emtAddCommentButton.click();


    }
    @FindBy(xpath = "//a[text()='Detail']")
    WebElement emtDetailButton;
    String emtDetailButtonXPath = "//a[text()='Detail']";

    @FindBy(xpath = "//select[@name='custStatus']/option[contains(@value,'ACT:L08')]")
    WebElement emtcustStatusOptionInput;
    String emtcustStatusOptionInputXPath = "//select[@name='custStatus']/option[contains(@value,'ACT:L08')]";


    @FindBy(xpath = "//input[@name='currentCustStatus']/following-sibling::input[@value='Update Status']")
    WebElement emtcurrentCustStatusButton;
    String emtcurrentCustStatusButtonXPath = "//input[@name='currentCustStatus']/following-sibling::input[@value='Update Status']";
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
    @FindBy(xpath = "//select[@name='custStatus']")
    WebElement emtcustStatusInput;
    String emtcustStatusInputXPath = "//select[@name='custStatus']";
    public void emtUpdateProfileStatus() {

        actionExecutor.scrollToElementViaDynamicXPath(driver,emtDetailButtonXPath, exceptionHandling);
        extentReportGenerator.addWarningMessage(currentTest, "Click on Details Button.");
        System.out.println("Click on Details Button.");
        emtDetailButton.click();
        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcustStatusInputXPath, exceptionHandling);
        emtcustStatusInput.click();
        extentReportGenerator.addWarningMessage(currentTest, "Select Status.");
        System.out.println("Select Status.");
        emtcustStatusOptionInput.click();
        actionExecutor.scrollToElementViaDynamicXPath(driver,emtcurrentCustStatusButtonXPath, exceptionHandling);
        emtcurrentCustStatusButton.click();
    }

    @FindBy(xpath = "//form[@name='quickSearchForm']/table/tbody/tr[1]/td[1]/b")
    WebElement dateTimeStamp;
    String dateTimeStampXpath = "//form[@name='quickSearchForm']/table/tbody/tr[1]/td[1]/b";
    @FindBy(xpath = "//form[@name='quickSearchForm']/table/tbody/tr[2]/td[1]/b")
    WebElement fullName;
    @FindBy(xpath = "//form//a[(@href='../../welcome.do') and contains(text(),'Home')]")
    WebElement homeLink;
    @FindBy(xpath = "//form//a[contains(@href,'../../showCustomerProfile')]")
    WebElement consumerIdLink;
    @FindBy(xpath = "//form[@name='quickSearchForm']//*[@type='text' and @name='tranId']")
    WebElement transctionIdTxtB;
    @FindBy(xpath = "//form[@name='quickSearchForm']//*[@type='text' and @name='custId']")
    WebElement custIdGUIDTxtB;
    String custIdGUIDTxtBXPath = "//form[@name='quickSearchForm']//*[@type='text' and @name='custId']";
    @FindBy(xpath = "//form[@name='quickSearchForm']//*[@id='goButton']")
    WebElement goBtn;
    @FindBy(xpath = "//form[@name='quickSearchForm']/../following-sibling::td/img")
    WebElement logoMG;

    public void validateMetaData()
    {
        extentReportGenerator.addInfoMessage(currentTest, "MetaData validation Starts");
        Assert.assertNotNull(dateTimeStamp, "DateTime Stamp is not displayed");
        Assert.assertTrue(fullName.getText().contains("Q2_MANAGER"),"Full-Name adn UserId are not displayed");
        Assert.assertTrue(homeLink.isDisplayed(),"Home hyperlink is not displayed");
        Assert.assertTrue(transctionIdTxtB.isDisplayed(),"TransctionId Text Box is not displayed");
        Assert.assertTrue(custIdGUIDTxtB.isDisplayed(),"CustId/GUID Text Box is not displayed");
        Assert.assertTrue(goBtn.isDisplayed(),"go Button is not displayed");
        Assert.assertTrue(logoMG.isDisplayed(), "MoneyGram Logo is not displayed");
        Assert.assertTrue(consumerIdLink.isDisplayed(),"ConsumerId Link is not displayed ");

    }
    @FindBy(xpath = "//*[text()='Profile Type']")
    WebElement profileType;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/../table/tbody/tr[2]/th[4]")
    WebElement loginId;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//th[5][text()='Status']")
    WebElement status1;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//th[6][text()='Sub-Status']")
    WebElement subStatus;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[text()='First Name']")
    WebElement firstName;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[contains(text(),'Last Name')]")
    WebElement lastName_FathersLastName;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[text()='Phone']")
    WebElement phone;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[text()='Consumer Id']")
    WebElement consumerId;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[text()='Consumer Address']")
    WebElement SSNMask;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[text()='Birth Date']")
    WebElement birthDate;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[text()='Create Date']")
    WebElement createDate;
    @FindBy(xpath = "//legend[contains(text(),'Consumer Profile Search')]/..//*[text()='Created IP Address']")
    WebElement CreatedIPAddress;


    public void validateConsumerProfileSearchResults() {

        extentReportGenerator.addInfoMessage(currentTest, "Profile Search Results validation Starts");
        Assert.assertEquals(profileType.getText(), "Profile Type", "Profile Type column name is not as expected");
        Assert.assertEquals(consumerId.getText(), "Consumer Id", "Consumer Id column name is not as expected");

        Assert.assertEquals(status1.getText(), "Status", "Status column name is not as expected");
        Assert.assertEquals(subStatus.getText(), "Sub-Status", "Sub-Status column name is not as expected");
        Assert.assertEquals(firstName.getText(), "First Name", "First Name column name is not as expected");
        Assert.assertEquals(lastName_FathersLastName.getText(), "Last Name/Father's last Name", "Last Name/Father's last Name column name is not as expected");
        Assert.assertEquals(phone.getText(), "Phone", "Phone column name is not as expected");
        Assert.assertEquals(birthDate.getText(), "Birth Date", "Birth Date column name is not as expected");
        Assert.assertEquals(createDate.getText(), "Create Date", "Create Date column name is not as expected");
        Assert.assertEquals(CreatedIPAddress.getText(), "Created IP Address", "Created IP Address column name is not as expected");
        Assert.assertEquals(SSNMask.getText(),"Consumer Address",  "SSN Mask column name is not as expected");
        Assert.assertEquals(loginId.getText(),"Email ID",  "Login Id column name is not as expected");

    }

    public void clickConsumerDetails()
    {
        actionExecutor.scrollToElementViaDynamicXPath(driver,emtDetailButtonXPath, exceptionHandling);
        extentReportGenerator.addWarningMessage(currentTest, "Click on Details Button.");
        System.out.println("Click on Details Button.");
        emtDetailButton.click();

    }

    @FindBy(xpath = "//legend[contains(text(),'Consumer Profiles Found')]/following-sibling::table//tr[3]/td[3]")
    WebElement searchResultPgConsumerID;

    public void getConsumerIDAndSearchProfile()
    {
        String custID = searchResultPgConsumerID.getText();

        actionExecutor.scrollToElementViaDynamicXPath(driver,custIdGUIDTxtBXPath, exceptionHandling);
        custIdGUIDTxtB.click();
        custIdGUIDTxtB.sendKeys(custID);
        goBtn.click();
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Customer Profile"),"User not landed on the CustomerProfile page");

    }

    @FindBy(xpath = "//*[contains(text(),'Good Trans In last 30 days:')]")
    WebElement goodTrans_In30days;
    @FindBy(xpath = "//*[contains(text(),'Tran Count')]")
    WebElement tranCount;
    @FindBy(xpath = "//*[contains(text(),'Total Amount:')]")
    WebElement totalAmount;
    @FindBy(xpath = "//*[contains(text(),'Receiver:')]")
    WebElement receiver;
    @FindBy(xpath = "//*[contains(text(),'Total Tran:')]")
    WebElement totalTran;
    @FindBy(xpath = "//*[contains(text(),'Send:')]")
    WebElement send;
    @FindBy(xpath = "//*[contains(text(),'Funded:')]")
    WebElement funded;
    @FindBy(xpath = "//*[contains(text(),'Average Amount:')]")
    WebElement averageAmount;
    @FindBy(xpath = "//*[contains(text(),'Credit Card Account:')]")
    WebElement creditCardAccount;
    @FindBy(xpath = "//*[contains(text(),'Super Taint')]")
    WebElement superTaintBtn;
    String SuperTaintBtnXpath = "//*[contains(text(),'Super Taint')]";


    public void validateConsumerProfileDashboard()
    {
        extentReportGenerator.addInfoMessage(currentTest, "Consumer Profile validation Starts");
        Assert.assertEquals(goodTrans_In30days.getText(), "Good Trans In last 30 days:", "Good Trans In last 30 days: lable is not displayed");
        Assert.assertEquals(tranCount.getText(), "Tran Count:", "Tran Count lable is not displayed");
        Assert.assertEquals(totalAmount.getText(), "Total Amount:", "Total Amount lable is not displayed");
        Assert.assertEquals(receiver.getText(), "Receiver:", "Receiver lable is not displayed");
        Assert.assertEquals(totalTran.getText(), "Total Tran:", "Total Tran lable is not displayed");
        Assert.assertEquals(send.getText(), "Send:", "Send lable is not displayed");
        Assert.assertEquals(funded.getText(), "Funded:", "Funded lable is not displayed");
        Assert.assertEquals(averageAmount.getText(), "Average Amount:", "Average Amount lable is not displayed");
        Assert.assertEquals(creditCardAccount.getText(), "Credit Card Account:", "Credit Card Account lable is not displayed");
        Assert.assertTrue(superTaintBtn.isDisplayed(),  "Super Taint lable is not displayed");

    }
    @FindBy(xpath = "//form[@id='superTaintForm']/../b")
    WebElement profilePg_ConsumerId;
    @FindBy(xpath = "//fieldset/legend[contains(text(),'Bank Accounts')]/..")
    WebElement bacEmailID;
    @FindBy(xpath = "//legend[contains(text(),'Bank Accounts')]/../b")
    WebElement bacConsuID;
    @FindBy(xpath = "//legend[contains(text(),'Bank Accounts')]/../font/b")
    WebElement bacNone;

    public void validateBankAccountFields(String userName)
    {
        Assert.assertTrue(bacEmailID.getText().contains(userName.toLowerCase()), "emailId is not displayed");
        Assert.assertEquals(bacConsuID.getText(), profilePg_ConsumerId.getText(), "ID not displayed");
        Assert.assertEquals(bacNone.getText(), "(None)", "None is not displayed");
    }

    @FindBy(xpath = "//legend[contains(text(),'Credit Card Accounts')]/..")
    WebElement ccEmailID;
    @FindBy(xpath = "//*[contains(text(),'Credit Card Number')]")
    WebElement creditCardNumber;
    String creditCardNumberXpath = "//*[contains(text(),'Credit Card Number')]";
    @FindBy(xpath = "//*[contains(text(),'Expiration Date')]")
    WebElement expirationDate;
    @FindBy(xpath = "//*[contains(text(),'Card Issuer')]")
    WebElement cardIssuer;
    @FindBy(xpath = "//*[contains(text(),'Card Type')]")
    WebElement cardType;
    @FindBy(xpath = "//*[contains(text(),'Create Date')]")
    WebElement ccCreateDate;
    @FindBy(xpath = "//*[contains(text(),'Status')]")
    WebElement status;
    @FindBy(xpath = "//select[@name='combinedStatusCode']")
    WebElement statusDropdown;
    @FindBy(xpath = "//select[@name='combinedStatusCode']/following-sibling::input")
    WebElement updateStatusBtn;

    @FindBy(xpath = "//form[@name='UpdateAccountStatusForm']/following-sibling::td/a")
    WebElement creditCardNumberValue;

    @FindBy(xpath = "//form[@name='UpdateAccountStatusForm']/../td[2]")
    WebElement expDateValue;
    @FindBy(xpath = "//form[@name='UpdateAccountStatusForm']/../td[3]")
    WebElement cardIssuerValue;
    @FindBy(xpath = "//form[@name='UpdateAccountStatusForm']/../td[4]")
    WebElement cardTypeValue;
    @FindBy(xpath = "//form[@name='UpdateAccountStatusForm']/../td[5]")
    WebElement createDateValue;

    public void validateCreditCardAccountFields(String userName) {
        extentReportGenerator.addInfoMessage(currentTest, "Credit Card accounts Field validation Starts");
        Assert.assertTrue(ccEmailID.getText().contains(userName.toLowerCase()), "emailId is not displayed");
        //Column Name validations
        Assert.assertTrue(creditCardNumber.getText().contains("Credit Card Number"), "Credit Card Number column is not displayed");
        Assert.assertTrue(expirationDate.getText().contains("Expiration Date"), "Expiration Date column is not displayed");
        Assert.assertTrue(cardIssuer.getText().contains("Card Issuer"), "Card Issuer column is not displayed");
        Assert.assertTrue(cardType.getText().contains("Card Type"), "Card Type column is not displayed");
        Assert.assertTrue(ccCreateDate.getText().contains("Create Date"), "Create Date column is not displayed");
        Assert.assertTrue(status.getText().contains("Status"), "Status column is not displayed");
        Assert.assertTrue(statusDropdown.isDisplayed(), "Status dropdown is not displayed");
        Assert.assertTrue(updateStatusBtn.isDisplayed(), "Update Status button is not displayed");
        //values validation
        Assert.assertNotNull(creditCardNumberValue, "Credit card number is not displayed");
        Assert.assertNotNull(expDateValue, "Expiration date is not displayed");
        Assert.assertNotNull(cardIssuerValue, "Card Issuer is not displayed");
        Assert.assertNotNull(cardTypeValue, "Card Type is not displayed");
        Assert.assertNotNull(createDateValue, "Create Date is not displayed");
        //Dropdown options Validation
        List<String> expectedOptions = new ArrayList<>(Arrays.asList("Deleted", "Failure", "Fraud", "Validation Level 0", "Validation Level 0", "Validation Level 1", "Validation Level 2"));
        validateDropdownOptions(statusDropdown, expectedOptions);
            }

    public void validateDropdownOptions(WebElement dropdown,List<String> expectedOptions)
    {
        Select s = new Select(dropdown);
        List<WebElement> options = s.getOptions();
        if(options.size()==expectedOptions.size())
        { System.out.println("There are "+options.size()+" options available in the dropdown");
            for(String expOption:expectedOptions)
            {
                for(WebElement option :options)
                {
                    String DropDnValue = option.getText();
                    if(expOption.equalsIgnoreCase(DropDnValue))
                    { System.out.println(DropDnValue+" option is available in the dropdown");
                        break;
                    }
                }}}

    }

    @FindBy(xpath = "//legend[contains(text(),'Debit Card Accounts')]/..")
    WebElement dcEmailID;
    @FindBy(xpath = "//legend[contains(text(),'Debit Card Accounts')]/../b")
    WebElement dcConsuID;
    @FindBy(xpath = "//legend[contains(text(),'Debit Card Accounts')]/../font/b")
    WebElement dcNone;
    public void validateDeditCardAccountFields(String userName)
    {
        System.out.println("dcEmailID is: "+ dcEmailID.getText());
        Assert.assertTrue(dcEmailID.getText().contains(userName.toLowerCase()), "emailId is not displayed");
        Assert.assertEquals(dcConsuID.getText(), profilePg_ConsumerId.getText(), "ID is not displayed");
        Assert.assertEquals(dcNone.getText(), "(None)", "None is not displayed");
    }

    @FindBy(xpath = "//legend[contains(text(),'Recurring Payments')]/..")
    WebElement recrPmtsEmailID;
    @FindBy(xpath = "//legend[contains(text(),'Recurring Payments')]/../b")
    WebElement recrPmtsConsID;
    @FindBy(xpath = "//legend[contains(text(),'Recurring Payments')]/..//a[contains(text(),'View')]")
    WebElement recrPmtsviewLink;
    public void validateRecurringPayments(String userName)
    {
        extentReportGenerator.addInfoMessage(currentTest, "Recurring Payments Field validation Starts");
        System.out.println("recrPmtsEmailID is: "+ recrPmtsEmailID.getText());
        Assert.assertTrue(recrPmtsEmailID.getText().contains(userName.toLowerCase()), "emailId is not displayed");
        Assert.assertEquals(recrPmtsConsID.getText(), profilePg_ConsumerId.getText(), "ID is not displayed");
        Assert.assertTrue(recrPmtsviewLink.isDisplayed(), "View Link is not displayed");
    }

    @FindBy(xpath = "//legend[contains(text(),'In-Store Transactions')]/..")
    WebElement inStoreTranEmailID;
    @FindBy(xpath = "//legend[contains(text(),'In-Store Transactions')]/../b")
    WebElement inStoreTranConsID;
    @FindBy(xpath = "//legend[contains(text(),'In-Store Transactions')]/..//a[contains(text(),'View')]")
    WebElement inStoreTranviewLink;
    public void validateInStoreTransactions(String userName)
    {
        extentReportGenerator.addInfoMessage(currentTest, "Store Transaction Field validation Starts");
        System.out.println("inStoreTranEmailID is: "+ inStoreTranEmailID.getText());
        Assert.assertTrue(inStoreTranEmailID.getText().contains(userName.toLowerCase()), "emailId is not displayed");
        Assert.assertEquals(inStoreTranConsID.getText(), inStoreTranConsID.getText(), "ID is not displayed");
        Assert.assertTrue(inStoreTranviewLink.isDisplayed(), "View Link is not displayed");
    }

    //@FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]")
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/..")
    WebElement p2pEmailID;
    @FindBy(xpath = "//*[contains(text(),'Owned By')]")
    WebElement p2pownedBy;
    @FindBy(xpath = "//*[contains(text(),'Program')]")
    WebElement p2pprogram;
    @FindBy(xpath = "//*[contains(text(),'Trans Id')]")
    WebElement p2pTranId;
    @FindBy(xpath = "//*[contains(text(),'Sender')]")
    WebElement p2pSender;
    @FindBy(xpath = "//*[contains(text(),'Sender Address')]")
    WebElement p2pSenderAddress;
    @FindBy(xpath = "//*[contains(text(),'Receiver')]")
    WebElement p2pReceiver;
    @FindBy(xpath = "//*[contains(text(),'Destination')]")
    WebElement p2pDestination;
    @FindBy(xpath = "//*[contains(text(),'Amount')]")
    WebElement p2pAmount;
    @FindBy(xpath = "//*[contains(text(),'Status')]")
    WebElement p2pStatus;
    @FindBy(xpath = "//*[contains(text(),'Funding Status')]")
    WebElement p2pFundingStatus;
    @FindBy(xpath = "//*[contains(text(),'Date/Time')]")
    WebElement p2pDateTime;
    @FindBy(xpath = "//*[contains(text(),'Decision')]")
    WebElement p2pDecision;
    @FindBy(xpath = "//*[contains(text(),'Sub Decision')]")
    WebElement p2pSubDecision;

    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'tranId')]")
    WebElement p2pTranIdLink;
    String p2pTranIdLinkXpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'tranId')]";
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'partnerSiteId=MGO')]")
    WebElement p2pDecisionLink;
    String p2pDecisionLinkXpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'partnerSiteId=MGO')]";
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'InAuth')]")
    WebElement p2pDeviceDetailsLink;
    String p2pDeviceDetailsLinkXpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'InAuth')]";
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'Socure')]")
    WebElement p2pSourceDetailsLink;
    String p2pSourceDetailsLinkXpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table//td/a[contains(@href,'Socure')]";
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[2]")
    WebElement p2pprogramValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[4]")
    WebElement p2pSenderValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[5]")
    WebElement p2pSenderAddressValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[6]")
    WebElement p2pReceiverValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[7]")
    WebElement p2pDestinationValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[8]")
    WebElement p2pAmountValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[9]")
    WebElement p2pStatusValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[10]")
    WebElement p2pFundingStatusValue;
    @FindBy(xpath = "//legend[contains(text(),'Person-To-Person Transactions')]/../table/tbody//td[11]")
    WebElement p2pDateTimeValue;

    public void validateInStorePersonToPersonTransactions(String userName)
    {
        extentReportGenerator.addInfoMessage(currentTest, "Person To Person Transactions Field validation Starts");
        Assert.assertTrue(p2pEmailID.getText().contains(userName.toLowerCase()), "emailId is not displayed");

        //column validations
        Assert.assertTrue(p2pownedBy.getText().contains("Owned By"), "Owned By column is not displayed");
        Assert.assertTrue(p2pprogram.getText().contains("Program"), "Program column is not displayed");
        Assert.assertTrue(p2pTranId.getText().contains("Trans Id"), "Trans Id column is not displayed");
        Assert.assertTrue(p2pSender.getText().contains("Sender"), "Sender column is not displayed");
        Assert.assertTrue(p2pSenderAddress.getText().contains("Sender Address"), "Sender Address column is not displayed");
        Assert.assertTrue(p2pReceiver.getText().contains("Receiver"), "Receiver column is not displayed");
        Assert.assertTrue(p2pDestination.getText().contains("Destination"), "Destination column is not displayed");
        Assert.assertTrue(p2pAmount.getText().contains("Amount"), "Amount column is not displayed");
        Assert.assertTrue(p2pStatus.getText().contains("Status"), "Status column is not displayed");
        Assert.assertTrue(p2pFundingStatus.getText().contains( "Funding Status"), "Funding Status column is not displayed");
        Assert.assertTrue(p2pDateTime.getText().contains("Date/Time"), "Date/Time column is not displayed");
        Assert.assertTrue(p2pDecision.getText().contains("Decision"), "Decision column is not displayed");
        Assert.assertTrue(p2pSubDecision.getText().contains("Sub Decision"), "Sub Decision column is not displayed");
        //value validations
        Assert.assertNotNull(p2pTranIdLink.getText(), "Tansaction ID link is not displayed");
        Assert.assertNotNull(p2pDecisionLink.getText(), "Decision Link is not displayed");
        Assert.assertNotNull(p2pDeviceDetailsLink.getText(), "Device Details Link is not displayed");
        Assert.assertNotNull(p2pSourceDetailsLink.getText(), "Source Details Link is not displayed");
        Assert.assertNotNull(p2pprogramValue,"Program is not displayed");
        Assert.assertNotNull(p2pSenderValue,"Program is not displayed");
        Assert.assertNotNull(p2pSenderAddressValue,"Program is not displayed");
        Assert.assertNotNull(p2pReceiverValue,"Program is not displayed");
        Assert.assertNotNull(p2pDestinationValue,"Program is not displayed");
        Assert.assertNotNull(p2pAmountValue,"Program is not displayed");
        Assert.assertNotNull(p2pStatusValue,"Program is not displayed");
        Assert.assertNotNull(p2pFundingStatusValue,"Program is not displayed");
        Assert.assertNotNull(p2pDateTimeValue,"Program is not displayed");

    }

    @FindBy(xpath = "//fieldset/legend[contains(text(),'IP History Summary')]/..")
    WebElement ipHistEmailID;
    @FindBy(xpath = "//legend[contains(text(),'IP History Summary')]/../b")
    WebElement ipHistConsID;
    @FindBy(xpath = "//legend[contains(text(),'IP History Summary')]/../font/b")
    WebElement ipHistNone;
    public void validateIPHistorySummary(String userName)
    {
        extentReportGenerator.addInfoMessage(currentTest, "IP History Summary Field validation Starts");
        System.out.println("ipHistEmailID is: "+ ipHistEmailID.getText());
        Assert.assertTrue(ipHistEmailID.getText().contains(userName.toLowerCase()), "emailId is not displayed");
        Assert.assertEquals(ipHistConsID.getText(), profilePg_ConsumerId.getText(), "ID is not displayed");
        Assert.assertEquals(ipHistNone.getText(), "(None)", "None is not displayed");
    }

    @FindBy(xpath = "//div[@id='oCMenu_top0']")
    WebElement systemAdmin;
    String systemAdminXPath = "//div[@id='oCMenu_top0']";
    @FindBy(xpath = "//div[@id='oCMenu_top1']")
    WebElement reporting;
    String reportingXPath = "//div[@id='oCMenu_top1']";
    @FindBy(xpath = "//div[@id='oCMenu_top2']")
    WebElement userAdmin;
    String userAdminXPath = "//div[@id='oCMenu_top2']";
    @FindBy(xpath = "//div[@id='oCMenu_top3']")
    WebElement dashBoard;
    String dashBoardXPath = "//div[@id='oCMenu_top3']";
    @FindBy(xpath = "//div[@id='oCMenu_top4']")
    WebElement consumer;
    String consumerXPath = "//div[@id='oCMenu_top4']";
    @FindBy(xpath = "//div[@id='oCMenu_top99']")
    WebElement logOff;

    public void validateHeaders() {
        extentReportGenerator.addInfoMessage(currentTest, "EMT Admin Main Headers validation Starts");
        System.out.println("First header is : " + systemAdmin.getText());
        Assert.assertTrue(systemAdmin.getText().contains(" System Admin"));
        System.out.println("Second header is : " + reporting.getText());
        Assert.assertTrue(reporting.getText().contains(" Reporting"));
        System.out.println("Third header is :  " + userAdmin.getText());
        Assert.assertTrue(userAdmin.getText().contains(" User Admin"));
        System.out.println("Fourth header is : " + dashBoard.getText());
        Assert.assertTrue(dashBoard.getText().contains(" Dashboard"));
        System.out.println("Fifth header is :  " + consumer.getText());
        Assert.assertTrue(consumer.getText().contains(" Consumer"));
        System.out.println("Six header is :  " + logOff.getText());
        Assert.assertTrue(logOff.getText().contains(" Logoff"));
    }

    @FindBy(xpath = "//legend[contains(text(),'Profile Information')]")
    WebElement profileInformation;
    @FindBy(xpath = "//legend[contains(text(),'Profile Information')]/../table/tbody//td/a[contains(@href,'Selection')]")
    WebElement searchForSimilarProLink;
    @FindBy(xpath = "//*[contains(text(), 'IP Address')]")
    WebElement createdIpAdd;
    @FindBy(xpath = "//legend[contains(text(),'Profile Information')]/../table/tbody/tr[2]//td[2]")
    WebElement createdIpAddValue;

    @FindBy(xpath = "//*[contains(text(), 'ProfileLocked:  ')]")
    WebElement profileLocked;
    @FindBy(xpath = "//*[contains(text(), 'Logon Id: ')]")
    WebElement consumerLogonId;
    @FindBy(xpath = "//*[contains(text(), 'Logon Id: ')]/../../td[2]")
    WebElement consumerLogonIdValue;
    @FindBy(xpath = "//*[contains(text(), 'Logon Id: ')]/../../td[2]/b")
    WebElement clId;
    @FindBy(xpath = "//*[contains(text(), 'Email Age Score: ')]")
    WebElement emailAgeScore;
    @FindBy(xpath = "//*[contains(text(), 'Consumer Email Address: ')]")
    WebElement emailAgeScoreNum;
    @FindBy(xpath = "//fieldset//a[(@href='../../vendorDataPage.do?custId=18649752&vendor=EmailAge') and contains(text(),'Details')]")
    WebElement detailsLink;
    @FindBy(xpath = "//*[contains(text(), 'First Seen ')]")
    WebElement firstSeenDate;
    @FindBy(xpath = "//*[contains(text(), 'First Seen ')]/../../td[2]//div")
    WebElement firstSeenDateValue;
    @FindBy(xpath = "//*[contains(text(), 'Email Age Name Match: ')]")
    WebElement emailAgeNameMatch;
    @FindBy(xpath = "//*[contains(text(), 'Email Age Name Match: ')]/../../td[2]//div")
    WebElement emailAgeNameMatchValue;
    @FindBy(xpath = "//*[contains(text(), 'Locked:')]")
    WebElement profile_Locked;
    @FindBy(xpath = "//*[contains(text(), 'Locked:')]/../../td[5]")
    WebElement profile_LockedValue;
    @FindBy(xpath = "//*[contains(text(), 'Source Device:')]")
    WebElement sourceDevice;
    @FindBy(xpath = "//*[contains(text(), 'Source Device:')]")
    WebElement sourceDeviceValue;
    @FindBy(xpath = "//*[contains(text(), 'Source App:')]")
    WebElement sourceApp;
    @FindBy(xpath = "//*[contains(text(), 'Source App:')]/../../td[5]//div")
    WebElement sourceAppValue;
    @FindBy(xpath = "//*[contains(text(), 'Last KYC Date:')] ")
    WebElement lastKYCDate;
    @FindBy(xpath = "//*[contains(text(), 'Last KYC Date:')]/../../td[5] ")
    WebElement lastKYCDateValue;
    @FindBy(xpath = "//*[contains(text(), 'Created on ')]")
    WebElement createdOnSite;
    @FindBy(xpath = "//*[contains(text(), 'Profile Typ')]")
    WebElement profileType1;
    @FindBy(xpath = "//*[contains(text(), 'Consumer Name')]")
    WebElement consumerName;
    @FindBy(xpath = "//*[contains(text(), 'Consumer Name')]/../../td[2]//span")
    WebElement consumerNameValue;
    @FindBy(xpath = "//a[text()='Edit Profile']")
    WebElement editProfileLink;
    @FindBy(xpath = "//*[contains(text(), 'Gender:')]")
    WebElement gender;
    @FindBy(xpath = "//*[contains(text(), 'Consumer A')]")
    WebElement consumerAddress;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[1]/td[1]")
    WebElement country;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[1]/td[2]")
    WebElement countryName;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[1]/td[3]")
    WebElement postalCode;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[1]/td[4]")
    WebElement postalCodeValue;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[2]/td[1]")
    WebElement addressLine1;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[2]/td[2]")
    WebElement addressLine1Value;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[2]/td[3]")
    WebElement cityTown;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[2]/td[4]")
    WebElement cityTownValue;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[3]/td[1]")
    WebElement addressLine2;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[3]/td[2]")
    WebElement addressLine2Value;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[3]/td[3]")
    WebElement provinceState;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[3]/td[4]")
    WebElement provinceStateName;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[4]/td[1]")
    WebElement addressLine3;
    @FindBy(xpath = "//*[@id='consumer_address']/tbody/tr[4]/td[2]")
    WebElement addressLine3Value;
    @FindBy(xpath = "//table//a[contains(@href,'viewAddressHistory')]")
    WebElement viewAddHistoryLink;
    @FindBy(xpath = "//*[contains(text(), 'Date of Birth: ')]")
    WebElement dob;
    @FindBy(xpath = "//*[contains(text(), 'Date of Birth: ')]/../../td[2]")
    WebElement dobYears;
    @FindBy(xpath = "//*[contains(text(), 'Country of Birth: ')]")
    WebElement countryOfBirth;
    @FindBy(xpath = "//*[contains(text(), 'Country of Birth: ')]/../../td[2]")
    WebElement countryOfBirthValue;
    @FindBy(xpath = "//*[contains(text(), 'Citizenship: ')]")
    WebElement citizenship;
    @FindBy(xpath = "//*[contains(text(), 'Citizenship: ')]/../../td[2]")
    WebElement citizenshipValue;
    @FindBy(xpath = "//*[contains(text(), 'Plus')]")
    WebElement plus;
    @FindBy(xpath = "//*[contains(text(), 'Plus')]/../../td[2]")
    WebElement plusValue;
    @FindBy(xpath = "//*[contains(text(), 'Primary Phone: ')]")
    WebElement primaryPhone;
    @FindBy(xpath = "//*[contains(text(), 'Phone Last Changed Date: ')]")
    WebElement phoneLastChangedDate;
    @FindBy(xpath = "//*[contains(text(), 'Auto Enroll Flag: ')]")
    WebElement plusAuto;
    @FindBy(xpath = "//*[contains(text(), 'Auto Enroll Flag: ')]/../../td[5]")
    WebElement plusAutoValue;
    @FindBy(xpath = "//select[@name='custStatus']")
    WebElement consumerStatusDropDown;
    @FindBy(xpath = "//select[@name='custStatus']/following-sibling::input[2]")
    WebElement updateStatusButton;
    @FindBy(xpath = "//*[contains(text(), 'Consumer Email Address: ')]")
    WebElement consumerEmailAddress;
    @FindBy(xpath = "//*[contains(text(), 'Consumer Email Address: ')]/../../td[2]//span")
    WebElement consumerEmailAddressValue;

    public void validateConsumerProfileInfo() {

        extentReportGenerator.addInfoMessage(currentTest, "Consumer Profile Information validation Starts");
        //column validations
        Assert.assertTrue(profileInformation.getText().contains("Profile Information"), "Profile Information is not displayed");
        Assert.assertTrue(createdIpAdd.getText().contains("Created IP Address:"), "Created IP Address is not displayed");
        Assert.assertTrue(consumerLogonId.getText().contains("Consumer Logon Id"), "Consumer Logon Id is not displayed");
        Assert.assertTrue(emailAgeScore.getText().contains("Email Age Score"), "Email Age Score is not displayed");
        Assert.assertTrue(emailAgeScore.getText().contains("Email Age Score"), "Email Age Score is not displayed");
        Assert.assertTrue(firstSeenDate.getText().contains("First Seen Date"), "First seen Date is not displayed");
        Assert.assertTrue(emailAgeNameMatch.getText().contains("Email Age Name Match"), "Email Age Name Match is not displayed");
        Assert.assertTrue(profile_Locked.getText().contains("Profile Locked"), "Profile Locked is not displayed");
        Assert.assertTrue(sourceDevice.getText().contains("Source Device"), "Source Device is not displayed");
        Assert.assertTrue(sourceApp.getText().contains("Source App"), "Source App is not displayed");
        Assert.assertTrue(lastKYCDate.getText().contains("Last KYC Date"), "Last KYC Date is not displayed");
        Assert.assertTrue(createdOnSite.getText().contains("Created on Site"), "Created on Site is not displayed");
        Assert.assertTrue(profileType1.getText().contains("Profile Type"), "Profile Type is not displayed");
        Assert.assertTrue(consumerName.getText().contains("Consumer Name"), "Consumer Name is not displayed");
        Assert.assertTrue(gender.getText().contains("Gender"), "Gender is not displayed ");
        Assert.assertTrue(consumerAddress.getText().contains("Consumer Address"), "Consumer Address is not displayed");
        Assert.assertTrue(country.getText().contains("Country"), "Country column is not displayed");
        Assert.assertTrue(postalCode.getText().contains("Postal Code"), "Postal Code column is not displayed");
        Assert.assertTrue(addressLine1.getText().contains("Address Line 1/Street"), "Address Line 1/Street column is not displayed");
        Assert.assertTrue(cityTown.getText().contains("City/Town"), "City/Town column is not displayed");
        Assert.assertTrue(addressLine2.getText().contains("Address Line 2"), "Address Line 2 column is not displayed");
        Assert.assertTrue(provinceState.getText().contains("Province/State"), "Province/State column is not displayed");
        Assert.assertTrue(addressLine3.getText().contains("Address Line 3"), "Address Line 3 column is not displayed");
        Assert.assertTrue(dob.getText().contains("Date of Birth"), "Date of Birth is not displayed");
        Assert.assertTrue(countryOfBirth.getText().contains("Country of Birth"), "Country of Birth is not displayed");
        Assert.assertTrue(citizenship.getText().contains("Citizenship"), "Citizenship is not displayed");
        Assert.assertTrue(plus.getText().contains("Plus #"), "Plus # is not displayed");
        Assert.assertTrue(primaryPhone.getText().contains("Primary Phone"), "Primary Phone is not displayed");
        Assert.assertTrue(phoneLastChangedDate.getText().contains("Phone Last Changed Date"), "Phone Last Changed Date is not displayed");
        Assert.assertTrue(plusAuto.getText().contains("Plus Auto Enroll Flag"), "Plus Auto Enroll Flag is not displayed");
        Assert.assertTrue(consumerEmailAddress.getText().contains("Consumer Email Address"), "Consumer Email Address is not displayed ");
        //value validations
        Assert.assertTrue(searchForSimilarProLink.isDisplayed(), "Search for similar profiles link is not displayed");
        Assert.assertTrue(detailsLink.isDisplayed(), "Details link is not displayed");
        Assert.assertTrue(editProfileLink.isDisplayed(), "Edit Profile Link is not displayed");
        Assert.assertTrue(viewAddHistoryLink.isDisplayed(), "View Address History Link is not displayed");
        Assert.assertTrue(consumerStatusDropDown.isDisplayed(), "Consumer Status dropdown is not displayed");
        Assert.assertTrue(updateStatusButton.isDisplayed(), "Update Status button is not displayed");
        Assert.assertNotNull(createdIpAddValue, "Email Age Score value is not displayed");
        Assert.assertNotNull(consumerLogonIdValue, "Consumer Logon Id value is not displayed");
        Assert.assertNotNull(clId, "Consumer Logon Id number is not displayed");
        Assert.assertNotNull(emailAgeScoreNum, "Email Age Score number is not displayed");
        Assert.assertNotNull(firstSeenDateValue, "First seen date number column is not displayed");
        Assert.assertNotNull(emailAgeNameMatchValue, "Email Age Name Match value column is not displayed");
        Assert.assertNotNull(profile_LockedValue, "Profile Locked value is not displayed");
        Assert.assertNotNull(sourceDeviceValue, "Source device value is not displayed");
        Assert.assertNotNull(sourceAppValue, "Source App value is not displayed");
        Assert.assertNotNull(lastKYCDateValue, "Last KYC Date value is not displayed");
        Assert.assertNotNull(consumerNameValue, "Consumer Name value is not displayed");
        Assert.assertNotNull(countryName, "Country Name value is not displayed");
        Assert.assertNotNull(postalCodeValue, "Postal Code value is not displayed");
        Assert.assertNotNull(addressLine1Value, "Address Line 1 value is not displayed");
        Assert.assertNotNull(cityTownValue, "City/Town value is not displayed");
        Assert.assertNotNull(addressLine2Value, "Address Line 2 value is not displayed");
        Assert.assertNotNull(provinceState, "Province/State value is not displayed");
        Assert.assertNotNull(addressLine3Value, "Address Line 3 value is not displayed");
        Assert.assertNotNull(dobYears, "Date of Birth and Age is not displayed");
        Assert.assertNotNull(countryOfBirthValue, "country Of Birth Value is not displayed");
        Assert.assertNotNull(citizenshipValue, "citizenship value is not displayed");
        Assert.assertNotNull(plusValue, "Plus value is not displayed");
        Assert.assertNotNull(plusAutoValue, "plus Auto Value is not displayed");
        Assert.assertNotNull(consumerEmailAddressValue, "Consumer Email Address value is not displayed");
        //Dropdown options Validation
        List<String> expectedOptions = new ArrayList<>(Arrays.asList("Active: Active Authentication pending", "Active: Business Account", "Active: Bypassed KBA", "Active: Document Validation ", "Active: Force Manual Review On Next Transaction", "Active: Id Pending", "Active: Id Uploaded","Active: NAP NEW ACCT FAILURE","Active: NAP VALIDATED","Active: Pending Close","Active: Pending Scoring","Active: Phone Authentication","Active: Validation Level 0","Active: Verid Abandon","L07 - Authentication Fail","L08 - Active Authentication Pass","L09 - Manual Authentication","L10 - Active Authentication Fail","L16 - Actimize Challenge","L17 - Force One-Time-Password","Not Active: ACH Return","Not Active: Bounced Email","Not Active: Chargeback","Not Active: Fraud","Not Active: Micro Deposit Fail","Not Active: Other","Not Active: Password Failures","Not Active: Receive Registration Failure","Not Active: Risky Activity","Not Active: Suspicious Activity","Not Active: Telecheck Return","Not Active: User Request","Not Active: Verid Fail","Pending: Initial"));
        validateDropdownOptions(consumerStatusDropDown, expectedOptions);
    }

   @FindBy(xpath = "//form[@name='AddCustomerCommentForm']/../tr[18]/td[1]")
    WebElement Cpc;
    @FindBy(xpath = "//table/tbody/tr[18]/td[1]/a")
    WebElement AlcLink;
    @FindBy(xpath = "//form[@name='AddCustomerCommentForm']/../tr[19]/td/b")
    WebElement CommentReason;
    @FindBy(xpath = "//form[@name='AddCustomerCommentForm']/../tr[20]/td/b")
    WebElement ConsumerComment;
    @FindBy(xpath = "//input[@value='Add Comment']")
    WebElement AddCommentBtn;
    @FindBy(xpath = "//input[@id='personSrchBtn']")
    WebElement BPSsearchBtn;
    @FindBy(xpath = "//input[@id='relativeSrchBtn']")
    WebElement RelativeSearchbtn;
    @FindBy(xpath = "//input[@class='transbtn3']")
    WebElement KBA;
    @FindBy(xpath = "//tr[1]/td[1][contains(text(), 'Create')]")
    WebElement CreateDate;
    @FindBy(xpath = "//tr[1]/td[2][contains(text(), 'Comment')]")
    WebElement Comment;
    @FindBy(xpath = "//tr[1]/td[3][contains(text(), 'Create')]")
    WebElement CreUser;
    @FindBy(xpath = "//tr[1]/td[4][contains(text(), 'Comment')]")
    WebElement CommentReason1;
    @FindBy(xpath = "//select[@name='commentReasonCode']")
    WebElement commentReasonDropDown;


    public void validateConsumerProfileComments() {
        extentReportGenerator.addInfoMessage(currentTest, "Consumer Profile Comment validation Starts");
        //column validations
        Assert.assertEquals(Cpc.getText(),"Customer Profile Comments Add IP Lookup comment","Customer Profile Comments text is not as expected");
        Assert.assertEquals(CommentReason.getText(),"Comment Reason:","Comment Reason text is not as expected");
        Assert.assertEquals(ConsumerComment.getText(),"Consumer Comment:","Consumer Comment text is not as expected");
        Assert.assertEquals(CreateDate.getText(),"Create Date","Create Date is not as expected");
        Assert.assertEquals(Comment.getText(),"Comment","Comment text is not as expected");
        Assert.assertEquals(CreUser.getText(),"Create User","Create User is not as expected");
        Assert.assertEquals(CommentReason1.getText(),"Comment Reason","Comment Reason is not as expected");
        //value validations
        Assert.assertTrue(AlcLink.isDisplayed(),"Add IP Lookup comment link is not displayed");
        Assert.assertTrue(emtcommentTextInput.isDisplayed(),"Comment text box field is not as expected");
        Assert.assertTrue(commentReasonDropDown.isDisplayed(), "Comment Reason dropdown  is not displayed");
        Assert.assertTrue(AddCommentBtn.isDisplayed(),"Add Comment button is not displayed");
        Assert.assertTrue(BPSsearchBtn.isDisplayed(),"BPS Search button is not displayed");
        Assert.assertTrue(RelativeSearchbtn.isDisplayed(),"OK button is disabled.");
        Assert.assertTrue(KBA.isDisplayed(),"KBA button is not displayed");


    }
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]")
    WebElement customerProfileActivityLog;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../tr[2]//td[1]")
    WebElement activityDate;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../following-sibling::tbody//td[1]")
    WebElement activityDateValue;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../tr[2]//td[2]")
    WebElement activityDescription;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../following-sibling::tbody//td[2]")
    WebElement activityDescriptionValue;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../tr[2]//td[3]")
    WebElement activityCategory;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../following-sibling::tbody//td[3]")
    WebElement activityCategoryValue;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../tr[2]//td[4]")
    WebElement createUser;
    @FindBy(xpath = "//td[contains(text(),'Profile Activity Log')]/../../following-sibling::tbody//td[4]")
    WebElement createUserValue;


    public void Validate_ConsumerProfileActivityLog()
    {
        extentReportGenerator.addInfoMessage(currentTest, "Consumer Profile Comment validation Starts");
        //column validations
        Assert.assertEquals(customerProfileActivityLog.getText(),"Customer Profile Activity Log","Customer Profile Activity Log is not as expected");
        Assert.assertEquals(activityDate.getText(),"Activity Date","Activity Date  is not as expected");
        Assert.assertEquals(activityDescription.getText(),"Activity Description","Activity Description is not as expected");
        Assert.assertEquals(activityCategory.getText(),"Activity Category","Activity Category is not as expected");
        Assert.assertEquals( createUser.getText(),"Create User","Create User is not as expected");
        //value validations
        Assert.assertNotNull(activityDateValue,"Activity Date column is not displayed");
        Assert.assertNotNull(activityDescriptionValue,"Activity Description column is not displayed");
        Assert.assertEquals(activityCategoryValue.getText(),"SECURITY EVENT","Activity Category column is  not as expected");
        Assert.assertEquals(createUserValue.getText(),"MGO","Create User Value is  not as expected");

    }
    @FindBy(xpath = "//td[contains(text(),'Lexis Nexis Activity Log')]")
    WebElement lexisNexisActivityLog;
    @FindBy(xpath = "//td[contains(text(),'Lexis Nexis Activity Log')]/../..//*[contains(text(),'Activity Date')]")
    WebElement activityDate_2;
    @FindBy(xpath = "//td[contains(text(),'Lexis Nexis Activity Log')]/../..//*[contains(text(),'Lexis Nexis Respons')]")
    WebElement lexisNexis_Respons;
    @FindBy(xpath = "//td[contains(text(),'Lexis Nexis Activity Log')]/../..//*[contains(text(),'High Risk Indicator')]")
    WebElement highRiskIndicator;
    @FindBy(xpath = "//td[contains(text(),'Lexis Nexis Activity Log')]/../..//*[contains(text(),'SSN Validity Indicator')]")
    WebElement sSNValidityIndicator;
    @FindBy(xpath = "//td[contains(text(),'Lexis Nexis Activity Log')]/../..//*[contains(text(),'SSN Indicator')]")
    WebElement sSNIndicator;
    @FindBy(xpath = "//td[contains(text(),'Lexis Nexis Activity Log')]/../..//*[contains(text(),'Comments')]")
    WebElement comments;

    public void Validate_LexisNexisActivityLog()
    {
        extentReportGenerator.addInfoMessage(currentTest, "Consumer Profile Comment validation Starts");
        //column validations
        Assert.assertEquals(lexisNexisActivityLog.getText(),"Lexis Nexis Activity Log","Lexis Nexis Activity Log is not as expected");
        Assert.assertEquals(activityDate_2.getText(),"Activity Date","Activity Date is not as expected");
        Assert.assertEquals(lexisNexis_Respons.getText(),"Lexis Nexis Response","Lexis Nexis Response is not as expected ");
        Assert.assertEquals(highRiskIndicator.getText(),"High Risk Indicator","High Risk Indicator is not as expected ");
        Assert.assertEquals(sSNValidityIndicator.getText(),"SSN Validity Indicator","SSN Validity Indicator is not as expected ");
        Assert.assertEquals(sSNIndicator.getText(),"SSN Indicator","SSN Indicator is not as expected ");
        Assert.assertEquals(comments.getText(),"Comments","Comments is not as expected");
    }


    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'Vendor Name')]")
    WebElement idHistVendorName;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/..")
    WebElement idHistVendorNameValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Type')]")
    WebElement idHistIDType;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Type')]")
    WebElement idHistIDTypeValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Category')]")
    WebElement idHistIDCategory;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Category')]")
    WebElement idHistIDCategoryValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Number')]")
    WebElement idHistIDNumber;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Number')]")
    WebElement idHistIDNumberValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'Country of Issue')]")
    WebElement idHistCountryOfIssue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'Country of Issue')]")
    WebElement idHistCountryOfIssueValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'State of Issue')]")
    WebElement idHistStateOfIssue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'State of Issue')]")
    WebElement idHistStateOfIssueValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Status')]")
    WebElement idHistIDStatus;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Status')]")
    WebElement idHistIDStatusValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'Upload Reason Code')]")
    WebElement idHistUploadReasonCode;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'Upload Reason Code')]")
    WebElement idHistUploadReasonCodeValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'Manual Review Date')]")
    WebElement idHistManualReviewDate;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'Manual Review Date')]")
    WebElement idHistManualReviewDateValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Last Update Date')]")
    WebElement idHistIDLastUpdateDate;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Last Update Date')]")
    WebElement idHistIDLastUpdateDateValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Upload Date')]")
    WebElement idHistIDUploadDate;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'ID Upload Date')]")
    WebElement idHistIDUploadDateValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'EMG Tran Id')]")
    WebElement idHistEMGTranId;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'EMG Tran Id')]")
    WebElement idHistEMGTranIdValue;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'MGO Doc Id')]")
    WebElement idHistMGODocId;
    @FindBy(xpath = "//*[contains(text(),'ID History')]/../b[contains(text(),'MGO Doc Id')]")
    WebElement idHistMGODocIdValue;

    public void validateIDHistory() {
        extentReportGenerator.addInfoMessage(currentTest, "ID History Field validation Starts");

        //Lable Validations
        Assert.assertTrue(idHistVendorName.getText().contains("Vendor Name"), "Vendor Name Lable is not displayed");
        Assert.assertTrue(idHistIDType.getText().contains("ID Type"), "ID Type Lable is not displayed");
        Assert.assertTrue(idHistIDCategory.getText().contains("ID Category"), "ID Category Lable is not displayed");
        Assert.assertTrue(idHistIDNumber.getText().contains("ID Number"), "ID Number Lable is not displayed");
        Assert.assertTrue(idHistCountryOfIssue.getText().contains("Country of Issue"), "Country of Issue Lable is not displayed");
        Assert.assertTrue(idHistStateOfIssue.getText().contains("State of Issue"), "State of Issue Lable is not displayed");
        Assert.assertTrue(idHistIDStatus.getText().contains("ID Status"), "ID Status Lable is not displayed");
        Assert.assertTrue(idHistUploadReasonCode.getText().contains("Upload Reason Code"), "Upload Reason Code Lable is not displayed");
        Assert.assertTrue(idHistManualReviewDate.getText().contains("Manual Review Date"), "Manual Review Date Lable is not displayed");
        Assert.assertTrue(idHistIDLastUpdateDate.getText().contains("ID Last Update Date"), "ID Last Update Date Lable is not displayed");
        Assert.assertTrue(idHistIDUploadDate.getText().contains("ID Upload Date"), "ID Upload Date Lable is not displayed");
        Assert.assertTrue(idHistEMGTranId.getText().contains("EMG Tran Id"), "EMG Tran Id Lable is not displayed");
        Assert.assertTrue(idHistMGODocId.getText().contains("MGO Doc Id"), "MGO Doc Id Lable is not displayed");
        System.out.println("yyyyyyyyyyyyyyyyyyyyy  getText: "+idHistVendorNameValue.getText());

        //Value validations

        String val = idHistVendorNameValue.getText();
        val =val.replaceAll("   ",",");
        System.out.println("Comma separated :  "+val);
        String[] arrOfStr=  val.split(",",13);
        for (String a : arrOfStr)
        {
            System.out.println("Property And Value: "+a);
            int index = a.indexOf(":");
            String s = a.substring(index);
            System.out.println("Value:" +s);
            //if(a.contains("Vendor Name")) Assert.assertNotNull(idHistVendorNameValue.getText(), "Vendor Name is not displayed");
            if(a.contains("ID Type")) Assert.assertNotNull(idHistIDTypeValue.getText(), "ID Type is not displayed");
            if(a.contains("ID Category")) Assert.assertNotNull(idHistIDCategoryValue.getText(), "ID Category is not displayed");
            if(a.contains("ID Number")) Assert.assertNotNull(idHistIDNumberValue.getText(), "ID Number is not displayed");
            if(a.contains("Country of Issue")) Assert.assertNotNull(idHistCountryOfIssueValue.getText(), "Country of Issue is not displayed");
            if(a.contains("State of Issue")) Assert.assertNotNull(idHistStateOfIssueValue.getText(), "State of Issue is not displayed");
            if(a.contains("ID Status")) Assert.assertNotNull(idHistIDStatusValue.getText(), "ID Status is not displayed");
            if(a.contains("Upload Reason Code")) Assert.assertNotNull(idHistUploadReasonCodeValue.getText(), "Upload Reason Code is not displayed");
            if(a.contains("Manual Review Date")) Assert.assertNotNull(idHistManualReviewDateValue.getText(), "Manual Review Date is not displayed");
            if(a.contains("ID Last Update Date")) Assert.assertNotNull(idHistIDLastUpdateDateValue.getText(), "ID Last Update Date is not displayed");
            if(a.contains("ID Upload Date")) Assert.assertNotNull(idHistIDUploadDateValue.getText(), "ID Upload Date is not displayed");
            if(a.contains("EMG Tran Id")) Assert.assertNotNull(idHistEMGTranIdValue.getText(), "EMG Tran Id is not displayed");
            if(a.contains("MGO Doc Id")) Assert.assertNotNull(idHistMGODocIdValue.getText(), "MGO Doc Id is not displayed");
        }

    }

    @FindBy(xpath = "//form[@name='viewVendorDataForm']/h3")
    WebElement inAuthData;
    @FindBy(xpath = "//form[@name='viewVendorDataForm']/a")
    WebElement backToCustProfile;
    @FindBy(xpath = "//form[@name='viewVendorDataForm']/h3")
    WebElement socureData;

    public void validateP2PTransLinks() {
        extentReportGenerator.addInfoMessage(currentTest, "Person To Person Transaction Links validation Starts");

        //Links Validation
        Assert.assertTrue(p2pTranIdLink.isDisplayed(), "Tansaction ID link is not displayed");
        scrollDownToAndClick(p2pTranIdLink,p2pTranIdLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Transaction Detail"),"Transaction ID is not working");
        driver.navigate().back();

        Assert.assertTrue(p2pDecisionLink.isDisplayed(), "Decision Link is not displayed");
        scrollDownToAndClick(p2pDecisionLink,p2pDecisionLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Show Transaction Score"),"Decision Link is not working");
        driver.navigate().back();

        Assert.assertTrue(p2pDeviceDetailsLink.isDisplayed(), "Device Details Link is not displayed");
        scrollDownToAndClick(p2pDeviceDetailsLink,p2pDeviceDetailsLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Vendor Data")&& inAuthData.getText().contains("InAuth Data"),"Device Details Link is not working");
        driver.navigate().back();

        Assert.assertTrue(p2pSourceDetailsLink.isDisplayed(), "Source Details Link is not displayed");
        scrollDownToAndClick(p2pSourceDetailsLink,p2pSourceDetailsLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Vendor Data")&& socureData.getText().contains("Socure Data"),"Transaction ID is not working");

    }

    public void scrollDownToAndClick(WebElement element, String elementXpath){

        if(element.isDisplayed()) {
            actionExecutor.scrollToElement(driver, element, exceptionHandling);
            if (exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, elementXpath, 1) != null) {
                element.click();
            }
        }}


    @FindBy(xpath = "//*[contains(text(),'Tran Count')]/following-sibling::a")
    WebElement tranCountLink;
    String tranCountLinkXpath = "//*[contains(text(),'Tran Count')]/following-sibling::a";
    @FindBy(xpath = "//*[contains(text(),'Consumer Last 30 Days')]")
    WebElement last30DaysTranList_tran;

    @FindBy(xpath = "//*[contains(text(),'Receiver:')]/following-sibling::a")
    WebElement receiverLink;
    String receiverLinkXpath = "//*[contains(text(),'Receiver:')]/following-sibling::a";
    @FindBy(xpath = "//*[contains(text(),'Last 30 days')]")
    WebElement last30DaysTranList_Receiver;

    @FindBy(xpath = "//*[contains(text(),'Total Tran:')]/following-sibling::a[1]")
    WebElement totalTranLink;
    String totalTranLinkXpath = "//*[contains(text(),'Total Tran:')]/following-sibling::a[1]";
    @FindBy(xpath = "//*[contains(text(),'Current Consumer All')]")
    WebElement CurrentConsumerTranList;
    @FindBy(xpath = "//*[contains(text(),'Send:')]/following-sibling::a[1]")
    WebElement sendLink;
    String sendLinkXpath = "//*[contains(text(),'Send:')]/following-sibling::a[1]";
    @FindBy(xpath = "//*[contains(text(),'Consumer Sent')]")
    WebElement consumerSentTranList;
    @FindBy(xpath = "//*[contains(text(),'Funded:')]/following-sibling::a")
    WebElement fundedLink;
    String fundedLinkXpath = "//*[contains(text(),'Funded:')]/following-sibling::a";
    @FindBy(xpath = "//*[contains(text(),'Consumer Funded')]")
    WebElement consumerFundedtTranList;
    @FindBy(xpath = "//*[contains(text(),'Credit Card Account:')]/following-sibling::a")
    WebElement creditCardAccountLink;
    String creditCardAccountLinkXpath = "//*[contains(text(),'Credit Card Account:')]/following-sibling::a";
    @FindBy(xpath = "//*[contains(text(),'Credit Card Accounts')]")
    WebElement consumerCreditCardList;
    @FindBy(xpath = "//h3[contains(text(),'User Data to be tainted')]")
    WebElement userDataTobetainted;

    public void validateConsumerProfileDashboardLinks() {

        Assert.assertTrue(tranCountLink.isDisplayed(), "Tan Count link is not displayed");
        scrollDownToAndClick(tranCountLink,tranCountLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Show Dashboard Detail") && last30DaysTranList_tran.isDisplayed(),"Tran Count Link ID is not working");
        driver.navigate().back();

        Assert.assertTrue(receiverLink.isDisplayed(), "Receiver link is not displayed");
        scrollDownToAndClick(receiverLink,receiverLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Show Dashboard Detail") && last30DaysTranList_Receiver.getText().contains("Receiver"),"Receiver Link is not working");
        driver.navigate().back();

        Assert.assertTrue(totalTranLink.isDisplayed(), "Total Tran Link is not displayed");
        scrollDownToAndClick(totalTranLink,totalTranLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Show Dashboard Detail") && CurrentConsumerTranList.getText().contains("Current Consumer"),"Total Tran Link is not working");
        driver.navigate().back();

        Assert.assertTrue(sendLink.isDisplayed(), "Send link is not displayed");
        scrollDownToAndClick(sendLink,sendLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Show Dashboard Detail") && consumerSentTranList.getText().contains("Consumer Sent"),"Send Link is not working");
        driver.navigate().back();

        Assert.assertTrue(fundedLink.isDisplayed(), "Funded link is not displayed");
        scrollDownToAndClick(fundedLink,fundedLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Show Dashboard Detail") && consumerFundedtTranList.getText().contains("Consumer Funded"),"Funded Link is not working");
        driver.navigate().back();

        Assert.assertTrue(creditCardAccountLink.isDisplayed(), "Credit Card Account link is not displayed");
        scrollDownToAndClick(creditCardAccountLink,creditCardAccountLinkXpath);
        Assert.assertTrue(driver.getTitle().contains("Show Dashboard Detail") && consumerCreditCardList.getText().contains("Consumer Credit Card Accounts"),"Credit Card Account Link is not working");

    }
}




