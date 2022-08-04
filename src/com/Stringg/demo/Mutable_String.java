package com.Stringg.demo;

public class Mutable_String {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Anurag");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		StringBuffer buffer1 = new StringBuffer("Anurag");
		System.out.println(buffer1);
		System.out.println(System.identityHashCode(buffer1));
		
		System.out.println("after append");
		buffer = buffer.append(buffer1);
		System.out.println(buffer);
		
		System.out.println(System.identityHashCode(buffer));
		
	}

}
