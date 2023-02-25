package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	
	//visiting 
	c.get("http://www.google.com");
	
	
	// title of website
	System.out.println(c.getTitle());
	
	//url of website
	System.out.println(c.getCurrentUrl());
	
	// size : height and width
	// Dimension class
	
	Dimension d = c.manage().window().getSize();
	System.out.println("Height is "+ d.getHeight());
	System.out.println("Width is "+ d.getWidth());
	
	// posiition: x and y value
	// point
	
	Point p = c.manage().window().getPosition();
	System.out.println("x value is "+ p.getX());
	System.out.println("y value is "+ p.getY());
	
	//cpabilites 
	
	Capabilities d1 = c.getCapabilities();
	System.out.println("browser name is "+ d1.getBrowserName());
	System.out.println("Version is "+ d1.getVersion());
	System.out.println("os name is "+ d1.getPlatform());
	
	c.quit();
}
}
