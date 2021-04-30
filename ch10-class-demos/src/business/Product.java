package business;
import java.text.NumberFormat;

public class Product {
	// instance variables
	private String code;
	private String description;
	private double price;
	
	// constructors
	// empty / default constructor
	public Product() {
		
	}

	// fully loaded constructor
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormated() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	@Override
	public String toString() {
		return description;
	}

	// if code is equal then equals is true
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (obj instanceof Product) {
			Product pdt = (Product)obj;
			if (code.equals(pdt.getCode())) {
				isEqual = true;
			}
		}
		
		return isEqual;
	}
	
	

}
