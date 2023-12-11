package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
//		Printer<Cat> printer = new Printer(new Cat());
//		printer.print();
//		Printer<Dog> printer1 = new Printer(new Dog());
//		printer1.print();
//		
//		
//		ArrayList<Object> cats = new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());
//		shout("Tame me to movie");
//		shout("Bring nechlace");
		//shout("Amount", 2000000);
		//shout();
		
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(7);
		intList.add(9);
		printList(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printList(catList);
		
		
	}
	
	public static void printList(List<?> myList) {
		System.out.println(myList);
	}
	
//	public static<T, V> T shout(T shoutOut, V valToBring) {
//		System.out.println(shoutOut + "...!!!");
//		System.out.println(valToBring + "...!!!");
//		
//		return shoutOut;
//	}
	
}
