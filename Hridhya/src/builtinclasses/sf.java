package builtinclasses;

public class sf {
	public static void main(String[] args) {
		
		StringBuffer s= new StringBuffer("Welcome");

		
		//  index   0   1   2   3    4    5     6 
		//          W   e   l   c    o    m     e
		
		System.out.println(s.length());
		// index of particular character
		System.out.println(s.indexOf("m"));
		// character at a particular index
		System.out.println(s.charAt(2));
		
		// insert , append
		System.out.println(s.append("All"));
		System.out.println(s.insert(1, 'e'));
		
		//deletecharat, delete
		System.out.println(s.deleteCharAt(1));
		System.out.println(s.delete(7, 10));//7,8,9
		
		//reverse
		System.out.println(s.reverse());
		System.out.println(s.reverse());
		
		System.out.println(s.replace(3, 7, "COME"));
		
		System.out.println(s);
	}

}
