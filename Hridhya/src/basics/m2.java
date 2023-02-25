package basics;

public class m2 {
public static void main(String[] args) {
	
	//different returntype other than void -> int, float, double, string, boolean
	
	
	// creation: add return statement at the end
	// calling : within sysout statement 
	//m2.add();//giving us the integer, not printing
	
	System.out.println(m2.add());
	System.out.println(m2.product());
	
}
// give me an integer value after execution
public static int add()
{
	int a=90;
	int b=40;
	int ADD=a+b;
	return ADD;
	}

private static double product()
{
	double a=4.8;
	double c=9.8;
	double D=a*c;
	return D;
}
}
