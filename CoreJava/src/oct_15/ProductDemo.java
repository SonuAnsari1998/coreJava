package oct_15;
import java.util.Scanner;
public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product p1=new Product();
		System.out.print("Enter Product ID");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Product Name");
		String name=sc.nextLine();
		System.out.print("Enter Product Price");
		double price=Double.parseDouble(sc.nextLine());
		p1.setProductDetails(id,name,price);
		System.out.println();
		System.out.println("----- Product Details -----");
		System.out.println(p1.toString());
		p1.calculateDiscount();

	}

}
