package org.arrays;

import java.util.Arrays;

public class ArraysUsingInt {
	
	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		
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
	}


	

}
