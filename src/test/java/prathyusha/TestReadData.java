package prathyusha;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestReadData {
WebDriver driver;

	@BeforeTest
	public void openBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.get("http://www.google.com");
	}
	
	
	
	@DataProvider()
	public Object[][] myData() throws Throwable{
		//ReadingData trd = new ReadingData();
		
		Object[][] dataread = ReadingData.getTestData("C:\\Users\\Sunku\\Desktop\\My learning\\TestData.xlsx","fnln");
		return dataread;
	}
	
	@Test(dataProvider = "myData")
	public void loginTest(Hashtable<String, String>TextField){
		driver.get("http://www.google.com");
		System.out.println("Testing HashTable");
//		driver = new ChromeDriver();
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.name("identifier")).sendKeys(TextField.get("prathyusha"));
		
		
	}

	@AfterTest
	public void TearDown(){
		driver.quit();
	}

}

