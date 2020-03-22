package com.syntax.class09;

public class Array1 {
	 static void main(String[] args) {
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		System.out.println(array[1]);
		
		int num[]=new int[3];
		num[0]=100;
		num[1]=300;
		num[2]=500;
		//Changing value...
		num[1]=1000;
		
		System.out.println(num[1] + num[2]);
	}

}	
