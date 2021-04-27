import java.text.NumberFormat;
import java.util.Scanner;

public class StaticMethodsApp {

	public static void main(String[] args) {
		System.out.println("Hello, welcome to the static methods app");
		
		// what is a static method?
		// here are two examples of method calls:
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		//System.out.println(currency.format(n));
		
		// prompt the user for their name
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		// print a custom welcome message
		printWelcomeMessage(name);
		
		System.out.println("Add 2 numbers:");
		System.out.print("Enter a number:");
		int nbr1 = sc.nextInt();
		System.out.print("Enter another number:");
		int nbr2 = sc.nextInt();
		
		int sum = sum(nbr1, nbr2);
		
		System.out.println("Sum = "+sum);
		
		
		
		System.out.println("Bye");

	}

	private static void printWelcomeMessage(String tValue) {
		System.out.println("Hello, " + tValue + ", welcome to the static methods app!");
	}
	
	private static int sum(int nbr1, int nbr2) {
		int sum = nbr1 + nbr2;
		return sum;
	}
	


}
