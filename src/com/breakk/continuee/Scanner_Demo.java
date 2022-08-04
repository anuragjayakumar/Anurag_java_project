package com.breakk.continuee;
//iterate the first 20 numbers and after reach 5 the program must terminate

import java.util.Scanner;

public class Scanner_Demo {
	public static Scanner s = new Scanner(System.in);
	public static int start, end , break_Point;
	
	public static void main(String[] args) {
		System.out.println("enter staring point ");
		start = s.nextInt();
		
		System.out.println("enter your end point");
		end = s.nextInt();
		
		System.out.println("enter your break point");
		break_Point = s.nextInt();
		
		for (int i = start; i <= end; i++) {
			if (i==5 ) {
				break;
				
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}
	

}
