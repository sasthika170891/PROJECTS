package overloading;

public class o2 {
public static void main(String[] args) {
	
	o2 ob= new o2();
	ob.area();
	ob.area(3);
	ob.area(3.4);
	ob.area(3, 4.5);
	ob.area(2.4, 10);
	
}

public  void area()//0
{
	System.out.println("area ");
}

public  void area(int s)//1
{
	System.out.println("area of square is "+ s*s);
}

public  void area(double r)//datatype 
{
	System.out.println("Area of circle is "+ 3.14*r*r);
}


public void area(double r , int l)
{
	System.out.println("Area of rectangle is "+ l*r);
}

public  void area( int l, double r)
{
	System.out.println("Area of triangle is "+ 0.5 *l*r);
}
}
