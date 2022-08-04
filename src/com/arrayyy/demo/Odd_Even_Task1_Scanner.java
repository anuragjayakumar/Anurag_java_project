package com.arrayyy.demo;
//write a program to all the odd number and even number from 366to 396

import java.util.Scanner;

public class Odd_Even_Task1_Scanner {
	public static int start,end;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter starting number");
		start = s.nextInt();
		System.out.println("enter end number ");
		end = s.nextInt();
		
		for (int i = start; i <= end; i++) {
			if (i%2==0) {
				System.out.println("even number :"+ i);
				
			}
			else if (i%2!=0) {
				System.out.println("odd number :"+ i);
				
			}
			else {System.out.println("invalued");
				
			}
			
		}
		
		
		
		
	}

}
