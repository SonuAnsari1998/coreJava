package interestCalculatorApp;
/*Methods :
Name of the Method : calculateInterest()  [Factory Method]
return type : InterestDetails 
Access Modifier : public, static
Argument : Customer 

In calculateInterest() method, task is to find the Customer Interest Details based on the following criteria and create and return the InterestDetails object:

Time (months)      Interest Rate
> 12               12.0%
>= 6               11.0%
>= 3               10.0%
< 3                9.0%

Formula used :
Interest Earned = (Principal × Rate × TimeInMonths) / (12 × 100)

		(10000 * 0.83  * 3)

Final Amount = Principal + Interest Earned*/
public class CalculateInterest {
	public static InterestDetails calculateInterest(Customer s) {
		InterestDetails intrData=null; 
		double principle=s.getPrincipal();
		int timeInMonths=s.getTimeInMonths();
		double interestRate=0;
		if(timeInMonths>12) {
			interestRate=0.12;
		}else if(timeInMonths>=6 && timeInMonths<=12) {
			interestRate=0.11;
		}else if(timeInMonths>=3 && timeInMonths<6) {
			interestRate=0.10;
		}else{
			interestRate=0.9;
		}
		
		double interestEarned=interestRate*principle;
		
		
		double finalAmount=interestEarned+principle;
		
		return new InterestDetails(s,interestRate,interestEarned,finalAmount);
		
	}
}
