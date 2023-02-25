package collectionframework;

import java.util.ArrayList;

public class l1 {

	public static void main(String[] args) {
		// collectionfraework-large amount of data under a single name
		// list, set, map, queue, table
		
		/*
		 * list 
		 *    index based
		 *    add
		 *    remove
		 *    retrieve
		 *    iterate
		 *    add duplicate values
		 *    
		 *    syntax: 
		 *    ArrayList<Datatype> name= new ArrayList<>();
		 * 
		 * int=> Integer
		 * String=> String
		 * double=> Double
		 * char=> Character* 
		 * */
		
		ArrayList<Integer>L= new ArrayList<>();
		L.add(90);
		L.add(0);
		L.add(10);
		L.add(30);
		L.add(9);
		L.add(900);
		///   index   0   1   2     3    4   5    
	  //              90  0   10    30   9  900
		System.out.println(L);
		// remove= > know the index
		L.remove(4);
		System.out.println(L);
		
		//retrieval
		System.out.println(L.get(2));
		
		//iteartion: enhanced for loop/for each loop
		// syntax:  for(datatype tempvariable: nameofthecollection)
		
		for(int x:L)
		{
			System.out.println(x);
		}
		
	}
}
