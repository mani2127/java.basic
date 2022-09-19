package org.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer , String>();
		
		m.put(10, "java");
		m.put(20, "selenium");
		m.put(30, "sql");
		m.put(40, "manual");
		m.put(50, "api");
		m.put(60, "git");
		
		System.out.println(m);
		
		int s = m.size();
		System.out.println(s);
		
		boolean b = m.containsKey(30);
		System.out.println(b);
		
		boolean b1 = m.containsValue("sql");
		System.out.println(b1);
		
		String s1 = m.get(30);
		System.out.println(s1);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		for (String x : values) {
			System.out.println(x);
			
		}
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		for (Integer x : keySet) {
			System.out.println(x);
		}
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> x : entrySet) {
			System.out.println(x);
			
		}
		
	  for (Entry<Integer, String> x : entrySet) {
			
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
		}
	  
		for (Entry<Integer, String> x : entrySet) {
		    if (x.getValue().equals("java")) {
		    	System.out.println(x.getKey());
			}
			
		}
	}
}
