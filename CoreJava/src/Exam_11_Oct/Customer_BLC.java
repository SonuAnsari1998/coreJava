package Exam_11_Oct;
/*Question - 01 :
===============
Write a program to print the Customer data in the given format
Explanation:
Create a BLC(Business Logic Class) class Customer which contains a static method

getCustomerDetails()

Name of the Method : getCustomerDetails()

Parameter of the Method : 3 parameters id ,name and bill of type int ,
String and double respectively.
Return type of the Method : String
Access modifier of the Method : public and static

Create another class Test in the same package which is ELC class (contains main
method) to test the application. Call the static method getCustomerDetails() which
should print the Customer data in the following format

[ Id is :101, Name is :Ravi, Bill is :14000.9]
Note :- Both the classes must be declared with public access modifier
 */
public class Customer_BLC {
	int id;
	String name;
	int bill;
	public void setCustomerDetails(int id, String name, int bill) {
		this.id=id;
		this.name=name;
		this.bill=bill;
	}
	public String getCustomerDetails() {
		return "[ Id is : "+id+", Name is : "+name+", Bill is : "+bill+"]";
	}

}
