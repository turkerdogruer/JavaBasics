package com_review03;

public class SumEvenForLoop {
	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		int grandTotal=0;
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("Even number is = "+ sumEven);
		System.out.println("Odd number is = "+ sumOdd);
		grandTotal=sumEven + sumOdd;
		System.out.println("Grand Total is = "+ grandTotal);
	}

}
