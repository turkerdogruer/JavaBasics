package com.syntax.class09;

public class ClassHW2 {
	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 * 
		 */
		String name[] = new String[5];
		name[0] = "ali";
		name[1] = "veli";
		name[2] = "ahmet";
		name[3] = "huseyin";
		name[4] = "hamza";
		System.out.println(name[3]);
		
		//Other way
		
		String[] name1 = { "ali", "veli", "ahmet", "huseyin", "hamza" };
		System.out.println(name1[4]);

	}
}
