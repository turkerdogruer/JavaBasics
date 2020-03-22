package com.syntax.class11;

public class StringValidation {
	public static void main(String[] args) {
		String str1 = "Welcome syntax students";
		String str2 = "Welcome syntax Students";

		// to compare 2 strings

		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		String expected = "Home - Syntax Technology";
		String actual = "Home - Syntax Technology";

		if (expected.equals(actual)) {
			System.out.println("Test case pass. Title are matched");
		} else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		if (actual.trim().equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		} else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		String browser="Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on the chrome browser");
		}
	}
}
