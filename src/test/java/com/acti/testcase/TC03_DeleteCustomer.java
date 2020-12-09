package com.acti.testcase;

import org.testng.annotations.Test;

import com.acti.utils.Generic;

public class TC03_DeleteCustomer extends BaseTestCase {

@Test
	public void testcreateCustomer() {
		loginPage.loginToApplication("admin", "manager");
		enterTimePage.clickTaskMenu();
		//taskPage.clickAddNewButton();
		//taskPage.clickNewCustomerItem();
		//taskPage.enterCustomerNameTb("T1est");
		//taskPage.enterCustomerDescription("Good");
		//taskPage.clickCustomerButton();
		taskPage.enterSearchCustomerTb("T1est");
		taskPage.clickSettingsButton();
		//taskPage.ActionButton();
		//taskPage.deleteButton();
		//taskPage.deletePermenantlyButton();
		
		Generic.fn_sleep();
		//taskPage.clickselectCustomer();
		//taskPage.selectGalaxyOption();
		//System.out.println(taskPage.getToastmessage());
	
}
}
