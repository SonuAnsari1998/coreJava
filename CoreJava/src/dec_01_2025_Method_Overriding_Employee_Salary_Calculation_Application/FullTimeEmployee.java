package dec_01_2025_Method_Overriding_Employee_Salary_Calculation_Application;

class FullTimeEmployee extends Employee {
	protected double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		if (salary <= 0) {
			System.out.println("Salary can't be negative!!!");
			System.exit(0);
		}
		this.salary = salary;
	}

	public double calculateSalry() {
		return this.salary;
	}
}