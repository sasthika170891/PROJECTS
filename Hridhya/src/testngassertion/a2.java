package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {

	@Test
	public void sft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver c = new ChromeDriver();
		c.get("http://www.google.com");
		SoftAssert s= new SoftAssert();
		s.assertEquals(c.getTitle(),"klklk");//fail
		s.assertNotEquals(c.getTitle(),"klklk");//pass
		WebElement ele = c.findElementByLinkText("Images");
		s.assertTrue(ele.isDisplayed());//pass
		s.assertFalse(ele.isSelected());//pass
		c.quit();
		//invoke assertAll()
		s.assertAll();
	}
}
