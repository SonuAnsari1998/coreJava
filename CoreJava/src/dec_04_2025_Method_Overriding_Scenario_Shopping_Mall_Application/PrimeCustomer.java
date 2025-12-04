package dec_04_2025_Method_Overriding_Scenario_Shopping_Mall_Application;

public class PrimeCustomer extends Customer {
	protected double discountRate = 10.0;

	public PrimeCustomer(String name) {
		super(name);
	}

	public double calculateBill(double ...prices) {
		total = super.calculateBill(prices);
		return total;
	}

	public void printDetails() {
		double discountAmount = (discountRate * total) / 100;
		System.out.println("Discount Amount: " + discountAmount);
		System.out.println("Final Amount : " + (total - discountAmount));
	}

}
