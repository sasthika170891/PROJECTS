package basics;

public class m4 {

	public static void main(String[] args) {
		
		//other returntype:
		   // add return statement at the end
		//   call it within sysout statement
		
		m4 ob1= new m4();
		System.out.println(ob1.add());
		System.out.println(ob1.wish());
	}
	
	public float add()
	{
		float a=9.4f;
		float b=3.2f;
		float c=a+b;
		return c;
	}
	
	private String wish()
	{
		String n="Hridhya";
		return n+" welcome";
	}
}
