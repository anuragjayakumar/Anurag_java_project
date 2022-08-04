package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_array_object {
	public static void main(String[] args) {
		List<Object> li1 = new ArrayList<Object>();
		li1.add("Starc");
		li1.add(true);
		li1.add("smith");
		System.out.println(li1); 
		
		
		
		
		 Object[] array  = li1.toArray();
		 for (int i = 0; i < array.length; i++) {
			 System.out.println(array[i]);
			
		}
		 System.out.println("length:"+array.length);
		 
			
		
			
	}

}
