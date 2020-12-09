package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript {
	@FindBy(xpath="//div[@class='title ellipsis']")WebElement addnewButton;  //1
	@FindBy(xpath="//div[@class='item createNewCustomer']")WebElement newcustomerItem;  //2
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")WebElement customerNameTb; //3
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement customerDescriptionTb;  //4
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")WebElement createcustomerButton;  //5
	@FindBy(xpath="//span[@class='innerHtml']")WebElement toastmessage;                       //6
	@FindBy(xpath="//div[@class='emptySelection']")WebElement selectcustomerDropdown;       //7
	@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Galaxy Corporation']")WebElement GalaxyOption;  //8
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")WebElement searchCustomerNameTb; //9
	@FindBy(xpath="(//div[@class='editButton'])[16]")WebElement SettingsButton;
	@FindBy(xpath="(//div[@class='action'])[1]")WebElement ActionButton;
	
	
	//we are using the same constructor.
	
	public TaskListPage() {
		PageFactory.initElements(driver, this);
	}
/***************************************************/
	
	public void clickAddNewButton() {   //1
		addnewButton.click();
	}
	public void clickNewCustomerItem() {   //2
		newcustomerItem.click();
	}
	public void enterCustomerNameTb (String customerName) {  //3//we are passing the variable String instead of hard coding.
		customerNameTb.sendKeys(customerName);
	}
	public void enterCustomerDescription(String customerDesc){  //4 we are passing the variable String instead of hard coding.
		customerDescriptionTb.sendKeys(customerDesc);
	}
	public void clickCustomerButton(){
		createcustomerButton.click();     //5
	}
	public String getToastmessage(){   //6
		return toastmessage.getText();
	}
	public void clickselectCustomer(){   //7
		selectcustomerDropdown.click();
	}
	public void selectGalaxyOption(){  //8
		GalaxyOption.click();
	}
 public void enterSearchCustomerTb (String customerName){//9
	 searchCustomerNameTb.sendKeys(customerName);
 }
public void clickSettingsButton(){
	SettingsButton.click();
}


}
/*#43
 */
