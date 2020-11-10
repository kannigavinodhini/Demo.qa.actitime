package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.acti.base.DriverScript;
/*
 * Name:Login Page Class
 * Tester:Kanya
 * Verified By:Vinodhini
 * DataModified:11/9/2020
 */

public class LoginPage extends DriverScript  // at page object model it is
											 // recommended to use @FindBy
{
	// ************WebElement/Objects***********************//

	@FindBy(id = "username")WebElement usernameTextbox;
	@FindBy(name = "pwd")WebElement passwordTextbox;
	@FindBy(id = "loginButton")WebElement LoginButton;   // Identifying the element
	@FindBy(className = "atLogoImg")WebElement actitimeLogo;

	// ************PageInitialization***********************//

	public LoginPage()// creating a constructor
	{
		                                        // Use of pagefactory model it is a --
		                                        //--class to intialize the current class elements.
		PageFactory.initElements(driver, this); // "this" is a keyword refers to
												 // current class objects.
	}

	// ************Page Actions***********************//
	public void loginToApplication(String username,String password) //Parameterize the values here
	                                                                //only in the test case - hard code the values.
	{
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		LoginButton.click();
		// one method is done
	}

	public boolean verifyLogo()     // First the method will be void after giving
								   // return type it will change into boolean.

	{
		return actitimeLogo.isDisplayed();
	}
	
	public String verifyPageTitle()// First the method will be void after giving
	                               // return type it will change into string.
	{
		return driver.getTitle();
	}
}
