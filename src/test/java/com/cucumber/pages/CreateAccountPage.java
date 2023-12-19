package com.cucumber.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class CreateAccountPage extends BasePage {
	static WebDriver driver ; 
	public CreateAccountPage() {
		super(driver = BaseTest.getDriver());
		addObject("accounttab", By.xpath("//a[text()='Accounts']")); 
		addObject("acctnameverify", By.xpath("//a[text()='Shakthi Priyal']"));
	    addObject("newtab", By.name("new"));
		addObject("accnametextbox", By.id("acc2"));
		addObject("typedropdown", By.id("acc6"));
		addObject("custprioritydropdown", By.id("00NHn00000HYReq"));
		addObject("savebutton", By.name("save"));
		addObject("newviewtab", By.xpath("//a[text()='Create New View']"));
		addObject("viewnametextbox", By.id("fname"));
		addObject("uniqueviewnametextbox", By.id("devname"));
		addObject("actualnameindropdown", By.id("fcf"));
		addObject("editlink", By.xpath("//a[text()='Edit']"));
		addObject("viewnametextbox", By.id("fname"));
		addObject("fielddropdown", By.id("fcol1"));
		addObject("operatordropdown", By.id("fop1"));
		addObject("valuetextbox", By.id("fval1"));
		addObject("mergeaccountlink", By.xpath("//a[text()='Merge Accounts']"));
		addObject("accttextbox", By.id("srch"));
		addObject("findacctbutton", By.name("srchbutton"));
		addObject("nextbutton", By.name("goNext"));
		addObject("mergebutton", By.name("save"));
}
}