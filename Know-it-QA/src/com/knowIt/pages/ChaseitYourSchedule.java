package com.knowIt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChaseitYourSchedule {
	
	WebDriver driver ;
	
	public ChaseitYourSchedule (WebDriver ldriver) {
		
		ldriver = this.driver ;
		
	}
    //Your Schedule
	@FindBy(xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/header/img")WebElement chaseit ;
	@FindBy (xpath="//*[@id=\"container\"]/app-navigation-bar/app-navigation-section[3]/ul/li[2]/a")WebElement YSchedule ;
	@FindBy (xpath="//*[@id=\"ledgerSelector\"]")WebElement ledgerselector ;
	
	//reminders to be sent
	@FindBy (xpath="//*[@id=\"hourDigits\"]/input")WebElement hours;
	@FindBy (xpath="//*[@id=\"minuteDigits\"]/input")WebElement minutes ;
	@FindBy (xpath="//*[@id=\"schedule\"]/app-welcomebox/div/app-schedule-time/div[2]/div")WebElement setnewtime;
	
	//initial chase
	@FindBy (xpath="//*[@id=\"initialReminder\"]/div[2]/div/div[2]/div/div[3]/app-template-selector/select")WebElement initialchaseemaialatemp ;
	@FindBy (xpath="//*[@id=\"initialReminder\"]/div[2]/div/div[2]/div/div[2]/div/label/div")WebElement inemail ;
	@FindBy(xpath="//*[@id=\"initialEnableMsg\"]/div[1]/div/div[2]")WebElement notready ;
	@FindBy(xpath="//*[@id=\"initialEnableMsg\"]/div[1]/div/div[1]")WebElement activateschedule ;
	@FindBy (xpath="//*[@id=\"initialReminder\"]/div[2]/div/div[2]/div/div[4]/div")WebElement inemailpreview ;
	
	
	 //Preview email 
	@FindBy(xpath="//*[@id=\"chase\"]/app-chase-schedule/app-chase-preview-dialog/app-modal/div/div/div/header/app-toggle-button/label/div/span")WebElement multiple ;
	@FindBy(xpath="//*[@id=\"chase\"]/app-chase-schedule/app-chase-preview-dialog/app-modal/div/div/div/button/span")WebElement closepopup ;
	
	//Before invoice due-email
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[1]/h4/input")WebElement daysbefore ;
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[1]/div[2]/div/label/div ")WebElement bdemail;
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[1]/div[3]/app-template-selector/select")WebElement bdemailtemplate ;
	@FindBy (xpath="//*[@id=\"initialReminder\"]/div[2]/div/div[2]/div/div[3]/app-template-selector/select")WebElement bdemailpreview ;
 
	//Before invoice due-letter
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[2]/div[2]/div/label/div ")WebElement bdletter ;
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[1]/div[3]/app-template-selector/select")WebElement bdlettertemplate ;
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[2]/div[4]/div ")WebElement bdletterpreview ;
	
	//Before due sms
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[3]/div[2]/div/label/div")WebElement bdsms ;
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[3]/div[3]/app-template-selector/select")WebElement bdsmstemplate ;
	@FindBy (xpath="//*[@id=\"beforeDueReminders\"]/div[2]/div/div[2]/div[3]/div[4]/div")WebElement bdsmspreview;
	
	//Add reminders
	@FindBy(xpath="//*[@id=\"newReminderDays\"]") WebElement setreminder ;
	@FindBy(xpath="//*[@id=\"overdueReminders\"]/div[1]/div[2]/div/div")WebElement addreminder ;
	
	//overdue invoice due-email1
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[1]/h4/input ")WebElement  daysoverdue1 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[1]/div[2]/div/label/div")WebElement  odemail1 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[1]/div[3]/app-template-selector/select ")WebElement  odemailtemplate1 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[1]/div[4]/div ")WebElement  odemailpreview1 ;
 
	//Overdue invoice due-letter1
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[2]/div[2]/div/label/div")WebElement  odletter1;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[2]/div[3]/app-template-selector/select ")WebElement  odlettertemplate1;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[2]/div[4]/div ")WebElement  odletterpreview1 ;
	
	//Overduedue sms1
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[2]/div[4]/div ")WebElement odsms1 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[1]/div[2]/div[3]/div[3]/app-template-selector/select")WebElement odsmstempplate1;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[3]/div[4]/div ")WebElement  odsmspreview1 ;
	
	//days overdue required
	
	//overdue invoice due-email2
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[1]/h4/input")WebElement daysoverdue2 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div/label/div")WebElement odemail2 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[1]/div[3]/app-template-selector/select")WebElement odemailtemplate2  ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[1]/div[4]/div ")WebElement odemailpreview2 ;
 
	//Overdue invoice due-letter2
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/label/div")WebElement odletter2 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[2]/div[3]/app-template-selector/select")WebElement  odlettertemplate2 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[2]/div[4]/div")WebElement  odletterpreview2 ;
	
	//Overduedue sms2
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/label/div")WebElement odsms2 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[3]/div[2]/div[3]/div[3]/app-template-selector/select")WebElement odsmstemplate2 ;
	@FindBy (xpath="//*[@id=\"overdueReminders\"]/div[2]/div[2]/div[2]/div[3]/div[4]/div")WebElement odsmspreview2;
	
	
	
