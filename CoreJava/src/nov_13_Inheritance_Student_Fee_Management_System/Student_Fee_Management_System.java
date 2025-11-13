package nov_13_Inheritance_Student_Fee_Management_System;

import java.util.Scanner;

public class Student_Fee_Management_System {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a particular type of Student :");
		System.out.println("1) Hosteller Student : \n2) DayScholer Student :");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1 -> {
			System.out.println("Enter Student ID: ");
			int studentId = sc.nextInt();
			if (studentId <= 0) {
				System.out.println("Id should be Positive.");
				System.exit(0);
			}
			System.out.println("Enter Student Name: ");
			String name = sc.next();
			System.out.println("Enter Exam Fee: ");
			double examFee = sc.nextDouble();
			if (examFee <= 0) {
				System.out.println("Exam Fee should be Positive.");
				System.exit(0);
			}
			System.out.println("Enter Transport Fee: ");
			double transportFee = sc.nextDouble();
			System.out.println("Enter Paid Amount: ");
			double amountPaind = sc.nextDouble();
			DayScholar d = new DayScholar(studentId, name, examFee, transportFee);
			System.out.println(d);
			double paid = d.payFee(amountPaind);
			if (paid == 0) {
				System.out.println("All Fees are clear");
			} else {
				System.out.println("Remaining amount to pay is: " + paid);

			}

		}
		case 2 -> {
			System.out.println("Enter Student ID: ");
			int studentId = sc.nextInt();
			System.out.println("Enter Student Name: ");
			String name = sc.next();
			System.out.println("Enter Exam Fee: ");
			double examFee = sc.nextDouble();
			System.out.println("Enter Hostel Fee: ");
			double hostelFee = sc.nextDouble();
			System.out.println("Enter Paid Amount: ");
			double amountPaind = sc.nextDouble();
			if (amountPaind <= 0) {
				System.out.println("amount should be Positive.");
				System.exit(0);
			}
			Hosteller h = new Hosteller(studentId, name, examFee, hostelFee);
			System.out.println(h);
			double paid = h.payFee(amountPaind);
			if (paid == 0) {
				System.out.println("All Fees are clear");
			} else {
				System.out.println("Remaining amount to pay is: " + paid);

			}

		}
		default -> {
			System.out.println("Invalid Choice!");
		}
		}
		;

	}
}

//------------------------------
class Student {
	int studentId;
	String name;
	double examFee;
	double totalAmount;

	Student(int studentId, String name, double examFee) {
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
}

//------------------------------
class DayScholar extends Student {
	double transportFee;

	DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	public String toString() {
		return "DayScholar[TransportFee=" + this.transportFee + ",name=" + this.name + ",studentId=" + this.studentId
				+ ",examFee=" + this.examFee + "]";
	}
	public double payFee(double amount) {
		totalAmount = (examFee + transportFee);
		return totalAmount - amount;
	}

}
//-----------------------------------
class Hosteller extends Student {
	double hostelFee;

	Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}
	public String toString() {
		return "Hosteller[HostelFee=" + this.hostelFee + ",name=" + this.name + ",studentId=" + this.studentId
				+ ",examFee=" + this.examFee + "]";
	}
	public double payFee(double amount) {
		totalAmount = (hostelFee + examFee);
		return totalAmount - amount;
	}
}
