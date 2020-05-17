package prathyusha;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
public class CrossBrowserTestting  {
	
	WebDriver driver;
@Parameters("browserUnderTest")
@Test

public void MultiBrowserTests(String browserUnderTest){
		
	if(browserUnderTest.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}else if(browserUnderTest.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
}
}
