package dec_23_2025_Our_Exception_By_Sonu;
/*ASSIGNMENT 3: INVALID LOGIN EXCEPTION 
--------------------------------------------------

Aim:
To validate login credentials using custom unchecked exception.

Theory:
Unchecked exceptions are useful for validation where program logic is violated.

Problem Statement:
Create a custom unchecked exception InvalidLoginException.
Throw the exception if username or password is incorrect.

Algorithm:
1. Store predefined username and password.
2. Accept login credentials from user.
3. Compare input with stored values.
4. Throw exception if mismatch occurs.
5. Display success message if valid.

Expected Output:
Login successful or error message.

Conclusion:
This assignment helps understand validation logic using unchecked exceptions.
*/
class InvalidLoginException extends RuntimeException{
	public InvalidLoginException() {
		
	}
	public InvalidLoginException(String message) {
		super(message);
	}
}

class Login{
	String user="sonu";
	String pass="Sonu@123";
	public void login(String userName, String password) {
		if(userName.equals(user) && password.equals(pass)) {
			IO.println("Login Successfully !!!");
		}else {
			throw new InvalidLoginException("Invalid user ID and Password\nPlease Enter Correct username and password");
		}
	}
}

public class LoginException {
	void main() {
		Login login=new Login();
		String userName=IO.readln("Enter Your urser name");
		String password=IO.readln("Enter Your Password");
		try {
			login.login(userName, password);
		}
		catch(InvalidLoginException e){
			System.err.println(e.getMessage());
			
		}
		
	}
}
