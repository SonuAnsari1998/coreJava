package dec_30_2025_Array;

public record Student(String name, EducationInstitute institute) {

	public void viewCoursesAndFees() {
		Course[] courses = institute.courses();

		for (Course c : courses) {
			System.out.println(c.id() + " : " + c.name() + " : " + c.fee());
		}
	}

	public void viewOffers() {
		Offer[] offers1 = institute.offers();
		for(Offer o:offers1) {
		IO.println(" Special discount: Get 20% off on all courses!\r\n"
				+ "Limited time offer:"+o.offerText());
		}
	}

	public void enrollInCourse(Integer courseId) {
		institute.enrollStudentInCourse(courseId, name);
	}
}
