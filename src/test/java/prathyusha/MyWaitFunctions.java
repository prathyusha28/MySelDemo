package prathyusha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWaitFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		driver.findElement(By.cssSelector("#content > div > a:nth-child(5)")).click();
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		
		WebDriverWait myWait = new WebDriverWait(driver, 5);
		WebElement myElement = driver.findElement(By.cssSelector("#finish > h4"));
		myWait.until(ExpectedConditions.visibilityOf(myElement));
		
		System.out.println(myElement.getText());
		
		
	//	Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver)
	//			.withTimeout
		
		
		
		
		
		
	}

}
