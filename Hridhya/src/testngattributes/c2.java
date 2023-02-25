package testngattributes;

import org.testng.annotations.Test;

public class c2 {
	
	@Test(priority=1,description="second",groups="p",timeOut=1000)
	public void ab() throws InterruptedException
	{
		System.out.println("Test case 2");
		Thread.sleep(2000);
	}

}
