package com.Stringg.demo;


public class Split_Demo2 {
	public static void main(String[] args) {
		String s = "suriya act has rolex character in vikram movie";
		  String[] split = s.split ("");
		  for (int i = 0; i < split.length; i++) {
			  System.out.println(split[i]);
			  
			
		}
		for (String value : split) {
			System.out.println(value);
			
		}
	}

}
