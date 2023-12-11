package lambda;

import java.security.DomainCombiner;
import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {

	private static HashMap<Integer, String> Employee = new HashMap<>();
	
	public static void add(String name,int ID) {
		if(!Employee.containsKey(ID)) {
			Employee.put(ID, name);
		}else {
			System.out.println("Employee already exists!");
		}
	}
	public static void main(String[] args) {
		Function<Integer, String> get = (Integer ID) -> {
			if(Employee.containsKey(ID)) return Employee.get(ID);
			else return "Invalid ID";
			
		};
		
		add("SNEHA", 1000);
		add("AMAN", 10002);
		add("VANSH", 1003);
		add("ANAMIKA", 1004);
		
		System.out.println("ID: 1000, Name: " + get.apply(1000));
	}
}
