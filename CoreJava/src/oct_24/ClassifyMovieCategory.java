package oct_24;
/*Create another class ClassifyMovieCategory which does not contain any field (Variable)

Methods :
Name of the Method : classifyCategory()  [Factory Method]
return type : MovieCategory 
Access Modifier : public, static
Argument : Movie 

In classifyCategory() method, task is to find the Movie category based on the IMDB rating and create and 
return the MovieCategory
object on the following criteria :

IMDB Rating                 Category
>= 8.5                       Blockbuster
>= 7.0                       Hit
>= 5.0                       Average
< 5.0                        Flop*/
public class ClassifyMovieCategory {
	public static MovieCategory classifyCategory(Movie m) {
		double rating=m.getImdbRating();
		MovieCategory movic= null;
		if(rating>=8.5) {
			movic=new MovieCategory(m,"Blockbuster");
		}else if(rating>=7.0 && rating<8.5) {
			movic=new MovieCategory(m,"Hit");
		}else if(rating>=5.0 && rating<7.0) {
			movic=new MovieCategory(m,"Average");
		}else {
			movic=new MovieCategory(m,"Flop");
		}
		return movic;
	}
}
