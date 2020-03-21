package com.sytax.class04;

import java.util.Scanner;

public class repl36 {
	public static void main(String args[]) {

		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter two strings please enter two numbers");
		String grape = scan.nextLine();
		String apple = scan.nextLine();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (num1 == num2 && grape.equals(apple)) {
			System.out.println("AND");
		}else if (num1 == num2 || grape.equals(apple)) {
				System.out.println("OR");

			} else if (num1 != num2 && !(grape.equals(apple))) {
				System.out.println("NONE");
			} 

		}
	}


