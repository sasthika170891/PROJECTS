package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {

	/*assertion : technique where we will be comparing actual result with obtained result
	 * 
	 * hard 
	 *    provided by Assert builtin class
	 *    static in nature
	 *    if assertion fails, it will stop the execution
	 *    
	 *    
	 * soft 
	 *     provided by SoftAssert builtin class
	 *     nonstatic in nature
	 *     if assertion fails also, it will proceed further
	 *     actual result : invoke assertAll()
	 *     
	 *    
	 *   assertEquals(actual, expected)
	 *   assertNotEquals(actual, expected)
	 *   assertTrue(condition)
	 *   assertFalse(condition)
	 * 
	 * 
	 * 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver c = new ChromeDriver();
		c.get("http://www.google.com");
		//Assert.assertEquals(c.getTitle(),"klklk");
		Assert.assertNotEquals(c.getTitle(),"klklk");
		WebElement ele = c.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		c.quit();
	}
}
