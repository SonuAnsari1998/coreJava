package dec_01_2025_Method_Overriding_Employee_Salary_Calculation_Application;
//comment
class Employee {
	protected int id;
	protected String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public double calculateSalry() {
		return 0.0;
	}
}
