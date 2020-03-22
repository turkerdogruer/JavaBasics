package com.sytax.class04;

public class nestedIfContinues {
public static void main(String[]args) {
	boolean allergy=true;
	boolean appleAllergy=false;
	boolean orageAllergy=true;
	boolean kiwiAllergy=false;
	
	if (allergy) {
		System.out.println("answer bellow");
		if(orageAllergy) {
			System.out.println("not to eat");
			if(appleAllergy) {
				System.out.println("not to eat");
			}
		}
		
	}
	
	else {
		System.out.println("Healthy");
	}
}
}
