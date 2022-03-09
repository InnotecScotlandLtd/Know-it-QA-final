package com.knowIt.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.XeroLogin;
import com.knowIt.utility.BrowserFactory;



public class XeroLoginT2 {
	
	WebDriver driver ;
	
	@BeforeTest
    public void setup() throws Exception {
    	
    	driver = BrowserFactory.StartBrowser(driver,"chrome","https://beta.know-it.co.uk");
    	Thread.sleep(5000);
    }
	
	@Test
	public void loginwithxero() throws Exception {
		
		XeroLogin xl =PageFactory.initElements(driver, XeroLogin.class);
		xl.login("nibesh@know-it.co.uk", "Kit@123456");
		
		String ActualText = driver.getTitle();
		String ExpectedText = "Know-it-Dashboard" ;
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("Sign in with Xero sucessfull");
		
		
	}
	
	@AfterTest
    public void teardown () throws Exception {
    	BrowserFactory.quitBrowser(driver);
    	Thread.sleep(5000);
    	
	}
}