package hierrarchial;

public class parent {
	
	
	public static void ps()
	{
		System.out.println("parent class statc method");
	}
	
	public void pn()
	{
		System.out.println("parent class non static method");
	}
	
	/*
	 * inheritance : process in which one class acquires properties of other class
	 * 
	 * parent/super/base :  class whose properties are inherited
	 * child/sub/derived:   class which uses properties of parent
	 * 
	 *            child is using parent class properties
	 * 
	 * to achieve:  in child definition=> extends parent class name
	 * 
	 * after inheritance :  child is having full control on the parent
	 * 
	 *  child obj=> can call parent methods
	 *  
	 *  single :  parent, child
	 *  multiple:  parent1, parent2<=> child  // java doesnot support it
	 *  hierrarchial:  parent<=> child1, child2...
	 *  multilevel:   parent<=> child<=> grandchild
	 * 
	 * 
	 * 
	 * 
	 * */

}
