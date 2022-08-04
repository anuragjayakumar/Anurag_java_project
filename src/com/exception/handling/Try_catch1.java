package com.exception.handling;

public class Try_catch1 {
	public static void main(String[] args) {
		int a = 10;
		
		try {
			System.out.println(a);
            System.out.println(a/0);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("process completed");
		}
		
	}
		
	}


