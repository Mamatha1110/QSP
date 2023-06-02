package handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/HP/Desktop/DesktopOffice/Sample%20WebPages/popups/prompt.html");
	 //handle the prompt popup
	 String assertiveStatement = driver.switchTo().alert().getText();
	 System.out.println("assertiveStatement = " + assertiveStatement);
	 driver.switchTo().alert().sendKeys("18");
	 driver.switchTo().alert().accept();
}
}