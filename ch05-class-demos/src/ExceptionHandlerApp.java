import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlerApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		// prompt user for a whole number
		Scanner sc = new Scanner(System.in);

		int nbr = getInt("Enter a whole number: ", sc);
		System.out.println("Good job!  Number entered is: "+nbr);

		double dbl = getDouble("Enter a double number: ", sc);
		System.out.println("Good job!  Number entered is: "+dbl);
		
		System.out.println("Bye");

	}

	private static int getInt(String prompt, Scanner sc) {
		boolean isValid = false;
		int n = 0;
		while (!isValid) {
			System.out.print(prompt);
			try {
				n = sc.nextInt();
				isValid = true;
			}
			catch (InputMismatchException ime) {
				System.out.println("Invalid input.");
				sc.nextLine();
			}			
		}
		return n;
	}

	private static double getDouble(String prompt, Scanner sc) {
		boolean isValid = false;
		double d = 0.0;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			}
			else {
				System.out.println("Invalid input.");
				sc.next();
			}			
		}
		return d;
	}
}
