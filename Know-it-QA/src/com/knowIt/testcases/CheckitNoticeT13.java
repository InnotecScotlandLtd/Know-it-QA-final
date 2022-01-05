package com.knowIt.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.knowIt.pages.BaseClass;
import com.knowIt.pages.CheckitNotices;


public class CheckitNoticeT13 extends BaseClass {
	
	@Test
	public void checknotices () throws Exception {
		
		CheckitNotices cn = PageFactory.initElements(driver, CheckitNotices.class);
		cn.notices("MARIA SABINA LTD");
	}

}