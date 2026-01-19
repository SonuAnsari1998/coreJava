package jan_19_2025_Collection;

public class ProductMain {
	void main() {
		ShoppingCart shoping = new ShoppingCart();
		
		while(true) {
			IO.println("1) Add Product");
			IO.println("2) Remove Product usig (Product id)");
			IO.println("3) Update Quantity using (Product id)");
			IO.println("4) View Poduct Details");
			IO.println("5) Exit");
			int choice=Integer.parseInt(IO.readln("Enter Your choice...."));
			switch(choice) {
			case 1->{ 
				int noOfProduct=Integer.parseInt(IO.readln("Enter No. of Product"));
				for(int i=1; i<=noOfProduct; i++) {
					int id=Integer.parseInt(IO.readln("Enter Poduct Id"));
					String productName=IO.readln("Enter Product Name");
					double price=Double.parseDouble(IO.readln("Enter Product Price"));
					int qty=Integer.parseInt(IO.readln("Enter Product Quantity"));
					
					shoping.addProduct(new Product(id, productName, price,  qty));
				}
			}
			default -> System.err.println("Invalid Choice. Please Enter valid choice");
			}
			
		}

	}
}
