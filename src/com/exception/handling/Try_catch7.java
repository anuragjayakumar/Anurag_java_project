package com.exception.handling;

public class Try_catch7 {
	public static void main(String[] args) {
		int a = 10;
		try {
			System.out.println(a/0);
			
			
		} catch (NullPointerException e) {
			System.out.println("NullPointException handled");
		}
		catch (Exception f) {
			System.out.println("Exception handler");
		}
		
	}

}
