package com.arrayyy.demo;


public class Array_Demo5 {
	public static void main(String[] args) {
		int a [ ] = {1,3,2,6,8};
		System.out.println("length :"+ a.length);
		
		int index = a.length-1;
		System.out.println("Index : "+ index);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i : a) {
			System.out.println(i);
			
		}
			
		}

}
