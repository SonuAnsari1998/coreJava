package Exam_11_Oct;

import java.util.Scanner;

public class Customer_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer_BLC c1=new Customer_BLC();
		System.out.println("Enter Customer ID: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Customer Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Customer Bill: ");
		int bill=Integer.parseInt(sc.nextLine());
		c1.setCustomerDetails(id, name, bill);
		System.out.println(c1.getCustomerDetails());
	}
}
