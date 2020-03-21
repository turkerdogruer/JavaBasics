package com.sytax.class04;
/*Java Key Word "Public" Class
 * Task class represent a single opperation that does not return the value*/
public class TASK {
/*Bize ogretile public static void main (String args[]} Bu dil ogretiliyor Java icinden */
	public static void main(String[]args) {
	double MorRate=4.8;
	int MorPrice=170000;
	if (MorRate>4.5) {
		System.out.println("high morgate");
	}else {
		System.out.println("buying house");
	}if (MorPrice>200000) {
		System.out.println("buy house with morgate");
	}else {
		System.out.println("buy with cash");
	}
} 
	
}