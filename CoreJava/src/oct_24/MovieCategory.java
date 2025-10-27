package oct_24;
/*Create another BLC class MovieCategory.

Instance Variables :
movie : Movie : private 
category : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Movie "Inception" is categorized as "Blockbuster"]*/
public class MovieCategory {
	private Movie movi;
	private String category;
	public MovieCategory(Movie movi,String category) {
		this.movi=movi;
		this.category=category;
	}
	public void setMovi(Movie movi) {
		this.movi=movi;
	}
	public Movie getMovi() {
		return this.movi;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public String getCategory() {
		return this.category;
	}
	public String toString() {
		return "[Movie "+this.movi+" is categorized as '"+this.category+"']"; 
	}
}
