package IOStream;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BOStream {

	public static void main(String[] args) {
		BufferedOutputStream bof = new BufferedOutputStream(System.out);
		
		String str = "I am a programmer";
		
		byte[] b = str.getBytes();
		
		try {
			bof.write(b);
			bof.flush();
			bof.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
