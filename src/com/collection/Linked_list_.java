package com.collection;
import java.util.LinkedList;
public class Linked_list_ {
	public static void main(String[] args) {
		LinkedList<Integer> linked = new LinkedList<Integer>();
		linked.add(10);
		linked.add(23);
		linked.add(null);
		linked.add(34);
		linked.add(45);
		linked.add(10);
		linked.add(23);
		linked.addAll(linked);
		System.out.println(linked);	
int size =  linked.size();
		System.out.println("size:"+ size);
int indexof = linked.indexOf(34);
		System.out.println("index of "+ indexof);
int lastindex = linked.lastIndexOf(10);
		System.out.println();
linked.clone();
		System.out.println("after clone :"+ linked);
linked.clear(); 
        System.out.println("after clear: "+ linked );
boolean contains = linked.contains(10);
         System.out.println("45 is there are not :"+ contains);
boolean containsall = linked.containsAll(linked);
         System.out.println(containsall);
 Integer getfirst = linked.getFirst();   
 System.out.println(getfirst);
         
         
		     
		     
		     
		
		
		
		
	}

}
