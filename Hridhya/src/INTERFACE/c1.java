package INTERFACE;

public class c1 implements demo {
	public static void main(String[] args) {
		
		c1 ob= new c1();
		ob.ab();
		ob.dp();
		
	}

	@Override
	public void ab() {
		System.out.println("abstract method");
		
	}

}
