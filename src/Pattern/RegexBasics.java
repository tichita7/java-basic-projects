package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
    public static void main(String[] args) {
		//w//W//s//S//d//D
    	//String re = "..";
    	String re = "\\w\\w\\w\\W";
    	String text = "sss@";
    	
    	Pattern pattern = Pattern.compile(re);
    	Matcher mt = pattern.matcher(text);
    	
    	boolean res = mt.matches();
        System.out.println(res);	
    }
}
