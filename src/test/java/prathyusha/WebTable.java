package prathyusha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cheapoair.com");
		
		driver.findElement(By.cssSelector("#from0")).sendKeys("DSM");
		driver.findElement(By.cssSelector("#from0")).click();
		
		driver.findElement(By.cssSelector("#to0")).sendKeys("ORD");
		driver.findElement(By.cssSelector("#to0")).click();
		
		WebElement myTravelDate= driver.findElement(By.cssSelector("#cal0"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
	//	js.executeScript("arguments[0].setAttribute('value','March 18 2020');", myTravelDate);
	//	js.executeScript("document.getElementById('cal0').removeAttribute('readonly',0);");  
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#cal0")).sendKeys("");;
		
		WebElement myReturnDate = driver.findElement(By.cssSelector("#cal1"));
		
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//js.executeScript("arguments[0].setAttribute('value','March 28 2020');", myReturnDate);
		
		//js.executeScript("document.getElementById('cal1').removeAttribute('readonly',0);");  
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#cal1")).sendKeys("");;
		
		driver.findElement(By.xpath("//*[@id='searchNow']")).click();
	}

}
