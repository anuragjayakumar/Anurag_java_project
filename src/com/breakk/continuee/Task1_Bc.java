package com.breakk.continuee;
//iterate the first 20 numbers and after reach 5 the program must terminate

public class Task1_Bc {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i<=5) {
				System.out.println(i);
				
			}
			else {
				break;
				
			}
			
		}
		
	}

}
