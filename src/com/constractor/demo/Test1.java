package com.constractor.demo;

public class Test1 {
	public Test1() {
		System.out.println("non parameterized");
		
	}
	private void abc() {
		System.out.println("abc");

	}
	private void bcd() {
		System.out.println("bcd");

	}
	public static void main(String[] args) {
	Test1 t = new Test1();
	t.abc();
	t.bcd();
	
	
		
	}
	

}
