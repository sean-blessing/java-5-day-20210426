import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlerApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		// prompt user for a whole number
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		int n = 0;
		while (!isValid) {
			System.out.print("Enter a whole number: ");
			try {
				n = sc.nextInt();
				isValid = true;
			}
			catch (InputMismatchException ime) {
				System.out.println("Invalid input.");
				sc.nextLine();
			}			
		}
		System.out.println("Good job!  Number entered is: "+n);
		System.out.println("Bye");

	}

}
