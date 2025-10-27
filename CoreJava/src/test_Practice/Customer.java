package test_Practice;

public class Customer {
	private String name;
	private double principle;
	private int timeInMonths;
	public Customer(String name, double principle, int timeInMonths) {
		super();
		this.name = name;
		this.principle = principle;
		this.timeInMonths = timeInMonths;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getTimeInMonths() {
		return timeInMonths;
	}
	public void setTimeInMonths(int timeInMonths) {
		this.timeInMonths = timeInMonths;
	}
	public String toString() {
		return this.name;
	}
}
