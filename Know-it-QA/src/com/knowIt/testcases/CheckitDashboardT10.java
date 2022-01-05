package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.CheckitDashboard;



public class CheckitDashboardT10 extends BaseClass{
	
	@Test
	public void Dashboard () throws Exception {
		
   CheckitDashboard cd = PageFactory.initElements(driver,CheckitDashboard.class);
   cd.dashboard();
   
		
	}

}
