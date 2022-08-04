package com.exception.handling;

public class Try_catch3 {
	public static void main(String[] args) {

		int a = 10;
		try {
			System.out.println(a / 0);

		} catch ( NullPointerException e) {
			System.out.println("null pointer exception handled");
		}

	}

}
