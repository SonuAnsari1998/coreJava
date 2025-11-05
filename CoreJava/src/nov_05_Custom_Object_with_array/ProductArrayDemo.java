package nov_05_Custom_Object_with_array;
/*Take an ELC class called ProductArrayDemo with main method.

Create Scanner class object to initialize product array dynamically. [User choice] 

Take a for loop to initialize the product array with user input.

We need to search the Prodcut from product array based on the product id, With the help of 
Scanner class ask user to input id value, using for each loop, search whether the given id 
product is available or not. [see test cases for more details]

If product is available based on the given id, print the product object otherwise print 
product object is not available with the given id. [Product id is working as a primary key]
Enter details for Product 1:
Enter Product ID: 111
Enter Product Name: Camera
Enter Product Price: 67890
*/

import java.util.Arrays;
import java.util.Scanner;
public class ProductArrayDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of products: ");
		int size=Integer.parseInt(sc.nextLine());
		Product arr[]=new Product[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter details for Product: "+(i+1));
			System.out.println("Enter Product ID: ");
			int id=sc.nextInt();
			//sc.nextLine();
			System.out.println("Enter Product Name: ");
			String productName=sc.next();
			System.out.println("Enter Product Price: ");
			double price=sc.nextDouble();
			arr[i]=new Product(id, productName, price);
		}
		System.out.println("Enter Product ID to search:");
		int search=sc.nextInt();
		boolean isFound=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getId()==search) {
				isFound=true;
				break;
			}
		}
		
		if(isFound)
		System.out.println("Product Found"+Arrays.toString(arr));
		else
		System.out.println("Product Not Found");
		
	}
}
