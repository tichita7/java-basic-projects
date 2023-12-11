package RandomPackage;

import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {
		Console console = System.console();
		
		if(console == null) {
			System.out.println("Console is not available");
			System.exit(1);
		}
		
		String name = console.readLine("What is your name?  ");
		char[] password = console.readPassword("Enter your password:   ");
		
		console.printf("Hello, %n", name);
		console.printf("Your password is: , %n", new String(password));
	}
}
