package com.example.equalshashcode;


class StudentDemo
{
String name;
int rollno;
StudentDemo(String name,int rollno)
{
this.name=name;
this.rollno=rollno;
}
public static void main(String[] args){
	StudentDemo s1=new StudentDemo("vijayabhaskar",101);
	StudentDemo s2=new StudentDemo("bhaskar",102);
	StudentDemo s3=new StudentDemo("vijayabhaskar",101);
	StudentDemo s4=s1;
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
}}