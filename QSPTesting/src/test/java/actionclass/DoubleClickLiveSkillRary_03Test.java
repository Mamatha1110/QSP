package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickLiveSkillRary_03Test {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
	WebElement addButton = driver.findElement(By.id("add"));
	Actions actions = new Actions(driver);
	actions.doubleClick(addButton).perform();
	//actions.doubleClick(addButton).perform();
}
}