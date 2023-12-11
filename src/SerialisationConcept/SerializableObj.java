package SerialisationConcept;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObj {
	
	public static void main(String[] args) {
		Person b1 = new Person(21, "Sneha Sharma");
		try {
			FileOutputStream fos = new FileOutputStream("person.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			fos.close();
			System.out.println("Task completed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
