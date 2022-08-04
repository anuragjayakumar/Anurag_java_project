package com.breakk.continuee;
// iterate the number from 1 to 50 are print all the numbers except 12 and 21
public class Task4_Bc {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i==12) {
				continue;
				
			}
			if (i == 21) {
				continue;
				
			} else {
				System.out.println(i);

			}
			
		}
		
	}

}
