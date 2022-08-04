package com.collection;

import java.util.*;

public class Linkedhashmap_ {
	public static void main(String[] args) {
		Map<String, Character> map = new LinkedHashMap<String,Character>();
		map.put("steven", 'p');
		map.put(null, 's');
		map.put(null, 'z');
		map.put("smith", null);
		map.put("watson", null);
		map.put("steven", 'p');
		map.put("john", 's');
		System.out.println(map);
		
	}

}
