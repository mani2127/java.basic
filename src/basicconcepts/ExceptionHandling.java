package basicconcepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		try {
			int age = sc.nextInt();
			System.out.println(age);	
		}
		catch (InputMismatchException e) {
			e.getMessage();
		}
		
		System.out.println("Enter your height");
	
			float height = sc.nextFloat();
			System.out.println(height);	
		
			sc.close();
	}

}
