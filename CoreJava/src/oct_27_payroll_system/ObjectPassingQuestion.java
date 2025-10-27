package oct_27_payroll_system;

/*The payroll system of an organization involves calculating the gross salary of each type of employee and the tax applicable to each. 

Note : Take parameterized constructor to initialize all fields. 
        Attributes must be private for all the BLC classes.

Create the following BLC classes as described below.

Class Employee
Fields: employeeId: int, employeeName : String, basicSalary : double, HRAPer : double, DAPer : double

Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer

Class Manager
Fields: managerId: int, managerName : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double

public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance

Class Trainer
Fields: trainerId: int, trainerName : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double

public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)

Class Sourcing
Fields: sourceId: int, sourcaName : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double

Calculate the gross salary as : basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)


Class TaxUtil
Fields: None
Public Methods:
calculateTax(Employee e) - returns a double
calculateTax(Manager m) - returns a double
calculateTax(Trainer t) - returns a double
calculateTax(Sourcing s) - returns a double

Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else, tax is 5%.

An ELC class TaxCalculation is given to you with the main Method. Use this class to test your solution.*/
