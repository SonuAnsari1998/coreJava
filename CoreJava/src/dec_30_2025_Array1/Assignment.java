package dec_30_2025_Array1;

/*Develop a scenario based program for an education institute course enrollment System. The system should provide courses and offers to students, allowing them to view available courses, ongoing offers, and enroll in their preferred courses.

Classes:
Take one record class Course
Components :
-> id (Integer): Unique identifier for the course.
-> name (String): Name of the course.
-> fee (Double): Fee for the course.



Take another record Offer:
Components :
-> offerText (String): Description of the special offer provided by the education institute.


Take another record EducationInstitute:
Components:
-> courses (Course[]): An array to store the available courses.
-> offers (Offer[]): An array to store ongoing offers.

Methods:
-> public void enrollStudentInCourse(int courseId, String studentName): Using this method
   student will enrolled in the course based on courseId [See the Test Case]. If the given
   courseId is not available then provide error message.


Take another record Student:

Components:
-> String name
-> EducationInstitute institute

Methods:
1) 
Method Name        : viewCoursesAndFees()
Parameter          : No Parameter
Return Type        : void
Access modifier    : public
In this method display all the courses information for student like course id, name and 
fees.

2) 
Method Name        : viewOffers()
Parameter          : No Parameter
Return Type        : void
Access modifier    : public
In this method display all the available offers provided by the institute for the course.


3) 
Method Name        : enrollInCourse()
Parameter          : courseId of type integer
Return Type        : void
Access modifier    : public
In this method write the logic so, student can take admission in the course based on the
courseId


Take an ELC class StudentEnrollmentProcess with main method.
In this class, create all the available courses, offers provided by the institute.
Create Student object so student can view all courses, ongoing offers and take admission
in the respective corse based on the course id.

Test Cases :
------------
Case 1 :
--------
Enter student name: Ravishankar
1 : Java : 35000.0
2 : .Net : 30000.0
3 : Python : 32000.0
Special discount: Get 20% off on all courses!
Limited time offer: Enroll in any two courses and get one course free!
Enter course ID to enroll: 1
Ravishankar enrolled in: Java

Case 2 :
---------
Enter student name: Smith
1 : Java : 35000.0
2 : .Net : 30000.0
3 : Python : 32000.0
Special discount: Get 20% off on all courses!
Limited time offer: Enroll in any two courses and get one course free!
Enter course ID to enroll: 3
Smith enrolled in: Python

Case 3 :
---------
Enter student name: Alen
1 : Java : 35000.0
2 : .Net : 30000.0
3 : Python : 32000.0
Special discount: Get 20% off on all courses!
Limited time offer: Enroll in any two courses and get one course free!
Enter course ID to enroll: 4
Course with ID 4 not found.*/
