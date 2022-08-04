package com.ifelse.demo;

import java.util.Scanner;

public class Ifelse_Scanner_Demo {
	public static String username;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		if (username == "null") {
			System.out.println("please enter your age ");
			byte age = s.nextByte();
		}
		else {
			System.out.println("inside else");
		}
		
	}
	

}
