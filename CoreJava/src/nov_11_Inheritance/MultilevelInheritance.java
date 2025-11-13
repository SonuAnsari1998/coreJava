package nov_11_Inheritance;

import java.util.Scanner;
public class MultilevelInheritance {
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your choice");
       int choice=sc.nextInt();
       switch(choice){
           case 1->{
               A animal=new A();
               animal.eat();
           }
           case 2->{
               B mammal=new B();
               mammal.walk();
           }
           case 3->{
               C dog=new C();
               dog.bark();
           }
           default ->{
               System.out.print("Invalid choice!");
           }
       };
   }
}
//--------------------------------------------------------------------
class A{
   public void eat(){
       System.out.println("A is eating");
   }
}
//--------------------------------------------------------------------
class B extends A{
   public void walk(){
       System.out.println("B is walking");
   }
}
//--------------------------------------------------------------------
class C extends B{
   public void bark(){
       System.out.println("C is barking");
   }
}
