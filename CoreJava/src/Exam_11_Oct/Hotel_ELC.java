package Exam_11_Oct;
/*Sample Output :
---------------
Enter Customer Name: Ravishankar
Enter Hotel Name: Hyderabad Palace
Enter Room Rate per Day: 2000
Enter Number of Days Stayed: 6
----- HOTEL BOOKING SUMMARY -----
Customer Name : Ravishankar
Hotel Name : Hyderabad Palace
Room Rate (per day): ₹2000.0
Days Stayed : 6
Total Amount : ₹12000.0
Amount after Discount: ₹10800.0*/
import java.util.Scanner;

public class Hotel_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Name:");
		String name=sc.nextLine();
		System.out.println("Enter Hotel Name:");
		String hotelName=sc.nextLine();
		System.out.println("Enter Room Rate per Day:");
		double roomRate=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Number of Days Stayed:");
		int day=Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println("----- HOTEL BOOKING SUMMARY -----");
		System.out.println("Hotel Name : "+hotelName);
		System.out.println("Room Rate (per day): "+roomRate);
		System.out.println("Days Stayed : "+day);
		System.out.println("Total Amount : "+(roomRate*day));
		
		System.out.println("Amount after Discount: "+Hotel_BLC.calculateTotalAmount(roomRate, day));
	}
}



