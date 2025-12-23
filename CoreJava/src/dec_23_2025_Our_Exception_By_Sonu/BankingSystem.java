package dec_23_2025_Our_Exception_By_Sonu;
/*ASSIGNMENT 2: INSUFFICIENT BALANCE EXCEPTION
--------------------------------------------------

Aim:
To implement a custom unchecked exception in a BankingSystem.

Theory:
Unchecked exceptions help enforce business rules without mandatory handling at
 compile time.

Problem Statement:
Create a custom unchecked exception named InsufficientBalanceException.
Throw the exception if withdrawal amount is greater than account balance.

Algorithm:
1. Initialize account balance to 5000.
2. Accept withdrawal amount.
3. Compare withdrawal amount with balance.
4. If amount exceeds balance, throw exception.
5. Else, deduct amount and display remaining balance.

Expected Output:
Error message if balance is insufficient.
Otherwise, successful transaction message.

Conclusion:
This assignment shows real-world use of unchecked exceptions in banking systems.*/
class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException() {
		
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class Bank{
	double balance=5000;
	public void withdrawAmount(double amount) {
		if (amount <= 0) {
		    throw new IllegalArgumentException("Withdrawal amount must be positive");
		}
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}else {
			balance = balance - amount;
			IO.println("Withdraw Successfully !!!");
			IO.println("Withdraw Amount : "+amount);
			IO.println("Available balance "+balance);
		}
	}
}


public class BankingSystem {
	void main() {
		Bank bank =new Bank();
		double withdrawAmount=Double.parseDouble(IO.readln("Enter your Withdraw amount"));
		try {
			bank.withdrawAmount(withdrawAmount);
		}
		catch(InsufficientBalanceException | IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}
