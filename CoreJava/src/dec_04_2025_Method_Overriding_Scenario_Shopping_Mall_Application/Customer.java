package dec_04_2025_Method_Overriding_Scenario_Shopping_Mall_Application;

public class Customer {
	protected String name;
	protected double total;

	public Customer(String name) {
		if (name.isBlank() || name.isEmpty()) {
			System.err.println("Customer name cannot be empty.");
			System.exit(0);
		}
		this.name = name;
	}

	public double calculateBill(double ...prices) {
		double sum=0;
		for (double price : prices) {
			sum += price;
		}
		total=sum;
		return total;
	}

	public void printDetails() {
		System.out.println("Customer Name : " + this.name);
		System.out.println("Total Cost : " + total);
		System.out.println("Discount : No discount for general Customer");
	}

}
