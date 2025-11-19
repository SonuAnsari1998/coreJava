package nov_19_HAS_A_Relation;

import java.util.Scanner;

public class CustomerAndOrdersManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String orderId = sc.nextLine();
		String productName = sc.nextLine();
		double price = sc.nextDouble();
		sc.nextLine();
		String name = sc.nextLine();
		String email = sc.nextLine();
		String address = sc.nextLine();
		long mobileNo = sc.nextLong();

		Customer c = new Customer(orderId, productName, price, name, email, address, mobileNo);
		System.out.println(c);

	}
}

class Order {
	private String orderId;
	private String productName;
	private double price;

	Order(String orderId, String productName, double price) {
		this.orderId = orderId;
		this.productName = productName;
		this.price = price;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public String toString() {
		return "Order Details:" + "\nOrder ID: " + this.orderId + "\nProduct Name: " + this.productName + "\nPrice: "
				+ this.price;
	}
}

class Customer {
	private String name;
	private String email;
	private String address;
	private long mobileNo;
	private Order order;

	Customer(String orderId, String productName, double price, String name, String email, String address,
			long mobileNo) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.order = new Order(orderId, productName, price);
	}

	public String toString() {
		return "Customer Details:" + "\nName: " + this.name + "\nEmail: " + this.email + "\nAddress: " + this.address
				+ "\nMobile: " + this.mobileNo + "\n\n" + order;
	}
}
