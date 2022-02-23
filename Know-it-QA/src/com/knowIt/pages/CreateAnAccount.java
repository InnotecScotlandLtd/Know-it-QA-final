package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.knowIt.utility.BrowserFactory;

public class CreateAnAccount {
	
	WebDriver driver ;
	
	public CreateAnAccount (WebDriver ldriver) {
		ldriver = this.driver;
		
	}

	@FindBy(xpath="//*[@id=\"signinBox\"]/div[3]/ul/li[1]/a") WebElement createanaccount ;
	
	@FindBy(xpath="//*[@id=\"firstname\"]") WebElement firstname ;
	@FindBy(xpath="//*[@id=\"lastname\"] ") WebElement lastname  ;
	@FindBy(xpath="//*[@id=\"email\"] ") WebElement emailaddress  ;
	@FindBy(xpath="//*[@id=\"password\"] ") WebElement password  ;
	@FindBy(xpath="//*[@id=\"registerForm\"]/form/div/app-checkbox/div/label/span ") WebElement checkbox ;
	@FindBy(xpath="//*[@id=\"registerForm\"]/form/div[2]/app-button/button") WebElement register ;
	
	
 
	
	public void createuser (String fname, String lname, String email,String pswd) throws Exception {
		
				
		createanaccount.click();
		Thread.sleep(5000);
		
		System.out.println("clicked on create Account button");
		
		firstname.sendKeys(fname);
		Thread.sleep(5000);
		
		lastname.sendKeys(lname);
		Thread.sleep(5000);
		
		emailaddress.sendKeys(email);
		Thread.sleep(5000);
		
		password.sendKeys(pswd);
		Thread.sleep(5000);
		
		checkbox.click();
		register.click ();
		Thread.sleep(5000);
		
		System.out.println("Entered sign up details");
		 
		
	}
	
	
}