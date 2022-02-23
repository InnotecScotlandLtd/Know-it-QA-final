package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class LoginPage {
	
	WebDriver driver ;
	
	public LoginPage (WebDriver ldriver) {
		
		ldriver =this.driver ;
	}

	
	@FindBy (xpath="//*[@id=\"email\"]")WebElement username ;
	@FindBy (xpath="//*[@id=\"password\"]")WebElement password ;
	@FindBy (xpath="//*[@id=\"loginForm\"]/form/div[2]/app-button/button")WebElement login ;
	
	              
	public void login (String user, String pass) throws Exception {
		
		username.sendKeys(user);
		Thread.sleep(5000);
		System.out.println("Entered Username");
		
		password.sendKeys(pass);
		Thread.sleep(5000);
		System.out.println("Entered password");
		
		
		login.click();
		Thread.sleep(5000);
		System.out.println("Login successful");
		 
		
		
		
		
	}
	
	

}