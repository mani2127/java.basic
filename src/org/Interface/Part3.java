package org.Interface;

public class Part3 implements Part1,Part2 {
	
	@Override
	public void test1() {
		System.out.println("test1");
	}
	
	@Override
	public void test2() {
		System.out.println("test2");
	}
	
	@Override
	public void test3() {
		System.out.println("test3");
	}
	
	@Override
	public void test4() {
		System.out.println("test4");
	}
	
	public static void main(String[] args) {
		
		Part3 p = new Part3();
		p.test1();
		p.test2();
		p.test3();
		p.test4();
	}

}
