package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Method1 {
	public static void main(String[] args) {
		List<Object> li = new ArrayList<>();
		
		li.add("starc");
		li.add(23);
		li.add(true);
		li.add(23.45f);
		li.add(null);
		li.add(23);
		li.add(null);
		System.out.println(li);
//size		
		
		int  size = li.size();	
		System.out.println("size :"+ size);
//index
		int index = size - 1;
		System.out.println("inside :" + index);
		
//index of
		 int indexof = li.indexOf(23);
		System.out.println("index of : "+ indexof);
		
//last index
		 int lastindex = li.lastIndexOf(null);
		 System.out.println("lastindex:"+lastindex);
		 
//contains
		   boolean flag = li.contains(23.45f);
		   System.out.println("contain :"+ flag);

//get
		    Object get = li.get(1);
		    System.out.println("first index value :"+ get);
		    
// unknown value get
		    Object object  = li.get(67);
		    System.out.println("first index value :"+ get);
		   
		 
		 
		

		
		
		
		
	}

}
