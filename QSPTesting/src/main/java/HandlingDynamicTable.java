
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDynamicTable {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	String CountryName="India";
	System.out.println("Position: " +driver.findElement(By.xpath("//span[.='"+CountryName+"']/../preceding-sibling::td[@class='rankings-block__banner--pos']")).getText());
	System.out.println("Matches: " +driver.findElement(By.xpath("//span[.='"+CountryName+"']/../following-sibling::td[@class='rankings-block__banner--matches']")).getText());
	System.out.println("Points: "+driver.findElement(By.xpath("//span[.='"+CountryName+"']/../following-sibling::td[@class='rankings-block__banner--points']")).getText());
	System.out.println("Ratings: "+driver.findElement(By.xpath("//span[.='"+CountryName+"']/../following-sibling::td[@class='rankings-block__banner--rating u-text-right']")).getText());
	driver.manage().window().minimize();
	driver.quit();
}
}
