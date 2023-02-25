package loops;

public class f1 {
	public static void main(String[] args) {
		/*
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
		 * 
		 * for(initialisation; condition checking; inc/dec)
		 * {
		 * statement
		 * }
		 * 
		 ** 9th table in reverse
		 *90,81...0
		 *
		 *0,9,18,27...90
		 * */
		
		for(int i=90;i>=0;i-=9)
		{
			System.out.println(i);
		}
	}

}
