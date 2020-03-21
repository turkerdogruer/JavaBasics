package com.syntax.class08;

public class TaskForDoWhile {
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for(int i=1; i<=99; i+=2) {
			if(i%2==1) {
				sum=sum+i;
			}else {
				sum1=sum1+i;
			}
		}System.out.println("tot even "+sum);
		System.out.println("tot even "+sum1);
	}

}
