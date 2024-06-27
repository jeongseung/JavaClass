package oop26.file17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_1 {
	public static void main(String[] args) {
	
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch(IOException e) {}
		//콘솔로 입력(ms949)
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch(IOException e) {}
		//콘솔로 입력(ms949)
		
	}

}
