package Collections;

import java.util.Map;
import java.util.HashMap;

public class MapClass {

	public static void main(String[] args) {
		Map<String, String> ss = new HashMap<String,String>();
		
		ss.put("a", "A");
		ss.put("b", "B");
		ss.put("c", "C");
		ss.put("d", "D");
		
		ss.put("e", null);
		ss.put(null, "nullVal");
		ss.put(null, null);
		ss.put("f", null);
		
		System.out.println(ss);
		
		
		
		
      HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		hs.put("Sneha", 117);
		hs.put("Aman", 118);
		hs.put("Alka", 119);
		hs.put("Arun", 120);
		
		System.out.println(hs);
		System.out.println(hs.get("Sneha"));
		System.out.println(hs.containsKey("Aman"));
		System.out.println(hs.containsValue(117));
		
		hs.put("Anamika", 121);
		hs.replace("Aman", 150);
		
		System.out.println(hs);
		
		
	}
}
