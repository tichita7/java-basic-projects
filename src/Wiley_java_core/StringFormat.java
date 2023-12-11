package Wiley_java_core;
import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
//		String title = "Java Developer";
//		float salary = 2000.3669f;
//		System.out.format("%s has %.3f USD salary", title, salary);
		
		List<String> techStack = Arrays.asList(
				"Essential java",
				"Head first java",
				"Java design patterns"
				);
		
		for(String book : techStack) {
			System.out.format("%-20s - In stock%n", book);
		}
	}
}
