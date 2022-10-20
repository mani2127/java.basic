package org.arrays;

import java.util.Arrays;

public class ArraysUsingInt {
	
	public static void main(String[] args) {
		
		int a[] = new int[] {100,200,300,400};
		
		int min = a[0];
		
		int second = a[1];
		
		int third = a[2];
		
		System.out.println(a[2]);  //1. to print the particular index of the array
		
		int le =a.length;
		System.out.println(le);   //2. to print the length of the total array
		
		System.out.println(Arrays.toString(a));  //3. to print the all datas of array in [] horizontal format
		
		System.out.println("normal for loop");     //i=0 i<4 a[0] i=>0+1=1    //4. to print all datas of array in vertical format
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		             //or
		System.out.println("Enhanced for loop");
		for(int x:a) {
			System.out.println(x);
		}
		
		System.out.println("Smallest number");
		for (int i = 3; i < a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
				System.out.println(min);
			
		}
	
		System.out.println("Largest number");
		for (int i =3 ; i < a.length; i++) {
			if(a[i]>min) {
				
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Second lowest number");
		for (int i = 0; i < a.length; i++) {
		if(a[i]<second) {
			System.out.println(second);
		}	
		}
		
		System.out.println("Third lowest number");
		for (int i = 1; i < a.length; i++) {
			if(a[i]<third) {
				System.out.println(third);
			}
		}
	}


	

}
