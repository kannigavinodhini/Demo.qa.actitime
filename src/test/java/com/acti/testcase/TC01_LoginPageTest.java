package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.base.DriverScript;
import com.acti.page.LoginPage;


public class TC01_LoginPageTest extends DriverScript{
	@BeforeMethod
	public void precondition()
	{
		initBrowser();
		launchApplication();
	}
	
@Test
	public void testLoginFunction() //call a method
	{
        LoginPage loginPage = new LoginPage();           // we are creating an object here--
        loginPage.loginToApplication("admin", "manager"); //--using the LoginPage class.
	}
public void testVerifyLogoDisplayed()
{
	LoginPage loginPage = new LoginPage();
	boolean flag = loginPage.verifyLogo();
	System.out.println(flag);
}
@AfterMethod
public void postcondition()
 {
	closeApplication();
 }
}
