import java.util.Scanner;

public class LogicalOperation {

	/*
	 * For you to do: Create a program that prompt user with question:
	 * "Do you need a loan?" If the result is true then prompt user with question:
	 * "What is your credit score?". Otherwise eligibility is "Unknown" Based on the
	 * score define users eligibility: if score is below 600 --> eligibility =
	 * "Not eligible" if score is between 600 and 700 inclusive --> eligibility =
	 * "Maybe eligible" if score is between 701 and 800 inclusive --> eligibility =
	 * "Eligible" if score is higher than any other previous values --> eligibility
	 * = "Definitely eligible" .
	 * 
	 * Output: "The eligibility is ____"
	 */
	public static void main(String[] args) {
		int score = 0;
		String eligib = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you neeed a loan?");
		boolean loan = scan.nextBoolean();
		if (loan) {
			System.out.println("What is your credit score?");
			score = scan.nextInt();
			if (score < 600) {
				eligib = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligib = "Maybe eligible";
			} else if (score > 700 && score < 800) {
				eligib = "eligible";
			} else if (score > 800) {
				eligib = "Definetly eligible";
			}

		} else {
			System.out.println("Unknown");
		}
		System.out.println("The eligibility is " + eligib);
	}

}
