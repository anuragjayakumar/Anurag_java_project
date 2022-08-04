package com.arrayyy.demo;

public class Leapyear_Task2 {
	public static void main(String[] args) {
		for (int i = 366; i <= 396; i++) {
			if (i % 2==0 ) {
				System.out.println("Even number :"+ i);
			}
				
				else if (i%2!=0) {
					System.out.println("odd number :"+ i);
					
				}
				else {
					System.out.println("invalud");
				
			}
			
		}
	}
}


