package Optimisation;

import java.lang.reflect.Array;

public class StrengthReduction {

	public static void main(String[] args) {
		
	}
	
	public int calSum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
//			int square = arr[i] *arr[i];
//			sum += square;
			sum += arr[i];
		}
		return sum * sum;
	}
	
	public int calTotal(int n) {
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += i*5;
		}
		return sum;
	}
}
