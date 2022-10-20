package programs;

public class Integerswapping {
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping a:"+a);
		System.out.println("Before swapping b:"+b);
		
		a= a+b; //a=10+20=>30;
		b=a-b;  //b=30-20=>10;
		a=a-b;  //a=30-10=>20;
		
		System.out.println("After swapping a:"+a);
		System.out.println("After swapping b:"+b);

		
	}
	
	
}
