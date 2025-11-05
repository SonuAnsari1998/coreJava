package nov_05_Custom_Object_with_array;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + "]";
	}
	
}
