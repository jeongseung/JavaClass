package oop26.file17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_2 {
	public static void main(String[] args) {
		File inputStreamReader = new File("src/oop26/file17/test.txt");
		//1. FileReader를 이용한 파일 읽기
		try(Reader reader = new FileReader(inputStreamReader)) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {}
		
		try(InputStream is = new FileInputStream(inputStreamReader);
			InputStreamReader isr = new InputStreamReader(is, "MS949");	
				) {
			int data;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {}
		
		
		
	}

}
