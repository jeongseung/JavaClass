package oop26.file07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {
		//src/oop26/file07/FileInput-Stream1.txt
		//입력 파일 생성
		File inFile = new File("src/oop26/file07/FileInput-Stream1.txt");
		//InputStream 객체 생성
		InputStream is = new FileInputStream(inFile);
		int data;
		while((data = is.read()) != -1) {
			System.out.println("읽은 데이터: " + (char)data + "남은 바이트 수 : " + is.available());
		}
		//InputStream 반납
		is.close();
	}
}
