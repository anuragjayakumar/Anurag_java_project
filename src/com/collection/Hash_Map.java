package com.collection;

import java.util.*;

public class Hash_Map {
	public static void main(String[] args) {
		Map<String, Character> map = new HashMap<String,Character>();
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
