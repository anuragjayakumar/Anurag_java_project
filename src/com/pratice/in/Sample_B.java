package com.pratice.in;

public class Sample_B extends Sample_A {
	int a = 1111;
	
	private void add() {
		System.out.println("parent variable:" + super.a);
		System.out.println("current variable:"+ this.a);
		

	}
	public static void main(String[] args) {
		Sample_B b = new Sample_B();
		b.add();
		
		
		
		
	}


}
