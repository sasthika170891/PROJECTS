package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		
		// cookies: temporary information stored by the browser
		// set
		
		
		c.manage().deleteAllCookies();
		
		Set<Cookie> k = c.manage().getCookies();
		System.out.println("Numbr of cookies "+ k.size());
		
	}

}
