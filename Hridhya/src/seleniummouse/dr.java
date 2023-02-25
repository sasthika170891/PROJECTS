package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dr {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("https://jqueryui.com/droppable/");
		
		// webelements=> inside the frame, switch ypur control to that frame
		//index, name, id
		c.switchTo().frame(0);
		Actions ac= new Actions(c);
		WebElement ele = c.findElementById("draggable");
		WebElement ele1 = c.findElementById("droppable");
		ac.dragAndDrop(ele, ele1).build().perform();
		
	}
}
