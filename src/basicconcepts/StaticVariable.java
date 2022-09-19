package basicconcepts;

public class StaticVariable {

	int x=1;
	static int y=1;
	
	public void sample() {
		
		x++;
		y++;
		System.out.println("nonstatic=>"+x +"static=>"+y);	
	}

	public static void main(String[] args) {
		
		StaticVariable s = new StaticVariable();
		s.sample();
		s.sample();
		System.out.println("again object created");
		StaticVariable s1 = new StaticVariable();
		s1.sample();
		s1.sample();
		System.out.println("again object created");
		StaticVariable s2 = new StaticVariable();
		s2.sample();
		s2.sample();
	}
}

//since instance variable will initialize from start 
//but static variable stored the last value and continue from stored value