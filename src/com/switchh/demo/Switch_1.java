package com.switchh.demo;

public class Switch_1 {
	public static void main(String[] args) {
		
	int a = 3;
	System.out.println("before switch");
	
	switch (a) {
	case 3:
		System.out.println("inside three");
		//break;
		
	case 4:
		System.out.println("inside four");
		break;
		
	case 5:
		System.out.println("inside five");
		break;

	default:
		break;
	}
	System.out.println("After switch");
		
	}

}
