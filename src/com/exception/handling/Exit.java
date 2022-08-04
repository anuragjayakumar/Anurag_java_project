package com.exception.handling;

public class Exit {
	public static void main(String[] args)throws InterruptedException {
		System.out.println("A");
		Thread.sleep(2000);
		System.out.println("B");
		System.exit(0);
		System.out.println("C");
		
	}

}
