package seleniumexe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class e1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		
		System.out.println(c.executeScript("return document.title"));
		
		System.out.println(c.executeScript("return document.URL"));
		
		c.quit();
	}

}
