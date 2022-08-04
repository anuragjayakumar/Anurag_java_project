package com.Stringg.demo;

public class Immutable_String {
	public static void main(String[] args) {
		String s = "anurag";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		String s1 = "anurag";
		System.out.println(s);
		System.out.println(System.identityHashCode(s1));
		
		String s2 = "harihant";
		System.out.println(s);
		System.out.println(System.identityHashCode(s2));
		
		
	}

}
