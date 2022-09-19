package org.constructor;

public class ConstructorChaining {

	public ConstructorChaining() {
		this("manikandan");
	System.out.println("default constructor");	
	}
	
	public ConstructorChaining(String name) {
		System.out.println(name);
		
		
	}
	
	public ConstructorChaining(float height, long phoneno) {
		System.out.println(height);
		System.out.println(phoneno);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorChaining c = new ConstructorChaining();
		ConstructorChaining c1 = new ConstructorChaining(165.5f, 7373318402l);
		
	}
}
