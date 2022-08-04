package com.exception.handling;

public class Try_catch6 {
	public static void main(String[] args) {
		int a = 10;
		try {
			System.out.println(a/0);

		} catch ( NullPointerException e ) {
			System.out.println("NullpointException handled");
		}
		catch (ArithmeticException f) {
			System.out.println("ArthmaticException handled");
			System.out.println("anurag");
			System.err.println("lokesh");
		}

	}

}
