package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.page.EnterTimePage;
import com.acti.page.LoginPage;
import com.acti.page.TaskListPage;

public class BaseTestCase extends DriverScript {
	LoginPage loginPage;
	EnterTimePage enterTimePage;
	TaskListPage taskPage;
	
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
	public void postCondition()
	{
		closeApplication();
	}
}
