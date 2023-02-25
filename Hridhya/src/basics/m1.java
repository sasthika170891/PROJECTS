package basics;

public class m1 {
	//main
	public static void main(String[] args) {
		
		//classname.methodname()
		m1.area();
		m1.add();
		}
	//area of rectangle: public
	// product of two number: private 
	// accessmodifier static returntype name(){}
	
	public static void area()
	{
		int s=4;
		System.out.println("area of square is "+ s*s);
		System.out.println();//type Sysout, hold on control and click on spacebar
	}
	
	private static void add()
	{
		double a=8.9;
		double b=2.3;
		System.out.println("Addition of two numbers "+ (a+b));
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
 * static:  fixed memory space , 
 *          we need not to allocate sprte memory space for calling it
 *          
 * syntax for creation:   accessmodifier static returntype name(){}
 * syntax for calling :   classname.methodname();
 * 
 * accessmodifier:  public, private and protected
 * returntype:     int, float, double, string, char, boolean , void 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
