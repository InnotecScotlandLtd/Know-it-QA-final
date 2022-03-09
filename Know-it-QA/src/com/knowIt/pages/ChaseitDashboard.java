package com.knowIt.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChaseitDashboard  {
	
	WebDriver driver ;
	
	public ChaseitDashboard (WebDriver ldriver) {
		ldriver =this.driver ;
	}

	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/header/img")WebElement chaseit ;
	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/ul/li[1]/a")WebElement dash ;
	@FindBy(xpath="//*[@id=\"agedDebtorsList\"]/div/app-list/app-table/div/div[2]/div[9]/app-actions/ul/li/button")WebElement collectit;  
	
	@FindBy(xpath="//*[@id=\"sendToCollectConfirmBox\"]/div/app-button[2]/button")WebElement cancel ;
	@FindBy(xpath="//*[@id=\"sendToCollectConfirmBox\"]/div/app-button[1]/button")WebElement sendtocollect ;
	@FindBy(xpath="//*[@id=\"dashboard\"]/div[2]/app-aged-debtors-list/app-modal/div/div/div")WebElement closepopup ;
	@FindBy(xpath="//*[@id=\"collectInvoiceList\"]/app-list/app-table/div/div[4]/div[6]/div/input")WebElement invoiceselect ;
	@FindBy(xpath="//*[@id=\"collectInvoiceList\"]/app-button/button")WebElement cont ;
	

	 
	
	
	
	public void cdashboard () throws Exception {
		
		chaseit.click();
		Thread.sleep(5000);
		
		dash.click();
		Thread.sleep(5000);
		
		collectit.click();
		Thread.sleep(5000);
		
		closepopup.click();
		Thread.sleep(5000);
		
			
		collectit.click();
		Thread.sleep(5000);
		
		invoiceselect.click();
		Thread.sleep(5000);

		
		collectit.click();
		Thread.sleep(5000);
		
		invoiceselect.click();
		Thread.sleep(10000);
		
		boolean searchIconEnabled = cont.isEnabled();
		System.out.println("Button enabled");
		
		 if (searchIconEnabled==true)
         {
                // click on the search button
                WebElement searchIcon = cont;
                searchIcon.click();
                Thread.sleep(5000);
 
		
//        cont.click();
//		Thread.sleep(10000);
//		
		
		
		System.out.println("Chase-it dashboard-pass");
		
		
		
		
		
		
		
         }	
		
		
		
		
		
	}
	
}
