package dec_01_2025_Method_Overriding_Employee_Salary_Calculation_Application;

import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1 -> {
			sc.nextLine();
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(id, name, salary);
			System.out.println(name + " Salary is :" + fullTimeEmployee.calculateSalry());
		}
		case 2 -> {
			sc.nextLine();
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double hourlyRate = sc.nextDouble();
			double hoursWorked = sc.nextDouble();
			PartTimeEmployee partTimeEmployee = new PartTimeEmployee(id, name, hourlyRate, hoursWorked);
			System.out.println(name + " Salary is:" + partTimeEmployee.calculateSalry());
		}
		default -> {
			System.out.println("Invalid Choice");
		}
		}
		;
	}
}