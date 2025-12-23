package dec_23_2025_Our_Exception_By_Sonu;
/*ASSIGNMENT 5: INVALID PRICE EXCEPTION PriceException
--------------------------------------------------

Aim:
To validate product price using custom unchecked exception.

Theory:
Unchecked exceptions help enforce business constraints.

Problem Statement:
Create a custom unchecked exception InvalidPriceException.
Throw the exception if product price is zero or negative.

Algorithm:
1. Accept product name and price.
2. Validate the price.
3. Throw exception if invalid.
4. Display product details if valid.

Expected Output:
Error message or product details.

Conclusion:
This assignment demonstrates price validation logic.
*/

class InvalidPriceException extends RuntimeException{
	public InvalidPriceException(){
		
	}
	public InvalidPriceException(String message){
		super(message);
	}
}
class Product{
	public void accept(String productName, double price) {
		if(price<=0) {
			throw new InvalidPriceException("Invalid Price please enter valid price");
		}else {
			IO.println("Product Name : "+productName);
			IO.println("Product Price : "+price);
		}
	}
}
public class PriceException {
	void main() {
		Product product = new Product();
		String productName=IO.readln("Enter Product Name");
		double price=Double.parseDouble(IO.readln("Enter Product Name"));
		try {
			product.accept(productName, price);
		}
		catch(InvalidPriceException e) {
			System.err.println(e.getMessage());
		}
	} 
}
