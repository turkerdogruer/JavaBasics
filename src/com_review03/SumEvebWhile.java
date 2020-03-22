package com_review03;

public class SumEvebWhile {
	public static void main(String[] args) {
		int i = 1;
		int sumOdd = 0, sumEven = 0;

		while (i <= 50) {
			if (i % 2 == 0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			i++;
		}
System.out.println("sumEven is = " + sumEven );
System.out.println("sumODD is = " + sumOdd);

i=1;
do {
	sumOdd+=i;
	i+=2;
}while(i<=50);
System.out.println("sumOdd is = " + sumOdd);
System.out.println("sumEven is = " + sumEven);
	}
}
