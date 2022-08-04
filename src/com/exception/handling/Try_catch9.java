package com.exception.handling;

public class Try_catch9 {
	public static void main(String[] args) {
		int a = 10;
		try {
			System.out.println(a/0);
			
			
		} catch (Exception e) {
			System.out.println("Inside catch block");
			System.out.println(a/0);
			System.out.println("handled");
		}
		
	}

}
