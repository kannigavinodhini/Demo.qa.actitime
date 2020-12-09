package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.utils.Generic;

public class EnterTimePage extends DriverScript {

	// we are here identifying the element.
	
	@FindBy(id = "container_tasks")WebElement taskMenu;           
	@FindBy(id = "logoutLink")WebElement logoutLink;

	// This is a constructor.
	
	public EnterTimePage() {       
		PageFactory.initElements(driver, this);
	}

	// we are calling the element using this method.
	
	
	public void clickLogoutlink() { 
		logoutLink.click();
	}

	public void clickTaskMenu() {
		taskMenu.click();
		Generic.fn_sleep();
	}
}
