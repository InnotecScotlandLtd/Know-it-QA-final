package com.knowIt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckitCreditReports {
	
	WebDriver driver ;
	
	public CheckitCreditReports (WebDriver ldriver) {
		
		ldriver =this.driver ;
				
	}
	
	//check-Credit Reports
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/header/img")WebElement check ;
    @FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/ul/li[2]/a")WebElement creditreports ;
    
    //Search Credit report
    @FindBy(xpath="//*[@id=\"creditReportSearch\"]")WebElement creditreportsearch ;
    @FindBy (xpath="//*[@id=\"creditReportListHeader\"]/app-search/div/div")WebElement search ;
          
  
    //purchase section
    @FindBy(xpath="//*[@id=\"creditReportListHeader\"]/app-search/div/div[2]/app-slidepanel/div[2]/div/div[1]/div/app-button/button")WebElement close ;
    @FindBy(xpath="//*[@id=\"creditReportListHeader\"]/app-search/div/div[2]/app-slidepanel/div[2]/div/div[3]/app-searchresult[1]/div/div/div[3]/app-button/button")WebElement purchase ;
   
    
    //compnyname 
    @FindBy(xpath="//*[@id=\"creditReportsListTable\"]/app-list/app-table/div/div[2]/div[2]/a")WebElement companyname ;
    
    //View Credit Report
    @FindBy(xpath="//*[@id=\"creditReportsListTable\"]/app-list/app-table/div/div[2]/div[4]/app-actions/ul/li[1]/button")WebElement view ;
    @FindBy(xpath="//*[@id=\"creditReportsListTable\"]/app-list/app-table/div/div[2]/div[4]/app-actions/ul/li[2]/button")WebElement print ;
    
    
    public void creditreport (String creportsearch) throws Exception {
    	
    	check.click();
    	Thread.sleep(5000);
    	System.out.println("check click");
    	
    	creditreports.click();
    	Thread.sleep(5000);
    	System.out.println("credit report click");
    	
    	creditreportsearch.sendKeys(creportsearch);
    	Thread.sleep(5000);
    	System.out.println("Search Credit Report");
    	
    	search.click();
    	Thread.sleep(5000);
    	System.out.println("Search for credit report");
    	
    	close.click();
    	Thread.sleep(5000);
    	System.out.println("close popup");
    	
    	creditreportsearch.sendKeys(creportsearch);
    	Thread.sleep(5000);
    	System.out.println("Search Credit Report");
    	
    	search.click();
    	Thread.sleep(5000);
    	System.out.println("Search for credit report");
    	
    	purchase.click();
    	Thread.sleep(10000);
    	System.out.println("purchase credit");
    	
    	companyname.click();
    	Thread.sleep(5000);
    	System.out.println("click company name");
    	
    	creditreports.click();
    	Thread.sleep(5000);
    	System.out.println("credit report click");
    	
    	view.click();
    	Thread.sleep(5000);
    	System.out.println("View credit report");
    	
    	creditreports.click();
    	Thread.sleep(5000);
    	System.out.println("credit report click");
    	
    	print.click();
    	Thread.sleep(5000);
    	System.out.println("Print credit report");
    	
       }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
 
}