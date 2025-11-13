package nov_12_HierarchicalInheritance;

import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int employeeId=sc.nextInt();
        String employeeName=sc.next();
        double employeeSalary=sc.nextDouble();
        if(employeeSalary<=0){
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
    PermanentEmployee permanentEmployee = new PermanentEmployee( employeeId,employeeName,employeeSalary);

    System.out.println(permanentEmployee);
    permanentEmployee.netSalary();
    //--------------------ContractEmployee-----------------
        int employeeId1=sc.nextInt();
        String employeeName1=sc.next();
        double employeeSalary1=sc.nextDouble();
        int contractDuration=sc.nextInt();
        ContractEmployee contractEmployee = new ContractEmployee(employeeId1, employeeName1,employeeSalary1, contractDuration);

        System.out.println(contractEmployee);
        
    }
}
class Employee{
    protected int employeeId;
    protected String employeeName;
    protected double employeeSalary;
    Employee(int employeeId, String employeeName, double employeeSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }
}

class PermanentEmployee extends Employee{
    protected double providentfund;
    PermanentEmployee(int employeeId, String employeeName, double employeeSalary)
    {
        super(employeeId,employeeName,employeeSalary);
        this.providentfund=(12*employeeSalary)/100;
    }
    public String toString(){
        return "PermanentEmployee [employeeId="+this.employeeId+", employeeName="+this.employeeName+", employeeSalary="+this.employeeSalary+", providentfund="+this.providentfund+"]";
    }
    public void netSalary(){
        System.out.println("Net Salary: "+(employeeSalary+providentfund));
    }
}

class ContractEmployee extends Employee{
    protected int contractDuration;
    ContractEmployee(int employeeId, String employeeName, double employeeSalary, int contractDuration)
    {
        super(employeeId, employeeName, employeeSalary);
        this.contractDuration=contractDuration;
    }
   
    public String toString(){
        return "ContractEmployee [employeeId="+this.employeeId+", employeeName="+this.employeeName+", employeeSalary="+this.employeeSalary+", contractDuration="+this.contractDuration+"]";
}
}
