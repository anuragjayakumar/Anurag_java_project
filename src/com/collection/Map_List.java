package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_List {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "john");
		map.put(2, "steven");
		map.put(3, "smith");
		map.put(null, "watson");
		map.put(null, "hayden");
		map.put(2, "starc");
		map.put(49, "smith");
		map.put(36, null);
		map.put(63, null);
		System.out.println(map);
//size		
		int size = map.size();
		System.out.println("size:" + size);
		int index = size - 1;
		System.out.println("index:" + index);

// contains key	
		boolean key = map.containsKey(36);
		System.out.println("36 is present :" + key);

// contains value 
		boolean value = map.containsValue("steven");
		System.out.println("steven  is present:" + value);
// is empty
		boolean empty = map.isEmpty();
		System.out.println("map is empty or not :" + empty);

// get
		String string = map.get(49);
		System.out.println("1 value :" + string);

// get unknown
		String strin = map.get(10);
		System.out.println("10 value :" + strin);
//key set
		Set<Integer> keyset = map.keySet();
		System.out.println("keys:" + keyset);
		for (Integer i : keyset) {
			System.out.println(i);
		}
//values
		Collection<String> v = map.values();
		System.out.println("values:" + v);
		for (String values : v) {
			System.out.println(values);

		}
//entry set
		Set<Entry<Integer, String>> entryset = map.entrySet();
		System.out.println("entryset:" + entryset);
		for (Entry<Integer, String> entry : entryset) {
			System.out.println(entry);
			
		}

	}
}
