package com.arrayyy.demo;

import java.util.Scanner;

//factorial 5

public class Factorial_Scanner {
	public static int start, end ;
	public static int value = 1;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter start");
		start = s.nextInt();
		
		System.out.println("enter end");
		end = s.nextInt();
		for (int i = start; i >= end; i--) {
			value = value*i;
			
			
			
		}
		System.out.println(value);
		
		
	}
	

}
