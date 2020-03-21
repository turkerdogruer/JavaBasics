package com_review03;

import java.util.Scanner;

public class ScannerLoop {
	public static void main(String[] args) {
		// ask the user enter a number
		// and add it to the total
		// but he should enter -1 to stop. -1 will not be added to total
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int num;
		System.out.println("Enter the number -1");
		num = scan.nextInt();

		while (num != -1) {
			total += num;
			num = scan.nextInt();
		}
		System.out.println("The total is = " + total);

	}
}
