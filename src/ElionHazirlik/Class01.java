package ElionHazirlik;

public class Class01 {
	public static void main(String[] args) {
		String say = "Hello";
		int count = 1;

		while (count <= 5) {
			count++;
			System.out.println(say);
		}

		System.out.println("======================================");

		count = 1;
		while (true) {
			count++;
			System.out.println(say);

			if (count == 6) {
				break;
			}
		}
	}

}
