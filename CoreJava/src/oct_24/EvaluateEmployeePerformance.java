package oct_24;
/*Employee Salary            Performance
> 100000                    Excellent
>= 75000                    Good
>= 50000                    Average
< 50000                     Below Average*/
public class EvaluateEmployeePerformance {
	public static EmployeePerformance evaluatePerformance(Employee s) {
		double sal=s.getSalary();
		EmployeePerformance per=null;
		if(sal>100000) {
			per=new EmployeePerformance(s,"Excelent");
		}else if(sal>=75000 && sal<=100000) {
			per=new EmployeePerformance(s,"Good");
		}else if(sal>=50000 && sal<75000) {
			per =new EmployeePerformance(s,"Average");
		}else {
			per = new EmployeePerformance(s,"Below Average");
		}
		return per;
		
	}
}
