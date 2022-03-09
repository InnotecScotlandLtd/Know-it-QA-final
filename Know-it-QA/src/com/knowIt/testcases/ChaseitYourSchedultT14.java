package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.ChaseitYourSchedule;


public class ChaseitYourSchedultT14 extends BaseClass {
	
	@Test
    public void chaseschedule () throws Exception {
    	
    	ChaseitYourSchedule ch = PageFactory.initElements(driver, ChaseitYourSchedule.class);
    	ch.chasers("13","50", "9", "1","9" ,"36");
    	
    }
	
	
}
