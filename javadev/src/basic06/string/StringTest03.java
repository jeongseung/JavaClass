package basic06.string;

import java.util.Arrays;

public class StringTest03 {
	public static void main(String[] args) {
		//문자열 길이
		String str1 = "Hello Java!";
		System.out.println("str1의 길이 : " + str1.length());
		
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println("str2의 길이 : " + str2.length());
		System.out.println();
		
		//charAt() : 문자열에서 특정 인덱스에 위치해 있는 문자 검색
		
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		//indexOf() : 문자열에서 특정 문자나 문자열을 앞에서부터 인덱스 값을 알아내기 위해 검색
		//lastIndexOf() : ...뒤에서부터 검색에서 인덱스 알아내기
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf('a', 8));
		
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		
		System.out.println(str1.indexOf("Bye")); //해당 문자열이 없으면 -1
		System.out.println(str1.lastIndexOf("고맙습니다")); // 해당 문자열이 없으면 -1
		
		//String.valueOf() : 기본자로형 -> 문자열로 변환
		String str3 = String.valueOf(2.3);
		System.out.println(str3);
		String str4 = String.valueOf(false);
		System.out.println(str4);
		
		//concat() : + 와 같은 기능
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		//와 String.valueOf()의 결합
		String str6 = "안녕" + 3;
		System.out.println(str6);
		String str7 = "안녕".concat(String.valueOf(3));
		System.out.println(str7);
		
		//getBytes() : 문자열 -> byte[]
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		byte[] arr1 = str8.getBytes();
		byte[] arr2 = str9.getBytes();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = str8.toCharArray();
		char[] arr4 = str9.toCharArray();
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
	}

}
