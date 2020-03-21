package com.syntax.class11;

public class Task {
	public static void main(String[] args) {
		String[] cars = { "american", "german", "korean", "italian" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println();
		for (String araba : cars) {
			System.out.println( araba+ " ");
		}
	}

}
