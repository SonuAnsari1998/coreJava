package oct_14;

public class Bank_BLC {
	String customerName;
	long accountNumber;
	private double currentBalance;
	private static String bankName="ICICI";
	private static String bankAddress="Ameerpet Hyd";
	private static String bankIFSCCode="ICI0120325";
	public void setCustomerDeatils(String name, long accNumber, double balance) {
		if(balance<=0) {
			System.err.println("Invalid balance");
			System.exit(0);
		}
		customerName=name;
		accountNumber=accNumber;
		currentBalance+=balance;	
	}
	public void withdraw(double amount) {
		if(amount>currentBalance) {
			System.out.println("------------------------------------");
			System.err.println("You have insufficient balance");
			System.exit(0);
			System.out.println("------------------------------------");
		}
		currentBalance-=amount;
		System.out.println("------------------------------------");
		System.out.println("Withdraw Sucessfully");
		System.out.println("Witdraw Balance: "+(amount));
		System.out.println("Available Balance is: "+currentBalance);
		System.out.println("------------------------------------");
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("------------------------------------");
			System.err.println("Invalid balance");
			System.exit(0);
			System.out.println("------------------------------------");
		}
		currentBalance+=amount;
		System.out.println("------------------------------------");
		System.out.println("Diposit Sucessfully");
		System.out.println("Diposit Balance: "+amount);
		System.out.println("Available Balance is: "+currentBalance);
		System.out.println("------------------------------------");
	} 
	public double getCurrentBalance() {
		return currentBalance;
	}
	public String displayDetails() {
		return 	"Bank Name = "+bankName+
				"\nIFSC Code = "+bankIFSCCode+
				"\nCustomer Name = "+customerName+
				"\nAccountNumber = "+accountNumber+
				"\nBalance is = "+currentBalance;
	}
}



