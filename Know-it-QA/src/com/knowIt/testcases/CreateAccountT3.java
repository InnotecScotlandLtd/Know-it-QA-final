package com.knowIt.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.CreateAnAccount;




public class CreateAccountT3 extends BaseClass {
	
	
	@Test
	public void newaccount () throws Exception {
		CreateAnAccount CA = PageFactory.initElements(driver,CreateAnAccount.class );
		CA.createuser("Nibs","Pkh","kitdemo30@hotmail.com","Kit@12345678");
		
		String ActualText = driver.getTitle() ;
		String ExpectedText= "Know-it - Sign up - Success" ;
		Assert.assertEquals(ActualText, ExpectedText);
		Thread.sleep(5000);
		System.out.println("create account sucessfull");
	}

}