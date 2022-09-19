package basicconcepts;

public class Localandinstancevariable {

	int c= 30;//global or instance variable
	
	void addition(int a, int b) {  //local variable
		System.out.println(a+b+this.c);
	}
	
	public static void main(String[] args) {
	
		Localandinstancevariable lp=new Localandinstancevariable();
		lp.addition(10, 20);
	}
}

