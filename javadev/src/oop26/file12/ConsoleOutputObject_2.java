package oop26.file12;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConsoleOutputObject_2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		//n-byte
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		byte[] byteArray2 = "반갑습니다".getBytes(Charset.defaultCharset());
		os.write(byteArray2, 6, 6);
		os.flush();
	}

}
