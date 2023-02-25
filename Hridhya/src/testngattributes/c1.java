package testngattributes;

import org.testng.annotations.Test;

public class c1 {

	//Testng=> test Next Generation=> testing framework
	// run the test cases
	// reports will be generated
	// parallel, test suite, grouping..annotations
	// inspired from JUNIT
	// Test cases
	//     nonstatic metohod
	//     @Test annotations
	//     default:  alphabetical order
	
	//attributes
	
	// priority:arrange the test case in a particular order 
	// description: adding short note on the test case 
	//grouping 
	//invocation count: run the same test case for multiple time 
	// enabled=false ; ignore/disable
	//timeout: fix timelimit for test case 
	
	@Test(priority=0, description="first test case ",groups="O",invocationCount=5, enabled=false)
	public void t1()
	{
		System.out.println("Test case 1");
	}
	
	
	@Test(priority=1,description="second",groups="O")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2, description="third",groups="P")
	public void t3()
	{
		System.out.println("Tst case 3");
	}
}
