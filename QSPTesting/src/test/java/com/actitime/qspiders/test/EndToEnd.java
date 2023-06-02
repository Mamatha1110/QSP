package com.actitime.qspiders.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.actitime.qspiders.genericutility.BaseClass;
import com.actitime.qspiders.pomrepository.HomePage;
import com.actitime.qspiders.pomrepository.LoginPage;

public class EndToEnd extends BaseClass {
	@Test
	public void loginLogout() throws IOException {
		webdriverutils.implicitWait(driver);
		LoginPage loginpage = new LoginPage(driver);
		WebElement usernameTextField = loginpage.getUsernameTextField();
		usernameTextField.sendKeys(fileutils.readDataFromPropertyFile("username"));
		WebElement passwordTextField = loginpage.passwordTextField();
		passwordTextField.sendKeys(fileutils.readDataFromPropertyFile("password"));
		WebElement loginButton =loginpage.getLoginButton();
		loginButton.click();
		HomePage homePage = new HomePage(driver);
		WebElement logoutOption =homePage.getLogoutOption();
		logoutOption.click();

	}
}