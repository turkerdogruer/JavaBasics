package com.syntax.class01;

import java.util.Scanner;

public class Hello {

	public static void main(String args[]) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 * 
		 * 
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 * 
		 */

		Scanner scan;
		String country;
		String language = null;

		scan = new Scanner(System.in);
		System.out.println("country you born");
		country = scan.nextLine();
		System.out.println("Please enter language you speak");
		language = scan.nextLine();

		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;

		case "America":
			language = "English";
			break;
		case "Germany":
			language = "German";
			break;
		default:
			language = "Unkonown";

		}

		System.out.println("You speak " + language);

	}
}
