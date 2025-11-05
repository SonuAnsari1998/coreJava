package nov_05_Custom_Object_with_array;

/*Assignment 01 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Student.

Attributes/Properties/Fields [tightly encapsulated]

id, name and marks

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called StudentArrayDemo with main method.

Create Student array with size 3 manually.

Assign Student objects to array elements using index manually.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Student [id=101, name=Ravi, marks=89.5]
Student [id=102, name=Anita, marks=92.0]
Student [id=103, name=Kiran, marks=85.75]

==========================================================================================
Assignment 02 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Employee.

Attributes/Properties/Fields [tightly encapsulated]

id, name and salary

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called EmployeeArrayDemo with main method.

Create Scanner class object to initialize employee array dynamically. [User choice] 

Take a for loop to initialize the employee array with user input.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Enter number of employees: 3

Enter details for Employee 1:
Enter ID: 111
Enter Name: Scott
Enter Salary: 45789

Enter details for Employee 2:
Enter ID: 222
Enter Name: Smith
Enter Salary: 78908

Enter details for Employee 3:
Enter ID: 333
Enter Name: Alen
Enter Salary: 99567

===== Employee Details =====
Employee [id=111, name=Scott, salary=45789.0]
Employee [id=222, name=Smith, salary=78908.0]
Employee [id=333, name=Alen, salary=99567.0]

==========================================================================================
Assignment 03 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Product.

Attributes/Properties/Fields [tightly encapsulated]

id, name and price

Take a parameetrized constructor to initialize all the fields.

Take getter method for id field.

Generate toString() method.

Take an ELC class called ProductArrayDemo with main method.

Create Scanner class object to initialize product array dynamically. [User choice] 

Take a for loop to initialize the product array with user input.

We need to search the Prodcut from product array based on the product id, With the help of Scanner class ask user to input id value, using for each loop, search whether the given id product is available or not. [see test cases for more details]

If product is available based on the given id, print the product object otherwise print 
product object is not available with the given id. [Product id is working as a primary key]

Sample Output :
----------------
Test Case 1 :
--------------
Enter number of products: 3

Enter details for Product 1:
Enter Product ID: 111
Enter Product Name: Camera
Enter Product Price: 67890

Enter details for Product 2:
Enter Product ID: 222
Enter Product Name: Laptop
Enter Product Price: 89000

Enter details for Product 3:
Enter Product ID: 333
Enter Product Name: Mobile
Enter Product Price: 75000

Enter Product ID to search: 222

Product Found: Product [id=222, name=Laptop, price=89000.0]

Test case 2 :
-------------
Enter number of products: 3

Enter details for Product 1:
Enter Product ID: 111
Enter Product Name: Camera
Enter Product Price: 78908

Enter details for Product 2:
Enter Product ID: 222
Enter Product Name: Mobile
Enter Product Price: 56789

Enter details for Product 3:
Enter Product ID: 333
Enter Product Name: Laptop
Enter Product Price: 78908

Enter Product ID to search: 4

Product with ID 4 not found.
*/
