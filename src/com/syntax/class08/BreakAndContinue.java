package com.syntax.class08;

public class BreakAndContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("I am in the loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("outside of the loop");
		
	}

}
