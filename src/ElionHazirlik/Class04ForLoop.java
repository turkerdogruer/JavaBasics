package ElionHazirlik;

public class Class04ForLoop {
	public static void main(String[] args) {

		int sumEven = 0, sumOdd = 0, grandTotal=0;

		for (int count = 1; count <= 50; count++) {
			if (count % 2 == 0) {
				sumEven += count;
			} else {
				sumOdd += count;
			}
			grandTotal+=count;
		}
		System.out.println("even num is " + sumEven);
		System.out.println("odd num is " + sumOdd);
		
		System.out.println("grand total is " + grandTotal );
	}
	
	
}
