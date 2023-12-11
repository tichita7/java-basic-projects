package Optimisation;

public class DeadCodeElimination {

	public void printOperation(int value) {
		if(value > 0) {
			System.out.println("value is positive");
		}else {
			System.out.println("value is negative");
		}
		System.out.println("something printing here");
	}
	public static void main(String[] args) {
		DeadCodeElimination DeadCodeElimination = new DeadCodeElimination();
		obj.printOperation(3);
	}
}
