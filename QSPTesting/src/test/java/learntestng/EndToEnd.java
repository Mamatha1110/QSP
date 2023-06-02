package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EndToEnd {
	WebDriver driver;
@BeforeMethod
	public void configBeforeMethod() {
		String browserName = "chrome";
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		System.out.println("Before every test BeforeMethod executed.");
	}
	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
		System.out.println("After every test AfterMethod executed");
	}
	@BeforeClass
	public void configBeforeClass() {
		System.out.println("BeofreClass has executed before any member of the class has got executed.");
	}
	@AfterClass
	public void configAfterClass() {
		System.out.println("AfterClass has executed after every member of the class has got executed.");
	}

	@Test(priority = 1)
	public void faceBook() {
		
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("Test Facebook Executed.");
	}

	@Test(priority = 2)
	public void actiTime() {
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		System.out.println("Test Actitime execyuted.");
	}

	@Test(priority = 3)
	public void vtiger() {
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement submitButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		submitButton.submit();
		System.out.println("Test Vtiger Executed.");
	}
}