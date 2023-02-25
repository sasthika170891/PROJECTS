package basics;

public class v1 {

	public static void main(String[] args) {
		
		//variable : name given to a memory location
		// syntax for variable declaration:  datatype variablename=value;
		
		/*
		 * word:    String
		 * letter:  char
		 * number:  int, double, float, short, long
		 * 
		 *          double: can store upto 16 digits after decimal point
		 *          float:  can store upto 8 digits after decimal point, add f at the end
		 *          
		 *true/false: boolean
		 * 
		 * */
		// datatype variablename=value;
		
		String n="Dhivya";
		int age=30;
		char letter='k';
		double height=163.2;
		float weight=63.2F;
		boolean result=false;
		
		System.out.println("Name is "+ n);
		System.out.println("Age is "+ age);
		System.out.println("height is "+ height);
		System.out.println("Weight is "+ weight);
		System.out.println("Result is "+ result);
		System.out.println("Letter is "+ letter);
		
		//area of square
		// additon of two numbers 
		//average of three numbers
		// area of circle 
		
		int r=3;
		System.out.println("Area of circle is "+ 3.14*r*r);
		
		double a=8.3;
		double b=2.3;
		double c=1.2;
		System.out.println("Average is "+ (a+b+c)/3);
	}
}
