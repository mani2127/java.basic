package org.abstraction;

public abstract class Partial {
	
	//abstractmethod
	public abstract void savingsaccount();
	
	public abstract void loanaccount();
	
	//non-abstractmethod
	public void fixedaccount() {
		
		System.out.println("4.2%");
		
	}

	

}


//partial abstraction contains both abstract and non abstract method
//abstract class level
//uses keyword "extends" to call the parent class