package com.pratice.in;

public class Task {
	public  int task_1(int age) {
		System.out.println("student age :" + age);
		return age;
	}
	private String task_1(String name ) {
		System.out.println("student name :" + name);
		return name;

	}
	public  char task_1(String name ,char initial) {
		System.out.println("student name"+ name);
		System.out.println("student initial" + initial);
	
		return initial;


	}
	public static void main(String[] args) {
		Task t = new Task();
		t.task_1(24);
		t.task_1("anurag");
		t.task_1("anurag",'a');
		
		
		
		
	}

}
