package org.collection;

import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		TreeSet<Integer> s = new TreeSet<Integer>();
	
		//linkedhashset - insertion order
	    //hashset - random order
		//treeset - ascending order
		
		s.add(50);
		s.add(60);
		s.add(30);
		s.add(40);
		s.add(20);
		s.add(10);
		
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
		s.remove(40);
		System.out.println(s);
		
		for (Integer x : s) {
			System.out.println(x);
		}
		
	}
}
