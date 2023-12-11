package lambda;

import java.util.function.Supplier;

public class BuiltInSupplier {

	public static void main(String[] args) {
		
		//supplier
		Supplier<String> msg = () -> "Sneha's lucky day is 11!";
		System.out.println(msg.get());
	}
}
