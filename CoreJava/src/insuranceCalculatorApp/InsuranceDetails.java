package insuranceCalculatorApp;
//vehicle : Vehicle : private 
//finalPremium : double : private 
//discountApplied : double : private
public class InsuranceDetails {
	private Vehicle vehicle;
	private double finalPremium;
	private double discountApplied;
	public InsuranceDetails(Vehicle vehicle, double finalPremium, double discountApplied) {
		super();
		this.vehicle = vehicle;
		this.finalPremium = finalPremium;
		this.discountApplied = discountApplied;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public double getFinalPremium() {
		return finalPremium;
	}
	public void setFinalPremium(double finalPremium) {
		this.finalPremium = finalPremium;
	}
	public double getDiscountApplied() {
		return discountApplied;
	}
	public void setDiscountApplied(double discountApplied) {
		this.discountApplied = discountApplied;
	}
	@Override
	public String toString() {
		return "InsuranceDetails [" + (vehicle != null ? "vehicle=" + vehicle + ", " : "") + "finalPremium="
				+ finalPremium + ", discountApplied=" + discountApplied + "]";
	}
	
}
