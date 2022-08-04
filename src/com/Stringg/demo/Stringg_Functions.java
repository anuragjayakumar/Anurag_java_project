package com.Stringg.demo;

public class Stringg_Functions {
	public static void main(String[] args) {
		String s = "welcome to string";

		int length = s.length();
		System.out.println("length :" + length);

		int index = length - 1;
		System.out.println("index :" + index);

		boolean flag_Equals = s.equals("Welcome To String");
		System.out.println("equal or not :" + flag_Equals);

		boolean ignorecase = s.equalsIgnoreCase("Welcome To String");
		System.out.println("equal ignore case :" + ignorecase);

		String uppercase = s.toUpperCase();
		System.out.println("uppercase:" + uppercase);

		String lowercase = s.toLowerCase();
		System.out.println("lowercase:" + lowercase);

		// pass the unknown index and return the char
		char particular_character = s.charAt(5);
		System.out.println("fifth index character :" + particular_character);

		// pass the unknown index and return Stringindexoutofbounds
		// char value =s.charAt(56);
		// System.out.println("56th character :"+ value);

		int indexOf = s.indexOf("e");
		System.out.println("e index :" + indexOf);

		// if we pass the unknown character and it return the value as -1
		int index_Z = s.indexOf("z");
		System.out.println("index z :" + index_Z);

		// if we pass character it return last occurence index
		int LastIndexOf = s.lastIndexOf("e");
		System.out.println("e last index :" + LastIndexOf);

		// pass the unknown character and it return value as -1

		int z_LastTndex = s.lastIndexOf("z");
		System.out.println("z last index :" + z_LastTndex);

		// contains
		boolean contains = s.contains("n");
		System.out.println("n is present or not :" + contains);

		// startsWith
		boolean starstWith = s.startsWith("wel");
		System.out.println("startswith: " + starstWith);

		//endsWith
		boolean endsWith= s.endsWith("g");
		System.out.println("Ends with :"+ endsWith);
		
//trim   it will remove unwanted space from string
		String abc = "                 steven smith 56                ";
		abc = abc.trim();
		System.out.println(abc);
		
//replace 
		     s =s.replace("e", "#");
		     System.out.println("Ater replace :"+ s);
		
//concat
		    s = s.concat("array");
		    System.out.println("After concat :"+ s);
		    
//substring
		  String substring_begin  = s.substring(8);
		  System.out.println("by using begin index :"+ substring_begin);
		  
		   String substring = s.substring(13, 17);
		   System.out.println("by using both :"+ substring);
		   
//join
		   String join = s.join("-","18","nov","1999");	  
		   System.out.println("using join :"+ join);
		
		
		
		
		
		
		     
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
