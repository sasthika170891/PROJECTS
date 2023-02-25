package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {
	public static void main(String[] args) {
		
		/*map: container , elements will be stored along with its key
		 * 
		 * key: any datatype
		 * element: any datatype
		 * 
		 * add
		 * remove
		 * retrieve
		 * iteration
		 * 
		 * TreeMap           :   keys:  alphabetical/ascending order
		 * LinkedHashMap     :   keys:  insertion
		 * HashMap           :   unpredictable order 
		 * 
		 * TreeMap<dtypeofkey, dtypeofelement> name= new TreeMap<>();
		 * *
		 * key:  string
		 * element: integer 
		 * */
		
		TreeMap<String, Integer> n= new TreeMap<>();
		n.put("zebra", 40);
		n.put("apple", 20000);
		n.put("kiwi", 90);
		n.put("cat", 600);
		n.put("dog", 140);
		System.out.println(n);
		
		
		LinkedHashMap<String, Integer> n1= new LinkedHashMap<>();
		n1.put("zebra", 40);
		n1.put("apple", 20000);
		n1.put("kiwi", 90);
		n1.put("cat", 600);
		n1.put("dog", 140);
		System.out.println(n1);
		 
		
		HashMap<String, Integer> n2= new HashMap<>();
		n2.put("zebra", 40);
		n2.put("apple", 20000);
		n2.put("kiwi", 90);
		n2.put("cat", 600);
		n2.put("dog", 140);
		System.out.println(n2);
		 
		 
	}

}
