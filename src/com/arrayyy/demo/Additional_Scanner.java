package com.arrayyy.demo;

import java.util.Scanner;

public class Additional_Scanner {
	public static int start, end ;
	public static int sum_Odd;
	public static int sum_Even;
			
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("start");
		start = s.nextInt();
		System.out.println("end");
		end = s.nextInt();
		
		for (int i = start; i <= end; i++) {
			if (i%2==0) {
				sum_Even = sum_Even+i;
			}
			if (i%2!=0) {
				sum_Odd=sum_Odd+i;
				
			} else {
				System.out.println();

			}
			
			
		}System.out.println("sum of even number :"+ sum_Even);
		System.out.println("sum of odd number :" + sum_Odd);
			
		
		
	}

}
