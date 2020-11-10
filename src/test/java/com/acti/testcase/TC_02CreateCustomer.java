package com.acti.testcase;

import org.testng.annotations.Test;

public class TC_02CreateCustomer extends BaseTestCase {
	@Test
	public void testcreateCustomer() {
		//initBrowser();
		//launchApplication();
		//LoginPage loginPage = new LoginPage();
		loginPage.loginToApplication("admin", "manager");
		//EnterTimePage enterTimePage = new EnterTimePage();
		enterTimePage.clickTaskMenu();
		//TaskPage taskPage = new TaskPage();
		taskPage.clickAddNewButton();
		taskPage.clickNewCustomerItem();
		taskPage.clickCustomerNameTb("JK");

	}

}
