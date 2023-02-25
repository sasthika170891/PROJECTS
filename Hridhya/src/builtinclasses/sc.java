package builtinclasses;

import java.util.Scanner;

public class sc {
	public static void main(String[] args) {
		
		//scanner: get input from the user at run time
		// nonstatic in nature
		// int=> nextInt()
		// String=> nextLine()
		//boolean=> nextBoolean()
		
		//three numbers from user, perform addition
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.nextLine();
		
		System.out.println("Enter your age");
	int age= s.nextInt();
	
	System.out.println("Enter your salary");
	double sal = s.nextDouble();
	System.out.println("Name is "+ name);
	System.out.println("Age is "+ age);
	System.out.println("salary is "+ sal);
	}

}
