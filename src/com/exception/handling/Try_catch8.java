package com.exception.handling;


public class Try_catch8 {
	public static void main(String[] args) {
		int a = 10;
		try {
			System.out.println(a/0);
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerHandled");
		}
		catch (ArithmeticException e) {
			System.out.println("ArthmeticException handled ");
			
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
				
		
	}

}
