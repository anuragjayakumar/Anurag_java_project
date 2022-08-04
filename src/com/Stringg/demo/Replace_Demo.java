package com.Stringg.demo;

public class Replace_Demo {
	public static void main(String[] args) {
		String s = "     Anurag%jayakumar$46      ";
		s =s.replaceAll("[^a-zA-z0-9]","");
		System.out.println(s);
		
	}

}
