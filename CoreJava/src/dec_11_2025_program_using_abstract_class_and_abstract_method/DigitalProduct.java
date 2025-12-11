package dec_11_2025_program_using_abstract_class_and_abstract_method;

public class DigitalProduct extends Product {
	private String licenseKey;
	private double discount;
	private double updatePrice;
	private double tex;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}

	public void applyDiscount(double percentage) {
		discount = (percentage * getPrice()) / 100;
		updatePrice = (getPrice() - discount);
	}

	public void calculateTax() {
		tex = (5 * discount) / 100;
	}

	@Override
	public String toString() {
		return "DigitalProduct [" + (licenseKey != null ? "licenseKey=" + licenseKey + ", " : "") + "discount="
				+ discount + ", updatePrice=" + updatePrice + ", tex=" + tex + "]";
	}
	

}
