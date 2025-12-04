package dec_04_2025_Method_Overriding_Scenario_Shopping_Mall_Application;

import java.util.Scanner;

public class ShoppingMall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("1) General Customer \r\n" + "2) Prime Customer \r\n" + "3) VIP Customer ");
		System.out.println("Please enter Customer type :");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1 -> {
			System.out.println("Please Enter your Name :");
			String customerName = sc.nextLine();
			System.out.println("Enter number of Items :");
			int noOfitem = Integer.parseInt(sc.nextLine());
			System.out.println("Please Enter the Item Name and Price :");
			String itemName[] = new String[noOfitem];
			double itemPrice[] = new double[noOfitem];
			for (int i = 0; i < noOfitem; i++) {
				System.out.println((i + 1) + ") Enter Item Name :");
				itemName[i] = sc.nextLine();
				System.out.println("Enter Item Price :");
				itemPrice[i] = Double.parseDouble(sc.nextLine());
			}
			Customer c = new GeneralCustomer(customerName);
			generateBill(c, itemPrice);
		}
		case 2 -> {
			System.out.println("Please Enter your Name :");
			String customerName = sc.nextLine();
			System.out.println("Enter number of Items :");
			int noOfitem = Integer.parseInt(sc.nextLine());
			System.out.println("Please Enter the Item Name and Price :");
			String itemName[] = new String[noOfitem];
			double itemPrice[] = new double[noOfitem];
			for (int i = 0; i < noOfitem; i++) {
				System.out.println((i + 1) + ") Enter Item Name :");
				itemName[i] = sc.nextLine();
				System.out.println("Enter Item Price :");
				itemPrice[i] = Double.parseDouble(sc.nextLine());
			}
			Customer c = new PrimeCustomer(customerName);
			generateBill(c, itemPrice);
		}
		case 3 -> {
			System.out.println("Please Enter your Name :");
			String customerName = sc.nextLine();
			System.out.println("Enter number of Items :");
			int noOfitem = Integer.parseInt(sc.nextLine());
			System.out.println("Please Enter the Item Name and Price :");
			String itemName[] = new String[noOfitem];
			double itemPrice[] = new double[noOfitem];
			for (int i = 0; i < noOfitem; i++) {
				System.out.println((i + 1) + ") Enter Item Name :");
				itemName[i] = sc.nextLine();
				System.out.println("Enter Item Price :");
				itemPrice[i] = Double.parseDouble(sc.nextLine());
			}
			Customer c = new VIPCustomer(customerName);
			generateBill(c, itemPrice);
		}

		default -> System.out.println("Invalid choice");
		}

	};

	public static void generateBill(Customer cust, double... prices) {
		System.out.println("Welcome to Hyderabad Mall");
		cust.calculateBill(prices);
		cust.printDetails();
	}
}
