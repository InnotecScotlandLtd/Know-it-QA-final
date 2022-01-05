package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.CheckitCreditmonitoring;



public class CheckitCreditMonitoringT12 extends BaseClass {
	
	@Test
	public void monitoring () throws Exception {
		
		CheckitCreditmonitoring cm = PageFactory.initElements(driver, CheckitCreditmonitoring.class);
		cm.monitoring("Know-it (Global)");
		
	}
	
	

}