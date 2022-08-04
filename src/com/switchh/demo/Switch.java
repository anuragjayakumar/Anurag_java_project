package com.switchh.demo;

public class Switch {
	public static void main(String[] args) {
		
	int a = 5;
			System.out.println("before switch");
			
		switch (a) {
		case 3:
			System.out.println("inside 3");
			
			break;
		case 4:
			System.out.println("inside 4");
			break;
			
		case  5:
			System.out.println("inside 5");
			break;

		default:
			break;
		}
		System.out.println("after switch");
		
	}

}
