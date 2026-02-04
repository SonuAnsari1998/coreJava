package feb_04_2026_Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Assignment : Q1 
----------------
Take a record Employee 
Components :Integer id, String name, Double salary.

Create a ArrayList to hold minimum 6 Employee records.

By using Stream API print all the Employee name in uppercase whose salary is > 50K

Output :
Employees earning above RS 50,000 (Names in uppercase):
SCOTT
SMITH
RAJ*/
record Employee(Integer id, String name, Double salary) {

}

public class PrintUpperCase {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();

		Employee emp1 = new Employee(101, "sonu", 78500D);
		Employee emp2 = new Employee(102, "scott", 45500D);
		Employee emp3 = new Employee(103, "allen", 69500D);
		Employee emp4 = new Employee(104, "raj", 32500D);
		Employee emp5 = new Employee(105, "rahul", 75500D);
		Employee emp6 = new Employee(106, "ravi", 63500D);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);

		List<String> collect = empList.stream().filter(em -> em.salary() > 50000D).map(r -> r.name().toUpperCase())
				.collect(Collectors.toList());

		for (String e : collect) {
			IO.println(e);
		}

	}
}
