package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoominx {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		
		// greater than 100=> zoomin
		// less than 100=> zoom out
		// 100 => nrml
		
		c.executeScript("document.body.style.zoom='150%'"); //zoomin
		Thread.sleep(3000);
		
		c.executeScript("document.body.style.zoom='100%'"); //nrml
		Thread.sleep(3000);
		
		c.executeScript("document.body.style.zoom='50%'"); //zoomout
		Thread.sleep(3000);
	}
}
