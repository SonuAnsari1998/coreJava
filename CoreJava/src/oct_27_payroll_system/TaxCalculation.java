package oct_27_payroll_system;
import java.util.Scanner;
/*private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;*/
public class TaxCalculation {
	public static Object [] inputHandler(Scanner sc)
	{
		Object []obj=new Object[5];
		
		System.out.print("Enter Employee Id");
		obj[0]=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name");
		obj[1]=sc.nextLine();
		System.out.print("Enter Employee Basic Salary");
		obj[2]=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Employee HRAPer");
		obj[3]=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Employee DAPer");
		obj[4]=Double.parseDouble(sc.nextLine());
		
		
		return obj;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice=Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1->
		{
//			System.out.print("Enter Employee Id");
//			int employeeId=Integer.parseInt(sc.nextLine());
//			System.out.print("Enter Employee Name");
//			String employeeName=sc.nextLine();
//			System.out.print("Enter Employee Basic Salary");
//			double basicSalary=Double.parseDouble(sc.nextLine());
//			System.out.print("Enter Employee HRAPer");
//			double HRAPer=Double.parseDouble(sc.nextLine());
//			System.out.print("Enter Employee DAPer");
//			double DAPer=Double.parseDouble(sc.nextLine());
			
			Object[] va = inputHandler(sc);
			Employee emp = new Employee ((int)va[0],(String)va[1],(double)va[2],(double)va[3],(double)va[4]);
			TaxUtil t1=new TaxUtil();
			System.out.println("Tax salary: "+t1.calculateTax(emp));
			System.out.println("Gross Salary :: "+emp.calculateGrossSalary());
			System.out.println("Final Salary : "+(emp.calculateGrossSalary()-t1.calculateTax(emp)));
			
		}
		case 2->
		{
//			System.out.print("Enter Manager Id");
//			int managerId=Integer.parseInt(sc.nextLine());
//			System.out.print("Enter Manager Name");
//			String managerName=sc.nextLine();
//			System.out.print("Enter Manager HRAPer");
//			double HRAPer=Double.parseDouble(sc.nextLine());
//			System.out.print("Enter Employee DAPer");
//			double DAPer=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Manager Project Allowance");
			double projectAllowance=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Manager Basic Salary");
			double basicSalary=Double.parseDouble(sc.nextLine());
			
			Object[] va = inputHandler(sc);
			Manager manager = new Manager((int)va[0], (String)va[1], (double)va[2], (double)va[3], projectAllowance,basicSalary);
			TaxUtil t1=new TaxUtil();
			System.out.println("Final salary: "+t1.calculateTax(manager));
			
		}
//		case 3->
//		{
//			System.out.print("Enter Manager Id");
//			int managerId=Integer.parseInt(sc.nextLine());
//			System.out.print("Enter Manager Name");
//			String managerName=sc.nextLine();
//			System.out.print("Enter Manager HRAPer");
//			double HRAPer=Double.parseDouble(sc.nextLine());
//			System.out.print("Enter Employee DAPer");
//			double DAPer=Double.parseDouble(sc.nextLine());
//			System.out.print("Enter Manager Project Allowance");
//			double projectAllowance=Double.parseDouble(sc.nextLine());
//			System.out.print("Enter Manager Basic Salary");
//			double basicSalary=Double.parseDouble(sc.nextLine());
////			Manager manager = new Manager (managerId,managerName,HRAPer,DAPer,projectAllowance,basicSalary);
//			TaxUtil t1=new TaxUtil();
//			System.out.println("Final salary: "+t1.calculateTax(manager));
//			
//		}
		}
	}
}
