package com.buffermode.demo;

public class Why_string_immutable {
	public static void main(String[] args) {
		String s = "Vikram";
		System.out.println(s.concat("kaithi2"));
		System.out.println(s);
		
		StringBuffer buffer = new StringBuffer("Rolex");
		System.out.println(buffer.append(" santhanam"));
		
		StringBuffer name = buffer.append("santhanam ");
		System.out.println(name);
		System.out.println(buffer.append(" anbu"));
		System.out.println(buffer);
		
		
		
		
	}

}
