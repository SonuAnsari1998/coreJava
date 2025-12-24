package dec_24_2025_Exception_Handling;

public class FinancialTransactionMain {
	void main() throws NumberFormatException {
		FinancialTransaction s = new FinancialTransaction();
		try {
			double amount = Double.parseDouble(IO.readln("Enter Transaction amount: "));
			long acNumber = Long.parseLong(IO.readln("Enter Account number: "));
			s.processTransaction(amount, acNumber);
		} 
		catch (Exception e) {
			if( e instanceof NumberFormatException) {
				System.err.println("Invalid input: Please enter a valid number for transaction amount.");
				
			}else if(e instanceof IllegalArgumentException)
			System.err.println(e.getMessage());
		}

	}
}
