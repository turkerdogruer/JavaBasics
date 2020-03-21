package com.syntax.class09;

import java.util.Scanner;

public class NestedLoopTask {
	public static void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    int [] numbers=new int[5];
	    for(int i=0; i<numbers.length; i++){
	      numbers [i]=scan.nextInt();
	     
	    }
	    for(int i=5; i>0; i--){
	      System.out.println(i);
	    }
	  }

	}

