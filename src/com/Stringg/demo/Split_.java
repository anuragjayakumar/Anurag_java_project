package com.Stringg.demo;

public class Split_ {
	public static void main(String[] args) {
		String s = "happy bithday to me ";
		  String[] split = s.split(" ");
		  
		  for (int i = 0; i < split.length; i++) {
			  System.out.println(split[i]);
			
		}
		  
		  for (String value : split) {
			  System.out.println(value);
			
		}
	
	}
}
