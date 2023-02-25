package collectionframework;

import java.util.TreeMap;

public class m2 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> n= new TreeMap<>();
		n.put("zebra", 40);
		n.put("apple", 20000);
		n.put("kiwi", 90);
		n.put("cat", 600);
		n.put("dog", 140);
		System.out.println(n);
		
		//remove: know the key
		n.remove("cat");
		System.out.println(n);
		
		//retrieve: know the key
		System.out.println(n.get("zebra"));
		
		System.out.println(n.entrySet());
		
		//only keys
		System.out.println(n.keySet());
	}
}
