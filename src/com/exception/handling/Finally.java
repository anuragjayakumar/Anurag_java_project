package com.exception.handling;

public class Finally {
	public static void main(String[] args) {
		int a= 10;
		try {
			System.out.println(a/0);
			
		} catch (Exception e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("finally block");
			
		}
		
	}

}
