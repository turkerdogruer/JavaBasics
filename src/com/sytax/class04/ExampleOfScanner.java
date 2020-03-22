package com.sytax.class04;

import java.util.Scanner;

public class ExampleOfScanner {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the name");
		String name=scan.nextLine();
		System.out.println("My name is " +name);
		
		int number=scan.nextInt();
		System.out.println("your name is " +name+ " your age "+ number);
		
	}

}
