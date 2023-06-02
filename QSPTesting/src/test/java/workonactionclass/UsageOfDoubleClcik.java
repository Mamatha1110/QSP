package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfDoubleClcik {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("file:///E:/SOFTWARE%20TESTING/SELENIUM/DoubleClick.html");
		WebElement button = driver.findElement(By.id("doubleclick"));
		Actions actions = new Actions(driver);
		// actions.doubleClick(button).perform();
		// actions.moveToElement(button).doubleClick().perform();
		// actions.click(button).pause(2000).click().perform();
		WebElement linkText = driver.findElement(By.linkText("Right-click here"));
		actions.contextClick(linkText).perform();
		
	}
}