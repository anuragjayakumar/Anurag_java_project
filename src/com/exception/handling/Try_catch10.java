package com.exception.handling;

public class Try_catch10 {
	public static void main(String[] args) {
		int a = 10;
		try {
			System.out.println(a/2);
			
		} catch (Exception e) {
			System.out.println("Handled");
		}
		finally {
			System.exit(0);
			System.out.println("Finally blocked ");
			
		}
		System.out.println("End");
		
	}

}
