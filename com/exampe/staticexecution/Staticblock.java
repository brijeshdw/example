package com.exampe.staticexecution;


class Staticblock{
	   static int num =8;
	   Staticblock()
	   {
		   System.out.println("calling default constructor");
	   }
	   //First Static block
	   static{
	      System.out.println("Static Block 1");
	      
	  } 
	   static void staticDisplay() {
			System.out.println("calling static method");
		}
	  //Second static block
	  static{
	      System.out.println("Static Block 2");
	      
	  }
	  public static void main(String args[])
	  {
		 // staticDisplay();
	      System.out.println("Value of num: "+num);
	      staticDisplay();
	   }
	}
