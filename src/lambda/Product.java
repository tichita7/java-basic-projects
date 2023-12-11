package lambda;

public abstract class Product implements Printable{

	public String name;
	public int pid;
	
	public Product() {
		
	}
	public void print() {
		System.out.println("This is a product class that implemenet printable");
	}
	
}
