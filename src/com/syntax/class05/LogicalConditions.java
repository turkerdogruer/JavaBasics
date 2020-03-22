package com.syntax.class05;

public class LogicalConditions {
	public static void main(String[] args) {
		/*
		 * if declared number is between 1-10 thn this number small between 11-100 thn
		 * this is big between 101-1000 thn this number large
		 */
		int num1 = 78;
		if (num1 >= 1 && num1 <= 10) {
			System.out.println("number small");
		} else if (num1 >= 11 && num1 <= 100) {
			System.out.println("this is big");
		} else if (num1 > 100 && num1 <= 1000) {
		} else {
			System.out.println("large number");
		}
	}

}
