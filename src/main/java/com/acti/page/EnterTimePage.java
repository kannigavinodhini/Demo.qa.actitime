package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class EnterTimePage extends DriverScript {

	@FindBy(id = "container_tasks")
	WebElement taskMenu;
	@FindBy(id = "logoutLink")
	WebElement logoutLink;

	public EnterTimePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickLogoutlink() {
		logoutLink.click();
	}

	public void clickTaskMenu() {
		taskMenu.click();
	}
}
