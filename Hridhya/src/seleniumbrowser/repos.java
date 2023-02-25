package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repos {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		
		// create an object for point class
		// pass desired x andy in it
		// apply it on the window
		
		Point d= new Point(400,200);
		c.manage().window().setPosition(d);
	}

}
