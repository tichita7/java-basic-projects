package Generics;

import java.io.Serializable;

public class Printer<T extends Animal & Serializable> {

	T valToPrint;
	
	public Printer(T valToPrint) {
		super();
		this.valToPrint = valToPrint;
	}
	public void print() {
		System.out.println(valToPrint);
	}
}
