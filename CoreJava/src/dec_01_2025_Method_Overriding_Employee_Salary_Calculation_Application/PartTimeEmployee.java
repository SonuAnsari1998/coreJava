package dec_01_2025_Method_Overriding_Employee_Salary_Calculation_Application;

class PartTimeEmployee extends Employee {
	protected double hourlyRate;
	protected double hoursWorked;

	PartTimeEmployee(int id, String name, double hourlyRate, double hoursWorked) {
		super(id, name);
		if (hourlyRate <= 0) {
			System.out.println("Employee hourly rate can't be zero OR Negative");
			System.exit(0);
		}
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public double calculateSalry() {
		return this.hourlyRate * this.hoursWorked;
	}
}