package com.syntax.class05;

public class StringLogicalOpe {
	public static void main(String[] args) {
		String day1 = "Saturday";

		if (day1.contentEquals("Thuesday") || day1.equals("Wed")) {
			System.out.println("SDLC Class");
		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("JAVA Class");
		} else if (day1.equals("monday") || day1.equals("Friday")) {
			System.out.println("review Class");
		}else {
			System.out.println("invalid class");
		}
	}
}
