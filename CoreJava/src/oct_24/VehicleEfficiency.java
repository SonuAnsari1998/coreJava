package oct_24;

public class VehicleEfficiency {
	 private Vehicle vehicle;  
	 private String efficiency;
	 public VehicleEfficiency(Vehicle vehicle,String efficiency) {
		 this.vehicle=vehicle;
		 this.efficiency=efficiency;
	 }
	 public void seVehicle(Vehicle vehicle) {
		 this.vehicle=vehicle;
	 }
	 public Vehicle getVehicle() {
		 return this.vehicle;
	 }
	 public void setEfficiency(String efficiency) {
		 this.efficiency=efficiency;
	 }
	 public String getEfficiency() {
		 return this.efficiency;
	 }
	 //[Vehicle Honda City is "Highly Efficient"]
	 public String toString() {
		 return "[Vehicle "+vehicle +" is '"+efficiency+"']";
	 }
}
