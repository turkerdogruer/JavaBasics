package com.sytax.class04;

import java.util.Scanner;

public class reyhanHW4 {
	 public static void main(String[] args) {
	        
	        // Write a Java Program to find whether a String is palindrome or not?
	        
	        Scanner scan;
	        String str="";
	        String fromLast="";
	        int size=str.length();
	        
		scan = new Scanner (System.in);
	        System.out.println("Please enter your String");
	        
	        str=scan.nextLine();
	        
	        for (int i=size-1; i>=0; i--) {
	            fromLast =fromLast+ str.charAt(i) ;                  //---> charAt num a verip bize char veren method 
	        
	        
	        if ( str.equalsIgnoreCase(fromLast)) {
	         
	            
	        } else {
	            
	        }
	        
	        }
	        
	        System.out.println("Your String is  Palindrome.") ; 
	    }
}
