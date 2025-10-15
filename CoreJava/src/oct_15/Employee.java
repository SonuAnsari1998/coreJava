package oct_15;
/*Assignment 01 :
---------------
Create a BLC class Employee :

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
    id : int
  name : String
salary : double

Methods :
---------
1)

Method Name		: setEmployeeDetails()
Parameter		: 3 Parameters (int id, String name, double salary)
Return Type		: void
Access modifier		: public

In this method with the help of parameters variables, initialize the non static fields.

2) 

Method Name		: calculateSalaryIncrement()
Parameter		: No Parameter
Return Type		: void
Access modifier		: public

In this method we need to calculate salary increment based on employee salary on the following criteria :

Salary		-      Increment
<50000		-      10 % increment on Salary
50000 to 80000	-	7 % increment on Salary
>80000		-	5 % increment on Salary

Now print two details inside the method
 a) Salary increment amount
 b) After increment, Updated salary

3) Generate toString() method to print Employee object properties.

Create another ELC class called EmployeeDemo which contains main method.
Create Employee Object, take the input from the Scanner class and call the methdos to get the following output.

Enter Employee ID: 101
Enter Employee Name: Ravi Kumar
Enter Employee Salary: 60000

----- Employee Information -----
Employee Details:
Employee [Id=101, Name=Ravi, Salary=84000.0]

----- Salary Increment Details -----
Salary Increment Amount: 4200.0
Updated Salary: 64200.0

------------------------------------------------------------------------------------------*/
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	public void setEmployeeDetails(int id, String name, double salary) {
		this.employeeId=id;
		this.employeeName=name;
		this.employeeSalary=salary;
	}
	public void calculateSalaryIncrement() {
		double inc=0;
		if(this.employeeSalary<50000) {
			double increment=(10*employeeSalary)/100;
			inc+=increment;
		}else if(this.employeeSalary>=50000 && employeeSalary<=80000) {
			double increment=(7*employeeSalary)/100;
			inc+=increment;
		}else if(this.employeeSalary>80000) {
			double increment=(5*employeeSalary)/100;
			inc+=increment;
		}else {
			System.err.println("Not Eligible for salary Increment");
		}
		System.out.println("Salary increment amount : "+inc);
		System.out.println("After increment, Updated salary : "+(this.employeeSalary+inc));
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + this.employeeId + ", employeeName=" + this.employeeName + ", employeeSalary="
				+ this.employeeSalary + "]";
	}
	
	
}
