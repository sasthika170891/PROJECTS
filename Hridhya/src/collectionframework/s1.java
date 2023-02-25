package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {

	public static void main(String[] args) {
		
		/*set
		 * 
		 *  doesnot accept duplicates 
		 *  not indexed
		 *  add
		 *  remove
		 *  retrieval is not possible
		 *  iterate 
		 *  
		 *  TreeSet         :   ascending order/alphabetical order
		 *  LinkedHashset   :   insertion order
		 *  Hashset         :   unpredictable order 
		 ** 
		 * */
		
		TreeSet<Double>t= new TreeSet<>();
		t.add(9.89);
		t.add(1.8);
		t.add(0.9);
		t.add(4.8);
		t.add(5.0);
		System.out.println(t);
		
		
		LinkedHashSet<Double>t1= new LinkedHashSet<>();
		t1.add(9.89);
		t1.add(1.8);
		t1.add(0.9);
		t1.add(4.8);
		t1.add(5.0);
		System.out.println(t1);
		
		HashSet<Double>t11= new HashSet<>();
		t11.add(9.89);
		t11.add(1.8);
		t11.add(0.9);
		t11.add(4.8);
		t11.add(5.0);
		System.out.println(t11);
		
		
	}
}
