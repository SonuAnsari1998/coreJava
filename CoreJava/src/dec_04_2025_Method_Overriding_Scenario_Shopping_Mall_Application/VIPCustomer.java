package dec_04_2025_Method_Overriding_Scenario_Shopping_Mall_Application;

public class VIPCustomer extends Customer {
	protected double discountRate = 15.0;

	public VIPCustomer(String name) {
		super(name);
	}

	public double calculateBill(double ...prices) {
		total = super.calculateBill(prices);
		return total;
	}

	public void printDetails() {
		double discountAmount = (discountRate * total) / 100;
		System.out.println("Customer: " + name);
		System.out.println("Total cost RS : " + total);
		System.out.println("Discount RS : " + discountAmount);
		System.out.println("Final amount RS : " + (total - discountAmount));

	}

}
