package com.constractor.demo;

public class parameterized1 {
	 public  parameterized1() {
		 System.out.println("non parameterized");
		 
	 }
	public  parameterized1 (int a){
		System.out.println("parameterized:"+ a);
	}
	public static void main(String[] args) {
		parameterized1 t = new parameterized1();
		parameterized1 a = new parameterized1(12);
		

		
	}


	}
	

