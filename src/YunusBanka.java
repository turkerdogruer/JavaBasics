import java.util.Scanner;

public class YunusBanka {

	public static void main(String[] args) {

		Scanner input;
		input = new Scanner(System.in);

		String username;
		int password;
		String yes;
		String no;
		long birthday;
		int ssn;

		System.out.println("Welcome to xx bank");
		System.out.println("Enter Username : ");
		username = input.nextLine();
		System.out.println("Enter Password : ");
		password = input.nextInt();

		if (username.equals("ahmet") && (password == 1453)) {
			System.out.println("Access Granted");
			System.out.println("Welcome Ahmet, do you want to apply xx bank platinum credit card? yes or no");

			no = input.nextLine();
			yes = input.nextLine();
			if (yes.equals("yes")) {
				System.out.println("please type your birthdate without any speacial char.");
				birthday = input.nextLong();
				if (birthday == 11111986) {
					System.out.println("Please enter you SSN");
					ssn = input.nextInt();

					if ((ssn > 100000000 && ssn < 999999999) && (ssn == 234567890 || ssn == 123456789)) {
						System.out.println("Checking your credit score!!!!! please see Sales representive");

					} else {

						System.out.println("Please type 9 digits SSN number");
					}

				} else {

					System.out.println("please type valid birthday/your birthday");
				}

			} else {

				System.out.println("Go back to main page");
			}

		} else {

			System.out.println("invalid entry");
		}

	}

}
