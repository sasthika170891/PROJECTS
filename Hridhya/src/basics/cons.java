package basics;

public class cons {

	public static void main(String[] args) {
		
		/*
		 * constructor: special method, that takes classname as its name
		 *             doesnot contain returntype
		 *             automatically called whenever an object is created
		 *             
		 *       syntax for creation: accessmodifier classname();
		 *       syntax for calling:  classname objectname= new classname();
		 ** 
		 * */
		
		cons ob= new cons();
		
	}
	
	public cons()
	{
		int a=4;
		int b=5;
		System.out.println("Addition of two numebrs "+ (a+b));
	}
}
