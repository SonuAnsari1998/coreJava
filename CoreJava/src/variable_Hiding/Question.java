package variable_Hiding;
/*🧩 Question: Scenario on Variable Hiding

Scenario:
A software company has two classes — Device and Smartphone.

The Device class stores a variable price representing the base price of any electronic device.

The Smartphone class extends Device and also declares its own variable price representing the total price including additional features.

You are asked to:

Create both classes (Device and Smartphone) such that the price variable in Smartphone hides the one in Device.

Write a method showPrice() in both classes to print their respective price values.

In the main method:

Create an object of Smartphone and call showPrice().

Create a reference of type Device that points to the Smartphone object and print price using both references (deviceRef.price and smartphone.price).

Observe and explain the output.

💡 Expected Output (Example)
Smartphone price: 55000
Base device price (using super): 30000

Accessing via references:
deviceRef.price = 30000
smartphone.price = 55000*/
public class Question {

}
