package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	
	//visiting 
	c.get("https://courses.letskodeit.com/practice");
	
	// create an object for selsect class
	//pass your dropdown bpx as input
	// index
	//value 
	//visible text
	
	// only one option at a time
	
	WebElement ele = c.findElementById("carselect");
	
	Select s= new Select(ele);
	//s.selectByIndex(1);
	//s.selectByValue("benz");
	s.selectByVisibleText("Benz");
}
}
