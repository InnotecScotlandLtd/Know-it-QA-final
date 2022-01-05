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
    public void setup() {
    	
    	driver = BrowserFactory.StartBrowser(driver,"chrome","https://Beta.know-it.co.uk");
    }
	
	@Test
	public void login  () throws Exception {
		
	LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
	lp.login("demokit2@hotmail.com","Kit@12345678");
	
	}
  
    
	@AfterTest
    public void teardown () {
    	BrowserFactory.quitBrowser(driver);
    	
    	
    	
    }
	
}