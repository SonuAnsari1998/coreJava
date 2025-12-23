package dec_23_2025_Our_Exception_By_Sonu;

/*CUSTOM UNCHECKED EXCEPTION – JAVA
PRACTICE ASSIGNMENTS (FULL DETAILS)

--------------------------------------------------
ASSIGNMENT 1: NEGATIVE NUMBER EXCEPTION
--------------------------------------------------

Aim:
To create and use a custom unchecked exception to handle negative number input.

Theory:
Unchecked exceptions are those that occur at runtime. In Java, they extend the 
RuntimeException class.
Custom unchecked exceptions are used to handle logical errors in programs.

Problem Statement:
Create a custom unchecked exception named NegativeNumberException.
Throw the exception if the user enters a negative number.

Algorithm:
1. Create a class extending RuntimeException.
2. Accept a number from the user.
3. Check if the number is negative.
4. If negative, throw the exception.
5. Otherwise, display the number.

Expected Output:
If input is negative, display an error message.
Otherwise, display the entered number.

Conclusion:
This assignment demonstrates basic creation and use of custom unchecked exceptions.

--------------------------------------------------
ASSIGNMENT 2: INSUFFICIENT BALANCE EXCEPTION
--------------------------------------------------

Aim:
To implement a custom unchecked exception in a BankingSystem.

Theory:
Unchecked exceptions help enforce business rules without mandatory handling at
 compile time.

Problem Statement:
Create a custom unchecked exception named InsufficientBalanceException.
Throw the exception if withdrawal amount is greater than account balance.

Algorithm:
1. Initialize account balance to 5000.
2. Accept withdrawal amount.
3. Compare withdrawal amount with balance.
4. If amount exceeds balance, throw exception.
5. Else, deduct amount and display remaining balance.

Expected Output:
Error message if balance is insufficient.
Otherwise, successful transaction message.

Conclusion:
This assignment shows real-world use of unchecked exceptions in banking systems.

--------------------------------------------------
ASSIGNMENT 3: INVALID LOGIN EXCEPTION 
--------------------------------------------------

Aim:
To validate login credentials using custom unchecked exception.

Theory:
Unchecked exceptions are useful for validation where program logic is violated.

Problem Statement:
Create a custom unchecked exception InvalidLoginException.
Throw the exception if username or password is incorrect.

Algorithm:
1. Store predefined username and password.
2. Accept login credentials from user.
3. Compare input with stored values.
4. Throw exception if mismatch occurs.
5. Display success message if valid.

Expected Output:
Login successful or error message.

Conclusion:
This assignment helps understand validation logic using unchecked exceptions.

--------------------------------------------------
ASSIGNMENT 4: INVALID MARKS EXCEPTION MarksException
--------------------------------------------------

Aim:
To validate student marks using custom unchecked exception.

Theory:
Data validation errors are best handled using unchecked exceptions.

Problem Statement:
Create a custom unchecked exception InvalidMarksException.
Throw the exception if marks are less than 0 or greater than 100.

Algorithm:
1. Accept marks for three subjects.
2. Validate each mark.
3. Throw exception for invalid marks.
4. Calculate total and average if valid.

Expected Output:
Error message for invalid marks or display result.

Conclusion:
This assignment highlights input validation using custom exceptions.

--------------------------------------------------
ASSIGNMENT 5: INVALID PRICE EXCEPTION PriceException
--------------------------------------------------

Aim:
To validate product price using custom unchecked exception.

Theory:
Unchecked exceptions help enforce business constraints.

Problem Statement:
Create a custom unchecked exception InvalidPriceException.
Throw the exception if product price is zero or negative.

Algorithm:
1. Accept product name and price.
2. Validate the price.
3. Throw exception if invalid.
4. Display product details if valid.

Expected Output:
Error message or product details.

Conclusion:
This assignment demonstrates price validation logic.

--------------------------------------------------
ASSIGNMENT 6: INVALID PIN EXCEPTION
--------------------------------------------------

Aim:
To validate ATM PIN using custom unchecked exception.

Theory:
Security validations are commonly handled using unchecked exceptions.

Problem Statement:
Create a custom unchecked exception InvalidPinException.
Throw the exception if PIN is not a 4-digit number.

Algorithm:
1. Accept PIN input.
2. Check length and numeric value.
3. Throw exception if invalid.
4. Allow access if valid.

Expected Output:
Access denied or access granted message.

Conclusion:
This assignment demonstrates security checks using unchecked exceptions.

--------------------------------------------------
ASSIGNMENT 7: FILE SIZE LIMIT EXCEPTION
--------------------------------------------------

Aim:
To validate file size using custom unchecked exception.

Theory:
Unchecked exceptions are suitable for system-level validations.

Problem Statement:
Create a custom unchecked exception FileSizeLimitExceededException.
Throw the exception if file size exceeds 10 MB.

Algorithm:
1. Accept file size input.
2. Compare with maximum allowed size.
3. Throw exception if limit exceeded.
4. Display success message if valid.

Expected Output:
Upload failed or upload successful message.

Conclusion:
This assignment shows system validation using unchecked exceptions.

--------------------------------------------------
ASSIGNMENT 8: INVALID SALARY EXCEPTION
--------------------------------------------------

Aim:
To validate employee salary using custom unchecked exception.

Theory:
Business rule violations are best handled using unchecked exceptions.

Problem Statement:
Create a custom unchecked exception InvalidSalaryException.
Throw the exception if salary is less than Rs.10,000.

Algorithm:
1. Accept employee name and salary.
2. Validate salary amount.
3. Throw exception if invalid.
4. Display employee details if valid.

Expected Output:
Error message or employee information.

Conclusion:
This assignment helps understand real-world salary validation.

--------------------------------------------------
END OF ASSIGNMENT FILE
--------------------------------------------------
*/
