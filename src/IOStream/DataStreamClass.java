package IOStream;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("E:\\REPOS\\Wiley_java_core\\src\\Student.txt");
		DataOutputStream dos = new DataOutputStream(fout);
		dos.writeBytes("I am a programmer");
		dos.flush();
		dos.close();
		
	}
}
