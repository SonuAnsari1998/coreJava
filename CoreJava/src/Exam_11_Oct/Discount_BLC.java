package Exam_11_Oct;
/*
 * if billAmount >= 5000 -> 20% discount on billAmount
if billAmount >= 3000 -> 15% discount on billAmount
if billAmount >= 1000 -> 10% discount on billAmount
 else 5% discount 
 
 
 ------ BILL SUMMARY ------
Customer Name: Ravi
Original Bill: 3500.0
Amount Payable after Discount: 2975.0

 */
public class Discount_BLC {
	double billAmount;
	public void setcalculateDiscount(double bAmount) {
		billAmount=bAmount;
	}
	public double getcalculateDiscount() {
		if(billAmount >= 5000) {
			double discount=(20*billAmount)/100;
			return billAmount-discount;
		}else if(billAmount >= 3000  && billAmount<5000) {
			double discount=(15*billAmount)/100;
			return billAmount-discount;
		}else if(billAmount >= 1000  && billAmount<3000) {
			double discount=(10*billAmount)/100;
			return billAmount-discount;
		}else{
			double discount=(5*billAmount)/100;
			return billAmount-discount;
		}
	}
}
