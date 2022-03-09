package com.knowIt.testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.knowIt.pages.LoginPage;
import com.knowIt.utility.BrowserFactory;


public class LoginT1  {
	
	WebDriver driver ;
	
 
	
	@BeforeTest
    public void setup() throws Exception {
    	
    	driver = BrowserFactory.StartBrowser(driver,"chrome","https://beta.know-it.co.uk");
    	Thread.sleep(5000);
    }
	
	@Test
	public void login  () throws Exception {
		
    	LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login("nibesh@know-it.co.uk","Kit@12345678");
	  
	    String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "Know-it - Dashboard" ;
	    Assert.assertEquals(ExpectedTitle,ActualTitle);
	    System.out.println("Login Sucessfull");
	    Thread.sleep(5000);

}
	
	
	@AfterTest
    public void teardown () throws Exception {
    	BrowserFactory.quitBrowser(driver);
    	Thread.sleep(5000);
}
}

