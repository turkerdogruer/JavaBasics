package com.syntax.class09;

public class Kemal2 {
	public static void main(String[] args) {
		String[] fruits = { "banana", "apple", "mango", "kiwi" };
		// for(String x:fruits) {
		// System.out.println(x);
		for (int x = 0; x < fruits.length; x++) {
			// System.out.println(fruits[x]);
			// burada x== da calisti(ilginc)
			// if(x.equals("apple")) {
			if (x == 1) {
				System.out.println(fruits[x] + " is favorite fruit");
			} else {
				System.out.println(fruits[x] + " not favorite");
			}
		}
	}
}