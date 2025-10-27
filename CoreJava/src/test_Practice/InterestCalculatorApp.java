package test_Practice;
import java.util.Scanner;
public class InterestCalculatorApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name=sc.nextLine();
		System.out.print("Enter Principle Amount : ");
		double principle=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Time in Month : ");
		int timeInMonth=Integer.parseInt(sc.nextLine());
		Customer c1=new Customer(name,principle,timeInMonth);
		System.out.println(CalculateInterest.calculateInterest(c1));
	}
}
