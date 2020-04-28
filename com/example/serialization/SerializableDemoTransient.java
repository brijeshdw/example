package com.example.serialization;


import java.io.*;
class Dog1 implements Serializable
{
static transient int i=10;
final transient int j=20;
}
class SerializableDemoTransient
{
	
public static void main(String args[])throws Exception{
Dog1 d1=new Dog1();
FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d1);
FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Dog1 d2=(Dog1)ois.readObject();
System.out.println(d2.i+"................"+d2.j);
}
}