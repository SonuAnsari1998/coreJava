package oct_24;

public class EmployeePerformance {
	 private Employee employee;  
	 private String performance; 
	 public EmployeePerformance(Employee employee,String performance) {
		 this.employee=employee;
		 this.performance=performance;
	 }
	 public void setEmployee(Employee employee) {
		 this.employee=employee;
	 }
	 public Employee getEmployee() {
		 return this.employee;
	 }
	 public void setPerformance(String performance) {
		 this.performance=performance;
	 }
	 public String getPerformance() {
		 return this.performance;
	 }
	 public String toString() {
		 return "["+employee +" has '"+performance+"' Performance]";
	 }
}
