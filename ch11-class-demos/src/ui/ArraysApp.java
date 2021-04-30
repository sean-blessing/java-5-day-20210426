package ui;

import java.util.Arrays;

import business.Item;

public class ArraysApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Arrays!");

		int[] numbers1 = {5,2,4,1,3};
		int[] numbers2 = new int[4];
		numbers2[0] = 2;
		numbers2[1] = 4;
		numbers2[2] = 6;
		numbers2[3] = 8;
		//System.out.println(numbers1);
		for(int i=0; i < numbers2.length; i++) {
			System.out.println(i + ":"+ numbers2[i]);
		}
		//System.out.println(numbers2);
		
		int[] numbers3 = new int[100];
		// populate w/ 1 to 100
		for (int i=0; i < 100; i++) {
			numbers3[i] = i+1;
		}
		for (int i=0; i < numbers3.length; i++) {
			System.out.println(i+": "+numbers3[i]);
		}
		
		System.out.println("array of strings - using enhanced for / for each");
		String[] bands = {"The Police", "Bob Marley", "Pearl Jam", "Foo Fighters"};
		for (String band: bands) {
			System.out.println(band);
		}
		
		System.out.println("Arrays class methods");
		Arrays.sort(bands);
		System.out.println("band list sorted:");
		
		for (String band: bands) {
			System.out.println(band);
		}
		
		// search for an item
		int idx = Arrays.binarySearch(bands, "The Police");
		System.out.println(idx);
		
		// array of items
		Item[] items = new Item[3];
		items[0] = new Item(102, "Duct Tape");
		items[1] = new Item(103, "Bailing Wire");		
		items[2] = new Item(101, "Chewing Gum");
		
		System.out.println("Unsorted Items:");
		for (Item i: items) {
			System.out.println(i);
		}
		
		Arrays.sort(items);
		System.out.println("Sorted Items:");
		for (Item i: items) {
			System.out.println(i);
		}
		
		
		
		
		
		
		System.out.println("bye");
	}

}
