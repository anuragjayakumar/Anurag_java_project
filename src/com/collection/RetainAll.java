package com.collection;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {
	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(1);
		li1.add(3);
		li1.add(4);
		li1.add(9);
		
		List <Integer> li2= new ArrayList <Integer> ();
		li2.add(1);
		li2.add(13);
		li2.add(4);
		li2.add(15);
		
		li1.addAll (li2);
		li1.retainAll(li2);
		System.out.println("after retain all :"+li1);
		System.out.println("after retain list 2 :"+ li2);
		
	}

}
