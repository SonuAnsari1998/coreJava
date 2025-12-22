package dec_19_2025_equals_Object_obj_method_Exception;
/*Ques : 2
=========

ArrayIndexOutOfBoundException 

-> Create a class named ArrayIndexExceptionDemo inside the package com.testing that contains
 the main method.

-> Inside the main method:

   Declare and initialize an integer array with 2 elements as follows:
   int a[] = new int[2];
   a[0] = 10;
   a[1] = 20;

-> Prompt the user to enter an index value using the Scanner class.

-> Try to print the value of the array element at the entered index.

-> If the user enters an index outside the valid range (i.e., anything other than 0 or 1), 
the program should catch the ArrayIndexOutOfBoundsException.

-> In the catch block, print the exception details using the following methods:

   getMessage()

   toString()

   printStackTrace()

Also, print a custom message using IO.println() explaining that the user tried to access an 
invalid index.


TEST CASE 1 :
-------------

Input:
3

Output:
getMessage():=> Index 3 out of bounds for length 2

toString():=> java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2

println():=> You tried to access an invalid array index. Please check the index range.

printStackTrace():=>
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
	at com.testing.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)



TEST CASE 2 :
-------------

Input : 
2

Output :
getMessage():=> Index 2 out of bounds for length 2

toString():=> java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

println():=> You tried to access an invalid array index. Please check the index range.

printStackTrace():=>
java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	at com.testing.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)




TEST CASE 3 :
-------------

Input:
1 

Output:
20


TEST CASE 4 :
-------------

Input:
0 

Output:
10


#########################################
*/
import module java.base;
public class ArrayIndexExceptionDemo {
	void main() {
		try {
			int arr[] = new int[2];
			arr[0] = 10;
			arr[1] = 20;
			int index=Integer.parseInt(IO.readln("Enter Index number"));
			IO.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			IO.println(e.getMessage());
					IO.println(toString());
					IO.println(" You tried to access an invalid array index. Please check the index range.");
					e.printStackTrace();
		}
		   
	}
}
