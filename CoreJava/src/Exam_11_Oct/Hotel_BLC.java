package Exam_11_Oct;
/*
 * Days Stayed Discount %
1–2 0%
3–4 5%
5–9 10%
10 or more 20%

Sample Output :
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
Amount after Discount: ₹10800.0

1–2 0%
3–4 5%
5–9 10%
10 or more 20%
*/
public class Hotel_BLC {
	public static double calculateTotalAmount(double roomRate, int day) {
		if(day>=1 && day<=2) {
			return roomRate*day;
		}else if(day>=3 && day<=4) {
			double total=roomRate*day;
			double discount=(5*total)/100;
			return total-discount;
		}else if(day>=5 && day<=9) {
			double total=roomRate*day;
			double discount=(10*total)/100;
			return total-discount;
		}else if(day>10){
			double total=roomRate*day;
			double discount=(20*total)/100;
			return total-discount;
		}else {
			return roomRate*day;
		}
	}

}
