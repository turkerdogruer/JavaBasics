package ElionHazirlik;

public class Class03 {
	public static void main(String[] args) {
		// sum of odd and even number btw 1 to 50

		int count = 1;
		int sumEven = 0, sumOdd = 0;

		while (count <= 50) {
			if (count % 2 == 0) {
				sumEven += count;
			} else {
				sumOdd += count;
			}
			count++;
		}
		System.out.println("Sum of even num is " + sumEven);
		System.out.println("Sum of odd num is " + sumOdd);

		System.out.println("========================================");
		count = 1;
		sumOdd = 0;
		do {
			sumOdd += count;
			count += 2;

		} while (count <= 50);
		System.out.println("odd num is " + sumOdd);

	}
}
