package interestCalculatorApp;

import java.util.Scanner;

public class InterestCalculatorApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Principle Amount");
		double principle=Double.parseDouble(sc.nextLine());
		System.out.println("Enter time in month");
		int timeInMonth=Integer.parseInt(sc.nextLine());
		Customer c=new Customer(name,principle,timeInMonth);
		InterestDetails interest = CalculateInterest.calculateInterest(c);
		System.out.println("Interest Earned :"+interest.getInterestEarned());
		System.out.println("Interest Rate :"+interest.getInterestRate()*100+"%");
		System.out.println("Final Amount :"+interest.getFinalAmount());
		
	}
}
