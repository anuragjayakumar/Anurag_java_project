package com.whiler.loop;

import java.util.Scanner;

//iterate the first 20 numbers and after reach 5 the program must terminate
public class While_Bc1 {
	public static Scanner s = new Scanner(System.in);
	public static int start, end, break_Point;

	public static void main(String[] args) {
		System.out.println("Enter your starting point ");
		start = s.nextInt();
		System.out.println("Enter your end point");
		end = s.nextInt();
		System.out.println(" enter your break point ");
		break_Point = s.nextInt();
		while (start <= end ) {
			do {
				System.out.println(start);
				start++;
				
				
			} while (start <= 5);
			break;
			
		}

	}

}
