package com.syntax.class09;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i = 9; i >0; i--) {
			for (int j = 9; j > 0; j--) {
				for (int k = 9; k > 0; k--) {
					for (int z = 9; z > 0; z--) {
						System.out.println(i + " " + j + " " + k + " " + z);
					}
				}

			}
		}
	}
}