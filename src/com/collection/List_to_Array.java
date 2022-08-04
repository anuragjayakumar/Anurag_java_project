package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_to_Array {
	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(1);
		li1.add(3);
		li1.add(9);
		System.out.println(li1);
		
		Object[] Array = li1.toArray();
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
			
		}

	}

}
