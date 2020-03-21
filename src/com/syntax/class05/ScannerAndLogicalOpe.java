package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOpe {
	public static void main(String[] args) {
		/*Take age input from user thn print output
		 * IF age from 0-3 you are baby
		 * if age 4-5 you are kid
		 * if age 6-12 you are child 
		 * if age 13-19 you are teenager
		 * if age from 20-64 you are an adult
		 * if age is more or equal 65 you are senior
		 */
		//1 - declare all variables 
		int age;
		Scanner scan;
		//2- capture values from client
		scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt(); 
		//3- Perfom verification
		
	if (age>0) {
		if (age<3) {
			System.out.println("Your are baby");
		}else if(age>=3 && age<=5) {
			System.out.println("Kid");
		}else if(age>=6 && age<=12) {
			System.out.println("child");
		}else if(age>=13 && age<=19) {
			System.out.println("teenager");
		}else if (age>=20 && age<=65) {
			System.out.println("adult");
		}else {
			System.out.println("Enjoy your life");
		}
	}else {
		System.out.println("Please valid age");}
	}

}
