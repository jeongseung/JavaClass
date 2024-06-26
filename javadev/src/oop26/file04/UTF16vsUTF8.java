package oop26.file04;

import java.awt.datatransfer.SystemFlavorMap;
import java.io.UnsupportedEncodingException;

public class UTF16vsUTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1 = "abc".getBytes("UTF-16"); //문자열 -> byte[]
		byte[] b2 = "abc".getBytes("UTF-8"); //문자열 -> byte[]
		System.out.println(b1.length);
		System.out.println(b2.length);
		for(byte b: b1) System.out.printf("%02X", b);
		System.out.println();
		for(byte b: b2) System.out.printf("%02X", b);
		System.out.println();
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		System.out.println();
		byte[]b3 = "가나다".getBytes("UTF-16");
		byte[]b4 = "가나다".getBytes("UTF-8");
		System.out.println(b3.length);
		System.out.println(b4.length);
		for(byte b : b3) {
			//변수 b의 값을 16진수로 출력하되 출력되는 문자열의 너비를 최소 2자리이며 필요한 경우 앞에 0을 넣어서 출력하라
			System.out.printf("%02X", b);
		}
		System.out.println();
		for(byte b : b4) {
			System.out.printf("%02X", b);
		}
		System.out.println();
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
		System.out.println();
	}
}


