package com.syntax.class05;

public class MoreLogicalOperatiors {
	public static void main(String[] args) {
		/*
		 * We have 7 days in weel if day is 2, 3 thn SDLC class if day 6, 7 thn java
		 * class if day 1,5 off class if day 4 thn review class
		 */
		int day = 6;

		if (day == 2 || day == 3) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("JAVA class");
		} else if (day == 1 || day == 5) {
			System.out.println("no class");
		} else if (day==4) {
			System.out.println("review class");
		}else {
			System.out.println("Invalid day");
		}
	}

}
