package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.ChaseitSettings;


public class ChaseitSettingsT8 extends BaseClass {
	
    @Test
	public void chasesettings () throws Exception {
		
		ChaseitSettings cs = PageFactory.initElements(driver, ChaseitSettings.class);
		cs.settings("Nik Smith", "21 test address", "Test address 2","Test toon","County test","T10 2HY","8957456");
	}
	
	
	
	

}
