package com.opps.demo;

public class Student_Data {
	private void student_Name() {
		System.out.println("Student name : Anurag");

	}
	public void student_Age() {
		System.out.println("student age : 24");

	}
	protected void Student_Phonenumber() {
		System.out.println("student phone number : 9551722816");

	}
	 void student_Gender() {
		System.out.println("student gender : male ");

	}
	public static void main(String[] args) {
		Student_Data data = new Student_Data();
		data.student_Age();
		data.student_Gender();
		data.student_Name();
		data.Student_Phonenumber();
		
	}

}
