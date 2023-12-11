package Assignment;

import java.io.*;
import java.util.*;

public class StudentRecordReaders {

	DataInputStream dataInput;
	
	public StudentRecordReaders(String inputFile) throws FileNotFoundException {
		dataInput = new DataInputStream(new FileInputStream(inputFile));
	}
	public List<Students> readAll() throws IOException{
		List<Students> listStudent = new ArrayList<>();
		try {
			while(true) {
				String name = dataInput.readUTF();
				boolean gender = dataInput.readBoolean();
				int age = dataInput.readInt();
				float grade = dataInput.readFloat();
				
				System.out.println("Name: " + name);
				Students student = new Students(name, gender, age, grade);
				listStudent.add(student);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		dataInput.close();
		return listStudent;
	}
	
	public static void main(String[] args) {
		String inputFile = "E:\\REPOS\\Wiley_java_core\\src\\Student.txt";
		try {
			StudentRecordReaders reader = new StudentRecordReaders(inputFile);
			List<Students> listOfStudents = reader.readAll();
			
			for(Students student: listOfStudents) {
				System.out.print(student.getName() + "\t");
				System.out.print(student.getGender() + "\t");
				System.out.print(student.getAge() + "\t");
				System.out.println(student.getGrade() );
			}
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		
	}
}
