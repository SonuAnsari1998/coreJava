package oct_24;
/*Create a program to categorize Movies based on IMDB Rating :

Create a BLC class Movie

Instance Variables :
title : String : private 
imdbRating : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the title of the movie from this method.*/
public class Movie {
	private String title;
	private double imdbRating;
	public Movie(String title,double imdbRating) {
		this.title=title;
		this.imdbRating=imdbRating;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setImdbRating(double imdbRating) {
		this.imdbRating=imdbRating;
	}
	public double getImdbRating() {
		return this.imdbRating;
	}
	public String toString() {
		return this.title;
	}
}
