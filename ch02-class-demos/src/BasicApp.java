import java.util.Scanner;

public class BasicApp {

	public static void main(String[] args) {
		// this is a single line comment
		
		/*
		 * p. 39
		 * This is a block comment
		 * It has multiple lines
		 * Won't stop until it sees the next line...
		 */
		
		// p. 45 define some primitive data type variables
		double price1 = 14.99;
		int qty = 2;
		double totalPrice = price1 * qty;
		System.out.println(totalPrice);
		System.out.println(price1 * qty);
		System.out.println("The total price is: "+totalPrice);
		
		int monthNumber = 0;
		
		monthNumber = 12;
		
		System.out.println(monthNumber);
		monthNumber = 5;
		System.out.println(monthNumber);
		
		int nbr1 = 10;
		int nbr2 = 4;
		
		System.out.println(nbr1 + nbr2);  // 14
		System.out.println(nbr1 - nbr2);  // 6
		System.out.println(nbr1 * nbr2);  // 40
		System.out.println(nbr1 / nbr2);  // 2
		System.out.println(nbr1 % nbr2);  // 2
		
		// p. 47 increment count
		int count = 0;
		System.out.println("count:" + count);
		count = count + 1;
		System.out.println("count:" + count);
		count += 1;
		System.out.println("count:" + count);
		count ++;
		System.out.println("count:" + count);
		
		// p. 48 Strings
		String firstName = "Bob";
		String lastName = "Marley";
		
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		String anotherName = null;
		
		anotherName = "Smith";
		
		//p. 51
		System.out.println("Escape Sequences...");
		System.out.println("This is all on one line but I wish it was on \n2 lines!!!");
		System.out.println("This\tis\ttabbed\tcontent.");
		System.out.println("I want to print a backslash \\");
		
		//p. 53 - Scanner and importing
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name1 = sc.nextLine();
		System.out.println("You entered: "+name1);
		
		//p. 55
		System.out.println("Enter a price: ");
		double price2 = sc.nextDouble();
		System.out.println("Enter a whole number: ");
		int nbr3 = sc.nextInt();
		
		//p. 63 
		// also using print vs println
		System.out.print("Enter 3 whole numbers on one line: ");
		int nbr4 = sc.nextInt();
		int nbr5 = sc.nextInt();
		int nbr6 = sc.nextInt();
		
		System.out.println(nbr4 + nbr5 + nbr6);
		
		System.out.print("Enter month of year (1-12): ");
		int monthInt = sc.nextInt();
		
		if (monthInt == 1) {
			System.out.println("January");
		}
		else if (monthInt == 2) {
			System.out.println("February");
		}
		else if (monthInt == 3) {
			System.out.println("March");
		}
		else {
			System.out.println("Not jan, feb, or march");
		}
		
		// p. 69 while loop
		String choice = "y";
		// see p. 65 about comparing Strings
		// Strings must use equals method to check for equality
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("in loop...");
			System.out.print("Do you want to continue? ");
			choice = sc.next();
		}
		
		int sum = 0;
		int i = 1;
		while (i < 5) {
			sum += i;
			i ++;
		}
		System.out.println("sum = "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
