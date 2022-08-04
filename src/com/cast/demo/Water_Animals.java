package com.cast.demo;

public class Water_Animals extends Forest{
	public void sea_King() {
		System.out.println("blue whale");

	}
	@Override
	public void forest_Animals() {
System.out.println("tiger");
		super.forest_Animals();
	}
	public static void main(String[] args) {
		Forest f = new Water_Animals();
		f.forest_Animals();
		
		
	}
	


	}

