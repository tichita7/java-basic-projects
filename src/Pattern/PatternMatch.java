package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("agent \\w\\w\\w");
		Matcher matcher = pattern.matcher("agent 0008");
		boolean found = matcher.find();
		boolean match = matcher.matches();	
	    System.out.println("Find : " + found);	
	    System.out.println("Match : " + match);	
	}
}
