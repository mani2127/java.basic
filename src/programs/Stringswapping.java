package programs;

public class Stringswapping {
	
	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping a:"+a);
		System.out.println("Before swapping b:"+b);
		
		a= a+b;  //a=Hello+world=>Helloworld(String append)
		b=a.substring(0,a.length()-b.length());  //b=Hello
		a=a.substring(b.length());  //a=world
		
		System.out.println("After swapping a:"+a);
		System.out.println("After swapping b:"+b);
		
		
	}

}
