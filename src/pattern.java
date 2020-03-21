
public class pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int k = 1; k <= 4; k++) {
				if (i == 1 || i == 4 || k == 1 || k == 4) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
