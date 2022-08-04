package com.exception.handling;

public class Try_catch4 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a/0);
		try {
			System.out.println(a/2);
			
		} catch (Exception e) {
			System.out.println("arthmeticexception handled");
		}
				
		
	}

}
