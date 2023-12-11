package Collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class FailSafeClass {
     public static void main(String[] args) {  
    	 Map<Integer, String> m = new ConcurrentHashMap<Integer, String>();
    	 m.put(1, "java");
    	 m.put(2, "python");
    	 
    	 Iterator it = m.keySet().iterator();
    	 
    	 while(it.hasNext()) {
    		 Integer key = (Integer) it.next();
    		 System.out.println("Key: " + m.get(key));
    		 m.put(3, "React");
    	 }
     }
}
