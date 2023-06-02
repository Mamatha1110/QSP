package handlingpopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiplePopus {
public static void main(String[] args) {
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	//WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.pib.gov.in/");
	//handle the alert popup
	String alertMessage = driver.switchTo().alert().getText();
	System.out.println("alertMessage = " + alertMessage);
	driver.switchTo().alert().accept();
	WebElement farmersWelfareWebsite = driver.findElement(By.xpath("//a[text()='Ministry of Agriculture & Farmers Welfare']"));
	Actions actions = new Actions(driver);
	actions.scrollToElement(farmersWelfareWebsite).pause(2000).click(farmersWelfareWebsite).build().perform();
	 //handle the confiramtion popup
	String confiramationMessage = driver.switchTo().alert().getText();
	System.out.println("confiramationMessage = " + confiramationMessage);
	//driver.switchTo().alert().dismiss();
	driver.switchTo().alert().accept();
	Set<String> allWindowsId = driver.getWindowHandles();
	for (String wid : allWindowsId) {
		String tabUrl = driver.switchTo().window(wid).getCurrentUrl();
		if (tabUrl.equals("https://www.pib.gov.in/indexd.aspx")) {
			
		}else if (tabUrl.equals("https://agricoop.nic.in/#gsc.tab=0")) {
			driver.close();
		}
	}
	
}
}