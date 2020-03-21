package com.syntax.class13;

public class Q11 {
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		a=b+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		
		String str1="day";
		String str2="night";
		
		str1=str1+str2;
		
		str2=str1.substring(0, 3);
		
		str1=str1.substring(4);
		
		System.out.println("Value of str2 = "+str1);
		System.out.println("Value of str2 = "+str2);
		
		
		
	}
}
