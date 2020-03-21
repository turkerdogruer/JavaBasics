package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {
	public static void main(String[] args) {
		/*
		 * write a program to ask user if there is sale if there is no sale thn not
		 * going shoping if there is sale thn ask price of the item based on the price
		 * thn will apply discount and calculate final price
		 *
		 * if price less thn 20 ---> apply 10% if price btw 20-100 --->apply 20% if
		 * price btw 100-500 -->apply 30% if price more thn 500----> apply 50%
		 */

		Scanner scan; // Scanner scan = new Scanner(System.in);
		String sale;
		double price;
		double discount = 0;
		double finalPrice = 0;

		scan = new Scanner(System.in);
		System.out.println("is there any sale?");
		sale = scan.nextLine();

		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("any sale");
			price = scan.nextDouble();
			if (price <= 20) {
				discount = price * 0.1;
				finalPrice = price - discount;
			} else if (price > 20 && price <= 100) {
				discount = price * 0.2;
				finalPrice = price - discount;
			} else if (price > 100 && price <= 500) {
				discount = price * 0.3;
				finalPrice = price - discount;

			} else if (price > 500) {
				discount = price * 0.5;
				finalPrice = price - discount;
			}
			System.out.println("After " + discount + " discount the price of the item reduced from " + price + " to "
                    + finalPrice);

		} else {

			System.out.println("no shopping");
		}
	}
}
