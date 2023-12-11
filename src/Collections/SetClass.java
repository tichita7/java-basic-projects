package Collections;


import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class SetClass {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		Set<String> set = new TreeSet<>();
		
		hs.add("java");
		hs.add("java");
		hs.add("sql");
		hs.add("python");
		hs.add("javascript");
		
		System.out.println(hs);
		
		set.add("Java");
		set.add("Java");
		set.add("Java");
		set.add("python");
		set.add("java");
		set.add("Javascript");
		System.out.println(set);
		
		//ArrayList of even names ---> get unique values
		//hs.addAll(array List);

		
	}
}
