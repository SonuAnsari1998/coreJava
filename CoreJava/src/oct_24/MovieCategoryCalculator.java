package oct_24;
import java.util.Scanner;
public class MovieCategoryCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Movi Title: ");
		String title=sc.nextLine();
		System.out.print("Enter Movi imdbRating: ");
		double imdbRating=Double.parseDouble(sc.nextLine());
		Movie m1=new Movie(title,imdbRating);
		System.out.println(ClassifyMovieCategory.classifyCategory(m1));
	}
}
