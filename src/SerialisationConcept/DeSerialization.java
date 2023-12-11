package SerialisationConcept;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("person.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = (Person) ois.readObject();
		System.out.println("Age:  " + p.age);
		System.out.println("Name: " + p.name);
		
		ois.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
