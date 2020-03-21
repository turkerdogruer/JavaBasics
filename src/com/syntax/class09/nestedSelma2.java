package com.syntax.class09;

public class nestedSelma2 {

	// Print 5 rows from 1 to 9
	public static void main(String[] args) {
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();

		}

	}

}
