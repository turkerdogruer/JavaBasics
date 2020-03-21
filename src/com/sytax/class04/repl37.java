package com.sytax.class04;

import java.util.Scanner;

public class repl37 {
	public static void main(String[] args) {
		/*
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?" "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=Water If user is thirsty and
		 * sleepy--> drink=Coffee If user is not thirsty and sleepy --> drink=Tea
		 * Otherwise drink="Nothing"
		 * 
		 * Output: "Looks like you need to drink ___ "
		 */
		Scanner scan;
		boolean thirsty;
		boolean sleepy;
		String out;
		scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thirsty = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = scan.nextBoolean();
		if (thirsty && !sleepy) {
			out = " drink water ";
		} else if (thirsty && sleepy) {
			out = "drink coffee";
		} else if (!thirsty && sleepy) {
			out = "drink tea";
		} else {
			out = "Nothing";
		}
		System.out.println("Looks like you need to " + out);
	}
}
