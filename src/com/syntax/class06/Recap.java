package com.syntax.class06;

public class Recap {
	public static void main(String[] args) {
		/*
		 * If hour btw 1 -11 thn morning if hour btw 12-15 afternoon if hour btw 16-20
		 * evening if hour btw 21-24 night
		 */
		int hour = 16;
		String timeOfDay;

		if (hour >= 1 && hour <= 11) {
			timeOfDay = "Morning";

		} else if (hour >= 12 && hour <= 15) {
			timeOfDay = "afternoon";
		} else if (hour >= 16 && hour <= 21) {
			timeOfDay = "evening";
		} else if (hour >= 21 && hour <= 24) {
			timeOfDay = "night";
		} else {
			timeOfDay = "Unknown";
		}
		System.out.println("Right now is " + timeOfDay);
		if (!timeOfDay.equals("Unknown")) {
			System.out.println("now timeis " + timeOfDay);
		}

	}

}
