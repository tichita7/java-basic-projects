package Assignment;

import java.util.Scanner;

public class CurrencyConvertor {

    public static void main(String[] args) {
		 
	    System.out.println("Currency Convertor");
	    System.out.println("-------------------");
	    System.out.println();
		System.out.println("1. Ruppe");
		System.out.println("2. Dollar");
		System.out.println("3. Euro");
		System.out.println("4. Yuan");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Choose the currency");
		int choice = sc.nextInt();
		System.out.println();
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		
		
		switch (choice) {
		case 1:
			Ruppe_to_other(amount);
			break;
		case 2:
			Dollar_to_other(amount);
			break;
		case 3:
			Euro_to_other(amount);
			break;
		case 4:
			Yuan_to_other(amount);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		sc.close();

	}

	public static void Ruppe_to_other(double amt) {
		System.out.println("1 Ruppe = " + 0.013 + " Dollar");
		System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollar");
		System.out.println();

		System.out.println("1 Ruppe = " + 0.012 + " Euro");
		System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro");
		System.out.println();
		System.out.println("1 Ruppe = " + 0.085 + " Yuan");
		System.out.println(amt + " Ruppe = " + (amt * 0.085) + " Yuan");
		System.out.println();

	}
	
	public static void Yuan_to_other(double amt) {
		System.out.println("1 Yuan = " + 0.14 + " Dollar");
		System.out.println(amt + " Yuan = " + (amt * 0.14) + " Dollar");
		System.out.println();
		
		System.out.println("1 Yuan = " + 0.13 + " Euro");
		System.out.println(amt + " Yuan = " + (amt * 0.13) + " Euro");
		System.out.println();
		
		System.out.println("1 Yuan = " + 11.80 + " Ruppe");
		System.out.println(amt + " Yuan = " + (amt * 11.80) + " Ruppe");
		System.out.println();
		
	}

	public static void Dollar_to_other(double amt) {
		System.out.println("1 Dollar = " + 79.37 + " Ruppe");
		System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
		System.out.println();

		System.out.println("1 Dollar= " + 0.98 + " Euro");
		System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
		System.out.println();
		System.out.println("1 Dollar = " + 6.92 + " Yuan");
		System.out.println(amt + " Dollar = " + (amt * 6.92) + " Yuan");
		System.out.println();
	}

	public static void Euro_to_other(double amt) {
		System.out.println("1 Euro = " + 80.85 + " Ruppe");
		System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe");
		System.out.println();

		System.out.println("1 Euro = " + 1.02 + " Dollar");
		System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
		System.out.println();
		
		System.out.println("1 Euro = " + 7.63 + " Yuan");
		System.out.println(amt + " Euro = " + (amt * 7.63) + " Yuan");
		System.out.println();
		
	}
}


