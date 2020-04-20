package com.main;

public class StaticInstance {
	int x =10;
    static int y=20;
    
	static void staticDisplay() {
		System.out.println("calling static method");
	}
	
    void instanceDisplay() {
	System.out.println("calling instance method");
	}

	public static void main(String[] args) {
		StaticInstance si = new StaticInstance();
		
		si.instanceDisplay();//calling instance method
		staticDisplay();/* We have to use Class name if calling static methe
		od is from another class*/
		System.out.println(si.x);// calling instace variable
		System.out.println(y);
		
		

	}

}

