package oop01.class02;

import java.util.Arrays;

public class A7 {
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
		modifyData(array);
		printArray(array);
	}

	private static void modifyData(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}

	private static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	

}
