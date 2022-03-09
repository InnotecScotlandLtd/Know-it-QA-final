package com.knowIt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChaseitInvoices {
	
	WebDriver driver ;

	public ChaseitInvoices (WebDriver ldriver) {
	ldriver = this.driver ;
	
	}
	
	//Chase-it-invoices
	@FindBy (xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/header/img")WebElement Chaseit ;
	@FindBy (xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/ul/li[5]/a")WebElement Invoices ;
	

	
    //Click on a company, invoice and contact Details
	@FindBy (xpath= "//*[@id=\"invoiceListTable\"]/app-list/div[3]/div[4]/h3")WebElement companyclick ;
	@FindBy (xpath="//*[@id=\"invoiceListTable\"]/app-list/div[3]/div[1]/app-table/div/div[2]/div[1]/a")WebElement invoiceclick ;
	
	
	@FindBy (xpath="//*[@id=\"paymentsAndNotes\"]/div[1]/p[2]")WebElement contactdetails ;
	 
	//Add expected payments
	@FindBy (xpath="//*[@id=\"invoiceActions\"]/app-button[1]/button")WebElement addexpectedpayment ;
	@FindBy (xpath= "//*[@id=\"invoiceNotes\"]/app-addexpectedpayments/app-slidepanel/div[2]/div/div[1]/div/app-button/button")WebElement closeexppaymentpup ;
	@FindBy (xpath="//*[@id=\"ep_date_0\"]")WebElement paymentdate ;
	@FindBy (xpath="//*[@id=\"addexpectedpaymentsForm\"]/form/div[2]/app-button/button")WebElement savebutton1;
	                 
		
	//Add Notes
	@FindBy (xpath="//*[@id=\"invoiceActions\"]/app-button[2]/button")WebElement addnote ;
	@FindBy (xpath="//*[@id=\"invoiceNotes\"]/app-addnote/app-slidepanel/div[2]/div/div[1]/div/app-button/button") WebElement closenotepopup ;
	@FindBy (xpath="//*[@id=\"noteType\"]" )WebElement notetype ;
	@FindBy (xpath="//*[@id=\"noteContent\"]")WebElement notecontent ;
	@FindBy (xpath="//*[@id=\"addNoteForm\"]/form/div[2]/app-button/button")WebElement savebutton2;
	
	//search by company name 
	@FindBy (xpath="//*[@id=\"ledgerCompany.companyName\"]")WebElement companysearch ;
	@FindBy (xpath=" //*[@id=\"invoiceListTable\"]/app-list/div[3]/div/app-table/div/div[2]/div[6]/app-actions/ul/li[1]/button")WebElement sendnow ;
	@FindBy (xpath="//*[@id=\"chase\"]/app-invoice-list/app-slidepanel/div[2]/div/div[1]/div/app-button/button")WebElement closesendnowpopup ;
	@FindBy(xpath="//*[@id=\"template\"]") WebElement sendreminder;
	
	@FindBy(xpath="//*[@id=\"previewInvoice\"]")WebElement preview ;   
	@FindBy(xpath="//*[@id=\"chase\"]/app-invoice-list/app-chase-preview-dialog/app-modal/div/div/div/header/app-toggle-button/label/div/span")WebElement multiple ;
	         
	@FindBy(xpath="//*[@id=\"chase\"]/app-invoice-list/app-chase-preview-dialog/app-modal/div/div/div/button/span")WebElement closepopup ;
    @FindBy(xpath="//*[@id=\"sendReminderForm\"]/form/div[2]/app-button[2]/button")WebElement send ;  
	@FindBy(xpath="//*[@id=\"invoiceListTable\"]/app-list/div[3]/div/app-table/div/div[2]/div[6]/app-actions/ul/li[2]/button")WebElement pause ;
	
	               
	
	
	public void invoice (String date,String content,String cnamesearch) throws Exception {
		
		Chaseit.click();
		Thread.sleep(5000);
		System.out.println("Click Chase-it");
		
		Invoices.click();
		Thread.sleep(5000);
		System.out.println("Click Invoices");
		
//		companyclick.click ();
//		Thread.sleep(5000);
//		System.out.println("click on the comapany");
		
		invoiceclick.click();
		Thread.sleep(5000);
		System.out.println("Click on the invoice");
		
		contactdetails.click();
		Thread.sleep(5000);
		System.out.println("Click contact details");
		
		contactdetails.click();
		Thread.sleep(5000);
		System.out.println("Click contact details");
		
		
		addexpectedpayment.click();
		Thread.sleep(5000);
		System.out.println("Click Add expected payment");
		
		closeexppaymentpup.click();
		Thread.sleep(5000);
		System.out.println("Close popup");
		
		addexpectedpayment.click();
		Thread.sleep(5000);
		System.out.println("Click Add expected payment");
		
		paymentdate.sendKeys(date);
		Thread.sleep(5000);
		System.out.println("Added payment date");
		
		savebutton1.click();
		Thread.sleep(5000);
		System.out.println("Clicked the save button");
		
		addnote.click();
		Thread.sleep (5000);
		System.out.println("Click Add note");
				
		closenotepopup.click();
		Thread.sleep (5000);
		System.out.println("close note popup");
		
		addnote.click();
		Thread.sleep (5000);
		System.out.println("Click Add note");
		
		Select st = new Select (notetype);
		st.selectByIndex(2);
		Thread.sleep(5000);
		System.out.println("Select Note type");
		
		notecontent.sendKeys (content);
		Thread.sleep(5000);
		System.out.println("Type in note content");
		
		savebutton2.click();
		Thread.sleep(5000);
		System.out.println("Click on the save button");
		
		Chaseit.click();
		Thread.sleep(5000);
		System.out.println("Click Chase-it");
		
		Invoices.click();
		Thread.sleep(5000);
		System.out.println("Click Invoices");
		
		
		companysearch.sendKeys(cnamesearch);
		Thread.sleep(5000);
		System.out.println("company search");
		
		sendnow.click();
		Thread.sleep(5000);
		System.out.println("click send now");
		
		closesendnowpopup.click();
		Thread.sleep(5000);
		System.out.println("close send now pop up");
		
		sendnow.click();
		Thread.sleep(5000);
		System.out.println("click send now");
		
		Select st1=new Select (sendreminder);
		st1.selectByIndex(3);
		Thread.sleep(15000);
		System.out.println("select reminder from the template");
		
		preview.click();
		Thread.sleep(5000);
		System.out.println("Preview chase template");
		
		multiple.click();
		Thread.sleep(5000);
		System.out.println("Multiple preview");
		
		closepopup.click();
		Thread.sleep(10000);
		System.out.println("close popup");
		
		
		send.click();
		Thread.sleep(10000);
		System.out.println("send");
		
		companysearch.sendKeys(cnamesearch);
		Thread.sleep(10000);
		System.out.println("company search");
		
		pause.click();
		Thread.sleep(10000);
		System.out.println("Click pause");
				
	}
	
	
	
	
	
	
}