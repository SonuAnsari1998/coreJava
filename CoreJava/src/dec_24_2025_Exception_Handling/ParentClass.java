package dec_24_2025_Exception_Handling;
/*Assignment : 02
================
Handling Multiple Exceptions in Method Overriding

Objective:
Write a Java program that demonstrates method overriding where the superclass method 
throws a checked exception (ClassNotFoundException), and the subclass overrides this
 method to handle various cases and throw appropriate exceptions 
 (IllegalArgumentException).

Instructions:
-------------
-> Create a superclass BLC named ParentClass:

-> Implement a method loadingClass :
   Method name : loadingClass
   Access modifier : public 
   Return type : void
   Parameter : String

   Load the class by using Class.forName(-) method.
   Throws a checked exception, ClassNotFoundException, if the class is not found.

-> Create a subclass BLC named ChildClass:

-> Override the loadingClass method:
   Method name : loadingClass
   Access modifier : public 
   Return type : void
   Parameter : String

-> In this overridden method parameter (String), pass the class name through command 
   Line Argument(FQN), throw an IllegalArgumentException, If the class name is empty or 
   null otherwise call the super class loadingClass method to load the given class from 
   command Line Argument.

-> Create a ELC class Tester and implement the main method:

   Inside the main method, create an instance of ChildClass and call the overridden 
   loadingClass method.

   Take the input from command line. Make sure if user is passing multiple class names
   through command line argument then we can load multiple classes.

   Use a try-catch block to catch and handle the exceptions.

Test Case 1 :
--------------
java.lang.String
Class java.lang.String loaded successfully.


Test Case 2 :
--------------
java.lang.String
java.lang.Integer
Class java.lang.String loaded successfully.
Class java.lang.Integer loaded successfully.


Test Case 3 :
--------------
null
Error: Class not found - null*/
public class ParentClass {
	public void loadingClass(String str) throws ClassNotFoundException {
			Class<?> c=Class.forName(str);
			IO.println("Class "+ c +" loaded successfully.");
	}
}
