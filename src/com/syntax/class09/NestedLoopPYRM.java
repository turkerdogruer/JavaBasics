package com.syntax.class09;

public class NestedLoopPYRM {
	public static void main(String[] args) {
		for(int n=1; n<=4; n++) {
			for(int k=1; k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
