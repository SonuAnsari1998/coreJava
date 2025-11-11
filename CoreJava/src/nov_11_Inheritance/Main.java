package nov_11_Inheritance;

import java.util.Scanner;
public class Main{
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       String breed=sc.next();
       boolean hasFur=sc.nextBoolean();
       String name=sc.next();
       Dog dog=new Dog(breed,hasFur,name);
       System.out.println(dog);
   }
}
//-------------------------------------------
class Animal{
   private String name;
   Animal(String name){
       this.name=name;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return this.name;
   }
}
//-------------------------------------------
class Mammal extends Animal{
   private boolean hasFur;
   public Mammal(boolean hasFur, String name){
       super(name);
       this.hasFur=hasFur;
   }
   public void setHasfur(boolean hasFur){
       this.hasFur=hasFur;
   }
   public boolean getHasfur(){
       return this.hasFur;
   }
}
//-------------------------------------------
class Dog extends Mammal{
   private String breed;
   public Dog(String breed, boolean hasFur, String name){
       super(hasFur,name);
       this.breed=breed;
   }
   public void setBreed(String breed){
       this.breed=breed;
   }
   public String getBreed(){
       return this.breed;
   }
   public String toString(){
       return "Dog [getName()="+getBreed()+", isHasFur()="+getHasfur()+",breed="+getName()+"]";
   }
}
