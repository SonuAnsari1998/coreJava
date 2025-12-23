package dec_23_2025_Our_Exception_By_Sonu;

class InvalidFeeException extends RuntimeException {
	public InvalidFeeException() {

	}

	public InvalidFeeException(String msg) {
		super(msg);
	}
}

class NareshIT {

	public void takeAdmission(String studentName, double fee) {
		if (fee < 30000) {
			throw new InvalidFeeException(
					"------Admission Failed!------ \nMinimum fee at Naresh i Technologies Hyderabad is Rs. 30000\n----------Thank You----------");
		}
		IO.println("!!! ------Naresh i Technologies Hyderabad------ !!!");
		IO.println("Admission Successful !!!");
		IO.println("Course: Java");
		IO.println("Faculty: Ravi Sir");
		IO.println("Student Name: " + studentName);
		IO.println("Paid Fee: ₹" + fee);
		IO.println("---------Thank You !!! --------");
		IO.println("---- Admission Process Completed ----");
	}
}

public class NareshITAdmission {
	void main() {
		NareshIT institute = new NareshIT();
		String studentName = IO.readln("Enter Student Name");
		double fee = Double.parseDouble(IO.readln("Enter Fee"));
		try {
			institute.takeAdmission(studentName, fee);
		} catch (InvalidFeeException e) {
			System.err.println(e.getMessage());
		}
	}
}
