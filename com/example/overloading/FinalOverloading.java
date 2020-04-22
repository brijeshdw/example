package com.example.overloading;


class Base {
    public final void doSomething(Object o) {
        System.out.println("Object");
    }
}

class FinalOverloading extends Base {
    public void doSomething(Integer i) {
        System.out.println("Int");
    }


public static void main(String[] args) {
    Base b = new Base();
    Base d = new FinalOverloading();
    b.doSomething(new Integer(0));
    d.doSomething(new Integer(0));
}}