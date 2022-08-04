package com.Stringg.demo;

public class ReplaceAll_demo {
	public static void main(String[]args){
	    String s = "Anurag%jayakumar$46";
	   s = s.replaceAll("[^A-Z0-9]"," ");
	    System.out.println(s);
	    

	}

}
