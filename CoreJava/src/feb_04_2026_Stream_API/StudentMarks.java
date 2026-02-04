package feb_04_2026_Stream_API;

import java.lang.classfile.TypeAnnotation.SupertypeTarget;
import java.util.ArrayList;

/*Assignment : Q4
------------------

WAP to find out top passing students name in an OCPJP exam where the 
passing score of exam is 65%.

Take a record Student
Components : String name, double score, String status (PASS/FAIL)

Create an ArrayList object to hold 6 student records.

By using Stream API, find out the top passing Students (Student scored 75% OR greater)

Top Passing Students:
Scott
Smith
Alen*/
record Student(String name, Double score, String status) {

}

public class StudentMarks {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		Student s1 = new Student("Allen", 78D, "Pass");
		Student s2 = new Student("Scott", 75D, "Pass");
		Student s3 = new Student("Raj", 69D, "Pass");
		Student s4 = new Student("Syam", 64D, "Pass");
		Student s5 = new Student("Rahul", 32D, "Fail");
		Student s6 = new Student("Amit", 69D, "Pass");
		Student s7 = new Student("Pooja", 26D, "Fail");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		
		System.out.println("Top Passing Students:");
		studentList.stream().filter(emp -> emp.score()>=75).map(s ->s.name()).forEach(IO::println);
	}
}
