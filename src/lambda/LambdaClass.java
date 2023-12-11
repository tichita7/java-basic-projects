package lambda;

public class LambdaClass {
public LambdaClass() {
	// TODO Auto-generated constructor stub
}static String printThing(Printable thing) {
    return thing.print("Edge");
}
public static void main(String[] args) {
	//Product myProd = new Product();
	
	//through printable interface
	//myProd.print();
	//through function
	//printThing(myProd);
	//lambda functions
	//printThing((s) -> System.out.println("This is a lambda expression"));
	
//	Printable lambdaPrinciple1 = (s) -> System.out.println("This is also a lambda expression 1");
//	Printable lambdaPrinciple2 = s -> System.out.println("This is also a lambda expression 2");
//	printThing(lambdaPrinciple1);
//	printThing(lambdaPrinciple2);
	
	Printable lambdaPrinciple = s -> "Wiley" + s;
	printThing(lambdaPrinciple);
}
}
