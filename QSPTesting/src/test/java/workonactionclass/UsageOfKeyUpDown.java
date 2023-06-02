package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfKeyUpDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Actions actions = new Actions(driver);
		// actions.keyDown(driver.switchTo().activeElement(),
		// Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("a").perform();
		// actions.keyDown(driver.switchTo().activeElement(),
		// Keys.SHIFT).sendKeys("abcd").keyUp(Keys.SHIFT).sendKeys("abcd").build().perform();
		actions.keyDown(driver.switchTo().activeElement(), Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("a").keyDown(Keys.SHIFT).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("b").keyDown(Keys.SHIFT).sendKeys("c").keyUp(Keys.SHIFT).sendKeys("c").build().perform();
	}
}