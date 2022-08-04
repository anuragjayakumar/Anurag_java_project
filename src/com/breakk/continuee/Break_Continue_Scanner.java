package com.breakk.continuee;

import java.util.Scanner;

public class Break_Continue_Scanner {
	public static Scanner s = new Scanner(System.in);
	public static int start,end, break_Point;
	
public static void main(String[] args) {
	System.out.println("Enter the starting point ");
	start = s.nextInt();
	
	System.out.println("Enter the end point");
	end = s.nextInt();
	
	System.out.println("Enter the break point");
		break_Point = s.nextInt();
		
		for (int i = start; i <= break_Point; i++) {
			if (i == break_Point) {
				break;
				
			} else {
				System.out.println(i);

			}
			
		}
	}
		
	}


