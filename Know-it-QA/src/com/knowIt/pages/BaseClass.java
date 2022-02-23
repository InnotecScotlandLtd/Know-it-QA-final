package com.knowIt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.knowIt.utility.BrowserFactory;



public class BaseClass {

	public WebDriver driver ;
	
	@BeforeTest
    public void setup() throws Exception {
    	
    	driver = BrowserFactory.StartBrowser(driver,"chrome","https://test.know-it.co.uk");
    	Thread.sleep(5000);
    }
	
	@Test
	public void login  () throws Exception {
		
	LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
	lp.login("nibesh@know-it.co.uk","Kit@12345678");
	Thread.sleep(5000);
	
	
	}
  
    
	@AfterTest
    public void teardown () throws Exception {
    	BrowserFactory.quitBrowser(driver);
    	Thread.sleep(5000);
    	
    	
    	
    	
    }
	
}