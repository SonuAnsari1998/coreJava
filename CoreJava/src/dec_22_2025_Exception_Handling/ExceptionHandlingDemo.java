package dec_22_2025_Exception_Handling;
/*Objective:
Write a Java program that demonstrates how to handle NumberFormatException and NullPointerException. 
The program should include a method that takes a string input, prints its length, attempts to convert it to an integer, and performs operations that might result in a NullPointerException. 
If an exception occurs, it should be caught and an appropriate message should be displayed.

Instructions:
-> Create a class named ExceptionHandlingDemo:

-> Implement a static method handleExceptions that takes a String parameter representing the 
input.
   Method name : handleExceptions
   Access Modifier : public
   Non-Access Modifier : static
   return type : void
   parameters : String

-> Inside this method, use a try block to:
   Print the length of the input string.
   Attempt to convert the string input to an integer using Integer.parseInt().
   Attempt to call a method on the input string to deliberately cause a NullPointerException if 
   the string is null.
   Catch NumberFormatException and print an appropriate message.
   Catch NullPointerException and print an appropriate message.

-> Create a main method:
   Inside the main method, create a Scanner object to read input from the user.
   Prompt the user to enter a string.
   Read the user's input and pass it to the handleExceptions method.
   Close the Scanner object.


TEST CASE 1 :
-------------
Input : 123

Output :
Length of the input string: 3
Converted to integer: 123
Uppercase version: 123


TEST CASE 2 :
-------------
Input : abc

Output :
Length of the input string: 3
NumberFormatException: Input is not a valid integer.


TEST CASE 3 :
-------------
Input : null

Output :
NullPointerException: Input is null.*/
public class ExceptionHandlingDemo {
	void main() {
		
	}
	public static void  handleExceptions(String str) {
		try {
			
		}
		catch(Exception e) {
			
		}
	}
}
