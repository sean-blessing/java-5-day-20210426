package ui;

import business.Book;
import business.Printable;
import console.util.Console;

public class InterfacesApp {

	public static void main(String[] args) {
		Book b1 = new Book("java", "Murach's Java Programming", 
							57.50, "Joel Murach");
		
		System.out.println("b1 print method: ");
		b1.print();
		
		printBook5Times(b1);
		System.out.println("use the interface...");
		printPrintable10Times(b1);
		
		System.out.println("Get input from user using Console class...");
		int nbr1 = Console.getInt("Enter a whole number: ");
		int nbr2 = Console.getInt("Enter another whole number: ");

	}
	
	private static void printBook5Times(Book b) {
		for (int i = 0; i < 5; i++) {
			System.out.println(b);
		}
		//here, we have access to all the Book attributes and methods
		System.out.println(b.getCode());
	}
	
	private static void printPrintable10Times(Printable p) {
		for (int i = 0; i < 10; i++) {
			System.out.println(p);
		}
		//here, we don't have access to Book attributes, only Pritable
		// p.getCode();
	}
	
	
	
	

}
