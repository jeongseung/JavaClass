package basic05.array;

import java.util.Arrays;
import java.util.concurrent.StructuredTaskScope.ShutdownOnSuccess;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,6,7};
		
		//배열의 길이 구하기
		
		System.out.println(arr.length);
		
		//출력하기
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		System.out.print(arr[2] + " ");
		System.out.print(arr[3] + " ");
		System.out.print(arr[4] + " ");
		System.out.println();
		
		//출력하기2
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//출력하기3
		for(int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		//출력하기4
		System.out.println(Arrays.toString(arr));
	}

}
