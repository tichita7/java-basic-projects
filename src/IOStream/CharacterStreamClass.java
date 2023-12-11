package IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class CharacterStreamClass {

	public static void main(String[] args) throws IOException {
		Writer out =  new OutputStreamWriter(System.out);
		Writer fw = new FileWriter("E:\\REPOS\\Wiley_java_core\\src\\Student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I like programming, what to do");
		bw.flush();
		bw.close();
		fw.close();
	}
}
