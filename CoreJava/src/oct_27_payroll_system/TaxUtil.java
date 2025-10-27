package oct_27_payroll_system;
/*Class TaxUtil
Fields: None
Public Methods:
calculateTax(Employee e) - returns a double
calculateTax(Manager m) - returns a double
calculateTax(Trainer t) - returns a double
calculateTax(Sourcing s) - returns a double

Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else, tax is 5%.*/
public class TaxUtil {
	double tax;
	public double calculateTax(Employee e) {
		double grossSalary=e.calculateGrossSalary();
		if(grossSalary>50000) {
			return grossSalary*0.20;
		}else {
			return grossSalary*0.05;
		}
	}
	public double calculateTax(Manager m) {
		double grossSalary=m.basicSalary;
		if(grossSalary>50000) {
			tax=0.20;
		}else {
			tax=0.5;
		}
		return tax;
	}

	public double calculateTax(Trainer t) {
		double grossSalary=t.basicSalary;
		if(grossSalary>50000) {
			tax=0.20;
		}else {
			tax=0.5;
		}
		return tax;
	}

	public double calculateTax(Sourcing s) {
		double grossSalary=s.calculateGrossSalary();
		if(grossSalary>50000) {
			return grossSalary-grossSalary*0.20;
		}else {
			return grossSalary-grossSalary*0.05;
		}
		
	}
}
