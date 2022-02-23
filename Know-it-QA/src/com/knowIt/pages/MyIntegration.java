package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyIntegration {
	
	WebDriver driver ;
	
	public MyIntegration (WebDriver ldriver) {
		
		ldriver =this.driver ;
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[6]/header/h2") WebElement integration ;
			
	@FindBy(xpath="//*[@id=\"integrationSection\"]/div[2]/h4/app-button/button/div/span")WebElement connecttoxero;
	
	@FindBy (xpath ="//*[@id=\"xl-form-email\"]") WebElement username ;  
	
	@FindBy (xpath ="//*[@id=\"xl-form-password\"]") WebElement password;
	
	@FindBy (xpath="//*[@id=\"xl-form-submit\"]")  WebElement login ;
	
	
	@FindBy(xpath="//*[@id=\"multipleTenants\"]/div/button/span")WebElement selectorganization;
	
	
	
	
	@FindBy(xpath="//*[@id=\"0151ae0c-cd01-489e-8023-96c8fdd98f60\"]/button/span")WebElement selectedorg ;
	               
 	@FindBy (xpath="//*[@id=\"approveButton\"]")WebElement approve ;
	
	
	public void accountintegration (String Uname, String pswd) throws Exception {
		
		WebElement I = integration ;
		
		I.click();
		Thread.sleep(5000);
		
		connecttoxero.click();
		Thread.sleep(5000);
		
		username.sendKeys(Uname);
		Thread.sleep(5000);
		password.sendKeys(pswd);
		Thread.sleep(5000);
		System.out.println("enetered username and password");
		
		login.click();
		Thread.sleep(15000);
		System.out.println("Click on the login button");
		
		
		selectorganization.click();
		Thread.sleep(5000);
		System.out.println("Click seelect organization");
		
		selectedorg.click();
		Thread.sleep(5000);
		System.out.println("Seelect organization");
		
//		Select st = new Select (selectorganization);
//		st.selectByIndex(2);
//		Thread.sleep(5000);
//		System.out.println("select ledger");
		
		approve.click();
		System.out.println("Allow Access)");
		Thread.sleep(30000);
			
		
	}
	
	
	
	  
	
	 
	
	
	

}
 