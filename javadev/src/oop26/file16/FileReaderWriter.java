package oop26.file16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {
	public static void main(String[] args) {
		//파일 객체 생성
		File readerWriterFile = new File("src/oop25/file16.ReaderWriterFile.txt");
		
		//1. FileWriter를 이용한 파일 쓰기(utf-8모드)
		try(Writer writer = new FileWriter(readerWriterFile)) {
			writer.write("안녕하세여\n".toCharArray());
			writer.write("Hello");
			writer.write("\r");
			writer.write("\n");
			writer.write("반갑습니다",2,3);
			writer.flush();
		} catch(IOException e) {}
		//2. FileReader 를 이용한 파일 읽기(UTF-8)
		try(Reader reader= new FileReader(readerWriterFile)) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {}
 	}

}
