package com.acti.testcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TC_02CreateCustomer extends BaseTestCase

{
	@Test
	public void testcreateCustomer() {
		//logger = extent.createTest("verify that user is able to create");
		logger = extent.createTest("validate,create customer functionality");
		loginPage.loginToApplication("admin", "manager");
		logger.log(Status.PASS, "Login Sucessful");
		enterTimePage.clickTaskMenu();
		logger.log(Status.PASS, "clicked on TaskMenu");//you should have this logger to find out the failures.
		taskPage.clickAddNewButton();
		logger.log(Status.PASS, "clicked on AddNewButton");
		taskPage.clickNewCustomerItem();
		logger.log(Status.PASS, "clicked on NewCustomerItem");
		taskPage.enterCustomerNameTb("sam");
		logger.log(Status.PASS, "clicked on CustomerNameTb");
		taskPage.enterCustomerDescription("Good");
		logger.log(Status.PASS, "clicked on Description");
		taskPage.clickCustomerButton();
		logger.log(Status.PASS, "clicked on CustomerButton");
		taskPage.clickselectCustomer();
		logger.log(Status.PASS, "clicked on selectCustomer");
		taskPage.selectGalaxyOption();
		logger.log(Status.PASS, "clicked on GalaxyOption");
		System.out.println(taskPage.getToastmessage());
		logger.log(Status.PASS, "customer created successfully");
	}
}

//Recording Session # 42
//Before executing this it will go and execute the Base Method.
//In the BaseTestCase we have created globally all the login functionality to-
//-use it in our Testcases.
//Thats how we are able to extend here.
//Using those objects we are calling this methods.
// initBrowser();//in this line # 13 we are shifting this to the BaseTest.
// launchApplication();//in this line #14we are shifting this to the BaseTest.
// LoginPage loginPage = new LoginPage();//line #15this is an object//we are
// shifting this to the BaseTest.
// EnterTimePage enterTimePage = new EnterTimePage();//this line #17we are
// shifting this to the BaseTest.
// TaskPage taskPage = new TaskPage();// this line #19we are shifting this to
// the BaseTest.