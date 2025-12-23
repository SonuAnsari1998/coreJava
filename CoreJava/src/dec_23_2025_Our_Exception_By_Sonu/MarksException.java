package dec_23_2025_Our_Exception_By_Sonu;
/*ASSIGNMENT 4: INVALID MARKS EXCEPTION MarksException
--------------------------------------------------

Aim:
To validate student marks using custom unchecked exception.

Theory:
Data validation errors are best handled using unchecked exceptions.

Problem Statement:
Create a custom unchecked exception InvalidMarksException.
Throw the exception if marks are less than 0 or greater than 100.

Algorithm:
1. Accept marks for three subjects.
2. Validate each mark.
3. Throw exception for invalid marks.
4. Calculate total and average if valid.

Expected Output:
Error message for invalid marks or display result.

Conclusion:
This assignment highlights input validation using custom exceptions.*/

class InvalidMarksException extends RuntimeException{
	public InvalidMarksException() {
		
	}
	public InvalidMarksException(String message) {
		super(message);
	}
}

class Grade{
	public void calculateGrade(int sub1, int sub2, int sub3) {
		if((sub1 >0 && sub1<=100)&&(sub2 >0 && sub2<=100)&&(sub3 >0 && sub3<=100)) {
			int totalMarks=sub1+sub2+sub3;
			double avg=totalMarks/3;
			IO.println("Total Marks "+totalMarks);
			IO.println("Agv. "+avg);
		}else {
			throw new InvalidMarksException("invalid marks Please Enter Valid marks");
		}
	}
}


public class MarksException {
	void main() {
		Grade grade=new Grade();
		int sub1=Integer.parseInt(IO.readln("Enter Subject 1 Marks"));
		int sub2=Integer.parseInt(IO.readln("Enter Subject 2 Marks"));
		int sub3=Integer.parseInt(IO.readln("Enter Subject 3 Marks"));
		try {
			grade.calculateGrade(sub1,sub2, sub3);
		}
		catch(InvalidMarksException e) {
			System.err.println(e.getMessage());
		}
	}
}
























