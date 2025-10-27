package oct_24;
/*Create a BLC class Product

Instance Variables :
name : String : private 
rating : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
product from this method.*/
public class Product {
	private String name;
	private double rating;
	public Product(String name,double rating) {
		this.name=name;
		this.rating=rating;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setRating(double rating) {
		this.rating=rating;
	}
	public double getRating() {
		return this.rating;
	}
	public String toString() {
		return this.name;
	}
}
