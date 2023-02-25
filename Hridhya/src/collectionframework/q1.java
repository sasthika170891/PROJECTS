package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {
public static void main(String[] args) {
	
	/*queue:  not indexed
	 * 
	 * add
	 * remove
	 * retrieve only head of the queue
	 * iteration
	 * add duplicates
	 * size limitation
	 * 
	 * ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<size);
	 *  * 
	 * */
	
	ArrayBlockingQueue<String> n= new ArrayBlockingQueue<>(4);
	n.add("apple");
	n.add("orange");
	n.add("kiwi");
	n.add("banana");
	
	System.out.println(n);
	
	// remove: value
	n.remove("apple");
	System.out.println(n);
	
	//retrieve: head: peek
	System.out.println(n.peek());
	
	for(String x:n)
	{
		System.out.println(x);
	}
	
	
}
}
