package com.qa.cucumberFiles.addEditProfile.stepDefFiles;

import com.qa.initializeDriversPagesAndUtilsClasses.InitializeDriverPagesAndUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editUpdatePhoneNumberProfilePageStepDef {
    InitializeDriverPagesAndUtils initDrPgsAndUtils;

    public editUpdatePhoneNumberProfilePageStepDef(InitializeDriverPagesAndUtils initDrPgsAndUtils) {
        this.initDrPgsAndUtils = initDrPgsAndUtils;
    }


    @When("User click on Mobile number Edit button in the  profile page")
    public void userAttemptsToEditMobilenumberButton() {
        initDrPgsAndUtils.getHomePage().geteditMobileNumber().click();

    }
    @Then("User verify the Notification Option and Verify the Default Text select")
    public void userAttemptsToVerifyNotificationOption() {
        initDrPgsAndUtils.getHomePage().verifyNotificationOption();

    }

    @Then("User update the Mobile number and Verify {string}")
    public void userAttemptsToUpdateMobileNumberandVerify(String countryPreFix) {
        initDrPgsAndUtils.getHomePage().userEditMobilenumberandVerify(countryPreFix);

    }






}
