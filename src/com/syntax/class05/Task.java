package com.syntax.class05;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner input/* any name*/=new Scanner (System.in);
		System.out.println("Do you have a credit card?");
		String card=input.nextLine();
		if (card.equals ("yes")){
			System.out.println("What's your balance?");
			int balance=input.nextInt();
			if (balance>=1000) {
				System.out.println("You need to pay immediately");
			}else {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("Would you like to get a new one?");
			String answer=input.nextLine();
		}
	}
	
	
	
}
