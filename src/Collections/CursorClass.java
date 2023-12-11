package Collections;

import java.util.Vector;
import java.util.Enumeration;

public class CursorClass {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<>();
		
		vc.addElement("a");
		vc.addElement("b");
		vc.addElement("c");
		vc.addElement("d");
		vc.addElement("e");
		vc.addElement("f");
		
		Enumeration<String> ev = vc.elements();
		
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
	}
}
