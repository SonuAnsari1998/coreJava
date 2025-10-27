package oct_24;
/*Create another BLC class ProductRating.

Instance Variables :
product : Product : private 
ratingCategory : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Product "iPhone" has "Excellent" Rating]*/
public class ProductRating {
	private Product product;
	private String ratingCategory;
	public ProductRating(Product product, String ratingCategory) {
		this.product=product;
		this.ratingCategory=ratingCategory;
	}
	public void seProduct(Product product) {
		this.product=product;
	}
	public Product getProduct() {
		return this.product;
	}
	public void setRatingCategory() {
		this.ratingCategory=ratingCategory;
	}
	public String getRatingCategory() {
		return this.ratingCategory;
	}
	public String toString() {
		return "[Product "+this.product+" has "+this.ratingCategory+" Rating]";
	}
}
