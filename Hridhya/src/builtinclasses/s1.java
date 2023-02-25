package builtinclasses;

import inheritance.parent;

public class s1 {

	public static void main(String[] args) {
		
		//String=> datatype and clss
		// methods=> non static in nature
		parent p= new parent();
		//p.pn();
		String n="Welcome";
		//  index   0   1   2   3    4    5     6 
		//          W   e   l   c    o    m     e
		
		//n=> variable and also object
		
		System.out.println(n.length());
		// index of particular character
		System.out.println(n.indexOf('m'));
		// character at a particular index
		System.out.println(n.charAt(2));
		
		System.out.println(n.toUpperCase());
		System.out.println(n.toLowerCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("Hi"));
		
		System.out.println(n.replace('l', 'k'));
		System.out.println(n.replace("come","go"));
		
		System.out.println(n.contains("kite"));
		
		System.out.println(n.substring(3, 7));//3,4,5,6
		
		System.out.println(n);
		
	}
}
