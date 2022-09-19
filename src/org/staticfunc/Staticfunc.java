package org.staticfunc;

public class Staticfunc {

	int a=10;
	static int b = 20;
	
	public void sample() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void sample1() {
		System.out.println(b);
		//System.out.println(a); // not possible since it is instance variable
	}

	public static void main(String[] args) {
		
		Staticfunc s = new Staticfunc();
		s.sample();
		sample1();
		
	}
}


//1.oru normal method kulla both static and non static variable ah declare panna mudiyum
//2. but oru static method kulla only static variable mattum tan declare panna mudiyum
//3.normal method ah object creation panni reference variable vachu object call pannanum
//4. but static method direct ah method name vache object call panna mudiyum
//5. vera class la static method ah call pannanum na classname.methodname vache object call pannalam