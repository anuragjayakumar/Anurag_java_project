package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Remove_demo {
	
	public static void main(String[] args) {
	List<Integer> li1 = new ArrayList<Integer>();
	li1.add(1);
	li1.add(3);
	li1.add(4);
	li1.add(9);
	
	li1.remove(2);
	System.out.println("2th index remove :"+li1);
	
	

}
}
