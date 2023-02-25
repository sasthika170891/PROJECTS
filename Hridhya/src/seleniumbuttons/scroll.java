package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
public static void main(String[] args) throws InterruptedException {
	
	
	//vertical scroller      : move up and down   , x value will be 0
	//                  down:  +y
	//                     up: -y
	
	
	// horizontal scroller:  move right and left, y value will be 0
	//                         right:+x
	//                         left -x
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");

	//classname objectname= new classname();
	ChromeDriver ob= new ChromeDriver();
	ob.get("https://www.seleniumeasy.com");
	
	// method1" page up and page down
	
	/*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // down
	
	Thread.sleep(3000);
	
ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); // up
	
	Thread.sleep(3000);*/
	
	
ob.executeScript("window.scrollBy(0,500)"); //scroll down
	
	Thread.sleep(3000);
	
ob.executeScript("window.scrollBy(0,-500)"); // scrollup
	
	Thread.sleep(3000);
	
}
}
