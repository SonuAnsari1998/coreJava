package nov_05_Custom_Object_with_array;
/*Take an ELC class called EmployeeArrayDemo with main method.

Create Scanner class object to initialize employee array dynamically. [User choice] 

Take a for loop to initialize the employee array with user input.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Enter number of employees: 3

Enter details for Employee 1:
Enter ID: 111
Enter Name: Scott
Enter Salary: 45789

Enter details for Employee 2:
Enter ID: 222
Enter Name: Smith
Enter Salary: 78908

Enter details for Employee 3:
Enter ID: 333
Enter Name: Alen
Enter Salary: 99567

===== Employee Details =====
Employee [id=111, name=Scott, salary=45789.0]
Employee [id=222, name=Smith, salary=78908.0]
Employee [id=333, name=Alen, salary=99567.0]*/
import java.util.Scanner;
public class EmployeeArrayDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int size=sc.nextInt();
		Employee[] arr = new Employee[size];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter details for Employee "+(i+1));
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Salary: ");
			double salary=sc.nextDouble();
			arr[i]= new Employee(id, name, salary);
		}
		for(Employee e:arr) {
			System.out.println(e);
		}
		
	}
}





















