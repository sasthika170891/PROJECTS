package overloading;

public class o1 {
	public static void main(String[] args) {
		/*
		 *inheritance    : single, ultiple, multilevel, hierarchial
		 *polymorphism   : overloading and overriding 
		 *abstraction
		 *encapsulation 
		 * 
		 * 
		 * overloading:  using same methodname for different purpose
		 *               showing difference in number /datatype/sequence
		 *               
		 *               static, nonstatic, constructor
		 *               
		 * 
		 * 
		 * */
		
		o1.area();
		o1.area(3);
		o1.area(3.4);
		o1.area(3, 4.5);
		o1.area(2.3, 5);
	}
	
	public static void area()//0
	{
		System.out.println("area ");
	}
	
	public static void area(int s)//1
	{
		System.out.println("area of square is "+ s*s);
	}
	
	public static void area(double r)//datatype 
	{
		System.out.println("Area of circle is "+ 3.14*r*r);
	}

	
	public static void area(double r , int l)
	{
		System.out.println("Area of rectangle is "+ l*r);
	}
	
	public static void area( int l, double r)
	{
		System.out.println("Area of triangle is "+ 0.5 *l*r);
	}


}
