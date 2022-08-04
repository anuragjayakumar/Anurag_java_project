package com.arrayyy.demo;

public class Even_Odd_Year {
	public static void main(String[] args) {
		for (int i = 2000; i <= 2030; i++) {
			if (i%4==0 && i%400!=0) {
				System.out.println("Leap year :"+ i);
				
				
			}
			
		}
		
	}

}
