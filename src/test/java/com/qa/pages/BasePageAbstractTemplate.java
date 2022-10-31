package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.appUtilFiles.ActionExecutor;
import com.qa.appUtilFiles.ExceptionHandling;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Scenario;
import org.testng.Assert;

//TEMPLATE PAGE, NOT AN ACTUAL PAGE OBJECT CLASS. JUST A SAMPLE
//All page classes will inherit the below abstract class and implement the abstract methods

public abstract class BasePageAbstractTemplate {
	protected final WebDriver driver;
	protected final ExtentReportGenerator extentReportGenerator;
	protected final ExtentTest currentTest;
	protected final Scenario scenario;

	protected final ExceptionHandling exceptionHandling;
	protected final Actions actions;
	protected final ActionExecutor actionExecutor;

	public BasePageAbstractTemplate(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
		this.driver = driver; //sets the driver object on this class to the same as the driver option passed into params when initializing this class.
		PageFactory.initElements(driver, this); //initializes these elements
		currentTest = currentTestFromInitDrPgsAndUtilsClass;
		extentReportGenerator = extentReportGeneratorFromInitDrPgsAndUtilsClass;
		this.scenario = scenario;

		exceptionHandling = new ExceptionHandling(currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass);
		actions = new Actions(driver);
		actionExecutor = new ActionExecutor(driver, currentTestFromInitDrPgsAndUtilsClass, extentReportGeneratorFromInitDrPgsAndUtilsClass);
	}

	public abstract WebElement getPageValidationElement();
	public abstract String getPageValidationElementXPath();

	//validation methods begin
	public abstract void validatePageIsOpen();
	//validation methods end

	//flows related to this page begin
}
