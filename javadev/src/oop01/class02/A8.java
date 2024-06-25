package oop01.class02;

import java.util.Arrays;

public class A8 {
	public static void main(String[] args) {
		method1(1,2);
		method1(1,2,3);
		method1();
		method2("안녕", "방가");
		method2("땡큐", "베리", "감사");
		method2();
		
	}

	private static void method1(int...values) {
		System.out.println("배열의 길이: " + values.length);
		/*
		   배열 출력 방법 1
		   for(int i=0;1 i<values.length(); i++) {
		   		System.out.print(values[i] + " ");
		   }
		 */
		
		//배열 출력 방법2
		for(int k : values) {
			System.out.println(k + " ");
		}
		
		//배열 출력 방법 3
		//System.out.println(Arrays.toString(values));
		
		
	}

	private static void method2(String...values) {
		System.out.println("배열의 길이 : " + values.length);
		
		/* 배열 출력 방법
		 
		for(int i=0; i<values.length; i++) {
			System.out.println(value[i] + " ");
		}
		 */
		for(String k : values) {
			System.out.println(k + " ");
		}
		
		/* 배열 출력 방법
		System.out.println(Arrays.toString(values));
		    
		 */
		
	}

}
