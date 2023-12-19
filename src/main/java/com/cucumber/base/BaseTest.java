package com.cucumber.base;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class BaseTest {
	
	protected static WebDriver driver;
	static CommonUtilities common = new CommonUtilities();
	
	public static void launchapplication() {
		driver = getDriver();
		String applicationurl=null;
		try {
			applicationurl = common.getproperty("url");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(applicationurl);
	}
public  void compareText(String stractualtext, String strexpectedtext) {
		
		Assert.assertEquals(stractualtext, strexpectedtext);
		
}
public void handlingAlerts(){
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
	
	public static WebDriver getDriver() {
		if(driver ==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }
		return driver;
	}

}
