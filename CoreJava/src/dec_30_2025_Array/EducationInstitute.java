package dec_30_2025_Array;

public record EducationInstitute(Course[] courses, Offer[] offers) {

	public void enrollStudentInCourse(int courseId, String studentName) {
		for(Course c:courses) {
			if(c.id()==courseId) {
				System.out.println(studentName+" enrooled for: "+c.name());
				System.exit(0);
			}
		}
		System.out.println("Course with ID "+courseId+" not found.");
	}
}
