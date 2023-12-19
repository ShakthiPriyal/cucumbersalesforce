package com.cucumber.base;

import java.util.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class BasePage {
	
	WebDriver driver;
	public HashMap<String, By> ObjectRepo = new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {
	this.driver=driver;
	}

	public void enterIntoTextbox(String logicalName, String value) {
		WebElement element = getElement(logicalName);
		waitforElement(element);
		element.sendKeys(value);
		
	}
	
	public void clickonButton(String logicalName) {
		
		WebElement element = getElement(logicalName);
		waitforElement(element);
		element.click();
	}
	
	public void addObject(String logicalName, By by) {
		ObjectRepo.put(logicalName, by);
		
	}
	
	public WebElement getElement(String logicalName) {
		By by = ObjectRepo.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
	}

	public void waitforElement(WebElement element) {
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void verifyingText(String logicalName,String value)	{
		WebElement element = getElement(logicalName);
		String actualtext=element.getText();
		String expectedtext=value;
		Assert.assertEquals(actualtext, expectedtext);
	}
	public String verifyTitle(String stractualtitle) {
		 return stractualtitle= driver.getTitle();
		 
	}
	public boolean verifycheckbox(String logicalName)
    {   
        WebElement element = getElement(logicalName);
        return element.isSelected();
    }
	
	public void verifyUsermenuDropdown(String strexpectedusermenulist,String logicalName) {
		List <WebElement> actualusermenulist = driver.findElements(ObjectRepo.get(logicalName));
		String actualuserlists;
		for(WebElement element :actualusermenulist) { 
		 
		 if(element.getText().equals(strexpectedusermenulist)){
			 System.out.println("Expected value is present");
			 break;
		 }}}
	
	public void switchToWebpage() {
		driver.switchTo().defaultContent();
	}
	public void switchToFrameUsingIndex() {
		driver.switchTo().frame(0);
	}
	public void switchToFrameUsingID(String frameId) {
	 driver.switchTo().frame(frameId);
	}
	public void uploadPhoto(String logicalName) {
		 Actions action = new Actions(driver);
		 WebElement element = getElement(logicalName);
		 waitforElement(element);
		 action.moveToElement(element).click().build().perform();
	}
	public void selectFromDropdown(String logicalName, String strvisibletext) {
		WebElement element = getElement(logicalName);
		waitforElement(element);
		Select viewname = new Select(element);
		viewname.selectByVisibleText(strvisibletext);
		
	}
	public void enterIntoTextboxWithClear(String logicalName, String value) {
		WebElement element = getElement(logicalName);
		waitforElement(element);
		element.clear();
		element.sendKeys(value);
		
	}
	//tpo switch to the child window

	public  void childWindowSwitch() {
			Set<String> handles = driver.getWindowHandles();
			for(String handle:handles) {
				System.out.println(handle);
				driver.switchTo().window(handle);
				}
			}
	//to verify whether its in child window

	public  void verifyChildWindow() {
			String childtitle=driver.getTitle();
			System.out.println(childtitle);
			driver.close();
	}
	public String verifyselectedOptionFromDropdown(String logicalName, String stractualselectedValueInDropDown) {
		WebElement element = getElement(logicalName);
		waitforElement(element);
		Select selectverifydrpdwn= new Select(element);
		WebElement selectedoption = selectverifydrpdwn.getFirstSelectedOption();
		return stractualselectedValueInDropDown = selectedoption.getText();

	}
	
	
	public void verifyDropdown(String[] strexpectedlist,String logicalName) {
		WebElement element = getElement(logicalName);
		waitforElement(element);
		Select select= new Select(element);
		
		List <WebElement> options =select.getOptions();

for(int i=0;i<options.size();i++) {
//System.out.println("Actual: "+actualdropdownlist.get(i)+" & Expected: "+expectedlist.get(i));
Assert.assertEquals(options.get(i).getText(),strexpectedlist[i] );
}
	}
}
