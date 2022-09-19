package org.constructor;

public class Cons {

	int x;
	float s;
	long v;
	String name;
	char a;
	int b;
	int c;
	
	public Cons() {
		this.x = 10;
		this.s = 10.10f;
		this.v = 10526426545l;
		this.name = "manikandan";
		this.a = 'a';
		System.out.println(x);
		System.out.println(s);
		System.out.println(v);
		System.out.println(name);
		System.out.println(a);
		this.b = 15;
		this.c = 20;
		int d = 30;
		System.out.println(b+c+d);
	}
	
	public Cons(int id) {
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		
		Cons c = new Cons();
		Cons c1 = new Cons(14);
	}
	
	
}
