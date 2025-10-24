package oct_24;
import java.util.Scanner;
public class EmployeePerformanceCalculator {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Employee Salary: ");
		double salary=Double.parseDouble(sc.nextLine());
		
		Employee emp=new  Employee(name, salary);
		System.out.println();
		System.out.println("--------------Employee Details----------------");
		System.out.println(EvaluateEmployeePerformance.evaluatePerformance(emp));
	}
}
