package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedUserInterationSnapdeal {

	public static void main(String[] args) {
	/*@Test
	public  void runAdvancedUserInterationSnapdeal() {*/

		WebDriverManager.chromedriver().setup();
		//Close the popup notifications or Handle  browser notifications 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement mensFashion = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct']/span[contains(text(),'Men')]"));
		WebElement shirts = driver.findElement(By.xpath("(//span[text()='Shirts'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).pause(1000).click(shirts).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
