package com.set.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_hashse {
	public static void main(String[] args) {
		Set<Object> s = new LinkedHashSet<Object>();
		s.add(1);
		s.add(null);
		s.add("smith");
		s.add(1);
		s.add(null);
		System.out.println(s);
	}

}
