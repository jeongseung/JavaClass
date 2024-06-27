package oop26.file12;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {
	public static void main(String[] args) throws IOException{
		OutputStream os = System.out;
		//1바이트씩 쓰기
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		os.flush();
		
		//2.n바이트씩 쓰기
		byte[] byteArray1 = "hello!".getBytes();
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		// n바이트씩 쓰기
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os.write(byteArray2,7,8);
		os.flush();
	}
}
