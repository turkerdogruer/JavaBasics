package com_review03;

public class DoWhileDemo {
	public static void main(String[] args) {
		int age = 0;
		while (age < 11) {
			age++;
			System.out.println("Happy birthday! you are " + age + " years old");
		}
		System.out.println("Grown! You dont need birthday");
		int age2 = 0;
		do {
			age2++;
			System.out.println("Happy birthday you are " + age2 + " years old");
		} while (age2 < 10);
		System.out.println("Now grown!no need birhday party");
	}
}
