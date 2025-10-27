package oct_27_payroll_system;

public class Sourcing {
	int sourceId;
	String sourcaName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
}
