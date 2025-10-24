package oct_24;

public class Vehicle {
	private String model;
	private double mileage;
	public Vehicle(String model, double mileage) {
		this.model=model;
		this.mileage=mileage;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return this.model;
	}
	public void setMileage(double mileage) {
		this.mileage=mileage;
	}
	public double getMileage() {
		return this.mileage;
	}
	public String toString() {
		return this.model;
	}
}

