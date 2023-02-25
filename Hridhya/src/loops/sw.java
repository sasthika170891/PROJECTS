package loops;

public class sw {

	public static void main(String[] args) {
		
		/*datatype of expression=> case naming will be done
		 * cannot use double/float 
		 * 
		 * 
		 * switch(expression)
		 * {
		 * 
		 * case :
		 *    statement
		 *    break
		 *    
		 * case:
		 *    Statement
		 *    break;
		 *    
		 *  default:
		 *    Statement
		 *    break;
		 *    
		 ** 
		 * }
	* */
		
		int age=0;
		switch(age)
		{
		case 0:
			System.out.println("not born");
			break;
			
		case 2:
			System.out.println("toddler");
			break;
			
		case 18:
			System.out.println("adult");
			break;
			
		default:
			System.out.println("doesnot match");
			break;
		
		
		
		
		}
	}
}
