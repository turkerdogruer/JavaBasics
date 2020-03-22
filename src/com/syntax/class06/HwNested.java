package com.syntax.class06;

import java.util.Scanner;

public class HwNested {
	public static void main(String[] args) {
		Scanner box;
		int num1, num2, num3;

		box = new Scanner(System.in);

		System.out.println("Please give three distinct number.");
		num1 = box.nextInt();
		num2 = box.nextInt();
		num3 = box.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("The largest number is " + num1);
			}

		} else if (num2 > num1) {

			if (num2 > num3) {
				System.out.println("The largest number is " + num2);
			}
		} if(num3>num2) {
			if(num3>num1) {
				System.out.println("The largest number is "+ num3);
			}
		}
	}
}
