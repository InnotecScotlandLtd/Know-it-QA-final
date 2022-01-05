package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.MyIntegration;


public class MyinterationT6 extends BaseClass {
	
	@Test
	public void acintegration  () throws Exception {
		MyIntegration mi= PageFactory.initElements(driver,MyIntegration.class);
		mi.accountintegration("nibesh@know-it.co.uk","Kit@123456");
	}

}

