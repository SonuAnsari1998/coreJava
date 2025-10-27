package insuranceCalculatorApp;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	private int vehicleAge;
	private double basePremium;
	public Vehicle(String ownerName, String vehicleType, int vehicleAge, double basePremium) {
		super();
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.vehicleAge = vehicleAge;
		this.basePremium = basePremium;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehicleAge() {
		return vehicleAge;
	}
	public void setVehicleAge(int vehicleAge) {
		this.vehicleAge = vehicleAge;
	}
	public double getBasePremium() {
		return basePremium;
	}
	public void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}
	@Override
	public String toString() {
		return this.ownerName;
	}
	
	
}
