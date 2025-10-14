package oct_14;

/*Assignment 01 :
--------------
A BLC class named as Bank is given in which you need to write the code for performing the withdrawal and 
deposit process and also Checking current balance and displayDetail of the Customer (BlC class)

Coding requirements :
---------------------

Non static Fields [private access modifier]
-----------------------------------------------------------------------------------------
customerName:String
accountNumber:int
currentBalance:double

static Field(public access modifier, must be initialized at the time of declaration)
-----------------------------------------------------------------------------------------
bankName:String static
bankAddress:String static
bankIFSCCode:Stirng static
------------------------------------------------------------------------------------------
This BLC class contains 6 methods with the following specifications :
-------------------------------------------------------------------------------------------
Methods :
---------
1)
Method Name		: setCustomerDeatils()
Parameter		: 3 Parameters of type String, int and double(name, accNumber, balance)
Return Type		: void
Access modifier		: public

In this method with the help of parameters variables, initialize the non static fields.
If balance is negative OR zero, provide error message and exit from the program.

-----------------------------------------------------------------------------------------
2)
Method Name		: withdraw()
Parameter		: double amount
Return Type		: void
Access modifier		: public

In this method, If withdraw amount is greater than available balance than it should print
error message "You have insufficient balance" and exit from the program.

------------------------------------------------------------------------------------------
3) 
Method Name		: deposit()
Parameter		: double amount
Return Type		: void
Access modifier		: public

In this method, If a cutsomer wants to deposit zero or -ve amount than it should provide error message 
and exit from the program.
---------------------------------------------------------------------------------------
4. 
Method Name		: getCurrentBalance()
Parameter		: No parameter
Return Type		: double
Access modifier		: public

In this method, You should return Current balance.
------------------------------------------------------------------------------------------
5. 
Method Name		: displayDetails()
Parameter		: No parameter
Return Type		: String
Access modifier		: public

In this method, We need to  return all the properties (non static field) in String format through this displayDetails() method in the below format :

Customer [Name=Ravi, AccountNumber=12345, Balance=13000.0]
-------------------------------------------------------------------------------------------
ELC Class
An ELC class BankCustomer is given with main method to call the method for performing business logic.

Take the input from Scanner class to initialize all the non static fields through
setCustomerDeatils() methods with proper validation.

Take one Infinite while loop [while(true){}], Under this loop take switch case to 
perform various operation as shown in the below output.


Test cases for Output :
------------------------
Case 1 :
---------
===== Welcome to ICICI Bank =====
Enter Customer Name : Ravi
Enter Account Number : 12345
Enter Opening Balance : 10000

Customer account created successfully!  [setCustomerDetails()]


===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 1
Enter deposit amount: 5000
Deposit successful! ₹5000.0 credited.

===== MENU =====  [//This menu should come through infinite loop]
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 


Case 2 :
----------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 2
Enter withdrawal amount: 3000
Withdrawal successful! ₹3000.0 debited.

Case 3 :
---------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 3
Current Balance: ₹12000.0

Case 4 :
----------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 4
Customer [Name=Ravi, AccountNumber=12345, Balance=13000.0]

Case 5 :
---------

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 5
Thank you for banking with ICICI Bank!


Test cases for Wrong Input Validation :
----------------------------------------
Case 1:
---------
===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 1
Enter deposit amount: -5000
Deposit amount should be greater than zero!

Case 2:
--------
===== Welcome to ICICI Bank =====
Enter Customer Name : Ravi
Enter Account Number : 1678
Enter Opening Balance : 10000

Customer account created successfully!

===== MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Customer Details
5. Exit
Enter your choice: 2
Enter withdrawal amount: 15000
You have insufficient balance!*/
