package com.syntax.class09;

public class ArrayWithLessElement {
	public static void main(String[] args) {
		String classStudent[]=new String [5]; 
		
		//classStuden[0]=null ----- since we dont know nothing in the list
		classStudent[1]="seyma";
		classStudent[2]="senel";
		classStudent[3]="gulsum";
		classStudent[4]="reyhan";
		//classStudent[5]="yunus"; INDEX 5 OUT OF BOUNDS FOR LENGHT [5]
		
		System.out.println(classStudent[0]);
		                              
	}

}
