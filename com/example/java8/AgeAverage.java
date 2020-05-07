package com.example.java8;

import java.util.List;


import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;





//calculating average
class Student {
	
private int id;
private String name;
private int age;
private String country;

public Student(int id, String name, int age, String country) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.country = country;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

public String toString() {
    return "{"+id+","+name+","+age+","+country+"}";
}
}


public class AgeAverage {
    public static void main(String[] args) {
    	
    	List<Student> students = new ArrayList<>();
    	students.add(new Student(1, "Sam", 22, "USA"));
    	students.add(new Student(2, "Sierra", 21, "Canada"));
    	students.add(new Student(3, "Ross", 20, "USA"));
    	students.add(new Student(4, "John", 22, "Canada"));
    	students.add(new Student(5, "Hannah", 22, "Australia"));
    	
    	Map<String, Double> studentsByCountryAvgAge = 
    			  students.stream()
    			   .collect(Collectors.groupingBy(Student::getCountry,
    			             Collectors.averagingInt(Student::getAge)));
    	System.out.println(studentsByCountryAvgAge);
    	
    }
}