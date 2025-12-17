package dec_17_2025_Function_Supplier;

import module java.base;

public class StudentNotification {
	void main() {
		int id = Integer.parseInt(IO.readln("Enter Student ID: "));
		String name = IO.readln("Enter Student Name: ");
		String course = IO.readln("Enter Student Course: ");
		Student student = new Student(id, name, course);
		Consumer<Student> studentMessage = p -> IO
				.println("Hello " + student.name() + "! Welcome to the " + student.course() + " course.");
		studentMessage.accept(student);
	}

}
