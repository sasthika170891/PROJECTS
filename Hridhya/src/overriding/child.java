package overriding;

public class child extends parent{

	public static void main(String[] args) {
		
		
		//overriding : using same methodnae for different purpose
		//             showing difference in location
		
		// method: parent: overriden method    :   parent object 
		// methodL child : overriding method   :   child object 
		
		parent p= new parent();
		p.area();
		
		
		child c= new child();
		c.area();
	}
	
	//overriding method
	public void area()
	{
		int d=4;
		System.out.println("Area of circle is "+ 3.14*d*d);
	}
}
