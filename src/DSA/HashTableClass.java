package DSA;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		ht.put(1, 2);
		ht.put(2, 3);
		ht.put(3, 4);
		ht.put(4, 5);
		ht.put(5, 6);
		
		ht.remove(3);
		
		System.out.println(ht);
		
	}
}
