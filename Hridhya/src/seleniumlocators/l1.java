package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
	
	public static void main(String[] args) {
		
		/*8 locators
		 * 
		 * id
		 * name
		 * classname :   not recommended
		 * 
		 * linktext
		 * partial linktext
		 * 
		 * tagname
		 * xpath 
		 * css
		 * 
		  * 
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.mycontactform.com");
		
		c.findElementById("user").sendKeys("Dhivyakarthi123");
		
		c.findElementByName("pass").sendKeys("12345");
		
		c.findElementByClassName("btn_log").click();
	}

}
