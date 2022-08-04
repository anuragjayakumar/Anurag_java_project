package com.ifelse.demo;

public class Instagram {
	public static String username = "anurag";
	public static String password = "12345678";
	public static String email = "anuragjayakumar1999@gmail.com";
	public static String forgot_Password = "enter your email";
	public static String new_password = "9551722816";
	public static String conform_password = "9551722816";

	public static void main(String[] args) {
		if (username == "anuragjaya"&& password == "7888676") {
			System.out.println("the user nmae you entered does not belong to an accountplease check your username and try again");
		}
			else if (forgot_Password == "enter your email"&& email == "anuragjayakumar1999@gmail.com" ) {
				System.out.println("email sent click the link to get back into your account");
				
			}
			if (new_password == "9551722816"&& conform_password == "9551722816" ) {
				System.out.println("welcome to instagram");
				
			} else {
				System.out.println("invalued link");

			}
			
		}
		
	}

