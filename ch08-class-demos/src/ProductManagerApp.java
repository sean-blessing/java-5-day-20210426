
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager");
		
		Book b1 = new Book("java", "Murach's Java Programming", 
							57.5, "Joel Murach");
		Software s1 = new Software("netbeans", "Netbeans", 0.0, "8.2");
		
		System.out.println("Book: "+b1);
		System.out.println("Software: "+s1);
		
		Product p;
		
		p = b1;
		
		System.out.println("p instanceof Book??? "+ (p instanceof Book));
		
		System.out.println("Product toString: "+p);
		
		p = s1;
		
		System.out.println("Product toString: "+ p);
		
		Product p1 = new Product("test", "test", 50.50);
		Book b2;
		//  b2 = p1;  This doesn't work
		
		// 281 - equals method, testing to see if 2 books are the same
		// Do Sean and Nick have the same book?
		// definition of 'same book' is both instances have same values
		Book seanBook = new Book("java", "Murach's Java Programming",
								57.50, "Joel Murach");
		Book nickBook = new Book("java", "Murach's Java Programming",
				57.50, "Joel Murach");
		
		if (seanBook.equals(nickBook)) {
			System.out.println("Sean and Nick have the same book!");
		}
		else {
			System.out.println("Sean and Nick have different books.  :(");
		}
		
		
		
		System.out.println("Bye");

	}

}
