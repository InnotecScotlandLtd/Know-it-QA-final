package com.knowIt.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.CreateAnAccount;
import com.knowIt.utility.BrowserFactory;




public class CreateAccountT3 {
	
	WebDriver driver ;
	
	@BeforeTest
    public void setup() throws Exception {
    	
    	driver = BrowserFactory.StartBrowser(driver,"chrome","https://test.know-it.co.uk");
    	Thread.sleep(5000);
    }
	
		
	@Test
	public void newaccount () throws Exception {
		CreateAnAccount CA = PageFactory.initElements(driver,CreateAnAccount.class );
		CA.createuser("Nibs","Pkh","nibesh@know-it.co.uk","Kit@12345678");
		
		String ActualText = driver.getTitle() ;
		String ExpectedText= "Know-it - Sign up - Success" ;
		Assert.assertEquals(ActualText, ExpectedText);
		Thread.sleep(5000);
		System.out.println("create account sucessfull");
	}
	
    
	@AfterTest
    public void teardown () throws Exception {
    	BrowserFactory.quitBrowser(driver);
    	Thread.sleep(5000);
    	

}
}