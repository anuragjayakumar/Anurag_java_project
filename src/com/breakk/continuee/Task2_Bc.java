package com.breakk.continuee;
//iterate the number between  90 to 99 an d print the number except 96

public class Task2_Bc {
	public static void main(String[] args) {
		for (int i = 90; i <= 99; i++) {
			if (i == 96) {
				continue;
				
			}
			else {
				System.out.println(i);
				
			}
			
		}
		
	}

}
