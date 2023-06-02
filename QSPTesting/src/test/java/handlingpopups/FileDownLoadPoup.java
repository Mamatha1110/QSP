package handlingpopups;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownLoadPoup {
public static void main(String[] args) throws Throwable {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.selenium.dev/downloads/");
	 WebElement version = driver.findElement(By.linkText("4.8.0"));
	 version.click();
	 driver.get("chrome://downloads/");
	 Thread.sleep(2000);
	 SearchContext parentshadowRootHost = driver.findElement(By.tagName("downloads-manager")).getShadowRoot();
	 SearchContext childShadowRootHost = parentshadowRootHost.findElement(By.cssSelector("iron-list[id='downloadsList']")).findElement(By.cssSelector("downloads-item[id='frb0']")).getShadowRoot();
	 //WebElement discardButton = childShadowRootHost.findElement(By.cssSelector("div[id='dangerous']")).findElement(By.cssSelector("cr-button[class='action-button']"));
	 //discardButton.click();
	 WebElement keepButton = childShadowRootHost.findElement(By.cssSelector("div[id='dangerous']")).findElement(By.cssSelector("cr-button[focus-type='save']"));
	 keepButton.click();
	 Thread.sleep(2000);
	// driver.switchTo().alert().dismiss();
	 //Actions actions = new Actions(driver);
	// actions.sendKeys(Keys.TAB).pause(200).sendKeys(Keys.ENTER).build().perform();
	 Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(200);
	 robot.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(200);
	 robot.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(200);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	 driver.navigate().back();
}
}