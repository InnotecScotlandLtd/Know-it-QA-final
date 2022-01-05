package com.knowIt.pages;

public class CheckitUnsecuredCreditors {
	

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckitUnsecuredCreditors {

	WebDriver driver ;
	
	public CheckitUnsecuredCreditors (WebDriver ldriver) {
		
		ldriver =this.driver ;
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/header/img")WebElement check ;
	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/ul/li[6]/a") WebElement Unsecuredcred ; 
	
	@FindBy (xpath = "//*[@id=\"companyname\"]")WebElement companynamesearch ;
	
	@FindBy(xpath ="//*[@id=\"unsecuredCreditorsListTable\"]/app-list/app-table/div/div[2]/div[1]") WebElement companynamecolumnclick ;
	
	@FindBy (xpath ="//*[@id=\"unsecuredCreditorsListTable\"]/app-list/app-table/div/div[3]/div[2]/a")WebElement companynameclick ;
	
	public void UnsCreditrors (String compname) throws Exception {
		
	check.click();
	Thread.sleep(5000);
	System.out.println(" Check it button");
	
	Unsecuredcred.click();
	Thread.sleep(5000);
	System.out.println("Unsecured Creditors");
	
		
	companynamesearch.sendKeys (compname) ;
	Thread.sleep(5000);
	System.out.println("company name search");
	
	
	companynamesearch.clear();
	companynamesearch.sendKeys(Keys.ENTER);
	
	companynamecolumnclick.click();
	Thread.sleep(5000);
	System.out.println("Ascending-descending");
	
	companynameclick.click();
	Thread.sleep(5000);
	System.out.println("click company name");
	
	
	}
	
	
	
}

}
