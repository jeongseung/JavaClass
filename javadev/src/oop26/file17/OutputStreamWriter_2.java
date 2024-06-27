package oop26.file17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_2 {
	public static void main(String[] args) {
		//콘솔출력 utf-8 -> utf-8
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n 한글과 영문이 모두 포함뙈 있습니다");
			osw.write("\n");
			osw.write("잘가 \n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch (IOException e) {
			
		}
		
		//2. 콘솔 출력 UTF-8 -> MS949
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n 한글과 영문이 모두 포함뙈 있습니다");
			osw.write("\n");
			osw.write("잘가 \n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch (IOException e) {
			
		}
		
	}

}
