package com.qa.cucumberFiles.receiveRedirect.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class receiveRedirectsStepDef {
    InitializeDriverPagesAndUtils initDrPgsAndUtils;

    public receiveRedirectsStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }


    @Then("User views details on home page and Set Weekly Schedule the transaction")
    public void userAttemptsToAddWeeklyScheduleDetails() {
        initDrPgsAndUtils.getHomePage().scheduleWeeklySendAgainTransaction();

    }


    @Then("User Delete Schedule")
    public void userAttemptsToDeleteScheduleDetails() {
        initDrPgsAndUtils.getHomePage().deleteWeeklyScheduleTransaction();

    }
    @Then("User views details on home page and Set Monthly Schedule the transaction")
    public void userAttemptsToMonthlyScheduleDetails() {
        initDrPgsAndUtils.getHomePage().userAttemptsToAddMonthlyScheduleDetails();

    }


    @And("User edits card from profile page cvv {string}")
    public void userEditsCardFromProfilePage(String cvv){
        initDrPgsAndUtils.getProfilePage().editCard(cvv);
    }

    @Then("User deletes card from profile page")
    public void userDeletesCardFromProfilePage(){
        initDrPgsAndUtils.getProfilePage().deleteCard();

    }

}
