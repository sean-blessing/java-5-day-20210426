package business;

public class Software extends Product {
	private String version;

	public Software(String code, String description, double price, String version) {
		super(code, description, price);
		this.version = version;
	}

	public Software() {
		super();
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return super.toString() + " " + version;
	}
	
	
}
