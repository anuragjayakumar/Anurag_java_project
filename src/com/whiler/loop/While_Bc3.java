package com.whiler.loop;
//iterate the number from 1 to 50 and after reach 25 need to terminate the program

import java.util.Scanner;

public class While_Bc3 {
	public static Scanner s = new Scanner(System.in);
	public static int start , end , break_Point;
	public static void main(String[] args) {
		System.out.println("Enter  start");
		start = s.nextInt();
		
		System.out.println("Enter end ");
		end = s.nextInt();
		
		System.out.println("Enter break");
		break_Point = s.nextInt();
		while (start <= end ) {
			do {
				System.out.println(start);
				start++;
				
			} while (start <= 25);
			break;
	
		}
	}
}
