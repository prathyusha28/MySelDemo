package prathyusha;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import prathyushaBase.Base;

public class MyActions extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intialization();
		
		Actions testActions = new Actions(driver);
		
		driver.get("http://www.amazon.com");
		
		WebElement moveThere = driver.findElement(By.id("nav-link-accountlist"));
		
		testActions.moveToElement(moveThere).build().perform();
		
		driver.get("https://jqueryui.com/droppable/#default");
		
		WebElement myFrame = driver.findElement(arg0)
		
		
		
	}

}
