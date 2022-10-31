package com.qa.cucumberFiles.emtAdmin.testRunnerFiles;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( //ensure this is CucumberOptions from testNG, NOT JUNIT!!!
		plugin = {"rerun:target/rerun.txt", "com.qa.cucumberFiles.initDrPgsAndUtilsHook.BeforeAndAfterAllPlugin"}, //cucumber rerun txt file + before and after all class plugin for cucumber
		features = "src/test/java/com/qa/cucumberFiles/emtAdmin/featureFiles/emitAdminValidation.feature",
		glue = {"com/qa/cucumberFiles/commonSteps/stepDefFiles", "com/qa/cucumberFiles/initDrPgsAndUtilsHook", "com/qa/cucumberFiles/sendMoney/stepDefFiles","com/qa/cucumberFiles/emtAdmin/stepDefFiles"} //have common steps step def file defined here, if there is one. Always have the initDrPgsAndUtilsHook. -->
)


public class emitAdminValidationTestRunner extends AbstractTestNGCucumberTests {
}