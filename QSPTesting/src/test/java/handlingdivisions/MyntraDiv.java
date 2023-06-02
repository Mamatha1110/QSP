package handlingdivisions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraDiv {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.myntra.com/");
	 Actions actions = new Actions(driver);
	 WebElement parentEleDiv = driver.findElement(By.xpath("//div[@class='desktop-navLinks']"));
	 List<WebElement> allNavOptions = parentEleDiv.findElements(By.xpath("//a[@data-type]"));
	 for (WebElement option : allNavOptions) {
		 System.out.println("Moved to : " + option.getText());
		 actions.moveToElement(option).pause(2000).perform();
	}
	 
}
}