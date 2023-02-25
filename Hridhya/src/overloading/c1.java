package overloading;

public class c1 {
	public static void main(String[] args) {
		
		c1 ob= new c1();
		
		c1 ob1= new c1(3);
		
		c1 ob2= new c1(3.5);
		
		c1 ob3= new c1(3,4.5);
		
		c1 ob4= new c1(3.4,5);
		
		
	}
	
	public c1()
	{
		System.out.println("area");
	}

	public c1(int s)
	{
		System.out.println("square : "+ s*s);
	}
	
	public c1(double b)
	{
		System.out.println("circle "+ 3.14*b*b);
	}
	
	
	public c1(int l, double b)
	{
		System.out.println("triangle "+ 0.5*l*b);
	}
	
	public c1(double b, int l)
	{
		System.out.println("rectangle "+ l*b);
	}
}
