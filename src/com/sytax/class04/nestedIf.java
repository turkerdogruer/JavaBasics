package com.sytax.class04;

public class nestedIf {
	public static void main(String[] args) {
		// declare date and a day.
		/*
		 * if day is Friday--> if date is 13--> watch a scary movie -->if not--> watch a
		 * comedy
		 */
		boolean isFriday = false;
		int date = 14;

		if (isFriday) {
			System.out.println("Today is Friday, and watching movie");
			if (date == 13) {
				System.out.println("watch scary movie");
			} else {
				System.out.println("watch comedy");
			}
		} else {
			System.out.println("not friday,staying home");
		}

		boolean classToday = true;
		boolean flag = false;
		if (flag) {
			System.out.println("Hello");
			if (classToday) {
				System.out.println("Hello friends");
			} else {
				System.out.println("Hello family");
			}
		} else {
			System.out.println("Bye");
		}
		System.out.println("I am outside of if condition");

	}

}
