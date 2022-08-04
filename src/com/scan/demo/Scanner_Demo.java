package com.scan.demo;

import java.util.Scanner;

public class Scanner_Demo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter your Name ");
		String name = s.next();
		System.out.println("please enter your age ");
		byte age = s.nextByte();
		System.out.println("please enter your initial");
		int initial = s.nextInt();
		System.out.println("please enter your D O B year");
		short year = s.nextShort();
		System.out.println("please enter your roll number");
		short rollnumber = s.nextShort();
		System.out.println("please enter your percentage");
		double percentage = s.nextDouble();
		
		
	}

}
