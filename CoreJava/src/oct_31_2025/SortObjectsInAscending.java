package oct_31_2025;
/*3. SortObjectsInAscending
SortObjectsInAscending
Write a java program to sort Employee objects by empName in ascending order.
-> create Employee class
   - fields : id,name,salary
   - parameterized constructor
   - toString()
-> create main() method 
   - create 3 Employee object and store in Employee type array and sort using Arrays.sort() method and print.
-> NOTE: import packages properly.

Sample Output :
--------------
Employees sorted by name (ascending):
Employee [ID=101, Name=Amit, Salary=60000.0]
Employee [ID=102, Name=Kiran, Salary=55000.0]
Employee [ID=103, Name=Ravi, Salary=50000.0]

Examples
Example 1
Input:
Employee 1: ID = 103, Name = Ravi, Salary = 50000.0  
Employee 2: ID = 101, Name = Amit, Salary = 60000.0  
Employee 3: ID = 102, Name = Kiran, Salary = 55000.0
Output:
Employees sorted by name (ascending):
Employee [ID=101, Name=Amit, Salary=60000.0]
Employee [ID=102, Name=Kiran, Salary=55000.0]
Employee [ID=103, Name=Ravi, Salary=50000.0]*/
import java.util.*;
public class SortObjectsInAscending{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    // int id=sc.nextInt();
    // String name=sc.nextLine();
    // double salary=sc.nextDouble();

    Employee emp2=new Employee(102, "Kiran", 70000);
    Employee emp1=new Employee(101, "Amit", 60000);
    Employee emp3=new Employee(103, "Kiran", 55000);
   
    Employee[] employees={emp2,emp1,emp3};

    Arrays.sort(employees);

    // System.out.println("Employees sorted by name (ascending ):");

    for(Employee e : employees){
        System.out.println(e);
    }

 

}
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return "Employee [ID=" + id+", Name="+name+", Salary="+salary+"]";
    }
    public int compareTo(Employee e){
        return this.name.compareTo(e.name);
    }
}
