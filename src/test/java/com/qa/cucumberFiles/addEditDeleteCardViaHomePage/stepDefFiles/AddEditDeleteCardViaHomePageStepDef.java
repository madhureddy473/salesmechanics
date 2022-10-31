package com.qa.cucumberFiles.addEditDeleteCardViaHomePage.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEditDeleteCardViaHomePageStepDef {
    InitializeDriverPagesAndUtils initDrPgsAndUtils;

    public AddEditDeleteCardViaHomePageStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }


    @When("User opens up the profile page")
    public void userAttemptsToAddReceiverDetails() {
        initDrPgsAndUtils.getHomePage().getViewProfileInfo().click();
    }



    @Then("User adds card from profile page creditCardNumber {string} expiryMonth {string} expiryYear {string} cvv {string}")
    public void userAddsCardFromProfilePage(String creditCardNumber, String expiryMonth, String expiryYear, String cvv){
        initDrPgsAndUtils.getProfilePage().addNewCard(creditCardNumber, expiryMonth, expiryYear, cvv);
    }

    @And("User edits card from profile page cvv {string}")
    public void userEditsCardFromProfilePage(String cvv){
        initDrPgsAndUtils.getProfilePage().editCard(cvv);
    }

    @Then("User deletes card from profile page")
    public void userDeletesCardFromProfilePage(){
        initDrPgsAndUtils.getProfilePage().deleteCard();

    }


    @Then("User deletes card from profile page via from Home Page")
    public void userDeletesCardFromHomepageProfilePage(){
        initDrPgsAndUtils.getProfilePage().deleteCard();

    }

}
