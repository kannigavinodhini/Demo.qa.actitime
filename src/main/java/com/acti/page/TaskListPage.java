package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript {
	@FindBy(xpath="//div[@class='title ellipsis']")WebElement addnewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']")WebElement newcustomerItem;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")WebElement customerNameTb;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement customerDescriptionTb;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")WebElement createcustomerButton;
	
	public TaskListPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAddNewButton() {
		addnewButton.click();
	}

	public void clickNewCustomerItem() {
		newcustomerItem.click();
	}
	public void clickCustomerNameTb (String customerName) {
		customerNameTb.sendKeys(customerName);
	}
}