public void chasers (String hr,String min,String dbefore,String reminder,String oddays1,String oddays2) throws Exception {
	
	chaseit.click () ;
	Thread.sleep(5000);
	System.out.println("click on chase-it");
	
	YSchedule.click ();
	Thread.sleep(5000);
	System.out.println("click your schedule");
	
	
	Select st = new Select (ledgerselector) ;
	st.selectByIndex(1);
	Thread.sleep(5000);
	
	hours.click();
	hours.sendKeys(hr);
	Thread.sleep(3000);
	System.out.println("set hours");
	
	
	minutes.click();
	minutes.sendKeys(min);
	Thread.sleep(5000);
	System.out.println("set minutes");
	
	setnewtime.click();
	Thread.sleep(5000);
	System.out.println("click set new time");
	
	Select st2 =new Select (initialchaseemaialatemp);
	st2.selectByIndex(2);
	Thread.sleep(5000);
	System.out.println("Select initial chase template");
	
	inemail.click();
	Thread.sleep(5000);
	System.out.println("Initial Email click");
	
	notready.click();
	Thread.sleep (5000);
	System.out.println("Not ready yet");
	
	inemail.click();
	Thread.sleep(5000);
	System.out.println("Initial Email click");
	
	activateschedule.click();
	Thread.sleep(3000);
	System.out.println("activate schedule");
	
	inemailpreview.click ();
	Thread.sleep(5000);
	System.out.println("Initial email preview");
	
	
	multiple.click();
	Thread.sleep(5000);
	System.out.println("initial email multiple preview");
	
	closepopup.click();
	Thread.sleep(5000);
	System.out.println("close pop up");
	
	daysbefore.sendKeys(dbefore);
	Thread.sleep(6000);
	System.out.println("set number of days before");
	
	bdemail.click();
	Thread.sleep(5000);
	System.out.println("Enable before due email");
	
	Select st3 =new Select (bdemailtemplate);
	st3.selectByIndex(3);
	Thread.sleep(5000);
	System.out.println("Select before due email template");
	
	bdemailpreview.click();
	Thread.sleep(5000);
	System.out.println("Before due email preview");
	
	multiple.click();
	Thread.sleep(5000);
	System.out.println("Before due email preview-multiple");
	
	closepopup.click();
	Thread.sleep(5000);
	System.out.println("Close before due email pop up");
	
	bdletter.click();
	Thread.sleep(5000);
	System.out.println("Before due letter template");
	
	
	Select st4 = new Select(bdlettertemplate);
	st4.selectByIndex(4);
	Thread.sleep(5000);
	System.out.println("Select letter template");
	
	bdletterpreview.click();
	Thread.sleep(5000);
	System.out.println("Before due letter preview-single");
	
	multiple.click();
	Thread.sleep(5000);
	System.out.println("Before due letter preview-multiple");
	
	closepopup.click();
	Thread.sleep(5000);
	System.out.println("close bdefore due letter pop up");
	
	bdsms.click();
	Thread.sleep(5000);
	System.out.println("before due sms");
	
	
	Select st5 = new Select (bdsmstemplate) ;
	st5.selectByIndex(2);
	Thread.sleep(5000);
	System.out.println("before due sms template");
	
	bdsmspreview.click();
	Thread.sleep(5000);
	System.out.println("before due sms preview");
	
	multiple.click();
	Thread.sleep(5000);
	
	closepopup.click();
	Thread.sleep(5000);
	
	addreminder.sendKeys(reminder);
	Thread.sleep(4000);
	
	daysoverdue1.sendKeys(oddays1);
	Thread.sleep(5000);
	
	odemail1.click();
	Thread.sleep(3000);
	
	Select st6 =new Select (odemailtemplate1 );
	st6.selectByIndex(3);
	Thread.sleep(5000);
	
	
	odemailpreview1.click();
	Thread.sleep(5000);
	
	multiple.click();
	Thread.sleep(5000);
	
	closepopup.click();
	Thread.sleep(5000);
	
	odletter1.click();
	Thread.sleep(5000);
	
	Select St7 =new Select (odlettertemplate1);
	St7.selectByIndex(2);
	Thread.sleep(5000);
	
	
	odletterpreview1 .click();
	Thread.sleep(5000);
	
	multiple.click();
	Thread.sleep(5000);
	
	closepopup.click();
	Thread.sleep(5000);
	
	
	odsms1.click();
	Thread.sleep(3000);
	
	Select st8=new Select (odsmstempplate1);
	st8.selectByIndex(3);
	Thread.sleep(5000);
	
	odsmspreview1.click();
	Thread.sleep(5000);
	
	multiple.click();
	Thread.sleep(5000);
	
	closepopup.click();
	Thread.sleep(5000);
	
	daysoverdue2.sendKeys(oddays2);
	Thread.sleep(5000);
	
	odemail2.click();
	Thread.sleep(5000);
	
	Select st9=new Select (odemailtemplate2  );
	st9.selectByIndex(3);
	Thread.sleep(5000);
	
	odemailpreview2.click();
	Thread.sleep(3000);
	
	multiple.click();
	Thread.sleep(5000);
	
	closepopup.click();
	Thread.sleep(5000);
	
	
	odletter2.click();
	Thread.sleep(3000);
	
	Select st10=new Select (odlettertemplate2 );
	st10.selectByIndex(2);
	Thread.sleep(3000);
	
	
	odletterpreview2.click();
	Thread.sleep(5000);
	
	multiple.click();
	Thread.sleep(5000);
	
	closepopup.click();
	Thread.sleep(5000);
	
	odsms2.click();
	Thread.sleep(3000);
	
	
	Select st11 =new Select(odsmstemplate2 ) ;
	st11.selectByIndex(3000);
	
	odsmspreview2.click();
	Thread.sleep(5000);
	
	multiple.click();
	Thread.sleep(5000);
	
	closepopup.click();
	Thread.sleep(5000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
 
	
	
	
	
	
	
	
}