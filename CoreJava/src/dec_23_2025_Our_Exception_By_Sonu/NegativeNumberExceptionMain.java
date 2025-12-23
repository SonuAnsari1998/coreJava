package dec_23_2025_Our_Exception_By_Sonu;
/*ASSIGNMENT 1: NEGATIVE NUMBER EXCEPTION
--------------------------------------------------

Aim:
To create and use a custom unchecked exception to handle negative number input.

Theory:
Unchecked exceptions are those that occur at runtime. In Java, they extend the 
RuntimeException class.
Custom unchecked exceptions are used to handle logical errors in programs.

Problem Statement:
Create a custom unchecked exception named NegativeNumberException.
Throw the exception if the user enters a negative number.

Algorithm:
1. Create a class extending RuntimeException.
2. Accept a number from the user.
3. Check if the number is negative.
4. If negative, throw the exception.
5. Otherwise, display the number.

Expected Output:
If input is negative, display an error message.
Otherwise, display the entered number.

Conclusion:
This assignment demonstrates basic creation and use of custom unchecked exceptions.*/
class NegativeNumberException extends RuntimeException{
	public NegativeNumberException() {
		
	}
	public NegativeNumberException(String message) {
		super(message);
	}
}

class CheckNegativeNumber{
	public void checkNumber(int n) {
		if(n<0) {
			throw new NegativeNumberException("Please Enter Possitive Number");
		}else {
			IO.println(n+" : Number is positive ");
		}
	}
}
public class NegativeNumberExceptionMain {
	void main() {
		CheckNegativeNumber n= new CheckNegativeNumber();
		int x=Integer.parseInt(IO.readln("Enter any Number"));
		try {
			n.checkNumber(x);
		}
		catch(NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}
}
