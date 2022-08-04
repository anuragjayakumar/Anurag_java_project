package com.exception.demo;

public class Number_format_exception_error {
	public static void main(String[] args) {
		String s = "17@";
		// s = s.replaceAll("[^0-9]"," ");
		 //s =s.trim();
		System.out.println(s + 10);
// convert string to int
		
	  int value = Integer.parseInt(s);
	  System.out.println(value + 10);
		
		
	}

}
