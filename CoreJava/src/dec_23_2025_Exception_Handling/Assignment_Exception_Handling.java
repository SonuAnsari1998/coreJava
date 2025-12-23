package dec_23_2025_Exception_Handling;

/*Assignment : 01
===============

Rectangle Area Calculation with Exception Handling

Objective:
Design and implement a Java program to calculate the area of a rectangle. 
The program should incorporate exception handling to validate user input and throw an 
IllegalArgumentException when invalid dimensions are provided.

Instructions:
-------------

-> Create a class named AreaCalculator:

-> Implement a static method calculateArea :
   Takes two integer parameters: length and width.
   Access Modifier : public
   Non-Access Modifier : static
   return type : double
   parameters : double, double

-> Calculates the area using the formula length * width.
   Throw an IllegalArgumentException if either length or width is less than zero.

-> Implement the main method:
   Inside the main method, use a Scanner object to read input from the user.
   Prompt the user to enter the length and width of the rectangle.

-> Call the calculateArea method within a try-catch block to handle any 
IllegalArgumentException.
   Print the area of the rectangle if dimensions are valid; otherwise, 
   print an error message.


TEST CASE 1 :
-------------
Input:
Enter length of rectangle: 5
Enter width of rectangle: 4

Output:
Area of rectangle with length 5 and width 4 is: 20.0


TEST CASE 2 :
-------------
Input:
Enter length of rectangle: -5
Enter width of rectangle: 4

Output:
Error: Length and width must be > 0.


TEST CASE 3 :
-------------
Input:
Enter length of rectangle: 5
Enter width of rectangle: 0

Output:
Error: Length and width must be > 0.

#########################################
Assignment : 2
===============
Handling ArrayStoreException in Java

Objective:
Write a Java program that demonstrates how to handle ArrayStoreException. 
The program should include a method that attempts to store objects of incompatible 
types into an array of String[]. 
Implement exception handling in the main method to catch and handle this exception.

Instructions:
-------------

-> Create a class named ArrayStoreExample:

-> Implement a static method storeObjects that:

   Method name : storeObjects
   Access modifiers : public
   Non-Access modifier : static
   Return type : void

   Initializes an Object array of type String[] with a size of 5.
   Attempts to store objects of different types (String, Integer, etc.) into the array 
   using array indexing.
   Throws an ArrayStoreException if an attempt is made to store an object that is 
   not compatible with String.

-> Implement the main method:

   Inside the main method, call the storeObjects method with different objects, 
   including objects of incompatible types. Use a try-catch block to catch and handle 
   any ArrayStoreException thrown by storeObjects method.Print an appropriate error 
   message when an incompatible object type is attempted to be stored in the array.


TEST CASE 1 :
-------------
Store objects of different types in the array
      strings[0] = "Hello";   // Storing a String
      strings[1] = "World";   // Storing another String
      strings[2] = "Java";    // Storing another String
Output as :
Objects stored successfully.

TEST CASE 2 :
-------------

Store objects of different types in the array
      strings[0] = "Hello";   // Storing a String
      strings[1] = "World";   // Storing another String
      strings[2] = 123;       // Trying to store an Integer in a String array

Output as :
ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in 
an array of java.lang.String*/
