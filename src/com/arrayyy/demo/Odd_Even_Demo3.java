package com.arrayyy.demo;

public class Odd_Even_Demo3 {
	public static void main(String[] args) {
		int sum_odd = 0;
		int sum_even = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum_even = sum_even + i;


			}
			else if (i% 2!= 0) {
				sum_odd = sum_odd + i;
				
			}
		}
		System.out.println("sum of even value :"+sum_even);
		System.out.println("sum of odd value  : "+ sum_odd);
	}
}