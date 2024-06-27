package oop26.file14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) throws IOException{
		File file = new File("src/oop26/file14/qwer.txt");
		OutputStream os = new FileOutputStream(file);
		byte[] bytes = "qwer".getBytes();
		os.write(bytes);
		

		
	}

}
