package test_Practice;

import insuranceCalculatorApp.Vehicle;

/*In calculatePremium() method, task is to find the discount and final premium as per the following criteria:

Vehicle Age      Discount Percentage
> 10             20.0%
>= 5             15.0%
>= 3             10.0%
< 3              5.0%

Formula used :
Final Premium = BasePremium - (BasePremium × Discount / 100)*/
public class CalculateInsurance {
	public static InsuranceDetails calculatePremium(Vehicle v) {
		InsuranceDetails insrcData=null;
		double basePremium=v.getBasePremium();
		int vehicleAge=v.getVehicleAge();
		double discountPercentage=0;
		if(vehicleAge>10) {
			discountPercentage=0.20;
		}else if(vehicleAge>=5 && vehicleAge<=10) {
			discountPercentage=0.15;
		}else if(vehicleAge>=3 && vehicleAge<5) {
			discountPercentage=0.10;
		}else{
			discountPercentage=0.5;
		}
		double finalPremium=(basePremium*discountPercentage/100);
		
		return new InsuranceDetails(v,finalPremium,discountPercentage);
		
		
	}
}
