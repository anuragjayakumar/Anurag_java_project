package com.exception.demo;

public class Number_format_exception {
	public static void main(String[] args) {
		String s = "17";
		System.out.println(s+10);
		
		// convert string into int 
		
		  int value = Integer.parseInt(s);
		  System.out.println(value+10);
		
	}

}
