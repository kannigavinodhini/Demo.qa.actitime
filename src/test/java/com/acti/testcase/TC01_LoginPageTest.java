// session recording 41- 44
//Multiple user is failing.

package com.acti.testcase;


import org.testng.annotations.Test;

import com.acti.utils.Excellibrary;
import com.acti.utils.Generic;


public class TC01_LoginPageTest extends BaseTestCase{
	
@Test
	public void testLoginFunction() //call a method
	{
                  loginPage.loginToApplication("admin", "manager"); //--using the LoginPage class.
                 Generic.fn_waitforPageTitle(driver, "Enter");
                  System.out.println(driver.getTitle());
                  enterTimePage.clickLogoutlink();
	}
//@Test
public void testVerifyLogoDisplayed()
{
	
	boolean flag = loginPage.verifyLogo();
	System.out.println(flag);
}
//@Test(dataProvider="actiData")
public void testloginwithMultipleUsers(String username,String password)
{
	loginPage.loginToApplication(username,password);
}

//@DataProvider(name="actiData")
public Object[][] testData()
{
Excellibrary xl = new Excellibrary();
int row = xl.getRowCount(0);
Object[][] data = new Object[row][2];

for(int i =0;i<row;i++)
{
 data[i][0]=xl.getCellData(0,i,0);
 data[i][0]=xl.getCellData(0,i,1);
}
return data;
}
}
