package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	@FindBy(xpath="//*[@id=\"registerForm\"]/form/app-button/button ") WebElement createaccount ;
	
	
	public void createuser (String fname, String lname, String email,String pswd) throws Exception {
		
		createanaccount.click();
		System.out.println("clicked on create Account button");
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		emailaddress.sendKeys(email);
		password.sendKeys(pswd);
		checkbox.click();
		createaccount.click ();
		Thread.sleep(5000);
		System.out.println("Entered sign up details");
		 
		
	}
	
	
}