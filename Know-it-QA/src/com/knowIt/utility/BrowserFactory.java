package com.knowIt.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
   static WebDriver driver ;
   
   public static WebDriver StartBrowser (WebDriver driver, String browserName, String url) {
	   
	  //google Chrome
	   if (browserName.equalsIgnoreCase("chrome")) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\mrnib\\Documents\\Office\\Automation tools\\chromedriver.exe");
		   driver = new ChromeDriver();
		    }
	   
	   //Firefox
	   else if (browserName.equalsIgnoreCase("firefox")) {
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\mrnib\\Documents\\Office\\Automation tools\\geckodriver.exe");
		   driver= new FirefoxDriver();
		   
	   }
	   
	  driver.manage().window().maximize ();
	  //driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  
	 
	  driver.get(url);
	  
	return driver;
   }
   
   public static void quitBrowser (WebDriver driver) {
	   driver.quit();
   }
} 