
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the product manager!");
		
		// create a product using empty/default constructor
		Product product1 = new Product();
		product1.setCode("java");
		product1.setDescription("Murach's Java Programming");
		product1.setPrice(57.5);
		
		// create a product using fully loaded constructor
		Product product2 = new Product("mysql", "Murach's MySQL", 54.5);
		
		System.out.println("product1: "+product1.getCode()+", "+
							product1.getDescription()+", "+
							product1.getPrice());
		
		System.out.println(product2);
		
		System.out.println("Bye");

	}

}
