package basicconcepts;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println(name);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("Enter your ph num");
		long phnum = sc.nextLong();
		System.out.println(phnum);
		
		System.out.println("Enter marital status");
		boolean married = sc.nextBoolean();
		System.out.println(married);
		
		sc.close();
		
	}

}
