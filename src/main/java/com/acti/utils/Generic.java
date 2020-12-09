package com.acti.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic {
	//Generic function for explicit wait statements, frames,date,screenshot,actions
public static void fn_sleep(){
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}
public static void makeScreenshot(WebDriver driver)
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	FileHandler.copy(src, new File("./report/screenshots/login.png"));
} 
catch (IOException e) {
	
	e.printStackTrace();
}

}

public static String makeScreen(WebDriver driver,String screenShotName)
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String dest="./report/screenshots/login.png";
	File fileDest=new File(dest);
	try{
		FileUtils.copyFile(src,fileDest);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return dest;
	}
// generic method for webdriver wait.

//you can create any number of wait methods for any elements.

//video session #45.

public static void fn_waitforPageTitle(WebDriver driver,String title)
{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.titleContains(title));//don't hard code it.
	}
// to save all the previous records.
public static String generateDataTime(){
	SimpleDateFormat customFormat = new SimpleDateFormat("MM_dd_yy_HH_mm_ss");
	Date date = new Date();
	return customFormat.format(date);
}
}
