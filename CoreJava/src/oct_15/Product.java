package oct_15;
/*---------------
Assignment 02 :
Create a BLC class Product :

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
    id : int
  name : String
 price : double

Methods :
---------
1)

Method Name		: setProductDetails()
Parameter		: 3 Parameters (int id, String name, double price)
Return Type		: void
Access modifier		: public

In this method with the help of parameters variables, initialize the non static fields

2) 

Method Name		: calculateDiscount()
Parameter		: No Parameter
Return Type		: void
Access modifier		: public

In this method we need to calculate the discount amount, After calculating discount based on 
the following criteria print the discout amount and final price of the product inside this method only.

Price			-      Discount
<1000			-       5 % discount on the Original price
>=1000 to <=5000	-	10 % discount on the Original price
>5000			-	15 % discount on the Original price



3) Generate toString() method to print the object properties.


Create another ELC class called ProductDemo which contains main method.
Create Product Object, take the input from the Scanner class and call the methdos to get the following output.

Enter Product ID: 101
Enter Product Name: Laptop
Enter Product Price: 84000

----- Product Details -----
Product [productId=101, productName=Laptop, productPrice=84000.0]
Discount Amount: 12600.0
Price After Discount: 71400.0
------------------------------------------------------------------------------------------*/
public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	public void setProductDetails(int id, String name, double price) {
		this.productId=id;
		this.productName=name;
		this.productPrice=price;
	}
	public void calculateDiscount() {
		double discountAmount=0;
		if(this.productPrice<1000) {
			double discount=(5*this.productPrice)/100;
			discountAmount+=discount;
		}else if(this.productPrice>=1000 && this.productPrice<=5000) {
			double discount=(10*this.productPrice)/100;
			discountAmount+=discount;
		}else if(this.productPrice>5000) {
			double discount=(15*this.productPrice)/100;
			discountAmount+=discount;
		}else {
			System.err.println("Not Eligible for any discount");
		}
		System.out.println("Discount Amount: "+discountAmount);
		System.out.println("Price After Discount: "+(this.productPrice-discountAmount));
	}
	@Override
	public String toString() {
		return "Product [productId=" + this.productId + ", productName=" + this.productName + ", productPrice=" + this.productPrice
				+ "]";
	}
	
}
