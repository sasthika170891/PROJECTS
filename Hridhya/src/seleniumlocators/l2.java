package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) throws InterruptedException {
		
		//linktext:        word/group of words=> click on it a new url wlll be opened 
		//partial linktext: substring of linktext 
		
		// no need for code inspection
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		//Terms
		
		//c.findElementByLinkText("Terms").click();
		
		c.findElementByPartialLinkText("Ter").click();
		
		Thread.sleep(3000);
		
		c.quit();
		
		
	}
}
