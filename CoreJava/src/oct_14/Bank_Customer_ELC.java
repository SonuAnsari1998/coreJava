package oct_14;

import java.util.Scanner;

public class Bank_Customer_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank_BLC c1= new Bank_BLC();
		System.out.println("===== Welcome to ICICI Bank =====");
		System.out.print("Enter Customer Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Account Number : ");
		long accNumber=Long.parseLong(sc.nextLine());
		System.out.print("Enter Opening Balance : ");
		double balance=Double.parseDouble(sc.nextLine());
		c1.setCustomerDeatils(name,accNumber,balance);
		System.out.println("-----------------------------------------------");
		System.out.println("Customer account created successfully! \n"+c1.displayDetails());
		System.out.println("---------------------------------------------------");
		System.out.println("===== MENU =====");
		while(true) {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Display Customer Details");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			System.out.println("-------------------------------");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1 -> {
				System.out.print("Enter deposit amount:");
				double amount=Double.parseDouble(sc.nextLine());
				c1.deposit(amount);
				}
			case 2 -> {
				System.out.print("Enter withdrawal amount: ");
				double amount=Double.parseDouble(sc.nextLine());
				c1.withdraw(amount);
				}
			case 3 -> {
				System.out.println("-----------------------------------");
				System.out.println("Available is Balance: "+c1.getCurrentBalance());
				System.out.println("-----------------------------------");
				}
			case 4 -> {
				System.out.println("-------Customer Details--------- ");
				System.out.println(c1.displayDetails());
				System.out.println("----------------------------");
				}
			case 5-> System.exit(0);
			}
		}
		
		
		
	}
}
