package com.syntax.class13;

public class Q22 {
//prime num 3 5 7 11 13 17 
	public static void main(String[] args) {

		int given = 7;

		boolean isPrime = true;

		if (given > 1) {

			for (int i = 2; i < given; i++) {
				if (given % i == 0) {
					isPrime = false;
					break;
				}
			}

		} else {
			isPrime = false;
		}

	}
}