package prathyushaBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
		static Properties props;
		
//		public Base(){
//			props = new Properties();
//			File src = new File("./configuration/config.property");
//			
//			FileInputStream myFile = null;
//			try{
//				myFile = new FileInputStream(src);
//		} catch (FileNotFoundException e){
//			e.printStackTrace();
//		}
//		try{
//			props.load(myFile);
//		}catch (IOException e){
//			e.printStackTrace();
//		}
//		
//	}
//		
//		public String myBrowser(){
//			String browserName = props.getProperty("browser");
//			return browserName;
//		}

	@BeforeTest	
		public void initialization(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//			String browserUnderTest = props.getProperty("browser");
//			if(browserUnderTest.equalsIgnoreCase("chrome")){
//				System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\chromedriver.exe");
//				driver = new ChromeDriver();
//				
//			}else if(browserUnderTest.equalsIgnoreCase("firefox")){
//				System.setProperty("webdriver.gecko.driver","C:\\Users\\Sunku\\Desktop\\My learning\\SeleniumNewClass\\geckodriver.exe");
//				driver = new ChromeDriver();
//			}
//		}
	}
