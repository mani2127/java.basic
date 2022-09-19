package org.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
	
	public static void main(String[] args) {
		
	   ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		System.out.println(li);
		
		int si = li.size();
		System.out.println(si);
		
		
		li.add(70);
		System.out.println(li);
		
		li.add(4, 80);
		System.out.println(li);
		
		li.remove(4);
		System.out.println(li);
		
		
		for (Integer x : li) {
			System.out.println(x);
			
		}
		
		boolean b = li.isEmpty();
		System.out.println(b);
		
		Integer i = li.get(4);
		System.out.println(i);
		
		int i1 = li.lastIndexOf(60);
		System.out.println(i1);
		
		int i2 = li.indexOf(40);
		System.out.println(i2);
		
		LinkedList<Integer> s = new LinkedList<Integer>();
		
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(100);
		s.add(40);
		
		System.out.println(s);
		
		s.retainAll(li);
		System.out.println(s);
		
		s.removeAll(li);
		System.out.println(s);
		
	}

}
