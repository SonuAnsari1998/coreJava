package oct_15;

/*Assignment 01 :
---------------
Create a BLC class Employee :

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
    id : int
  name : String
salary : double

Methods :
---------
1)

Method Name		: setEmployeeDetails()
Parameter		: 3 Parameters (int id, String name, double salary)
Return Type		: void
Access modifier		: public

In this method with the help of parameters variables, initialize the non static fields.

2) 

Method Name		: calculateSalaryIncrement()
Parameter		: No Parameter
Return Type		: void
Access modifier		: public

In this method we need to calculate salary increment based on employee salary on the following criteria :

Salary		-      Increment
<50000		-      10 % increment on Salary
50000 to 80000	-	7 % increment on Salary
>80000		-	5 % increment on Salary

Now print two details inside the method
 a) Salary increment amount
 b) After increment, Updated salary

3) Generate toString() method to print Employee object properties.

Create another ELC class called EmployeeDemo which contains main method.
Create Employee Object, take the input from the Scanner class and call the methdos to get the following output.

Enter Employee ID: 101
Enter Employee Name: Ravi Kumar
Enter Employee Salary: 60000

----- Employee Information -----
Employee Details:
Employee [Id=101, Name=Ravi, Salary=84000.0]

----- Salary Increment Details -----
Salary Increment Amount: 4200.0
Updated Salary: 64200.0

------------------------------------------------------------------------------------------
Assignment 02 :
---------------
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
