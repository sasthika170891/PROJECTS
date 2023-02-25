package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class get1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		
		// cookies: temporary information stored by the browser
		// set
		
		Set<Cookie> k = c.manage().getCookies();
		System.out.println("Numbr of cookies "+ k.size());
		
		// get cookie details
		
		// iterating through the cookies :    for(datatype tempvariable: nameofthecollection)
		
		for(Cookie x: k)
		{
			System.out.println("Name : "+ x.getName());
			System.out.println("value : "+ x.getValue());
			System.out.println("Expiry date : "+ x.getExpiry());
			System.out.println("Domain is "+ x.getDomain());
			System.out.println();
		}
		
		c.quit();
	}

}
