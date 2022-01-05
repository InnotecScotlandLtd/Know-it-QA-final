package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckitCreditmonitoring {
	
	WebDriver driver ;
	
	public CheckitCreditmonitoring (WebDriver ldriver) {
		
		ldriver =this.driver ;
		
	}
    
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/header/img")WebElement check ;
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/ul/li[3]/a")WebElement creditmonitoring ;
	@FindBy (xpath="//*[@id=\"keywords\"]") WebElement CmonitoringSearch ;
	@FindBy (xpath="//*[@id=\"monitoringListTable\"]/app-list/app-table/div/div[3]/div[1]/a")WebElement compnameclick ;
	
	
	public void monitoring (String compname) throws Exception {
		
		check.click();
		Thread.sleep(5000);
		System.out.println("check click");
		
		creditmonitoring.click () ;
		Thread.sleep(5000);
		System.out.println("Click Credit monitoring");
		
		CmonitoringSearch.sendKeys(compname);
		Thread.sleep(5000);
		System.out.println("enter company name");
		
		compnameclick.click();
		Thread.sleep(5000);
		System.out.println("Company name click");
		
		
	}
	
	
}
