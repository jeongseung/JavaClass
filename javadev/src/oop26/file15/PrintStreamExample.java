package oop26.file15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		File outFile1 = new File("src/oop26/file15/print-Stream1.txt");
		File outFile2 = new File("src/oop26/file15/print-Stream2.txt");
		try(OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);) {
			ps.println(5.8);
			ps.print(3+ " 안녕 " + 12345 +"\n");
			ps.printf("%d", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
		
		//2. PrintStream(File)
		try(PrintStream ps = new PrintStream(outFile2);) {
				ps.println(5.8);
				ps.print(3+ " 안녕 " + 12345 +"\n");
				ps.printf("%d", 7).printf("%s %f", "안녕", 5.8);
				ps.println();
			} catch(IOException e) {}
		
		try(OutputStream os2 = System.out;
				PrintStream ps = new PrintStream(os2);) {
				ps.println(5.8);
				ps.print(3+ " 안녕 " + 12345 +"\n");
				ps.printf("%d", 7).printf("%s %f", "안녕", 5.8);
				ps.println();
			} catch(IOException e) {}
			
		
	}

}
