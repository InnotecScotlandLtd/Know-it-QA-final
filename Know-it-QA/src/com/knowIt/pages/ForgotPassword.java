package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword {
	
	WebDriver driver ;
	
	public ForgotPassword (WebDriver ldriver ) {
		ldriver = this.driver ;
	}
		
		@FindBy(xpath="//*[@id=\"signinBox\"]/div[3]/ul/li[2]/a")WebElement forgotpassword ;
		@FindBy(xpath="//*[@id=\"email\"]")WebElement email ;
		@FindBy(xpath="//*[@id=\"forgotPasswordForm\"]/form/div[2]/app-button/button")WebElement resetpassword;
		@FindBy(xpath="//*[@id=\"forgotPasswordSuccessBox\"]/app-button/button")WebElement returntologin ;
		
		 
		public void forgotpassword (String emailaddress) throws Exception {
			
			forgotpassword.click();
			Thread.sleep(5000);
			
			email.sendKeys(emailaddress);
			Thread.sleep(5000);
			
			resetpassword.click();
			Thread.sleep(5000);
			System.out.println("reset password sucessfull");
			
			returntologin.click();
			Thread.sleep(5000);
			System.out.println("return to login");
			
			
			
		}
		
}
