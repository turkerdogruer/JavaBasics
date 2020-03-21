package class03;

public class DoubleComparison {
	/* 1) Create a Java program and name it Double Comparison. 
	   Declare 2 double values and
	   if value of first variable is higher 
	then the second, print “Double value __ is larger than __ .” Otherwise print...
	2)Create a Java program and name it Temperature Check. 
	Create variable to store temperature. 
	Your program should check if temperature is below 32 
	then it should print “Water will freeze with temperature __“, 
	otherwise “Water will NOT freeze with temperature __“.
	* */
	
public static void main(String[]args) {
	  double n1=24.5;
	  double n2=31.3;
	  
	  if(n1>n2) {
		  System.out.println("Double value " +n1+ " is larger than " +n2 );
	  }
	  else {
		  System.out.println("Double value " +n1+ " is not larger than " +n2 );
	  }  
	  int temp=44;
		if (temp>32) {
		System.out.println("water will freeze");}
		else {
			System.out.println("water will not freeze");
		}	  
 //if boolean is true we can enter if loop. 
		
		boolean flag=false;
		int num=123;
		
		if(flag) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Bye");
		}
		System.out.println(flag);
 }
	  } 
	
	
	  
