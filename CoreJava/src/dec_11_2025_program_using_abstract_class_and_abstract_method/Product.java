package dec_11_2025_program_using_abstract_class_and_abstract_method;

public abstract class Product {
	private String name;
	private double price;
	private String category;

	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public abstract void applyDiscount(double percentage);

	public abstract void calculateTax();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [" + (name != null ? "name=" + name + ", " : "") + "price=" + price + ", "
				+ (category != null ? "category=" + category : "") + "]";
	}

}
