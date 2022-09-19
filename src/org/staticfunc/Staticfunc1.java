package org.staticfunc;

public class Staticfunc1 {
	
	public void example() {
		System.out.println("dummy");
	}

	public static void main(String[] args) {
		Staticfunc1 l = new Staticfunc1();
		l.example();
		Staticfunc.sample1();
	}
}
