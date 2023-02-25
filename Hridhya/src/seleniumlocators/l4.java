package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.mycontactform.com");
		
		// css: casecade style sheet
		// manual: 7 ways
		// shortcut
		
		// 1. tagname and id        syntax: tagname#id
		//c.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2. tagname and classname   syntax: tagname.classname
		//c.findElementByCssSelector("input.txt_log").sendKeys("hi");
		
		//3.tagname and attribute    syntax: tagname[attribute='value']
		//type=text
		//c.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		//4. tagname, classname and attribute   syntax: tagname.classname[attribute='value']
		//c.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		
		////5.tagname and prefix of attribute    syntax: tagname[attribute^='prefix value']
		//type=te
		//c.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		
		////6.tagname and  suffix of attribute    syntax: tagname[attribute$='suffix value']
		//type=xt
		//c.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
		
		///7.tagname and  substring of attribute    syntax: tagname[attribute*='value']
		//type=ex
		//c.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		//copy=> copy selector
		
		c.findElementByCssSelector("#user").sendKeys("hi");
	}

}
