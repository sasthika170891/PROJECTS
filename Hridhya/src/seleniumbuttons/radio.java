package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	
	//visiting 
	c.get("https://courses.letskodeit.com/practice");
	
	//can select only one button at a time 
	
	/*c.findElementById("bmwradio").click();
	Thread.sleep(3000);
	
	c.findElementById("benzradio").click();
	Thread.sleep(3000);
	c.findElementById("hondaradio").click();*/
	
	
	List<WebElement> l = c.findElementsByXPath("//*[@name='cars' and @type='radio']");
	for(WebElement x: l)
	{
		x.click();
		Thread.sleep(2000);
	}
	Thread.sleep(3000);
	
	c.quit();
}
}
