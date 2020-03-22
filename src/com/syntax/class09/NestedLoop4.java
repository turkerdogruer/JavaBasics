package com.syntax.class09;

public class NestedLoop4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
