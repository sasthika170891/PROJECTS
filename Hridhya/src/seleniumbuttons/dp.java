package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("https://jqueryui.com/datepicker/");
		c.switchTo().frame(0);
		// getting the calender
		c.findElementById("datepicker").click();
		
		// march
		for(int i=0;i<2;i++)
		{
			c.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		
		//24th
		c.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a").click();
	}
}
