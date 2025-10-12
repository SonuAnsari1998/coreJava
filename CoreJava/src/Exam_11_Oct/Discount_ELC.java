package Exam_11_Oct;
/*------ BILL SUMMARY ------
Customer Name: Ravi
Original Bill: 3500.0
Amount Payable after Discount: 2975.0

*/
import java.util.Scanner;

public class Discount_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Discount_BLC c1=new Discount_BLC();
		System.out.println("Enter Costomer Name: ");
		String cname=sc.nextLine();
		System.out.println("Enter Total Bill: ");
		double tBill=Double.parseDouble(sc.nextLine());
		c1.setcalculateDiscount(tBill);
		System.out.println("------ BILL SUMMARY ------");
		System.out.println("Customer Name: "+cname);
		System.out.println("Original Bill: "+tBill);
		System.out.println("Amount Payable after Discount:"+c1.getcalculateDiscount());
		
	}
}
