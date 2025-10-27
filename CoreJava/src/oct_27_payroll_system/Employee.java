package oct_27_payroll_system;
public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	public Employee(int employeeId, String employeeName, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHRAPer() {
		return HRAPer;
	}

	public void setHRAPer(double hRAPer) {
		HRAPer = hRAPer;
	}

	public double getDAPer() {
		return DAPer;
	}

	public void setDAPer(double dAPer) {
		DAPer = dAPer;
	}

	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer;
	}
	
}
