package com.ifelse.demo;
public class Result {
	public static String registar_Number = "7079219";
	public static String date_of_birth = "18/11/1999";
	public static int tamil = 60;
	public static int english = 70;
	public static int science = 95;
public static void main(String[] args) {
		if (registar_Number == "57687908096" && date_of_birth == "21/4/2022") {
			System.out.println("given details are incorrect");
		} else if (registar_Number == "7079219" && date_of_birth == "18/11/1999") {
			System.out.println("student portal");
		}
		if (tamil <= 40) {
			System.out.println("tamil : fail");
		} else if (tamil >= 40) {
			System.out.println("tamil : pass");
		}
		if (english <= 40) {
			System.out.println("english : fail ");

		}else if (english >= 40) {
			System.out.println("english : pass");	
		} 
		if (science <= 40) {
			System.out.println("science : fail");
		}
		else if (science >= 40) {
			System.out.println("science : pass");
		}
		else {
			System.out.println("error");
		}

	}

}
