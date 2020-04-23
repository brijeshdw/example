package com.example.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class EqualsArrayList {
    public static void main(String[] args) {
        Student alex = new Student(1, "Alex");
        List < Student > studentsLst = new ArrayList < Student > ();
        studentsLst.add(alex);
        System.out.println("Arraylist size = " + studentsLst.size());
        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student(1, "Alex")));
    }
}
