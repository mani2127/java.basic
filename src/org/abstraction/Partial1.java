package org.abstraction;

public class Partial1 extends Partial{
	
	@Override
	public void savingsaccount() {
		System.out.println("2%");
	}
	
	@Override
	public void loanaccount() {
		System.out.println("3%");
	}
	
	public static void main(String[] args) {
		
		Partial1 p = new Partial1();
		p.savingsaccount();
		p.loanaccount();
		p.fixedaccount();
	}

}
