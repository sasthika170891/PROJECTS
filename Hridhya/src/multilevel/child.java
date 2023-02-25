package multilevel;

public class child extends parent {

	public static void main(String[] args) {
		
		//calling its own method
		
		child.cs();
		child c= new child();
		c.cn();
		
		// after inheritance
		
		// with child object => can call parent methods 
		c.pn();
		c.ps();
		
	}
	
	public static void cs()
	{
		System.out.println("child class statc method");
	}
	
	public void cn()
	{
		System.out.println("child class non static method");
	}
	
}
