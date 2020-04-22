package com.example.overriding;


class Animal {
   public void eat() throws Exception {
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

      a.eat();   // unhandled type exception
      b.eat();   
   }
}