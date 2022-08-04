package com.variable.com;

public class Local_Variable {
	public void m1() {
		int a = 45;
		a = 675;
		System.out.println(a);
		
	}
	private void m2() {
		int a = 25;
				System.out.println(a);

	}
	public static void main(String[] args) {
		Local_Variable method = new Local_Variable();
		method .m1();
		method .m2();
		
	}

}
