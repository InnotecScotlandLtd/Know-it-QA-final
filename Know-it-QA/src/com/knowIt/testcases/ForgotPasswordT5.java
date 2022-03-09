package com.knowIt.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.ForgotPassword;
import com.knowIt.utility.BrowserFactory;


public class ForgotPasswordT5   {
	
	WebDriver driver ;
	
	
	@BeforeTest
    public void setup() throws Exception {
    	
    driver = BrowserFactory.StartBrowser(driver,"chrome","https://beta.know-it.co.uk");
    Thread.sleep(5000);
    }
	
	
	@Test
	public void forgotpswd () throws Exception {
	
	ForgotPassword fp = PageFactory.initElements(driver,ForgotPassword.class);
	fp.forgotpassword("demokit1@hotmail.com");
	
}
	
	@AfterTest
    public void teardown () throws Exception {
    	BrowserFactory.quitBrowser(driver);
    	Thread.sleep(5000);
}
}



