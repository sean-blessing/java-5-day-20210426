package business;

public class Book extends Product implements Printable {
	private String author;

	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;
	}

	public Book() {
		super();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString() + " by " + author;
	}

	@Override
	public void print() {
		System.out.println("Printable object: "+toString());
		
	}
	
	
}
