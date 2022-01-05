package com.knowIt.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.SignupwithXero;



public class XeroSignupT4 extends BaseClass{
	
	@Test
	public void xerosignup () throws Exception {
		SignupwithXero sx = PageFactory.initElements(driver, SignupwithXero.class);
		sx.xerosignup( "nibesh@know-it.co.uk","Kit@123456");
	}
	

}

