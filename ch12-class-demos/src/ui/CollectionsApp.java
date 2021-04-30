package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the collections app!");
		
		List<Integer> numbersList = new ArrayList<>();
		// add elements to end
		numbersList.add(5);
		numbersList.add(3);
		numbersList.add(27);
		numbersList.add(13);
		
		System.out.println(numbersList);
		
		// add element at a position
		numbersList.add(2, 11);
		System.out.println(numbersList);
		
		// get an element at a position
		System.out.println("Item at position 1: "+numbersList.get(1));
		
		// use size in a for loop
		for (int i=0; i<numbersList.size(); i++) {
			System.out.println("number at position "+i+" is "+numbersList.get(i));
		}
		
		Collections.sort(numbersList);
		System.out.println("sorted numbers:");
		System.out.println(numbersList);
		
		int numberRemoved = numbersList.remove(2);
		System.out.println(numberRemoved);
		
		//search for an element
		if (numbersList.contains(5)) {
			System.out.println("yes, 5 is in list");
		}
		
		//p. 409 - HashMap
		HashMap<String, String> spanishEnglishMap = new HashMap<>();
		spanishEnglishMap.put("uno", "one");
		spanishEnglishMap.put("dos", "two");
		spanishEnglishMap.put("tres", "three");
		spanishEnglishMap.put("quatro", "four");
		spanishEnglishMap.put("cinco", "five");
		
		//contains?
		System.out.println("ocho?? "+spanishEnglishMap.containsKey("ocho"));
		System.out.println("tres?? "+spanishEnglishMap.containsKey("tres"));
		System.out.println("three?? "+spanishEnglishMap.containsValue("three"));
		
		System.out.println(spanishEnglishMap.get("dos"));
		System.out.println(spanishEnglishMap.remove("quatro"));
		
		System.out.println(spanishEnglishMap);
		// p.411 entry set
		for (Map.Entry<String, String> entry: spanishEnglishMap.entrySet()) {
			System.out.println("spanish: "+entry.getKey()+" = english: "+entry.getValue());
		}
		
		System.out.println("Bye");

	}

	
	
	
	
	
	
	
	
	
}
