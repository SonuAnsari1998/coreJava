public class Main {
	public static void main(String[] args) {
		PayrollSystem payrollSystem = new PayrollSystem();
		while (true) {
			IO.println("1) Add Employee");
			IO.println("2) Show Employees");
			IO.println("3) Remove Employee");
			int choice = Integer.parseInt(IO.readln("Enter Your Choice...."));
			switch (choice) {
			case 1 -> {
				FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 5000.0);
				PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 102, 30, 15.0);
				payrollSystem.addEmployee(emp1);
				payrollSystem.addEmployee(emp2);
			}
			case 2 -> {
				System.out.println("Initial Employee Details:");
				payrollSystem.displayEmployees();
			}
			case 3 -> {
				System.out.println("\nRemoving Employee...");
				payrollSystem.removeEmployee(101);
			}
			default -> System.err.println("Invalid choice..");
			};
		}
	}
}