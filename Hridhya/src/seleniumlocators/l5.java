package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
public static void main(String[] args) {
	//xml path language 
	
	//relative
	//absolute xpath
	
	//absolute xpath:  from the root to the desired element
	//                 starts with single slash
	//                 copy=> copy full xpath
	//                 /html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input
	
	
	//relative xpath:  starts with double slash
	//                  //*[@locator/attribute='value']
	//                  copy=> copy xpath
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	
	//visiting 
	c.get("http://www.mycontactform.com");
	
	  //*[@locator/attribute='value']
	
	//locator 
	c.findElementByXPath("//*[@id='user']").sendKeys("dhivyakarthi123");
	
	// attribute 
	
	c.findElementByXPath("//*[@type='password']").sendKeys("12345");
	
	// copy=> copy xpath
	c.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	
}
}
