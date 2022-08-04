package com.buffermode.demo;

public class String_Buffer_Method {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Vikram");
		System.out.println("After append :"+ buffer.append("Kaithi2"));
		System.out.println("After insert :"+ buffer.insert(6, "Rolex"));
		System.out.println("After delete :"+buffer.delete(0, 6));
		System.out.println("After Replace :"+ buffer.reverse());
		
		
	}

}
