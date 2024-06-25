package oop16.thread09;

public class MyData {//공유 객체
	int data = 3;
	
	public void plusData() {
		synchronized(this) {
			int myData = data; // 데이터 가져오기
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data = myData + 1; //값을 1 증가		
		}
	}	
}
