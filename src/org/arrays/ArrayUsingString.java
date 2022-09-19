package org.arrays;

import java.util.Arrays;

public class ArrayUsingString {

	public static void main(String[] args) {
		
		String s[] = {"Apple", "Banana", "orange", "Pineapple", "Watermelon"};
		
		System.out.println(s[2]);         //1. to print the particular index of the array
		
		int le = s.length;
		System.out.println(le);           //2. to print the length of the total array
		
		System.out.println(Arrays.toString(s));   //3. to print the all datas of array in [] horizontal format
		
		System.out.println("normal for loop");    //4. to print all datas of array in vertical format
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		           //or
		System.out.println("Enhanced for loop");
		for(String x:s) {
			System.out.println(x);
		}
	}
}
