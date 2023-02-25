package hierrarchial;

public class child1  extends parent{

public static void main(String[] args) {
	
	// parent<=> child
	//parent<=> child1
		
		//calling its own method
		
	
	
		child1.c1s();
		child1 c= new child1();
		c.c1n();
		
		// after inheritance
		
		// with child object => can call parent methods 
		c.pn();
		c.ps();
		
	}
	
	public static void c1s()
	{
		System.out.println("child class1 statc method");
	}
	
	public void c1n()
	{
		System.out.println("child class1 non static method");
	}
	
}
