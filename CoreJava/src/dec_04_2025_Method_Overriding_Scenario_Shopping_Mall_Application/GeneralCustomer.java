package dec_04_2025_Method_Overriding_Scenario_Shopping_Mall_Application;

public class GeneralCustomer extends Customer {

	public GeneralCustomer(String name) {
		super(name);
	}
	@Override
	public double calculateBill(double ...prices) {
		 
		return super.calculateBill(prices);

	}

}
