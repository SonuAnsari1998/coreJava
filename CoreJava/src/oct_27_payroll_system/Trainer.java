package oct_27_payroll_system;

public class Trainer {
	int trainerId;
	String trainerName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
	}
}
