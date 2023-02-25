package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	
	//visiting 
	c.get("https://courses.letskodeit.com/practice");
	
	// create an object for selsect class
	//pass your list bpx as input
	// index
	//value 
	//visible text
	
	// multiple option at a time
	
	WebElement ele = c.findElementById("multiple-select-example");
	
	Select s= new Select(ele);
	
	

	List<WebElement> l = s.getOptions();
	int size = l.size();
    for(int i =0; i<size ; i++){
       String options = l.get(i).getText();// bmw, benz, honda 
      
       if(options.contains("Apple") || options.contains("Orange"))
       {
    	   l.get(i).click();
    	   Thread.sleep(2000);
       }
       System.out.println(options);
    }
	
	
}
}
