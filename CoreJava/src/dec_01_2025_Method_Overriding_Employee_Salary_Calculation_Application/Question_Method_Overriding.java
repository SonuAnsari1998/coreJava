package dec_01_2025_Method_Overriding_Employee_Salary_Calculation_Application;

/*
Method Overriding
Ravi Shankar
•
9:03 AM
100 points
Batch_51_Assignment.txt
Text
Class comments
Your work
Assigned
Private comments
Assignment details
Create a Employee Salary calculation Application project by using Method Overriding Concept 
to display different kinds of salary for PartTimeEmployee and FullTimeEmployee.
Validate all the inputs properly and generate error message, if any input is not appropriate. 

Create a BLC class called Employee
Fields :
 id  int  protected
 name String protected
	
Use a parameterized constructor to initialize all the fields, 

 Methods :
 
 1) Method Name 	: calculateSalary()
    Parameter  		: No Parameter
    Return Type 	: double
    Access modifier	: public
    In this method return 0.0 for generic salary

 Create another BLC class FullTimeEmployee which is sub class of Employee.

  
  Field :
  protected double salary;
  
  Take a parameterized constructor to initialize super class and sub class properties.
  Validate all the inputs properly and generate error message, if any input is not 
  appropriate. 
  [See the Test cases for Input Validation]

 Method :
  
 1) Method Name 	: calculateSalary()
    Parameter   	: No Parameter
    Return Type 	: double
    Access modifier	: public
    
    In this overridden method return the salary of employee as a non static variable

    
Create another BLC class PartTimeEmployee which is sub class of Employee
  
  Field :
  protected double hourlyRate;
  protected int hoursWorked; 
  
  Take a parameterized constructor to initialize super class and sub class properties.
  Validate all the inputs properly and generate error message, if any input is not 
  appropriate. 
  [See the Test cases for Input Validation]
  
 Method :
  
 1) Method Name 	: calculateSalary()
    Parameter   	: No Parameter
    Return Type 	: double
    Access modifier	: public
    In this overridden method return the salary of employee as based on number of hours, he 
    has
    worked in the Organization.
        
    Create an ELC class EmployeeSalary with main method to test this application.
    
Test Cases for Output :
------------------------
Test Case 1 :
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
1
Enter Fulltime Employee Id :101
Enter Fulltime Employee Name :Scott
Enter the Salary :90000
Scott Salary is :90000.0

Test Case 2 :
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
2
Enter PartTime Employee Id :102
Enter PartTime Employee Name :Alen
Enter your hourly rate:1000
Enter your total works hour in the month :90
Alen Salary is :90000.0

Test Cases for Input Validation :
 ---------------------------------
Test Cases 1:
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
1
Enter Fulltime Employee Id :101
Enter Fulltime Employee Name :Scott
Enter the Salary :-9000
Salary can't be negative!!!

Test Cases 2:
-------------
 		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
2
Enter PartTime Employee Id :102
Enter PartTime Employee Name :Alen
Enter your hourly rate:-12
Enter your total works hour in the month :90
Employee hourly rate can't be zero OR Negative

Test Cases 3:
-------------
		***Salary Calculation Menu***		
		 1) FullTime Employees 
		 2) PartTime Employees  
Please select the Employee type
2
Enter PartTime Employee Id :102
Enter PartTime Employee Name :Alen
Enter your hourly rate:1000
Enter your total works hour in the month :-10
Employee hours of work can't be Negative*/
