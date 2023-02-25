package testngdependency;

import org.testng.annotations.Test;

public class dp2 {
	//dependsOnGroups: create connection between test case and group
	
	
	@Test(priority=0,groups="i")
	public void vis()
	{
		System.out.println("visiting website");
	}
	
	
	@Test(priority=1,groups="i")
	public void user()
	{
		System.out.println("entering username");
	}
	
	@Test(priority=2,groups="i")
	public void pass()
	{
		System.out.println("entering pwd");
	}
	
	@Test(priority=3,groups="i")
	public void lg()
	{
		System.out.println("clicking on login");
	}
	
	@Test(priority=4,dependsOnGroups="i")
	public void home()
	{
		System.out.println("home");
	}
	
	//group i; vising, uer,pwd, login   : 4    :  pass      home: pass
	// even if 1 fails                                      home: skipped

}
