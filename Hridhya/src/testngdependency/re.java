package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class re {
	ChromeDriver c;
	@Test(priority=0, description="visiting google", groups="U")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
	}
	
	@Test(priority=1, description="maximising google", groups="U")
	public void max()
	{
		c.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing google", invocationCount=3, groups="U")
	public void refresh()
	{
		c.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking on privacy linktext", dependsOnGroups="U")
	public void clicking()
	{
		c.findElementByLinkText("Privacy").click();
	}
	
	@Test(priority=4, description="closing google", timeOut=3000, dependsOnGroups="U")
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		c.quit();
	}

}
