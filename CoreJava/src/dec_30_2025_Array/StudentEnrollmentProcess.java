package dec_30_2025_Array;

import module java.base;

public class StudentEnrollmentProcess {
	void main() {
		Course c[] = { new Course(1, "Java", 35000.0), new Course(2, ".Net", 30000.0),
				new Course(3, "Python", 32000.0) };
		Offer offer[] = { new Offer("Enroll in any two courses and get one course free!") };

		EducationInstitute ed = new EducationInstitute(c, offer);

		String stdName = IO.readln("Enter student name:");

		Student std = new Student(stdName, ed);
		int cId = Integer.parseInt(IO.readln("Enter course ID to enroll:"));

		std.enrollInCourse(cId);

	}
}
