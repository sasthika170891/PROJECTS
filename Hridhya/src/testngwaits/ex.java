package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.l1.class)
public class ex {
	
	// explicit wait: conditional sychronisation
	// time limit is applicatble for certain conditions
	// create an object for webdriver wait
	// pass driver instance and time limit as input
	// call untill method
	// call expectedConditions 
	
	

	
	@Test
	public void e1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver c = new ChromeDriver();
		c.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(c,5);
		
		//title
		//w.until(ExpectedConditions.titleIs("Goo")); //5
	
		// w.until(ExpectedConditions.titleContains("oo")); 
		
		//alert
		
		//w.until(ExpectedConditions.alertIsPresent()); 
		
		// visibility of an element
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy")));
		
		// visbility of more elements
		// images=> visible or not
		
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		// clickable or not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		
		c.quit();
	}
}
