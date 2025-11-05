package nov_05_Custom_Object_with_array;

public class StudentArrayDemo {
	public static void main(String[] args) {
		Student students[]=new Student[3];
		
		students[0]=new Student(101, "Ravi", 89.5);
		students[1]=new Student(102, "Anita", 92.0);
		students[2]=new Student(103, "Kiran", 85.75);
		
		for(Student s:students) {
			System.out.println(s);
		}
		
	}
}
