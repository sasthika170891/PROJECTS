package testngannt;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {

	/*
	 * before test : run only once before all the test cases started its execution
	 * after test  : run only once after all the test case finshed its execution
	 * 
	 * befre class : run only once, aftr before test
	 * after class: run only once, before after test 
	 * 
	 * before method: run before each test case 
	 * after method: run after each test case 
	 * 
	 * before test: visit
	 *  before class" max
	 *     before method : refresh   tc1 : title    aftermethod  : deleting cookies
	 *     before method : refresh  tc2  : clicking  aftermethod: deleting cookies
	 *   after class" url
	 * after test: closing
	 * 
	 * 
	 * 
	 * */
ChromeDriver c;	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
		c.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method");
		c.manage().deleteAllCookies();
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");
		c.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class ");
		System.out.println(c.getCurrentUrl());
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case1 : title "+ c.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		 c= new ChromeDriver();
		
		//visiting 
		c.get("http://www.google.com");
		System.out.println("before test");
	}
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test");
		Thread.sleep(3000);
		c.quit();
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2");
		c.findElementByLinkText("Privacy").click();
	}
}
