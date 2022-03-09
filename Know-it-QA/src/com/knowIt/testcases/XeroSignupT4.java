package com.knowIt.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.SignupwithXero;
import com.knowIt.utility.BrowserFactory;



public class XeroSignupT4  {
	
	WebDriver driver ;
	
	@BeforeTest
    public void setup() throws Exception {
    	
    	driver = BrowserFactory.StartBrowser(driver,"chrome","https://test.know-it.co.uk");
    	Thread.sleep(5000);
    }
	
	
	@Test
	public void xerosignup () throws Exception {
		SignupwithXero sx = PageFactory.initElements(driver, SignupwithXero.class);
		sx.xerosignup( "nibesh@know-it.co.uk","Kit@123456");
	}
	
	



@AfterTest
public void teardown () throws Exception {
	BrowserFactory.quitBrowser(driver);
	Thread.sleep(5000);
}
}



