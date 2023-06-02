package careers5d;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_script {
public static void main(String[] args) {
	 WebDriver driver =  new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 Actions actions = new Actions(driver);
	 driver.get("https://magento.softwaretestingboard.com/");
	 //SignIn Option
		WebElement signInOption = driver.findElement(By.xpath("//li[@class='authorization-link']/ancestor::div[@class='panel header']//a[contains(text(),'Sign In')]"));
		signInOption.click();
		//Email Text Field
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("betegeriparveezahmed@gmail.com");
		//password text field
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("Parveez@1");
		//sign In button
		WebElement signInButton = driver.findElement(By.xpath("//div[@class='primary']/ancestor::fieldset[@class='fieldset login']//button[@id='send2']"));
		signInButton.click();
		//Search Text field
		WebElement searchTextField = driver.findElement(By.id("search"));
		wait.until(ExpectedConditions.elementToBeClickable(searchTextField));
		searchTextField.sendKeys("Jacket");
		searchTextField.sendKeys(Keys.ENTER);
		WebElement productReference = driver.findElement(By.xpath("(//div[@class='product-item-info'])[1]"));
		WebElement addToCartButton = productReference.findElement(By.xpath("//a[contains(.,'Adrienne Trek Jacket')]/ancestor::div[@class='product-item-info']//button[@title='Add to Cart']"));
		wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
		actions.scrollToElement(addToCartButton);
		WebElement jacketSize = productReference.findElement(By.xpath("//div[text()='S']"));
		WebElement jacketColor = productReference.findElement(By.xpath("//div[@id='option-label-color-93-item-56']"));
		actions.moveToElement(jacketSize).click().pause(500).moveToElement(jacketColor).click().pause(500).moveToElement(addToCartButton).click().pause(3000).build().perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,0);");
		WebElement cart = driver.findElement(By.xpath("//div[@class='minicart-wrapper']/a[@href='https://magento.softwaretestingboard.com/checkout/cart/']"));
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
		WebElement quatityTextField = driver.findElement(By.xpath("//div[@class='details-qty qty']//input[@type='number']"));
		wait.until(ExpectedConditions.elementToBeClickable(quatityTextField));
		actions.moveToElement(quatityTextField).click().pause(500).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2").build().perform();
		WebElement updateButton = driver.findElement(By.xpath("//button[@title='Update']"));
		wait.until(ExpectedConditions.visibilityOf(updateButton));
		actions.click(updateButton).perform();
		WebElement proceedToCheckOutButton = driver.findElement(By.xpath("//button[@title='Proceed to Checkout']"));
		actions.pause(500).click(proceedToCheckOutButton).pause(2000).build().perform();
		driver.manage().window().minimize();
		driver.quit();
}
}