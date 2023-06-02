package com.actitime.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public WebElement getUsernameTextField() {
		return username;
	}
	
	public WebElement passwordTextField() {
		return passwordTextField;	
	}
	public WebElement getLoginButton() {
		return loginButton;
	}

}