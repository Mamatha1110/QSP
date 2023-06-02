package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AvoidingFileUploadPopup {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://demo.guru99.com/test/upload/");
	 WebElement fileUploadButton = driver.findElement(By.id("uploadfile_0"));
	 fileUploadButton.sendKeys("E:\\SOFTWARE TESTING\\SELENIUM\\POPUPs Notes.txt");
	 WebElement checkBox = driver.findElement(By.id("terms"));
	 checkBox.click();
	 WebElement submitButton = driver.findElement(By.id("submitbutton"));
	 submitButton.click();
}
}