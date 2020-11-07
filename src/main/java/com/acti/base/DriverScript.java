//inheritance concept.// video41//11/4/2020
//to check the method working do the unit testing method.
//for all the basic steps generic steps we will have it in the  Drivers script.

package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
	public static WebDriver driver;
	static Properties prop;

	public DriverScript()// constructor

	{

		try// to deal with external files use try catch method.
		{
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} 
		catch (Exception e) {
			System.out.println("Unable to load the file" + e.getMessage());

		}

	}

	public static void intiBrowser() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/browsers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gekco.driver", "./src/test/resources/browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("unsupport browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String url = prop.getProperty("qurl");
		driver.get(url);
	}
}
