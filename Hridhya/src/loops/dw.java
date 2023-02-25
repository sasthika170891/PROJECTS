package loops;

public class dw {

	public static void main(String[] args) {
		
		/*
		 * while/do while/for loop  
		 * 
		 * initialisation:     where to start
		 * 
		 * condition:          where to stop
		 *     
		 *                     forward:  <=end value
		 *                     backward: >=end value
		 *                     
		 * inc/dec  :          difference between numbers 
		 * 
		 * 
		 * syntax:
		 * 
		 * initialisation
		 * do
		 * {
		 * statement
		 * inc/dec
		 * }
		 * while(condition);
		 * 
		 * even numbers from 30 to 20... 30,28,26...20
		 * 
		 * print odd numbers from 1 to 13   .... 1,3,5,7,9,11
		 */
		
		int i=30;
		do
		{
			System.out.println(i);
			i=i-2;
		}
		while(i>=20);
	}
}
