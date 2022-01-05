package com.knowIt.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckitNotices {
	
	WebDriver driver ;
	
	public CheckitNotices (WebDriver ldriver) {
		
		ldriver = this.driver ;
		
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/header/img")WebElement check ;
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[2]/ul/li[4]/a")WebElement notices ;
	@FindBy(xpath="//*[@id=\"company_name\"]")WebElement searchcompanyname ;
	@FindBy(xpath="//*[@id=\"notice_type\"]")WebElement noticetype ;
	@FindBy(xpath="//*[@id=\"sector\"]")WebElement sector ;
	@FindBy(xpath="//*[@id=\"noticesList\"]/app-list/app-table/div/div[3]/div[6]/app-actions/ul/li/button")WebElement viewnotice ; 
	@FindBy(xpath="//*[@id=\"content\"]/app-notices/app-slidepanel/div[2]/div/div[1]/div/app-button/button")WebElement close ;

	
	public void notices (String search) throws Exception {
		
		check.click();
		Thread.sleep(5000);
		System.out.println(" Check it button");
		
		notices.click();
		Thread.sleep(5000);
		System.out.println("click notice");
		
		searchcompanyname.sendKeys(search);
		Thread.sleep(5000);
		System.out.println("Company name search");
		
		searchcompanyname.clear();
		Thread.sleep (5000);
		System.out.println("Clear search");
		
	  	searchcompanyname.sendKeys(Keys.ENTER);
	  	Thread.sleep (5000) ;
	  	
		Select st = new Select (noticetype) ;
		st.selectByIndex(6);
		Thread.sleep(5000);
		System.out.println("select notice type");
		
		Select st1 = new Select (noticetype) ;
		st1.selectByIndex(0);
		Thread.sleep(5000);
		System.out.println("clear notice type");
		
		
		Select st2 = new Select (sector)	;
		st2.selectByIndex(11);
		Thread.sleep(5000);
		System.out.println("Select sector");
		
		Select st3 = new Select (sector);
		st3.selectByIndex(0);
		Thread.sleep(5000);
		System.out.println("clear sector");
		
                 
	}

}