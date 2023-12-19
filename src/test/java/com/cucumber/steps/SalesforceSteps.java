package com.cucumber.steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;



public class SalesforceSteps extends BaseTest {
	
	
	BasePage page;
	PageFactory pageFactory = new PageFactory();
	@Given("User launch application")
	public void user_launch_application() {
		launchapplication();
	}
	@Given("User is on {string}")
	public void user_is_on(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		page = pageFactory.initialize(pageName);
	}
	@Then("User Enter into the textbox {string} {string}")
	public void user_enter_into_the_textbox(String logicalName, String value) {
		page.enterIntoTextbox(logicalName, value);
	}
	@Then("User Click on Button {string}")
	public void user_click_on_button(String logicalName) {
		 page.clickonButton(logicalName);
	}
	@Then("verify checkbox is selected {string} {string}")
	public void verify_checkbox_is_selected(String logicalName, String expectedvalue) {
	   boolean value= page.verifycheckbox(logicalName);
	   String actualvalue = String.valueOf(value);
	   compareText(actualvalue,expectedvalue);		   
	}
	@Then("Check the error mesage {string} {string}")
	public void check_the_error_mesage(String logicalName, String value) {
		page.verifyingText(logicalName,value);
	}
	@Then("Verify the dropdown {string}, {string}")
	public void verify_the_dropdown(String expectedusermenulist , String logicalName) {
		List<String> expectedusermenulist1 = new ArrayList<String>();
		expectedusermenulist1.add("My Profile");
		expectedusermenulist1.add("My Settings");
		expectedusermenulist1.add("Developer Console");
		expectedusermenulist1.add("Switch to Ligtning Experience");
		expectedusermenulist1.add("Logout");
		page.verifyUsermenuDropdown(expectedusermenulist,logicalName);
	}
	@Then("switch to webpage")
	public void switch_to_webpage() {
		page.switchToWebpage();
	}
	@Then("switch to frame using Index")
	public void switch_to_frame_using_index() {
		page.switchToFrameUsingIndex();
	}
	@Then("User Upload the photo {string}")
	public void user_upload_the_photo(String logicalName) {
		page.uploadPhoto(logicalName);
	}
@Then("switch to frame using ID {string}")
public void switch_to_frame_using_id(String frameId) {
	page.switchToFrameUsingID(frameId);
}
@Then("Verify user is in page {string}")
public void verify_user_is_in_page(String expectedvalue) {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String actualvalue=page.verifyTitle("actualtitle");
	   compareText(actualvalue,expectedvalue);
}
@Then("User selects from dropdown {string} {string}")
public void user_selects_from_dropdown(String logicalName, String strvisibletext) {
	page.selectFromDropdown(logicalName, strvisibletext);
}
@Then("User Enter into the textbox after clear {string} {string}")
public void user_enter_into_the_textbox_after_clear(String logicalName, String value) {
	page.enterIntoTextboxWithClear(logicalName, value);
}
@Then("switch to window")
public void switch_to_window() {
	String parentwindow =	driver.getWindowHandle();
	page.childWindowSwitch() ;
	page.verifyChildWindow();
	driver.switchTo().window(parentwindow);
}

@Then("Verify the name in the dropdown {string} {string}")
public void verify_the_name_in_the_dropdown(String logicalName, String expectedselectednameindropdown) {
	String actualselectednameindropdown=page.verifyselectedOptionFromDropdown(logicalName,"actualselectedValueInDropDown");
	compareText(actualselectednameindropdown,expectedselectednameindropdown);
}
@Then("User should handle the alert")
public void user_should_handle_the_alert() {
	handlingAlerts();
}
	
	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.close();
		driver =null;
	}
	
	

}
