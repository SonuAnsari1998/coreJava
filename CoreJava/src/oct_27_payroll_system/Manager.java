package oct_27_payroll_system;

public class Manager {
	int managerId;
	String managerName;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	double basicSalary;
	
	public Manager(int managerId, String managerName, double hRAPer, double dAPer, double projectAllowance,
			double basicSalary) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
		this.basicSalary = basicSalary;
	}
	

	public double calculateGrossSalary() {
		return  +HRAPer +DAPer + projectAllowance;
	}
}
