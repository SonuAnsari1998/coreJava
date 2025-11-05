package nov_05_Custom_Object_with_array;

public class Student {
	private int id;
	private String name;
	private double marks;
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "marks=" + marks + "]";
	}
	
	
	
}
