package abstraction;

public class child extends parent{

	//right click=> source=> override/implement method

	public static void main(String[] args) {
		
		child c= new child();
		c.ab();
		c.nrm();
		
		//parent p= new parent();
		
	}
	
	@Override
	public void ab() {
		System.out.println("abstract method");
		
	}
}
