package seleniumnav;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");//step1
		Thread.sleep(3000);
		c.findElementByLinkText("Images").click();//2
		//back //step1
		c.navigate().back();
		Thread.sleep(3000);
		// move to step2
		c.navigate().forward();
	    
	}
}
