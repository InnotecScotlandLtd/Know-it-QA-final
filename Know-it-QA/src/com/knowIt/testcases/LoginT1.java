package com.knowIt.testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.knowIt.pages.LoginPage;
import com.knowIt.utility.BrowserFactory;


public class LoginT1  {
	
	WebDriver driver ;
	
	@Test
	public void login  () throws Exception {
		
		driver = BrowserFactory.StartBrowser(driver,"chrome","https://Beta.know-it.co.uk");
		
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login("demokit10@hotmail.com","Kit@12345678");
	  
	    String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "Know-it - Dashboard" ;
	    Assert.assertEquals(ExpectedTitle,ActualTitle);
	    System.out.println("Login Sucessfull");
	    Thread.sleep(5000);

}
	
}

