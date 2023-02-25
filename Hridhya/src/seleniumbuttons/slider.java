package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		
		// horizontal:  move along x axis, y value will be 0
		//vertical   : move along y axis, x value will be 0
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("https://jqueryui.com/slider/");
		
		c.switchTo().frame(0);
		Actions ac= new Actions(c);
		
		WebElement ele = c.findElementById("slider");
		
		ac.dragAndDropBy(ele, 40, 0).build().perform();
	}
}
