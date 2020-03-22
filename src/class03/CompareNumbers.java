package class03;

public class CompareNumbers {
/*Multiple conditions we use else if (elif)... 
	and as long as we have condition else if, 
	not all line is gonna executed only particular
	line will be executed given..Debugging is goona 
	hellp to understand execution step by step
/**/
/*
	1)Create a Java program and declare 
	int variable that will hold a month. 
	Based on the value of the variable 
	your program should print the 
	name of the month.
	2)Write a program to check 
	whether number is positive or negative.
	Interview Question
	3)Write a Java Program to check 
	whether number is Even or Odd.*/
	public static void main(String[]args) {
		int month= 8;
		if(month ==1) { 
			System.out.println("It is January" );
		}else if (month==2) {
			System.out.println("It is February ");
			}
		if (month== 3) { 
			System.out.println("it is March");
		}else if (month == 4){
			System.out.println("It is Apre");
		}else if(month ==5) {
			System.out.println("It is May");
		}else if(month ==6) {
			System.out.println("It is June");
		}else if (month ==7) {
			System.out.println("It is july");
		}else if (month == 8) {
			System.out.println("It is august ");
		}else if (month==9) {
			System.out.println("It is September");
		}	
		
	
	}

}