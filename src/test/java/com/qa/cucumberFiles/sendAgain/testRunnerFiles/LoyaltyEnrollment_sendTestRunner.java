package com.qa.cucumberFiles.sendAgain.testRunnerFiles;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( //ensure this is CucumberOptions from testNG, NOT JUNIT!!!
		plugin = {"rerun:target/rerun.txt", "com.qa.cucumberFiles.initDrPgsAndUtilsHook.BeforeAndAfterAllPlugin"}, //cucumber rerun txt file + before and after all class plugin for cucumber
		features = "src/test/java/com/qa/cucumberFiles/sendAgain/featureFiles/LoyaltyEnrollment_send.feature",
		glue = {"com/qa/cucumberFiles/commonSteps/stepDefFiles", "com/qa/cucumberFiles/initDrPgsAndUtilsHook","com/qa/cucumberFiles/RegisterNewProfile/stepDefFiles","com/qa/cucumberFiles/payBills/stepDefFiles", "com/qa/cucumberFiles/sendMoney/stepDefFiles","com/qa/cucumberFiles/sendAgain/stepDefFiles"} //have common steps step def file defined here, if there is one. Always have the initDrPgsAndUtilsHook. -->
)

public class LoyaltyEnrollment_sendTestRunner extends AbstractTestNGCucumberTests {
}
