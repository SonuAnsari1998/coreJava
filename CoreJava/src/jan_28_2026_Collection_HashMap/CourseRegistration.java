package jan_28_2026_Collection_HashMap;

import java.util.*;

public class CourseRegistration {

	public static void main(String[] args) {

		Map<String, List<String>> courseList = new HashMap<>();

		while (true) {
			System.out.println("--- Course Registration Menu ---");
			System.out.println("1. Register student to course");
			System.out.println("2. Remove student from course");
			System.out.println("3. View course-wise student list");
			System.out.println("4. Exit");
			int choice = Integer.parseInt(IO.readln("Enter your choice: "));
			switch (choice) {
			case 1 -> {
				String courseName = IO.readln("Enter course name: ");
				String studentName = IO.readln("Enter student name:");
				courseList.computeIfAbsent(courseName, key -> new ArrayList<String>()).add(studentName);
				System.out.println(studentName + " registered to " + courseName);
				System.out.println();
			}
			case 2 -> {
				String courseName = IO.readln("Enter course name: ");
				String studentName = IO.readln("Enter student name to remove:");
				
				
				courseList.computeIfPresent(courseName, (k, v) -> {
					if(v.remove(studentName)) {
						System.out.println(studentName+" : has removed from "+courseName);
					}else {
						System.out.println(studentName+" and "+courseName+" Not found...");
					}
					return v;
				});

			}
			case 3 -> {
				System.out.println(" Course → Students List:");
				for (Map.Entry<String, List<String>> entry : courseList.entrySet()) {
					System.out.println(entry.getKey() + "\t" + entry.getValue());
				}
			}
			case 4 -> {
				System.out.println("\nThank you for visting......");
				System.exit(0);
			}
			default -> System.err.println("Invalid choice.....");
			}
		}
	}

}
