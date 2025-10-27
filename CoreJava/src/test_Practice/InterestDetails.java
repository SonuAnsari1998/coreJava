package test_Practice;
/*customer : Customer : private 
interestRate : double : private 
interestEarned : double : private 
finalAmount : double : private*/
public class InterestDetails {
	private Customer customer;
	private double interestRate;
	private double interestEarned;
	private double finalAmount;
	
	public InterestDetails(Customer customer, double interestRate, double interestEarned, double finalAmount) {
		super();
		this.customer = customer;
		this.interestRate = interestRate;
		this.interestEarned = interestEarned;
		this.finalAmount = finalAmount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getInterestEarned() {
		return interestEarned;
	}
	public void setInterestEarned(double interestEarned) {
		this.interestEarned = interestEarned;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	@Override
	public String toString() {
		return "InterestDetails [customer=" + customer + ", interestRate=" + interestRate + ", interestEarned="
				+ interestEarned + ", finalAmount=" + finalAmount + "]";
	}
	
}
