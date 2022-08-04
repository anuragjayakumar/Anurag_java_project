package com.pratice.in;

import com.pratice.demo.Method_3;

public class Keyword_Task {
	public final short a = 10;
	private final short b = 20;
	protected final short c = 30;
	final short d = 40;

	private final void student_Name() {
		System.out.println("Student name : Anurag");

	}

	public void student_Age() {
		System.out.println("student age : 22");

	}

	final void student_Gender() {
		System.out.println("student gender : Male ");

	}

	protected void student_Percentage() {
		System.out.println("student percentage : 70%");

	}

	public static void main(String[] args) {
		Keyword_Task task = new Keyword_Task();
		task.student_Name();
		task.student_Age();
		task.student_Gender();
		task.student_Percentage();

		System.out.println(task.a);
		System.out.println(task.b);
		System.out.println(task.c);
		System.out.println(task.d);

		Method_3 meth = new Method_3();
				meth.staff_Name();
				System.out.println(meth.age);
				
				Method_2 method = new  Method_2();
				method.patient_Name();
				method.patient_Treatment();


	}
}
