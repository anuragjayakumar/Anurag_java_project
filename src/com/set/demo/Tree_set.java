package com.set.demo;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
	public static void main(String[] args) {
		Set<Object> s = new TreeSet<Object>();
		s.add(1);
		s.add(null);
		s.add("smith");
		s.add(1);
		s.add(null);
		System.out.println(s);
		
	}

}
