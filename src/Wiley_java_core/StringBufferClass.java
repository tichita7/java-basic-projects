package Wiley_java_core;

public class StringBufferClass {
     public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Sneha");
		StringBuffer sb1 = new StringBuffer("Sneha");
		StringBuffer sb2 = new StringBuffer("Sneha");
		
		String ss = "Sneha";
		System.out.println(ss.equals(sb1));
		System.out.println(ss.equals(sb1.toString()));
		
		
		System.out.println(sb);
		sb.append(" Sharma");
		System.out.println(sb);
		
		
		sb.insert(5, "'s");
		System.out.println(sb);
		
		sb.delete(8, 14);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
	}
}
