package basics;

public class m3 {

	public static void main(String[] args) {
		
		//classname objectname= new classname();
		//objectname.methodname();
		
		m3 ob= new m3();
		ob.area();
		ob.wish();
		}
	//accessmodifier  returntype name(){}
	
	public void area()
	{
		int r=4;
		System.out.println("Area of circle is "+ 3.14*r*r);
	}
	
	
	private void wish()
	{
		System.out.println("good mrng ");
	}
	
}
/*method: block of code which perfrms certain actions
 * 
 * should be created outside the main method
 * should be called inside the main method
 * 
 * static 
 * non static
 * 
 * non- static:  doesnot have fixed memory space , 
 *          we need  to allocate sprte memory space for calling it
 *          
 * syntax for creation:   accessmodifier  returntype name(){}
 * syntax for calling :  
 *      step1: creating and naming object:    classname objectname= new classname();
 *      step2: calling                        objectname.methodname();
 *   
 *   
 * 
 * accessmodifier:  public, private and protected
 * returntype:     int, float, double, string, char, boolean , void */