package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(56));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.flipkart.com/");
	 WebElement popupCloseButton = driver.findElement(By.xpath("//button[text()='✕']"));
	 popupCloseButton.click();
	 
}
}