package jan_24_Collection_Lab_Test_List_Interface;

import java.util.LinkedList;
import java.util.List;

/*2. FindingMiddleElementInALinkedList

A retail company maintains its product catalog using a linked list data structure. 
The management needs a system to quickly identify the "middle product" in their catalog 
for various business operations such as:

Inventory balancing - Middle product helps in stock distribution planning

Promotional campaigns - Middle product can be featured in marketing

Pricing analysis - Middle position products often represent average-priced items

Catalog reorganization - Understanding the center point for restructuring

Examples
Example 1
Input:
How many products would you like to add? 1

--- Product 1 ---
Enter Product ID: S001
Enter Product Name: Tablet
Enter Price: 599.99
Output:
=== YOUR PRODUCT CATALOG ===
Middle Product:
Product [id=S001, name=Tablet, price=500.0]*/
record Product(Integer id, String name, Double price) {
	
}

public class FindingMiddleElementInALinkedList {
	void main() {
		List<Product>  productList = new LinkedList<Product>();
		
		int noOfProduct=Integer.parseInt(IO.readln("How many products would you like to add?"));
		for(int i=1; i<=noOfProduct; i++) {
			IO.println("\n--- Product "+i+" ---");
			int id=Integer.parseInt(IO.readln("Enter Product ID:"));
			String name=IO.readln("Enter Product Name:");
			double price=Double.parseDouble(IO.readln("Enter Price: "));
			productList.add(new Product(id, name, price));
			IO.println("Product "+i+" Added Sucessfully..........\n");
		}
		int middle = productList.size()/2;
		IO.println(productList.get(middle));	
	}
}
