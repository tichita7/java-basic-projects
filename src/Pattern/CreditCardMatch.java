package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {

	public static void main(String[] args) {
		String cardNo = "2345-5432-4567-6543";
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(cardNo);
		
		String maskedCard = matcher.replaceAll("xxxx-xxxx-xxxx-");
		System.out.println(maskedCard);
	}
}
