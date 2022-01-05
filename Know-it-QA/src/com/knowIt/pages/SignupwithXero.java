package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupwithXero {
	
	WebDriver driver ;
	
	public SignupwithXero (WebDriver ldriver) {
		ldriver = this.driver ;
	}
	
	@FindBy(xpath="//*[@id=\"signinBox\"]/div[3]/ul/li[1]/a") WebElement createanaccount ;
	@FindBy (xpath ="//*[@id=\"integrationSignups\"]/div/span")WebElement signup;
	@FindBy (xpath ="//*[@id=\"xl-form-email\"]") WebElement username ;                 
	@FindBy (xpath ="//*[@id=\"xl-form-password\"]") WebElement password;
	@FindBy (xpath="//*[@id=\"xl-form-submit\"]")  WebElement login ;
	
	@FindBy(xpath="//*[@id=\"multipleTenants\"]/div/button/span")WebElement selectorganization ;
	@FindBy(xpath="//*[@id=\"approveButton\"]")WebElement continuewithorganization ;
	
	public void xerosignup (String Uname, String pswd) throws Exception {
		
		createanaccount.click();
		signup.click();
		
		username.sendKeys(Uname);
		password.sendKeys(pswd);
		Thread.sleep(5000);
		System.out.println("enetered username and password");
		
		login.click();
		Thread.sleep(5000);
		System.out.println("Click on the login button");
		
//		Select st =new Select (selectorganization);
//		st.selectByIndex(1);
//		System.out.println("select ledger");
//		
//		continuewithorganization.click();
//		Thread.sleep(5000);
//		System.out.println("continue with organization");
	}
	
	

}