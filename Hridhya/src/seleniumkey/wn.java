package seleniumkey;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		WebElement ele = c.findElementByName("q");
		Actions ac= new Actions(c);
		ac.click(ele).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
	}
}
