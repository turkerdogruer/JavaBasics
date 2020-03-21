package com_review03;

public class WhileDemo {
public static void main(String[] args) {
	String greeting="Hello";
	int count=1;
	
	while(count<=10) {
		count++;
		System.out.println(greeting);
	}
	
	count=1;
	
	while(true) {
			count++;
		System.out.println(greeting);
		if(count==6) {
			break;
		}
	}
}
}
