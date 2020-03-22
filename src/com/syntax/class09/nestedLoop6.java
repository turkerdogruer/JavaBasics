package com.syntax.class09;

public class nestedLoop6 {
	public static void main(String[] args) {
		
		
		
		for(int outerLoop=0; outerLoop<5; outerLoop++) {
			for(int innerLoop = 0; innerLoop<outerLoop; innerLoop++) {
				System.out.println(outerLoop);
			}
		}
	}

}
