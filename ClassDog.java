package com.main;


class Animal {
   public void eat() {
      System.out.println("From Animal class");
   }
}

class Dog extends Animal {
   public void eat() {
      System.out.println("From Dog Class");
   }
   
}

public class ClassDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal  object
      Animal b = new Dog();   //  Dog object

      a.eat();   
      b.eat();   
   }
}