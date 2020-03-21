package com.syntax.class06;

import java.util.Scanner;

public class SwitchIntro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter the number of thee day in week...:");
			int day = input.nextInt();
			String today;
			switch (day) {
			/*If Else den farki case 1: name , case2:, gibi If () sonrasi parantez args atip {} output aliyoruz*/
			case 1:
				today = "Monday";
				break;
			case 2:
				today = "Tuesday";
				break;
			case 3:
				today = "Wednesday";
				break;
			case 4:
				today = "Thursday";
				break;
			case 5:
				today = "Friday";
				break;
			case 6:
				today = "Saturday";
				break;
			case 7:
				today = "Sunday";
				break;
			default:
				today = "Invalid";
			}
			System.out.println("Today is ...:" + today);
		} while (0 == 0);
	}
}
		
	

	
