package basics;

public class m5 {

	public static void main(String[] args) {
		
		//parameter:  variable passed to a function definition
		// argument:  value assigned to the parameter while calling it
		
		m5.area(3, 5);   // a=3   b=5    ; 3,5=> arguments
		m5 ob = new m5();
		ob.product(3.2, 4.5);// a=3.2  b=4.5   
		
	}
	
	public static void area(int a, int b)// a and b=> parameter
	{
		System.out.println("Area of rectangle is "+ a*b);
	}
	
	
	public void product(double a, double b)// a and b=> parameters 
	{
		System.out.println("Product "+ a*b);
	}
}
