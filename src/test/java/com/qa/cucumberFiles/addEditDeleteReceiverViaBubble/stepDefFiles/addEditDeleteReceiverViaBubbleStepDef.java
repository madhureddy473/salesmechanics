package com.qa.cucumberFiles.addEditDeleteReceiverViaBubble.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class addEditDeleteReceiverViaBubbleStepDef {
    InitializeDriverPagesAndUtils initDrPgsAndUtils;

    public addEditDeleteReceiverViaBubbleStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }


    @And("User Click on new Add Bubble button and enter receiver details with {string}")
    public void userAttemptsToAddReceiverDetails(String receiverCountry) {
        initDrPgsAndUtils.getBubbleAddReceivePage().addreceiverBubble(receiverCountry);
    }
    @Then("User validates newly added receiver Bubble and click for edit")
    public void userEditReceiverBubble(){
        initDrPgsAndUtils.getBubbleAddReceivePage().verifyBubbleandEdit();
    }
    @Then("User verify the newly added receiver Bubble and click for edit and then Delete")
    public void userClickOnEditReceiverBubble(){
        initDrPgsAndUtils.getBubbleAddReceivePage().verifyBubbleandClickEditandThenDelete();
    }
    @Then("User validates edited receiver Bubble and click for delete")
    public void userDeleteReceiverBubble(){
        initDrPgsAndUtils.getBubbleAddReceivePage().verifyBubbleandDelete();
    }



}
