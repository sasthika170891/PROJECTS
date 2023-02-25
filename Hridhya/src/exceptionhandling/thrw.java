package exceptionhandling;

import java.util.Scanner;

public class thrw {
	
	public static void main(String[] args) {
		
		
		// throw=> create your own exception when particular cond met
		
		// syntax:  throw new exceptionclassname("error message")
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Etner your age");
		
		int age=s.nextInt();
		
		
	if(age>18 )
	{
		System.out.println("major");
	}
	
	else
	{
		throw new ArithmeticException("cannot vote");
	}
	}

}
