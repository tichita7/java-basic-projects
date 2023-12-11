package IOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import IOStream.Student; 

public class StudentRecordOutput {
	DataOutputStream dataOutput;
	
	public StudentRecordOutput(String outputFile) throws IOException {
		
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void writer(Student student) throws IOException {
		dataOutput.writeUTF(student.getName());
		dataOutput.writeBoolean(student.getGender());
		dataOutput.writeInt(student.getAge());
		dataOutput.writeFloat(student.getGrade());
	}
	
	public void save() throws IOException {
		dataOutput.close();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
//		if(args.length < 1) {
//			System.out.println("Please provide output file");
//			System.exit(0);
//		}
//		
//		String outputfile = args[0];
		String outputFile =  new String("E:\\REPOS\\Wiley_java_core\\src\\Student.txt");
		List<Student> listStudent = new ArrayList<>(); 
		FileOutputStream fos = new FileOutputStream("E:\\REPOS\\Wiley_java_core\\src\\Student.txt");
        DataOutputStream dos  = new DataOutputStream(fos);

		
		listStudent.add(new Student("Sneha", true, 23, 90.1f));
		listStudent.add(new Student("Akshat", true, 21, 81.5f));
		listStudent.add(new Student("Vansh", false, 18, 91.1f));
		listStudent.add(new Student("Alka", true, 55, 95.1f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputFile);
			
			for(Student student: listStudent) {
				outputWriter.writer(student);
			}
			
			outputWriter.save();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
}
