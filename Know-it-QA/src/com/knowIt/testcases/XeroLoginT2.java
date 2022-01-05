package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.XeroLogin;



public class XeroLoginT2 extends BaseClass {
	
	@Test
	public void loginwithxero() throws Exception {
		
		XeroLogin xl =PageFactory.initElements(driver, XeroLogin.class);
		xl.login("kitdemo30@hotmail.com", "Kit@123456");
		
		String ActualText = driver.getTitle();
		String ExpectedText = "Login | Xero Accounting Software" ;
		Assert.assertEquals(ActualText, ExpectedText);
		System.out.println("Sign in with Xero sucessfull");
		
				
		
		
	}

}