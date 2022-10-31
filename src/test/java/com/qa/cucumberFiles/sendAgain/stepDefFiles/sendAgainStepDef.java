package com.qa.cucumberFiles.sendAgain.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class sendAgainStepDef {
    InitializeDriverPagesAndUtils initDrPgsAndUtils;

    public sendAgainStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }

    @Then("User perform send again via Receiver Bubble")
    public void performSendAgainviaReceiverBubble() {
        initDrPgsAndUtils.getHomePage().performSendAgainViaRcvBubble();
        initDrPgsAndUtils.getFeeEstimatorPage().SendAgainFeeEstimator();

        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().selectExistingCardandVerifyCVV();
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();

    }

    @Then("User perform interac send again")
    public void performinteracSendAgain() {
        initDrPgsAndUtils.getHomePage().performinteracSendAgain();
        // initDrPgsAndUtils.getFeeEstimatorPage().testButtonFeeEstimator();
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();


    }


    @Then("User perform fast send send again")
    public void performfastsendSendAgain() {
        initDrPgsAndUtils.getHomePage().performfastsendSendAgain();
        // initDrPgsAndUtils.getFeeEstimatorPage().testButtonFeeEstimator();
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().fastsendPopup();
        initDrPgsAndUtils.getSendMoneyReceiverInfoPage().selectExistingCardandVerifyCVV();
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addSendAgainAdditionalDetails();
        initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();

    }




        @Then("User perform send again")
        public void performSendAgain() {
            initDrPgsAndUtils.getHomePage().performSendAgain();
            // initDrPgsAndUtils.getFeeEstimatorPage().testButtonFeeEstimator();
            initDrPgsAndUtils.getSendMoneyReceiverInfoPage().scrollToAndClickNextButton();
            initDrPgsAndUtils.getSendMoneyReceiverInfoPage().selectExistingCardandVerifyCVV();
            initDrPgsAndUtils.getSendMoneyPaymentInfoPage().addSendAgainAdditionalDetails();
            initDrPgsAndUtils.getSendMoneyPaymentInfoPage().scrollDownToAndClickNextButton();

        }

    }



