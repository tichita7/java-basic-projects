package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {

	public static void main(String[] args) {
		List<String> l = new CopyOnWriteArrayList<>();
		l.add("a");
		l.add("b");
		l.add("d");
		
		Iterator<String> it = l.iterator();
		
		//mod count
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			l.add("c");
		}
		System.out.println(l);
	}
}
