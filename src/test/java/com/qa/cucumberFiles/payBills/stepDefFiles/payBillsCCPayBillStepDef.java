package com.qa.cucumberFiles.payBills.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class payBillsCCPayBillStepDef {
    InitializeDriverPagesAndUtils initDrPgsAndUtils;

    public payBillsCCPayBillStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }


    @And("User search for Survey Biller Name and PayBills {string}")
    public void userPayBillsSurvey(String paymentOption) {
        initDrPgsAndUtils.getHomePage().userPayBillsaccount(paymentOption);
    }

    @And("User search for Biller Name and PayBills {string}")
    public void userPayBills(String paymentOption) {
        initDrPgsAndUtils.getHomePage().userPayBills(paymentOption);
    }


    @And("User search non US for Biller Name and PayBills {string}")
    public void userPayBillsnonUS(String paymentOption) {
        initDrPgsAndUtils.getHomePage().userPayBillsnonUS(paymentOption);
    }

    @Then("User Validates the Receiver Bubbles count in Home page")
    public void userValidatetheBubbleCount() {
        initDrPgsAndUtils.getHomePage().userValidatetheBubble();
    }
    @And("User search for Biller Name and PayBills via PWC {string}")
    public void userPayBillsviaPWC(String paymentOption) {
        initDrPgsAndUtils.getHomePage().userPayBillsviaPWC(paymentOption);
    }

    @And("User search for Biller Name and Validate Default Payment Option {string}")
    public void userVerifyPayBillsPaymentOption(String paymentOption) {
        initDrPgsAndUtils.getHomePage().userVerifyDefaultPayBills(paymentOption);
    }


    @And("User select Pay again and completes PayBills {string}")
    public void payBillsPayAgain(String paymentOption){
        initDrPgsAndUtils.getHomePage().payBillsandPayAgain(paymentOption);
        initDrPgsAndUtils.getHomePage().userAdditionalDetailsPayBills();
      //  initDrPgsAndUtils.getSendMoneyReceiverInfoPage().selectExistingCardandVerifyCVV();

        //initDrPgsAndUtils.getSendMoneyReceiverInfoPage().selecPayAgaintExistingCardandVerifyCVV();

    }

    @And("User Adds Additional Details in the PayBills")
    public void userAdditionalDetailsPayBills() {
        initDrPgsAndUtils.getHomePage().userAdditionalDetailsPayBills();
    }

}
