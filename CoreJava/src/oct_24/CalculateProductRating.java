package oct_24;
/*Create another class CalculateProductRating which does not contain any field (Variable)

Methods :
Name of the Method : calculateRating()  [Factory Method]
return type : ProductRating 
Access Modifier : public, static
Argument : Product 

In calculateRating() method, task is to find the Product rating based on customer rating and create and return the ProductRating
object on the following criteria :

Customer Rating             Rating Category
> 4.5                        Excellent
>= 4.0                       Good
>= 3.0                       Average
< 3.0                        Poor*/
public class CalculateProductRating {
	public static ProductRating calculateRating(Product p){
		double cRating=p.getRating();
		ProductRating pRating = null;
		if(cRating>4.5) {
			pRating = new ProductRating(p,"Excellent");
		}else if(cRating>=4.0 && cRating<=4.5) {
			pRating = new ProductRating(p,"Good");
		}else if(cRating>=3.0 && cRating<4.0) {
			pRating = new ProductRating(p,"Average");
		}else {
			pRating = new ProductRating(p,"Poor");
		}
		return pRating;
	}
}
