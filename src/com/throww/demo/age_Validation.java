package com.throww.demo;

public class age_Validation {
	public static int age= 16;
	
	public static void age_validation() throws My_Exception {
		if (age >= 18 ){
			System.out.println("eligiable for vote");
			
		} else {
			 throw new My_Exception("invalid age ");
		}
			
			System.out.println("welcome page");
			System.out.println("news feed");
			
	

		}
		public static void main(String[] args) throws My_Exception {
			age_validation();
			
		}
	

	
		
	}
		
	


