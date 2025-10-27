package test_Practice;

/*Assignment 01 :
---------------
Create a program to determine Customer Interest Details based on the Investment Duration and Principal Amount.

Create a BLC class Customer

Instance Variables :
name : String : private 
principal : double : private 
timeInMonths : int : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
customer from this method.

Create another BLC class InterestDetails.

Instance Variables :
customer : Customer : private 
interestRate : double : private 
interestEarned : double : private 
finalAmount : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

--- Result ---
Name: Sonu Ansari
Principal Amount: 10000.0
Time (months): 3
Applied Interest Rate: 10.0%
Interest Earned: 1000.0
Final Amount after Interest: 11000.0

Create another class CalculateInterest which does not contain any field (Variable)

Methods :
Name of the Method : calculateInterest()  [Factory Method]
return type : InterestDetails 
Access Modifier : public, static
Argument : Customer 

In calculateInterest() method, task is to find the Customer Interest Details based on the following criteria and create and return the InterestDetails object:

Time (months)      Interest Rate
> 12               12.0%
>= 6               11.0%
>= 3               10.0%
< 3                9.0%

Formula used :
Interest Earned = (Principal × Rate × TimeInMonths) / (12 × 100)

		
Final Amount = Principal + Interest Earned

Create an ELC class InterestCalculatorApp which contains main method to test the application.

Sample Output :
Enter your name: Sonu Ansari
Enter principal amount: 10000
Enter time in months: 3

--- Result ---
Name: Sonu Ansari
Principal Amount: 10000.0
Time (months): 3
Applied Interest Rate: 10.0%
Interest Earned: 1000.0
Final Amount after Interest: 11000.0


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Assignment 02 :
---------------
Create a program to determine Customer Interest Details based on the Investment Duration and Principal Amount.

Create a BLC class Customer

Instance Variables :
name : String : private 
principal : double : private 
timeInMonths : int : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
customer from this method.

Create another BLC class InterestDetails.

Instance Variables :
customer : Customer : private 
interestRate : double : private 
interestEarned : double : private 
finalAmount : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

--- Result ---
Name: Sonu Ansari
Principal Amount: 10000.0
Time (months): 3
Applied Interest Rate: 10.0%
Interest Earned: 1000.0
Final Amount after Interest: 11000.0

Create another class CalculateInterest which does not contain any field (Variable)

Methods :
Name of the Method : calculateInterest()  [Factory Method]
return type : InterestDetails 
Access Modifier : public, static
Argument : Customer 

In calculateInterest() method, task is to find the Customer Interest Details based on the following criteria and create and return the InterestDetails object:

Time (months)      Interest Rate
> 12               12.0%
>= 6               11.0%
>= 3               10.0%
< 3                9.0%

Formula used :
Interest Earned = (Principal × Rate × TimeInMonths) / (12 × 100)
Final Amount = Principal + Interest Earned

Create an ELC class InterestCalculatorApp which contains main method to test the application.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Assignment 03 :
---------------
Create a program to determine Student Grade based on Percentage Score.

Create a BLC class Student

Instance Variables :
name : String : private 
percentage : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
student from this method.

Create another BLC class StudentGrade.

Instance Variables :
student : Student : private 
gradeCategory : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Student "Rahul" has "A+" Grade]

Create another class CalculateStudentGrade which does not contain any field (Variable)

Methods :
Name of the Method : calculateGrade()  [Factory Method]
return type : StudentGrade 
Access Modifier : public, static
Argument : Student

In calculateGrade() method, task is to find the Student Grade based on Percentage Score and create and return the StudentGrade object on the following criteria:

Percentage        Grade Category
> 90              A+
>= 80             A
>= 70             B
>= 60             C
< 60              D

Create an ELC class StudentGradeCalculator which contains main method to test the application.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Assignment 04 :
---------------
Create a program to determine Employee Bonus based on Experience.

Create a BLC class Employee

Instance Variables :
name : String : private 
experience : int : private 
salary : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the employee.

Create another BLC class EmployeeBonus.

Instance Variables :
employee : Employee : private 
bonusPercentage : double : private 
bonusAmount : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Employee "Ravi" gets 15.0% Bonus Amount: 7500.0]

Create another class CalculateEmployeeBonus which does not contain any field (Variable)

Methods :
Name of the Method : calculateBonus()  [Factory Method]
return type : EmployeeBonus 
Access Modifier : public, static
Argument : Employee 

In calculateBonus() method, task is to find the Employee Bonus based on Experience and create and return the EmployeeBonus object using the following criteria:

Experience (years)    Bonus Percentage
> 10                  20.0%
>= 5                  15.0%
>= 2                  10.0%
< 2                   5.0%

Formula used :
Bonus Amount = (Salary × BonusPercentage) / 100

Create an ELC class EmployeeBonusCalculator which contains main method to test the application.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Assignment 05 :
---------------
Create a program to determine Hotel Room Bill based on Number of Days Stayed.

Create a BLC class Customer

Instance Variables :
name : String : private 
daysStayed : int : private 
roomType : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
customer from this method.

Create another BLC class BillDetails.

Instance Variables :
customer : Customer : private 
ratePerDay : double : private 
totalBill : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

--- Result ---
Name: Riya Sharma
Room Type: Deluxe
Days Stayed: 5
Rate per Day: 2500.0
Total Bill Amount: 12500.0

Create another class CalculateHotelBill which does not contain any field (Variable)

Methods :
Name of the Method : calculateBill()  [Factory Method]
return type : BillDetails 
Access Modifier : public, static
Argument : Customer

In calculateBill() method, task is to find the rate per day based on room type and calculate total bill as per the following criteria:

Room Type      Rate per Day
Standard       1500.0
Deluxe         2500.0
Suite          4000.0

Formula used :
Total Bill = DaysStayed × RatePerDay

Create an ELC class HotelBillingApp which contains main method to test the application.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Assignment 06 :
---------------
Create a program to determine Vehicle Insurance Premium based on Vehicle Type and Age.

Create a BLC class Vehicle

Instance Variables :
ownerName : String : private 
vehicleType : String : private 
vehicleAge : int : private 
basePremium : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the owner name.

Create another BLC class InsuranceDetails.

Instance Variables :
vehicle : Vehicle : private 
finalPremium : double : private 
discountApplied : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

--- Result ---
Owner Name: Arjun Mehta
Vehicle Type: Car
Vehicle Age: 4
Base Premium: 8000.0
Discount Applied: 10.0%
Final Premium: 7200.0

Create another class CalculateInsurance which does not contain any field (Variable)

Methods :
Name of the Method : calculatePremium()  [Factory Method]
return type : InsuranceDetails 
Access Modifier : public, static
Argument : Vehicle

In calculatePremium() method, task is to find the discount and final premium as per the following criteria:

Vehicle Age      Discount Percentage
> 10             20.0%
>= 5             15.0%
>= 3             10.0%
< 3              5.0%

Formula used :
Final Premium = BasePremium - (BasePremium × Discount / 100)

Create an ELC class InsuranceCalculatorApp which contains main method to test the application.


Assignment 07 :
---------------
Create a program to calculate a Cricket Player’s Batting Average and Strike Rate based on the number of matches, runs scored, balls faced, and times out.

Create a BLC class Player

Instance Variables :
playerName : String : private 
noOfMatches : int : private 
runs : int : private 
ballsFaced : int : private 
timesOut : int : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Methods :
1. Name : calculateStrikeRate()
   Return Type : double
   Access Modifier : public
   Description : Calculates the Strike Rate using the formula :
   Strike Rate = (Runs / BallsFaced) × 100

2. Name : calculateAverage()
   Return Type : double
   Access Modifier : public
   Description : Calculates the Batting Average using the formula :
   Average = Runs / TimesOut

Override toString() method to print the player details in the following format :

Player Name : Rohit
Matches : 120
Runs : 550
Balls Faced : 740
Times Out : 90
Average : 49.5
Strike Rate : 150.0

Create an ELC class PlayerStatisticsApp
This class contains the main() method to test the application by creating a Player object, invoking both calculation methods, and printing the result using the toString() method.*/
