package encapsulation;

public class e1 {
	/*
	 * encapsulation : data hiding 
	 * 
	 * does not follow inheritance
	 * 
	 * to achieve:
	 *          declare variable as private
	 *          must not assign value straightly to the variable
	 *          
	 *          access the variable: through setter and getter
	 *          
	 *          setter, getter=>nonstatic, public
	 *          
	 *          setter: assign value to the variable
	 *          getter:  view value stored in the variable 
	 *          
	 * 
	 * 
	 * 
	 * */
	
	private String password;
	
	//setter
	public void setp(String p)
	{
		password=p;
		}
	
	//getter
	public void getp()
	{
		System.out.println(password);
	}

}
