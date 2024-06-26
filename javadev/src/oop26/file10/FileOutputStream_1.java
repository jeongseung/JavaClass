package oop26.file10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		//입력 파일 생성
		File outFile = new File("src/oop26/file10/FileOutputStreams1.txt");
		OutputStream os1 = new FileOutputStream(outFile);
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); //13(생략 가능)
		os1.write('\n'); //10 개행 
		os1.flush();
		os1.close();
		// 2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true); //내용 연결
		byte[] byteArray1 = "Hello!".getBytes();
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		//3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true); //내용 연결
		byte[] byteArray2 = "Better the last smil than the first laughter".getBytes();
		os3.write(byteArray2, 7, 8);
		os3.flush();
		os3.close();
		
		
	}

}
