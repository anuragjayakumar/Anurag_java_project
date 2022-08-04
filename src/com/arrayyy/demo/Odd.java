package com.arrayyy.demo;


public class Odd {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0 ) {
				System.out.println("even number :" + i );
				
			}
			else if (i% 2!= 0) {
				System.out.println("odd number : " + i);
				
			} else {
				System.out.println("invalid");

			}
		}
	}
}