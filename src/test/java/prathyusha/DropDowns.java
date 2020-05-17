package prathyusha;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.id("searchDropdownBox")).click();
		
		WebElement mySelectElement = driver.findElement(By.id("searchDropdownBox"));
		
		Select mySelect = new Select(mySelectElement);
	//	List<WebElement> myAmazonList = mySelect.getOptions();
		//mySelect.selectByIndex(4);
		//mySelect.selectByVisibleText("Audible Books & Originals");

		
		//driver.findElement(By.cssSelector("input[type*='submit']")).click();
		
		
		
		
	}

}
