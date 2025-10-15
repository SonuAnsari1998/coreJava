package oct_15;
import java.util.Scanner;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp =new Employee();
		System.out.print("Enter Employee Id");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee Name");
		String name=sc.nextLine();
		
		System.out.print("Enter Employee Salary");
		double salary=Double.parseDouble(sc.nextLine());
		
		emp.setEmployeeDetails(id,name,salary);
		System.out.println("----- Employee Information -----");
		System.out.println("Employee Details:");
		System.out.println(emp.toString());
		System.out.println("");
		System.out.println("----- Salary Increment Details -----");
		emp.calculateSalaryIncrement();
		

	}

}
