package com.knowIt.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.CheckitUnsecuredCreditors;



public class CheckitUnsecuredCreditors15 extends BaseClass {
	
    @Test
	public void  unsecuredCreditors () throws Exception {
		
		CheckitUnsecuredCreditors uc = PageFactory.initElements(driver,CheckitUnsecuredCreditors.class);
	    uc.UnsCreditrors("MAGNELA LTD");

}
	
}