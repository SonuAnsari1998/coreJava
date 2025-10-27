package interestCalculatorApp;

public class Customer {
	private String name;
	private double principal;
	private int timeInMonths;
	public Customer(String name, double principal, int timeInMonths) {
		super();
		this.name = name;
		this.principal = principal;
		this.timeInMonths = timeInMonths;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getTimeInMonths() {
		return timeInMonths;
	}
	public void setTimeInMonths(int timeInMonths) {
		this.timeInMonths = timeInMonths;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}
