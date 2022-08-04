package com.arrayyy.demo;
//write a program to print a leap year from 2000 to 2030 
import java.util.Scanner ;

public class Odd_Even_Task2_Scanner {
	public static int start,end;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter start");
		start = s.nextInt();
		System.out.println("enter end ");
		end = s.nextInt();
		
		for(int i = start; i<=end;i++) {
			if (i%4==0 && i%100!=0) {
				System.out.println("Leap year :"+ i);
				
			}
		}
		
	}

}
