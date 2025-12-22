package dec_22_2025_Exception_Handling;
/*Assignment 01
==============

Handling NumberFormatException and NullPointerException
Objective:
Write a Java program that demonstrates how to handle NumberFormatException and NullPointerException. 
The program should include a method that takes a string input, prints its length, attempts to convert it to an integer, and performs operations that might result in a NullPointerException. 
If an exception occurs, it should be caught and an appropriate message should be displayed.

Instructions:
-> Create a class named ExceptionHandlingDemo:

-> Implement a static method handleExceptions that takes a String parameter representing the input.
   Method name : handleExceptions
   Access Modifier : public
   Non-Access Modifier : static
   return type : void
   parameters : String

-> Inside this method, use a try block to:
   Print the length of the input string.
   Attempt to convert the string input to an integer using Integer.parseInt().
   Attempt to call a method on the input string to deliberately cause a NullPointerException if the string is null.
   Catch NumberFormatException and print an appropriate message.
   Catch NullPointerException and print an appropriate message.

-> Create a main method:
   Inside the main method, create a Scanner object to read input from the user.
   Prompt the user to enter a string.
   Read the user's input and pass it to the handleExceptions method.
   Close the Scanner object.*/
import java.util.Scanner;

public class ExceptionHandlingDemo {
	void main() {
		Scanner sc = new Scanner(System.in);
		IO.println("Enter a String ");
		String str = sc.nextLine();
		handleExceptions(str);
		sc.close();
	}
	public static void handleExceptions(String str) {
		try {
			IO.println("Length of the input string: " + str.length());
			int x = Integer.parseInt(str);
			IO.println("Converted to integer: " + x);
			IO.println("Uppercase version: " + str.toUpperCase());
		} catch (Exception e) {
			if (e instanceof NumberFormatException) {
				IO.println("Input is not a valid integer.");
			}
			if (e instanceof NullPointerException) {
				IO.println("Input is null");
			}
		}
	}
}
