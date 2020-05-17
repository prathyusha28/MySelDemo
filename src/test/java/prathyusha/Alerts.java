package prathyusha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		
		driver.switchTo().alert().sendKeys("hello");
		
		driver.switchTo().alert().accept();
		
		String messageAccepted = driver.findElement(By.cssSelector("#result")).getText();
		
		System.out.println(messageAccepted);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("#result")).isDisplayed());
	}

}
