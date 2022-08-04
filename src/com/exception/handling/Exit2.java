package com.exception.handling;

public class Exit2 {
	public static void main(String[] args)throws InterruptedException {
		System.out.println("A");
		System.exit(0);
		Thread.sleep(2000);
		System.out.println("B");
		System.out.println("C");
		
	}


}
