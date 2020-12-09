package com.acti.testcase;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.acti.base.DriverScript;
import com.acti.page.EnterTimePage;
import com.acti.page.LoginPage;
import com.acti.page.TaskListPage;
import com.acti.utils.Generic;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTestCase extends DriverScript {
	
	ExtentHtmlReporter htmlreport;
	ExtentReports extent;
	ExtentTest logger;//This logger obj is responsible to log or to write ,your writing in the test case to the report 
	
	LoginPage loginPage;
	EnterTimePage enterTimePage;
	TaskListPage taskPage;
	
	 
	
	@BeforeClass
	public void preTest()//create three methods.
	{
		 htmlreport = new ExtentHtmlReporter("./report/AutomationactiReport+"+Generic.generateDataTime()+".html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		
	}
	
	@BeforeMethod
	public void preCondition()
	{
		initBrowser();
		launchApplication();
		loginPage = new LoginPage(); 
	    enterTimePage = new EnterTimePage();
	    taskPage = new TaskListPage();
	}

	@AfterMethod
	public void postCondition(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			Generic.makeScreenshot(driver);
		}
		closeApplication();
	}
	@AfterClass
	public void teardown()
	{
		
		extent.flush();//it will flush out the report after it is passed.
		
	}
}
/*#41
*/