package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.ForgotPassword;


public class ForgotPasswordT5 extends BaseClass {
	
	@Test
	public void forgotpswd () throws Exception {
	
	ForgotPassword fp = PageFactory.initElements(driver,ForgotPassword.class);
	fp.forgotpassword("demokit1@hotmail.com");
	
	String ActualText ="Know-it - Login" ;
	String ExpectedText= driver.getTitle() ;
	Assert.assertEquals(ActualText, ExpectedText);
	 
	

}

}

