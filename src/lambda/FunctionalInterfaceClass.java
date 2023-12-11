package lambda;

interface Calc{
	//abstract method
	int calculated(int val);
}
public class FunctionalInterfaceClass {

	public static void main(String[] args) {
		//implement abstract method of Calc interface
		Calc c1 = (int val) -> val+54; // lambda expression
		
		//call the method
		System.out.println("Result: " + c1.calculated(54));
	}
}
