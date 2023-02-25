package collectionframework;

import java.util.Hashtable;

public class ht {
public static void main(String[] args) {
	
	Hashtable<String,Integer>t= new Hashtable<>();
	t.put("zebra", 40);
	t.put("apple", 20000);
	t.put("kiwi", 90);
	t.put("cat", 600);
	t.put("dog", 140);
	System.out.println(t);
	
	t.remove("zebra");
	System.out.println(t);
	
	System.out.println(t.get("apple"));
	
	System.out.println(t.keySet());
	System.out.println(t.entrySet());
}
}


/*
 * 
 * list    set
 * 
 * list   queue 
 * 
 * Treeset, linkedhashset, hashset
 * Treemap, linkedhashmap, hashmap
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 