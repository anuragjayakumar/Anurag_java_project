package com.pratice.in;

public class Keywords {
	public static int a = 10;// static variable 
	public static void demo() { // static method 
 
		System.out.println("static method ");
	}
	public static void main(String[] args) {
		demo();
		int value = a;
		System.out.println(value);
	}
}
