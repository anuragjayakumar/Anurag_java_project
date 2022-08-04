package com.breakk.continuee;
//Iterate 1 to 5 but except 3

public class Break_Continue_Demo2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
				
			} else {
				System.out.println(i);

			}
			
		}
		
	}

}
