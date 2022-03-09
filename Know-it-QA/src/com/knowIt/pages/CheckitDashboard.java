package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckitDashboard {
	
	WebDriver driver;
	
	public CheckitDashboard (WebDriver ldriver) {
		ldriver =this.driver ;
	}
    
	//check
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/header/img")WebElement check ;
	 	              
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/ul/li[1]/a")WebElement dashboard ;
	
	//credit Report
	@FindBy(xpath="//*[@id=\"creditReportMonitoringList\"]/div/app-list/app-table/div/div[2]/div[1]/a ")WebElement creditreport;
	@FindBy(xpath="//*[@id=\"creditReportMonitoringList\"]/div/app-button/button ")WebElement creportmonitoringviewall ;
	
	//Credit Report Archive
	@FindBy(xpath="//*[@id=\"archivedCreditReportsList\"]/div/app-list/app-table/div/div[3]/div[2]/a ")WebElement creportarchive ;
	@FindBy(xpath="//*[@id=\"archivedCreditReportsList\"]/div/app-list/app-table/div/div[3]/div[4]/app-actions/ul/li/button ")WebElement view ;
	@FindBy(xpath="//*[@id=\"archivedCreditReportsList\"]/div/app-button/button ")WebElement carchivedviewall ;
	
	//unsecured creditor claims
    @FindBy(xpath="//*[@id=\"unsecuredCreditors\"]/div/app-list/app-table/div/div[3]/div[2]/a ")WebElement  unsecuredcreditorsclaims ;
 	@FindBy(xpath="//*[@id=\"unsecuredCreditors\"]/div/app-button/button")WebElement   unsecuredcreditorviewall ;
	
	//Gazette notices
	@FindBy(xpath="//*[@id=\"recentNoticesList\"]/div/app-list/app-table/div/div[2]/div[6]/app-actions/ul/li/button ")WebElement viewnotices ;
	               
	                
	@FindBy(xpath="//*[@id=\"dashboard\"]/div[3]/app-recent-notices/app-slidepanel/div[2]/div/div[1]/div/app-button/button ")WebElement close ;
	@FindBy(xpath="//*[@id=\"recentNoticesList\"]/div/app-list/app-table/div/app-paging/button[2] ")WebElement next ;
	@FindBy(xpath ="//*[@id=\"recentNoticesList\"]/div/app-list/app-table/div/app-paging/button[1]")WebElement prev ;
	@FindBy(xpath="//*[@id=\"recentNoticesList\"]/div/app-button/button")WebElement noticesviewall ;
	
	
	public void dashboard () throws Exception {
		
		check.click();
		Thread.sleep(5000);
		System.out.println("check click");
		
		dashboard.click();
		Thread.sleep(5000);
		System.out.println("Dashboard click");
		
		creditreport.click();
		Thread.sleep(5000);
		System.out.println("Credit report-monitoring click");
		
	
		
		dashboard.click();
		Thread.sleep(5000);
		System.out.println("Dashboard click");
		
		creportmonitoringviewall.click();
		Thread.sleep(5000);
		System.out.println("credit monitoring view all");
		
 
		
		dashboard.click();
		Thread.sleep(5000);
		System.out.println("Dashboard click");
		
		creportarchive.click();
		Thread.sleep(5000);
		System.out.println("credit report archive");
 
		
		dashboard.click();
		Thread.sleep(5000);
		System.out.println("Dashboard click");
		
		view.click();
		Thread.sleep(5000);
		System.out.println("view credit report");
 
		
		dashboard.click();
		Thread.sleep(5000);
		System.out.println("Dashboard click");
		
		carchivedviewall.click();
		Thread.sleep(5000);
		System.out.println("credit Report archive view all");
		
 
		
		dashboard.click();
		Thread.sleep(5000);
		System.out.println("Dashboard click");
		
		unsecuredcreditorsclaims.click () ;
		Thread.sleep(5000);
		System.out.println("");
		
 
		
		dashboard.click();
		Thread.sleep(5000);
		System.out.println("Dashboard click");
		
		viewnotices.click();
		Thread.sleep(5000);
		System.out.println();
		
		close.click();
		Thread.sleep(5000);
		System.out.println("Close notice");
		
		next.click();
		Thread.sleep(5000);
		System.out.println("next button");
		
		prev.click();
		Thread.sleep(5000);
		System.out.println("previous button");
		
		noticesviewall.click();
		Thread.sleep(5000);
		System.out.println("Notices view all");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
