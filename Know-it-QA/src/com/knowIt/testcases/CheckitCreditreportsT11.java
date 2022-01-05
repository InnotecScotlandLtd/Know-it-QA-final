package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.CheckitCreditReports;


public class CheckitCreditreportsT11 extends BaseClass {
	
	@Test
	public void creditReports () throws Exception {
		
		CheckitCreditReports cr = PageFactory.initElements(driver, CheckitCreditReports.class);
		cr.creditreport("Nibs");
		
		
		
	}
	
	

}
