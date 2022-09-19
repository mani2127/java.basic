package org.abstraction;

public class Fully1 implements Fully{
	
	@Override
	public void fixed() {
		System.out.println("4.2%");
	}
	
	@Override
	public void loan() {
		System.out.println("10%");
	}
	
	@Override
	public void savings() {
		System.out.println("2%");
	}
	
	public static void main(String[] args) {
		
		Fully1 f=new Fully1();
		f.fixed();
		f.loan();
		f.savings();
	}

}
