package Collections;


import java.util.Set;
import java.util.TreeSet;


public class CompareTo {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		
		
		System.out.println(((TreeSet<Integer>) set).first().compareTo(((TreeSet<Integer>) set).last()));
		
		//obj1.compareTo(obj2)

		
	}
}

