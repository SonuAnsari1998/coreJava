package nov_11_Inheritance;

import java.util.Scanner;
public class MultilevelInheritance {
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your choice");
       int choice=sc.nextInt();
       switch(choice){
           case 1->{
               Animal animal=new Animal();
               animal.eat();
           }
           case 2->{
               Mammal mammal=new Mammal();
               mammal.walk();
           }
           case 3->{
               Dog dog=new Dog();
               dog.bark();
           }
           default ->{
               System.out.print("Invalid choice!");
           }
       };
   }
}
//--------------------------------------------------------------------
class Animal{
   public void eat(){
       System.out.println("Animal is eating");
   }
}
//--------------------------------------------------------------------
class Mammal extends Animal{
   public void walk(){
       System.out.println("Mammal is walking");
   }
}
//--------------------------------------------------------------------
class Dog extends Mammal{
   public void bark(){
       System.out.println("Dog is barking");
   }
}
