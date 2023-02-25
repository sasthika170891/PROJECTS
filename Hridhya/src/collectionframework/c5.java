package collectionframework;

import java.util.TreeSet;

public class c5 {
	public static void main(String[] args) {
		TreeSet<Character>t= new TreeSet<>();
		t.add('p');
		t.add('t');
		t.add('r');
		t.add('e');
		t.add('w');
		System.out.println(t);
		
		// remove : know the value
		t.remove('w');
		System.out.println(t);
		
		//for(datatype tempv: name)
		
		for(char x: t)
		{
			System.out.println(x);
		}
	}

}
