package com.breakk.continuee;
//iterate the number between  90 to 99 an d print the number except 96

import java.util.Scanner;

public class Scanner_bc_demo2 {
	public static Scanner s = new Scanner(System.in);
	public static int start,end,break_Point;
	public static void main(String[] args) {
		
		System.out.println("Enter your starting point");
		start = s.nextInt();
		
		System.out.println("Enter your ending point");
		end = s.nextInt();
		
		System.out.println("Enter your Break point ");
		break_Point = s.nextInt();
		
		for (int i = start; i <= end; i++) {
			if (i == 96) {
				continue;
				
			} else {
				System.out.println(i);

			}
			
		}
		
		
		
		
		
	}
	

}
