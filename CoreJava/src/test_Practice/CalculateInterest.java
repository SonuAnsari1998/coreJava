package test_Practice;
/*Create another class CalculateInterest which does not contain any field (Variable)

Methods :
Name of the Method : calculateInterest()  [Factory Method]
return type : InterestDetails 
Access Modifier : public, static
Argument : Customer 

In calculateInterest() method, task is to find the Customer Interest Details based on the following 
criteria and create and return the InterestDetails object:

Time (months)      Interest Rate
> 12               12.0%
>= 6               11.0%
>= 3               10.0%
< 3                9.0%

Formula used :
Interest Earned = (Principal × Rate × TimeInMonths) / (12 × 100)
Final Amount = Principal + Interest Earned*/
public class CalculateInterest {
	public static InterestDetails calculateInterest(Customer c){
		double principle=c.getPrinciple();
		int timeInMonths=c.getTimeInMonths();
		double interestRate=0;		
		if(timeInMonths>12) {
			interestRate=(12*principle)/100;
		}else if(timeInMonths>=6 && timeInMonths<=12) {
			interestRate=(11*principle)/100;
		}else if(timeInMonths>=3 && timeInMonths<6) {
			interestRate=(10*principle)/100;
		}else{
			interestRate=(9*principle)/100;
		}
		double Interestearned=(principle*interestRate*timeInMonths)/100;
		double finalAmount=Interestearned+principle;
		return new InterestDetails(c, interestRate, Interestearned, finalAmount);
		
	}
}
