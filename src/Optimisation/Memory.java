package Optimisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Memory {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("myFile.txt");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
		        	fis.close();
				}catch(IOException e2) {
					e2.printStackTrace();
				}
      	}
	  }
		
		
		
		try(FileInputStream fisa = new FileInputStream("myFile.txt")){
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();;
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
