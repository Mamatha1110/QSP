import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IPhonesOnAmazon {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
	 List<WebElement> iPhones = driver.findElements(By.xpath("//img[contains(@alt,'Apple iPhone')]"));
	 System.out.println(iPhones.size());
	 for (WebElement iPhone : iPhones) {
		System.out.println("Name: " + iPhone.getAttribute("alt"));
	}
		
	}
}
