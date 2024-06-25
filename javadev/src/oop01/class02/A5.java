package oop01.class02;

import java.util.Arrays;

public class A5 {
	public static void main(String[] args) {
		int[] a = new int[] {4,5,6};
		printArray(a);
		printArray(new int[] {1,2,3});
	}

	private static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
