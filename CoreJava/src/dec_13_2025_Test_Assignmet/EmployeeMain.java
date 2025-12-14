package dec_13_2025_Test_Assignmet;

import java.util.function.Function;

public class EmployeeMain {
	void main() {
		int id = Integer.parseInt(IO.readln("Enter Employee Id"));
		String name = IO.readln("Enter Employee name");
		double salary = Double.parseDouble(IO.readln("Enter salary"));

		Employee employee = new Employee(id, name, salary);
		Function<Employee, Double> function = emp -> emp.salary() + 5000D;
		IO.println("Latest Salary: " + function.apply(employee));
	}
}
