package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	
	//visiting 
	c.get("http://www.google.com");
	
	// create an object for dimension class
	// pass desired height and width in it
	// apply it on the window
	
	Dimension d= new Dimension(400,200);
	c.manage().window().setSize(d);
}
}
