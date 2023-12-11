package Collections;


import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
       TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		
		tm.put(1000, "Sneha");
		tm.put(2000, "Ayush");
		tm.put(3000, "Alok");
		tm.put(4000, "Aman");
		

		System.out.println(tm);
		
		tm.forEach((k,v)-> System.out.println("key: " + k + " - val: " + v));
		System.out.println("Last key: " + tm.lastKey());
		System.out.println("First key: " + tm.firstKey());
		
		
		
		
	}
}
