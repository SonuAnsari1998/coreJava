package dec_13_2025_Test_Assignmet;

/*
01. Create a Java program to demonstrate loose coupling and polymorphism using an
interface and its implementing classes.

You must define an interface NotificationHub that contains two abstract methods:
sendAlert() and sendReport().

Create two classes that implement this interface:

EmailNotification

SMSNotification

Each class must provide its own version of alert and report messages.

In the ELC class, write a static polymorphic method named: "processNotification"

This method should call the two interface methods (sendAlert() and sendReport())
based on the object passed.
This proves loose coupling because the method works with any class implementing the
interface.

In the main method:
Take user input (email or sms)
Create the corresponding object
Pass it to the static polymorphic method
The correct classs methods must execute based on the object provided

This demonstrates how polymorphism removes direct dependency on specific classes
and enables loose coupling.

Constraints:
User must enter either "email" or "sms" All printing must happen from inside implemented
methods, not main Static method must accept interface reference only No direct object-specific
method should be called from main

Sample Input:
email

Sample Output:
Email Alert Sent Email Report Generated

Explanation:
Polymorphism allows the static method to work with any object that implements NotificationHub.
calls SMSs alert & report.
================================================================================================

02.You are required to write a Java program that demonstrates the use of the
java.util.function.Function<T, R> functional interface with either:

A lambda expression, OR A method reference

Your task is to:
Create an Emp class with:
int empNo
String name
float salary

Read employee details from user input.
Create a Function<Emp, Float> to:
Add 5000.00 bonus to the employee's salary.
Return the updated salary.

Apply the function and print the latest salary.
You may use either a lambda expression or a method reference

Constraints:
Salary must be positive. Use Function<Emp, Float> only. Bonus is fixed: 5000.00 Input must be
taken from the user

Sample Input:
101 Rahul 45000

Sample Output:
Latest Salary: 50000.0
================================================================================================

03.
Description:
You are required to write a Java program that demonstrates how to combine two
Predicate conditions using the and() method from the java.util.function.Predicate
interface.

Your task:
Accept an integer input N.

Create two predicates:
Predicate 1: Check if the number is even.
Predicate 2: Check if the number is greater than 10.

Combine both predicates using the and() method.
Evaluate the input number using the combined predicate.
Print whether the number satisfies both conditions

Constraints:
Input must be an integer. 1 N 109 You must use: Predicate<Integer> test() and() method

Sample Input:
12

Sample Output:
Number satisfies both predicates: true

Explanation:
Predicate 1 returns true if the number is even. Predicate 2 returns true if the number is greater
than 10. The and() method combines them so the number must satisfy both conditions.
Example: Input: 12 Even? Greater than 10? Combined result:
*/
