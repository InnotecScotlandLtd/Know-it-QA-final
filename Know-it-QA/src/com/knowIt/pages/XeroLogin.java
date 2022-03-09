package com.knowIt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XeroLogin {
	
	WebDriver driver ;
	
	public XeroLogin (WebDriver ldriver) {
		
		ldriver = this.driver ;
	}
	
	@FindBy (xpath ="//*[@id=\"integrationSignin\"]/div") WebElement signinwithxero;
	@FindBy (xpath ="//*[@id=\"xl-form-email\"]") WebElement username ;                 
	@FindBy (xpath ="//*[@id=\"xl-form-password\"]") WebElement password;
	@FindBy (xpath="//*[@id=\"xl-form-submit\"]")  WebElement login ;
	
	public void login (String Uname, String pswd) throws Exception    {
		
		signinwithxero.click();
		Thread.sleep(5000);
		
		username.sendKeys(Uname);
		password.sendKeys(pswd);
		Thread.sleep(5000);
		System.out.println("enetered username and password");
		
		login.click();
		Thread.sleep(15000);
		System.out.println("Click on the login button");
		
		
	}
	
}
	
	

