package basicconcepts;

import java.io.File;
import java.io.IOException;

public class ThrowsandThrow {
	
	public void sample1() throws IOException {
		
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\javaconcepts");
		boolean file = f.createNewFile();
		System.out.println(file);
	}

	public void sample() {
		
		int age = 23;
		int after = age + 5;
		
		if (after<18) {
			throw new ArithmeticException("person is not eligibel since age is below 18");
		}
		else {
			System.out.println("person is eligible");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ThrowsandThrow th = new ThrowsandThrow();
		th.sample1();
		th.sample();

	}
}
