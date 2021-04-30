package com.bmdb.ui;

import java.util.List;

import com.bmdb.business.Movie;
import com.bmdb.db.DAO;
import com.bmdb.db.MovieDB;

import console.util.Console;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the bmdb console app!");
		DAO<Movie> movieDAO = new MovieDB();

		int command = 0;
		while (command!=99) {
			displayMenu();
			command = Console.getInt("Enter command: ", 0, 100);
			switch (command) {
				case 1:
					//get all movies
					List<Movie> movies = movieDAO.getAll();
					for (Movie m: movies) {
						System.out.println(m);
					}
					break;
				case 2: 
					//get a movie by id
					int id = Console.getInt("Enter movie id to retrieve: ");
					Movie m = movieDAO.getById(id);
					if (m != null) {
						System.out.println(m);
					}
					break;
				case 3: 
					break;
				case 4: 
					break;
				case 99: 
					break;
			}
		}		
		
		
		System.out.println("Bye");
	}
	
	private static void displayMenu() {
		String menu = "COMMAND MENU:\n"+
					  "===============\n"+
					  "1  - List Movies\n"+
					  "2  - Get Movie By Id\n"+
					  "3  - Add Movie\n"+
					  "4  - Delete Movie\n"+
					  "99 - Exit\n";
		System.out.println(menu);
	}

}
