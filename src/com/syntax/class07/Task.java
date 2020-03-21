package com.syntax.class07;

import java.util.Scanner;

public class Task {
	public static void main(String args[]) {
		Scanner scan;
		int number;
		int ln = 17;
		scan = new Scanner(System.in);

		do {
			System.out.println("enter number");
			number = scan.nextInt();
		} while (number != ln);
		{
			System.out.println("got it");
		}

	}
}
