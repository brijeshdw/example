package com.example.java8;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//28 april 3
 class Student1 {
	 private int id;
    private String name;
    private int age;
    private String city;
    private int score;
    
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	
    
    
    public Student1(int id, String name, int age, String city, int score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.score = score;
	}
	
   
    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", age='" + score + '\'' +
                '}';
    }
} 



public class CollectorsGroupingBy {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1,"Ram",26,"Mumbai" ,54);
        Student1 s2 = new Student1(2,"shayam",28,"Mumbai" ,59);
        Student1 s3 = new Student1(3,"anil",23,"Mumbai" ,77);
        Student1 s4 = new Student1(4,"keshav",26,"Mumbai" ,56);
        Student1 s5 = new Student1(5,"raja",24,"chennai" ,64);
        Student1 s6 = new Student1(6,"sachin",29,"bang" ,82);
        Student1 s7 = new Student1(7,"rahul",21,"Mumbai" ,89);
        Student1 s8 = new Student1(8,"kumar",22,"Mumbai" ,49);
        Student1 s9 = new Student1(9,"prasson",30,"bhopal" ,90);
        Student1 s10 = new Student1(10,"abhi",26,"Mumbai" ,76);
        
        List<Student1> list = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
        //Group Student1 on the basis of Score
        System.out.println("----Group Student1 on the basis of Score----");
        Map<Integer, List<Student1>> stdByClass = list.stream()
                    .collect(Collectors.groupingBy(Student1::getScore));
        
        stdByClass.forEach((k,v)->System.out.println("Score:"+k+"  "+ 
                ((List<Student1>)v).stream().map(m->m.getName()).collect(Collectors.joining(","))));

        
        //Group Student1 on the basis of age
        System.out.println("----Group Student1 on the basis of age----");
        Map<Integer, List<Student1>> stdByAge = list.stream()
                    .collect(Collectors.groupingBy(Student1::getAge)
                    		);
        


        
        stdByAge.forEach((k,v)->System.out.println("Age:"+k+"  "+ 
                ((List<Student1>)v).stream().map(m->m.getName()).collect(Collectors.joining(","))));
    }
} 
