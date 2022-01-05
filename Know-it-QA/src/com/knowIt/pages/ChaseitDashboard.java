package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaseitDashboard extends BaseClass {
	
	WebDriver driver ;
	
	public ChaseitDashboard (WebDriver ldriver) {
		ldriver =this.driver ;
	}

	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/header/img")WebElement chaseit ;
	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/ul/li[1]/a")WebElement dash ;
	@FindBy(xpath="//*[@id=\"agedDebtorsList\"]/div/app-list/app-table/div/div[2]/div[9]/app-actions/ul/li/button")WebElement collectit;  
	
	@FindBy(xpath="//*[@id=\"sendToCollectConfirmBox\"]/div/app-button[2]/button")WebElement cancel ;
	@FindBy(xpath="//*[@id=\"sendToCollectConfirmBox\"]/div/app-button[1]/button")WebElement sendtocollect ;
	
	public void cdashboard () throws Exception {
		
		chaseit.click();
		Thread.sleep(5000);
		
		dash.click();
		Thread.sleep(5000);
		
		collectit.click();
		Thread.sleep(5000);
		
		cancel.click();
		Thread.sleep(5000);
		
		collectit.click();
		Thread.sleep(5000);
		
		sendtocollect.click();
		Thread.sleep(5000);
		
		System.out.println("Chase-it dashboard-pass");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
