package com.repetative.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_ {
	public static void main(String[] args) {
		
	
	String s = ("for the people by the people of the people");
	 String[] words = s.split(s);
	 Map<String, Integer> map = new LinkedHashMap<>();
	 
	 for (String word : words) {
		 
		 if (map.containsKey(word)) {
			  Integer value = map.get(word);
			  map.put(word, value+ 1);
		}
		else {
			map.put(word, +1);
			
		}
	}
	  Set<Entry<String, Integer>> entryset = map.entrySet();
	  for (Entry<String, Integer> entry : entryset) {
		  if(entry.getValue()>1)
		  {
			  System.out.println(entry);
		  }
		
	}
	 
	 

	


}
}