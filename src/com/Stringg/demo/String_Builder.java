package com.Stringg.demo;

public class String_Builder {
	public static void main(String[] args) {
		StringBuilder bulider = new StringBuilder("Anurag");
		System.out.println(bulider);
		System.out.println(System.identityHashCode(bulider));
		
		StringBuilder bulider1 = new StringBuilder("Anurag");
		System.out.println(bulider1);
		System.out.println(System.identityHashCode(bulider1));
		
		System.out.println("After append");
		bulider = bulider.append(bulider1);
		System.out.println(bulider);
		System.out.println(System.identityHashCode(bulider));
		
	}

}
