package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.ChaseitInvoices;



public class ChaseitInvoicesT9 extends BaseClass {
	
	@Test
	public void invoices () throws Exception {
		
		ChaseitInvoices ci = PageFactory.initElements(driver, ChaseitInvoices.class);
		ci.invoice("25112021", "Tezter's test note for testing", "Fusion Group UK Ltd");
		
		
	}

}