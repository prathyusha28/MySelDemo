package prathyusha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cheapoair.com");
		WebElement source = driver.findElement(By.id("from0"));
		source.sendKeys("Lon");
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.id("to0"));
		destination.sendKeys("delhi");
		destination.sendKeys(Keys.DOWN);
		//destination.sendKeys(Keys.DOWN);
		//destination.sendKeys(Keys.DOWN);
		destination.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("#cal0")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("#calendar > div.calendar__wrapper.clearfix > div:nth-child(1) > div:nth-child(3) > div:nth-child(26) > a")).click();
		driver.findElement(By.cssSelector("a[aria-label='22 May 2020']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("#cal1")).click();
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("#calendar > div.calendar__wrapper.clearfix > div:nth-child(3) > div:nth-child(3) > div:nth-child(27) > a")).click();
		
		
		
	}

}
