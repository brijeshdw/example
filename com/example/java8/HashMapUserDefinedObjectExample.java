package com.example.constructor;

import java.util.HashMap;
import static java.util.stream.Collectors.toList;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Collection ;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Student {
    private Integer age;
    private String name;
   

    public Student( Integer age,String name ) {
        
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}


public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(15, new Student(15, "Rajeev"));
        studentMap.put(29, new Student(29, "David"));
        studentMap.put(30, new Student(30, "Jack"));
        //int x = 0;
      
        studentMap.forEach((age, name) -> {
        	//IntStream s = IntStream.of(age);
        	//OptionalDouble obj = s.average();
        	
            System.out.println(age + " => " + name);
            
            
            
        });
    }
}