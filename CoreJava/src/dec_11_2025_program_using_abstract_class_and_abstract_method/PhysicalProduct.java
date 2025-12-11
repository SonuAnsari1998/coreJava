package dec_11_2025_program_using_abstract_class_and_abstract_method;

public class PhysicalProduct extends Product {
	private double shippingWeight;
	private double discount;
	private double updatePrice;
	private double tex;

	public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}

	public void applyDiscount(double percentage) {
		discount = (percentage * getPrice()) / 100;
		updatePrice = (getPrice() - discount);
	}

	public void calculateTax() {
		tex = (8 * discount) / 100;
	}

	public double calculateShippingCost() {
		return shippingWeight * 5;
	}

	@Override
	public String toString() {
		return "PhysicalProduct [shippingWeight=" + shippingWeight + ", discount=" + discount + ", updatePrice="
				+ updatePrice + ", tex=" + tex + "]";
	}
	

}
