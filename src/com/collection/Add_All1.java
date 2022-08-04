package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Add_All1 {
	public static void main(String[] args) {
	List<Integer> li1 = new ArrayList<Integer>();
	li1.add(1);
	li1.add(3);
	li1.add(4);
	li1.add(9);
	
	List <Integer> li2= new ArrayList <Integer> ();
	li2.add(11);
	li2.add(12);
	li2.add(13);
	li2.add(14);
	li2.add(15);
	
    li2.addAll(li1);
    System.out.println(li1);
    System.out.println(li2);
    
}

}


