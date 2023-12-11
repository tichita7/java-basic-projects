package lambda;
import java.util.function.BiConsumer;
public class BuiltInConsumer {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> bic = (Integer age, Integer percent) -> {
			if(age > 18 && percent > 75) {
				System.out.println("Not applicable");
			}else {
				System.out.println("applicable");
			}
		};
		bic.accept(18, 90);
	}
}
