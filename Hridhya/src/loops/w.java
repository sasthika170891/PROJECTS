package loops;

public class w {
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
		 * initialisaiton
		 * while(condition)
		 * {
		 * statement
		 * inc/dec
		 * }
		 * * 4,8,12,16,20...40
		 * 
		 * 1,2,3...10 
		 * */
		int i=4;
		while(i<=40)
		{
			System.out.println(i);
			i=i+4;
		}
	}

}
