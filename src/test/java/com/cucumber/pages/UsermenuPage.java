package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class UsermenuPage extends BasePage{
	static WebDriver driver ; 
	public UsermenuPage() {
		super(driver = BaseTest.getDriver());
		addObject("usermenudrpdwn", By.id("userNavLabel")); 
	    addObject("actualusermenulist", By.id("userNav-menuItems"));
		addObject("myprofile", By.xpath("//a[text()='My Profile']"));
		addObject("editbtn", By.xpath("//img[@title='Edit Profile'][1]"));
		addObject("abouttab", By.xpath("//a[@aria-controls='TabPanel:0:Body:1']"));
		addObject("lastnamebox", By.id("lastName"));
		addObject("saveallbtn", By.xpath("//input[@value='Save All']"));
		addObject("postlink", By.xpath("//span[text()='Post']"));
		addObject("posttextbox", By.xpath("//body[text()='Share an update, @mention someone...']"));
		addObject("sharebtn", By.id("publishersharebutton"));
		addObject("filelink", By.xpath("//span[text()='File']"));
		addObject("uploadfilelink", By.xpath("//a[text()='Upload a file from your computer']"));
		addObject("choosefilelink", By.id("chatterFile"));
		addObject("filesharebtn", By.xpath("//span[text()='File']"));
		addObject("uploadphotomousehover", By.id("photoSection"));
		addObject("addphotolink", By.xpath("//a[@id='uploadLink']"));
		addObject("choosephoto", By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		addObject("savebutton", By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		addObject("saveaftercropbutton", By.xpath("//input[@id='j_id0:j_id7:save']"));
		addObject("mysettings", By.xpath("//a[text()='My Settings']"));
		addObject("personallink", By.id("PersonalInfo_font"));
		addObject("loghistorylink", By.id("LoginHistory_font"));
		addObject("loginhistorydownloadlink", By.xpath("//a[contains(text(),'Download login history for last six months')]"));
		addObject("displayoutlink", By.id("DisplayAndLayout_font"));
		addObject("customtablink", By.id("CustomizeTabs_font"));
		addObject("customappdrpdown", By.id("p4"));
		addObject("addreports", By.id("duel_select_0"));
		addObject("addbutton", By.className("rightArrowIcon"));
		addObject("emaillink", By.id("EmailSetup_font"));
		addObject("emailsettinglink", By.id("EmailSettings_font"));
		addObject("emailnametextbox", By.id("sender_name"));
		addObject("emailaddresstextbox", By.id("sender_email"));
		addObject("bccradiobutton", By.id("auto_bcc1"));
		addObject("savenamebutton", By.name("save"));
		addObject("calandreminderlink", By.id("CalendarAndReminders_font"));
		addObject("activityreminderlink", By.id("Reminders_font"));
		addObject("testbutton", By.id("Reminders_font"));
		addObject("devconsole", By.xpath("//a[text()='Developer Console']"));
		addObject("logout", By.xpath("//a[text()='Logout']"));
		
		
		
		
		
		
		
		
	}

}
