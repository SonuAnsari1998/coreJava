package nov_19_HAS_A_Relation;


import java.util.Scanner;
public class ModelingEmployeeAndAddressDetails {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String street=sc.nextLine();
        String city=sc.nextLine();
        String name=sc.nextLine();
        Person person=new Person(street, city, name);
        System.out.println(person.getPersonDetails());
    }
}
class Address{
    private String street;
    private String city;
    Address(String street, String city){
        this.street=street;
        this.city=city;
    }
    public void setStreet(String street){
        this.street=street;
    }
    public String getStreet(){
        return this.street;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return this.city;
    }
}
class Person extends Address{
    private String name;
    Person(String street, String city, String name){
        super(street, city);
        this.name=name;
    }
    public String getPersonDetails(){
        return "Person Name: "+this.name+
        "\nAddress: Street - "+getStreet()+
        ", City - "+getCity();
    }

}
