package oct_24;

import java.util.Scanner;

public class ProductRatingCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Name: ");
		String productName=sc.nextLine();
		System.out.print("Enter Product Rating: ");
		double rating=Double.parseDouble(sc.nextLine());
		Product p1=new Product(productName,rating);
		System.out.println(CalculateProductRating.calculateRating(p1));
	}
}
