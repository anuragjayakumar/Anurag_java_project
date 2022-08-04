package com.ifelse.demo;

import java.util.Scanner;

public class Youtube {
	public static String name;
	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		System.out.println("Enter your name ");
		name = s.next();
		
		if (name .equals("Anurag")) {
			System.out.println("correct");
			
		} else {
			System.out.println("incorrect");

		}
		
		
		
	}


}
