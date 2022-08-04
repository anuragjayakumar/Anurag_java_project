package com.Stringg.demo;

public class Split_Demo {
	public static void main(String[]args) {
		String s = "welcome to string";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			
		}
		System.out.println("by the each loop");
		for (String value  : split) {
			System.out.println(value);
			
		}
		
	}

}
