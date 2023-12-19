package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LoginPage extends BasePage {
	
	static WebDriver driver ; 
	public LoginPage() {
		super(driver = BaseTest.getDriver());
		addObject("usrname", By.id("username"));
		addObject("pwd", By.id("password"));
		addObject("loginbtn", By.id("Login"));
		addObject("rememberme", By.id("rememberUn"));
		addObject("forgotpwd", By.id("forgot_password_link"));
		addObject("forgotpwdusername", By.id("un"));
		addObject("contbutton", By.id("continue"));
		addObject("returnlogin", By.xpath("//a[text()='Return to Login']"));
		addObject("errormsg", By.id("error"));
	}

	

}
