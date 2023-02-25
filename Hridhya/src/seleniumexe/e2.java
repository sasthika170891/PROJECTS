package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		
		//alert: popup, prompt, confrmation
		
		//c.executeScript("alert('Timeout')");  //ok
		c.executeScript("window.confirm('TimeOut')");//ok and cancel
		Thread.sleep(3000);
		Alert al = c.switchTo().alert();
		al.accept();
	}
}
