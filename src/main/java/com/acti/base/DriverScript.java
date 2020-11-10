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

/*
 * Name:DriverScript
 * Description:XXX
 * Developed By:Kanya
 * DataModified:11/9/2020
 */

public class DriverScript {
	public static WebDriver driver;
	static Properties prop;// we made this Properties as a global variable
							// because we need to use it in other places.

	public DriverScript()// constructor

	{

		try// to deal with external files use try catch method.
		{
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);// file type as an
															// argument
			prop = new Properties();   // class object
			prop.load(fis);           // from this prop object call the method load and
							         // give file argument.
		} catch (Exception e) {
			System.out.println("Unable to load the file" + e.getMessage());

		}

	}

	// next thing we are going to create a method to open up the browser and
	// reading fm prop file.
	
	public static void initBrowser() 
	{
		String browser = prop.getProperty("browser");// this is a method-
														// browser is a key
														// type.
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/browsers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("unsupported browser value");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 launchApplication();
		// to call the below static method we can also put the launchApplication
		// here.
		try{
		 Thread.sleep(3000);
		}
		 catch(InterruptedException e){
		 e.printStackTrace();
		 }
		//closeApplication();{
		//	}
		}
		 public static void launchApplication()//its a static method
		// breaking like this is called Modularization.for easy trouble shooting
		// and maintenance
		 {
		String url = prop.getProperty("qaurl");
		driver.get(url);
		 }
		 public static void closeApplication()//another method
		 {
		 driver.quit();
	}
}
