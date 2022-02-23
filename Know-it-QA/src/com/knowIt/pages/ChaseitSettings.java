package com.knowIt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChaseitSettings {
	
	WebDriver driver ;
	
	public ChaseitSettings (WebDriver ldriver) {
		ldriver = this.driver ;
	}

	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/header/img")WebElement chaseit ;
	@FindBy (xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/ul/li[4]/a")WebElement settings ;
	@FindBy (xpath="//*[@id=\"ledgerSelector\"]")WebElement ledgerselector ;
	
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[1]/div[1]/div/input")WebElement fromname ;
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[2]/div[1]/input")WebElement address1 ;
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[2]/div[2]/input")WebElement address2 ;
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[2]/div[3]/input")WebElement town ;
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[2]/div[4]/input")WebElement county ;
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[2]/div[5]/input")WebElement postcode ;
	
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[1]/div[2]/div[2]/input")WebElement limitedcompanycheckbox ;
	@FindBy (xpath="//*[@id=\"letterSettings\"]/div[2]/div/div[1]/div[2]/div[1]/input")WebElement companynumber ;
	@FindBy (xpath="//*[@id=\"saveDetailsBtn\"]/button")WebElement savedetails ;
	
	public void settings (String fname, String add1,String add2,String twn, String count, String pcode,String compno) throws Exception {
		
		chaseit.click();
		Thread.sleep(5000);
		System.out.println("click chase-it");
		
		settings.click () ;
		Thread.sleep(5000);
		System.out.println("click settings");
		
		Select st =new Select (ledgerselector);
		st.selectByIndex(1);
		Thread.sleep(7000);
		System.out.println("select ledger");
		
		
		fromname.sendKeys(fname);
		Thread.sleep(3000);
		System.out.println("from name");
		
		address1.sendKeys(add1);
		Thread.sleep(3000);
		System.out.println("address1");
		
		address2.sendKeys (add2);
		Thread.sleep (3000);
		System.out.println("address2");
		
		town.sendKeys(twn);
		Thread.sleep(3000);
		System.out.println("town");
		
		county.sendKeys (count);
		Thread.sleep(3000);
		System.out.println("county");
		
		postcode.sendKeys(pcode);
		Thread.sleep(3000);
		System.out.println("postcode");
		
		limitedcompanycheckbox.click();
		Thread.sleep(3000);
		System.out.println("limited company checkbox");
		
		companynumber.sendKeys(compno);
		Thread.sleep(5000);
		System.out.println("company number");
		
		savedetails.click();
		Thread.sleep(5000);
		System.out.println("save details");
		
	}
	
}