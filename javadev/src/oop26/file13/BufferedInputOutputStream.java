package oop26.file13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputOutputStream {
	public static void main(String[] args) throws IOException {
		//파일생성
		File orgfile = new File("src/oop26/file13/cat.jpg");
		File orgfile1 = new File("src/oop26/file13/cat1.jpg");
		File orgfile2 = new File("src/oop26/file13/cat2.jpg");
		long start, end, time1, time2;
		//buffered 사용 x
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgfile);
			OutputStream os = new FileOutputStream(orgfile1);) {
			int data;
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch(IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("without Buffered : " + time1);
		
		
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgfile);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(orgfile1);
			BufferedOutputStream bos = new BufferedOutputStream(os);) {
			
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch(IOException e) {}
		end = System.nanoTime();
		time2 = end - start;
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgfile);
			OutputStream os = new FileOutputStream(orgfile1);) {
			int data;
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch(IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("with Buffered : " + time2);
		System.out.println("diff : " + time1/time2);
	}

}
