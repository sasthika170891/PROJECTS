package operators;

public class op1 {

	public static void main(String[] args) {
		
		//Arithmetic operators:   +,-,*,/
		//comparision operators:  <,>,<=,>=,==,!=
		// assignment operators : +=,-=,*=,/=
		// conditional operator:  condition ? true : false   //ternary operator
		// logical operators:   and, or, not
		
		
		
		//int a=4;
		//                 con ?   true  :  false 
		//System.out.println(a>18 ? "major": "minor");
		//add 10 to a 
		//a+=10;  //a=a+10   a=4+10=14
		
		// subtract 1 from a
		//a-=1;
		
		// multiply a by 3
		//a*=3;
		
		//divide a by 2
		//a/=2;
		//System.out.println(a);
		
		/*
		 * and => &&
		 * 
		 * cond1    cond2    output
		 * True       True   True
		 * True      False   False
		 * False     True    False
		 * False     False   False 
		 * 
		 * 
		 * or => ||
		 * 
		 * cond1    cond2    output
		 * True       True   True
		 * True      False   True
		 * False     True    True
		 * False     False   False 
		 * 
		 * 
		 * Not => !
		 * true=> false
		 * False=> true
		 * 
 * 
		 * */
		int m=40;
		int n=3;
		
		System.out.println("AND operator");
		System.out.println(m>20 && n==3);
		System.out.println(m>20 && n==0);
		System.out.println(m==0 && n<5);
		System.out.println(m==0 && n==0);
		
		
		System.out.println("OR operator");
		System.out.println(m>20 || n==3);
		System.out.println(m>20 || n==0);
	     System.out.println(m==0 || n<5);
		System.out.println(m==0 || n==0);
		
		System.out.println("Not operator");
		System.out.println(m==40);
		System.out.println(m!=40);
		
		
	}
}
