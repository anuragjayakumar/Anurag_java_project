package com.collection;


public class Reverse_ {
	public static void main(String[] args) {
		String a = "Python";
		String reverse = " ";
		
		//for (int i = a.length()-1; i>0 ; i--) {
			//reverse = reverse + a.charAt(i);
			//System.out.println(reverse);
			
			for (int i= a.length()-1; i>=0 ; i--) {
				reverse = reverse + a.charAt(i);
				
			}
			System.out.println(reverse);
			
		}

		
	}


