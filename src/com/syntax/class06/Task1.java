package com.syntax.class06;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input;
		String Bmonth;
		String m = "January", m2 = "February", m3 = "March", m4 = "April", m5 = "May", m6 = "June", m7 = "July",
				m8 = "August", m9 = "September", m10 = "October", m11 = "November", m12 = "December";
		/*Preferences kisisel tercihler zevkler renkler gibi en sevdigim secerim vs =null; kullanilir (*/
		
		String season = null; //statement int ve boolean almadigi icin =null; instead of String season;
		input = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		Bmonth = input.nextLine();
		if (Bmonth.equals(m) || Bmonth.equals(m12) || Bmonth.equals(m2)) {
			season = "Winter";
		} else if (Bmonth.equals(m3) || Bmonth.equals(m4) || Bmonth.equals(m5)) {
			season = "Spring";
		} else if (Bmonth.equals(m6) || Bmonth.equals(m7) || Bmonth.equals(m8)) {
			season = "Summer";
		} else if (Bmonth.equals(m9) || Bmonth.equals(m10) || Bmonth.equals(m11)) {
			season = "Autumn";
		}
		System.out.println("You were born " + season);
	}
}
