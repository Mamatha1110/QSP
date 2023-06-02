package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraMouseHovering {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menSection = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menSection).pause(2000).moveToElement(menSection, 74, 0).pause(2000).moveToElement(menSection, 149, 0).pause(2000).moveToElement(menSection, 248, 0).pause(2000).moveToElement(menSection, 356, 0).pause(2000).moveToElement(menSection, 440, 0).pause(2000).build().perform();
		driver.manage().window().minimize();
		driver.quit();
	}
}