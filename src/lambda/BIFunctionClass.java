package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BIFunctionClass {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> uo= a -> a ^ 1;
		System.out.println(uo.apply(11));
		
		//BiFunction
		BinaryOperator<Integer> bo= (a,b) -> a & b;
		System.out.println(bo.apply(71,81));
	}
}
