package INTERFACE;

public interface demo {
	
	/*
	 * interface
	 * 
	 *     doesnot contain main method
	 *     doesnot contain static method
	 *     will have nonstatic method with default keyword
	 *     will have abstract method without abstract keyword
	 *     
	 *     abstract method
	 *          nonstatic
	 *          will be empty in its own class
	 *          wll be redefined in the class to which interface connects to
	 *          
	 *          class<=> class:    extends
	 *          class<=> interface:  implements 
	 *          
	 *          class definition:   implements interfacename 
	* 
	 * 
	 * */
	
	default public void dp()
	{
		System.out.println("hi");
		
	}
	
	public void ab();

}
