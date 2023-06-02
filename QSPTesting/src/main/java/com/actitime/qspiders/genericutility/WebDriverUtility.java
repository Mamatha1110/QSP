package com.actitime.qspiders.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
/**
 * This class will provide the WebDriver accessories to the script
 * @author Chandan N R
 * Implicit wait
 */
public class WebDriverUtility {
	/**
	 * This method will supply the time for every invocation of SearchContext
	 * @author Chandan N R
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}