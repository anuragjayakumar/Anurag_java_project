package com.constractor2.demo;


public class Abc extends Bcd {
	public Abc() {
		//super
		System.out.println("child constractor");

	}
	public  void Demo1() {
		System.out.println("demo1");

	}
	public void demo2() {
		System.out.println("demo2");

	}

	public static void main(String[] args) {
		new Abc().Demo1();
		new Abc().demo2();

	}

}
