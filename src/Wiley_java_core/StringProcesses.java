package Wiley_java_core;

public class StringProcesses {
       public static void main(String[] args) {
		String s1 = "Sneha";
		String s2 = "Sneha";
		
		String s3 = new String("Sneha");
		String s4 = new String("Sneha");
		
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
//		System.out.println(s3==s4);
		
		String str = "I am a java developer";
		String str1 = "I am a python developer";
		
		String str2= str.concat(" "+str1);
		
		String fname = "Sneha";
		String mname = "Sharma";
		String lname = "Verma";
		
		String fullName = fname.concat(" "+mname).concat(" "+lname);
		System.out.println(fullName);
		
		System.out.println(str.charAt(10));
		System.out.println(str.length());
		System.out.println(str2);
		
		System.out.println(str.replace("d", "D"));
		
		String[] str3 = str.split("");
		for(String s: str3) {
		System.out.println(s);
		}
		String u= " Vansh";
		System.out.println(u);
		System.out.println(u.trim());
		
	}
}
