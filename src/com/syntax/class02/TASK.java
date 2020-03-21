package com.syntax.class02;

public class TASK {
	public static void main(String[] args) {
		// 1
		double num1 = 10.2;
		double num2 = 3.5;
		double sum1 = num1 + num2;
		double sum2 = num1 - num2;
		double sum3 = num1 * num2;
		double sum4 = num1 / num2;
		System.out.println("The adding of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum1);
		// 2
		double s = 3.9;
		double s2 = s * s;
		System.out.println("The squire of the " + s + " is " + s2);

		// 3
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimiter = 2 * (width + height);
		System.out.println("The perimeter of a rectangle with width " + width + "and height " + height + " is egual to "
				+ perimiter + " and the area is " + area);
	}

}
