package com.breakk.continuee;
//iterate the number from 1 to 50 are print all the numbers except 12 and 21

import java.util.Scanner;

public class Scanner_Bc2 {
	public static Scanner s = new Scanner(System.in);
	public static int start, end, break_Point;

	public static void main(String[] args) {
		System.out.println("enter the starting point ");
		start = s.nextInt();

		System.out.println("enter the end point ");
		end = s.nextInt();

		System.out.println("enter the breakpoint");
		break_Point = s.nextInt();

		for (int i = start; i <= end; i++) {
			if (i == 12) {
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
