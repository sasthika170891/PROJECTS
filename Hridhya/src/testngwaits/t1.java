package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t1 {
	/*
	 * webdriver synchronisation tech
	 *   
	 *   conditional    : explicit wait 
	 *   unconditional  : implicit wait, thread.sleep
	 *   
	 *   implicit wait: once it is declared all the code which is present after it will take timelimit
	 *   
	 *   code is correct: executes within the time limit, it will proceed further, wont wait for completion of time limit
	 *   code is wrong: it will wait for the completion of time limit, then it will throw up error 
	* 
	 * */

	@Test
	public void sft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 ChromeDriver c = new ChromeDriver();
		c.get("http://www.google.com");
		c.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(c.getTitle());//5
		System.out.println(c.getPageSource());//5
		c.navigate().refresh();//5
		c.findElementByLinkText("Ikjlkj"); //5
		c.quit();//5
	}
}
