package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.ChaseitDashboard;



public class ChaseitDashboardT7 extends BaseClass {
	
	@Test
	public void dashboard () throws Exception {
		ChaseitDashboard cd = PageFactory.initElements(driver,ChaseitDashboard.class);
		cd.cdashboard();
	}

}