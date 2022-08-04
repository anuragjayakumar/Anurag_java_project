package com.constractor.demo;

public class Parametrized_Demo2 {
	public Parametrized_Demo2() {
		 System.out.println("non parameterized");
		 
	 }
	public  Parametrized_Demo2(int a){
		System.out.println("parameterized:"+ a);
	}
	public static void main(String[] args) {
		new parameterized1();
		new parameterized1(12);
		

}
}
