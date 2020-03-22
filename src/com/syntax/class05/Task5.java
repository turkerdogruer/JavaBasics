package com.syntax.class05;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		int day=4;
		Scanner box;
		
		box= new Scanner(System.in);
		System.out.println("Weekend or Weekday");
		day=box.nextInt();
		
		if (day==1 || day==5) {
			System.out.println("weekday");
		}else if (day==6 || day==7) {
			System.out.println("weekend");
		}else {
			System.out.println("Invalid");
		}
	}

}
