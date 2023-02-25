package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) throws InterruptedException {
		
		//automate websites
		// support all the browsers 
		
		//step1: (once a project):  right click=> propertie=> java build path
		//                     libraries=> classpath=?> add external jar=> browser=> apply and close
		
		//step2: cnf chrome driver
		//step3: create obj fr chromedriver class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		
		//max
		//c.manage().window().maximize();
		
		//c.manage().window().fullscreen();
		
		c.navigate().refresh();
		
		
		// hold the page for certain seconds
		Thread.sleep(3000);
		
		//close
		
		c.quit();
	}
}
