package feb_03_2026_Stream_API_Logical_Program;

import java.util.Arrays;
import java.util.List;

//3) Fetch all the Employees name whose salary is greater than 50k and convert into List object.

record Employee(Integer id, String name, Double salary) {

}

public class EmployeesSalaryGreaterThan50K {
	void main() {

		Employee emp1 = new Employee(101, "Sonu", 65000D);
		Employee emp2 = new Employee(102, "Amit", 95000D);
		Employee emp3 = new Employee(103, "Allen", 85000D);
		Employee emp4 = new Employee(104, "Scott", 45000D);
		Employee emp5 = new Employee(105, "Rahul", 35000D);
		Employee emp6 = new Employee(106, "Raj", 54500D);

		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6).stream()
				.filter(emp -> emp.salary() < 50000D).toList();
		empList.forEach(IO::println);

	}
}
