package com.whiler.loop;
//iterate the number between  90 to 99 an d print the number except 96

import java.util.Scanner;
//iterate the number between  90 to 99 an d print the number except 96

public class While_Bc2 {
	public static Scanner s = new Scanner(System.in);
	public static int start , end , break_Point;
	public static void main(String[] args) {
		System.out.println("Enter  start");
		start = s.nextInt();
		
		System.out.println("Enter end ");
		end = s.nextInt();
		
		System.out.println("Enter break");
		break_Point = s.nextInt();
		
		while (start <= end) {
		
			do {
				System.out.println(start);
				start++;
				
				
				
			} while (start == 96);
			continue;
			
			
		}
		System.out.println(start);
		
		
		

		
	}
	
	

}
